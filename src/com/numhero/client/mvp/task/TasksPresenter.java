package com.numhero.client.mvp.task;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.task.DeleteTasksRequest;
import com.numhero.client.model.datacargo.task.TaskListRequest;
import com.numhero.client.model.datacargo.task.TaskListResponse;
import com.numhero.client.mvp.GenericTimeTabPage;
import com.numhero.client.mvp.GridPresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

@Singleton
public class TasksPresenter extends GridPresenter {

    private Service<TaskListRequest, TaskListResponse> taskListService;
    private Service<DeleteTasksRequest, BulkActionResponse> deleteTasksService;

    @Inject
    public TasksPresenter(EventManager eventManager,
                          Service<TaskListRequest, TaskListResponse> taskListService,
                          Service<DeleteTasksRequest, BulkActionResponse> deleteTasksService) {
        super(eventManager, new GenericTimeTabPage(new TasksTable()));

        this.taskListService = taskListService;
        this.deleteTasksService = deleteTasksService;

        getView().setDetailTitlePanel(Application.getConstants().manageTasks());
        final TasksTable table = (TasksTable) getView().getContentPanel().getContentWidget();

        Command deleteTaskCommand = new Command() {
            public void execute() {
                deleteTasks(table.getSelectedIds());
            }
        };
        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteTasks(), deleteTaskCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void deleteTasks(List<String> ids) {
        DeleteTasksRequest request = new DeleteTasksRequest();
        request.setEntityIdList(ids);
        deleteTasksService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors deleting Tasks");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("Problem deleting Tasks:" + th.toString());
            }
        });
    }

    @Override
    protected String getPresenterUrl() {
        return "tasks";
    }

    @Override
    public GenericTimeTabPage getView() {
        return (GenericTimeTabPage) super.getView();
    }

    @Override
    public void onShow() {
        refreshFromServer();
    }

    private void refreshFromServer() {
        TaskListRequest request = new TaskListRequest();
        taskListService.execute(request, new ServiceCallbackImpl<TaskListResponse>() {
            @Override
            public void onSuccess(TaskListResponse response) {
                ((TasksTable) getView().getContentPanel().getContentWidget()).setTasks(response.getTaskCList());
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem getting tasks:" + th.toString());
            }
        });
    }
}
