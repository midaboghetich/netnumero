package com.numhero.client.mvp.task;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ListBox;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.task.GetTaskRequest;
import com.numhero.client.model.datacargo.task.GetTaskResponse;
import com.numhero.client.model.datacargo.task.SaveTaskRequest;
import com.numhero.client.model.datacargo.task.SaveTaskResponse;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.client.mvp.BasePresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.LocationUtils;
import com.numhero.shared.enums.TaskStateEnum;
import com.numhero.shared.enums.TimeEntryTypeEnum;

@Singleton
public class TaskPresenter extends BasePresenter {

    Service<GetTaskRequest, GetTaskResponse> taskGetService;
    Service<SaveTaskRequest, SaveTaskResponse> taskSaveService;

    @Inject
    public TaskPresenter(EventManager eventManager,
                         Service<GetTaskRequest, GetTaskResponse> taskGetService,
                         Service<SaveTaskRequest, SaveTaskResponse> taskSaveService,
                         TaskView taskView) {
        super(eventManager, taskView);
        this.taskGetService = taskGetService;
        this.taskSaveService = taskSaveService;
    }

    @Override
    protected String getPresenterUrl() {
        return "task";
    }

    @Override
    public TaskView getView() {
        return (TaskView) super.getView();
    }

    @Override
    public void onShow() {
        if (getUrl().getId() == null) {
            getView().getTaskPanel().setTask(new TaskC());
        } else {
            GetTaskRequest request = new GetTaskRequest();
            request.setEntityId(getUrl().getId());

            taskGetService.execute(request, new ServiceCallbackImpl<GetTaskResponse>() {
                @Override
                public void onSuccess(GetTaskResponse response) {
                    getView().getTaskPanel().setTask(response.getTaskC());
                }

                @Override
                public void onFailure(Throwable th) {
                    Window.alert("problem getting task:" + th.toString());
                }
            });
        }
    }

    private ClickHandler saveTaskHandler() {
        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                if (getView().getTaskPanel().saveValuesFromUi()) {

                    SaveTaskRequest request = new SaveTaskRequest();

                    request.setTaskC(getView().getTaskPanel().getTaskC());
                    taskSaveService.execute(request, new ServiceCallbackImpl<SaveTaskResponse>() {
                        @Override
                        public void onSuccess(SaveTaskResponse response) {
                            LocationUtils.redirect("#tasks");
                        }

                        @Override
                        public void onFailure(Throwable th) {
                            Window.alert("problem saving task:" + th.toString());
                        }
                    });
                }
            }
        };
        return ret;
    }

    @Override
    protected void onBind() {
        super.onBind();
        TaskPanel panel = getView().getTaskPanel();

        ListBox taskState = panel.getState();
        for (TaskStateEnum c : TaskStateEnum.values()) {
            taskState.addItem(c.name());
        }

        ListBox timeEntryUnit = panel.getTimeEntryUnit();
        for (TimeEntryTypeEnum c : TimeEntryTypeEnum.values()) {
            timeEntryUnit.addItem(c.name());
        }

        panel.getBtSearch().addClickHandler(saveTaskHandler());
    }

    @Override
    protected void onUnbind() {
        super.onUnbind();
    }
}
