package com.numhero.client.mvp.task;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.*;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.client.model.datacargo.task.SaveTaskRequest;
import com.numhero.client.model.datacargo.task.SaveTaskResponse;
import com.numhero.client.model.datacargo.task.TaskListRequest;
import com.numhero.client.model.datacargo.task.TaskListResponse;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.client.mvp.clientsupplier.ClientSelect;
import com.numhero.client.service.Service;
import com.numhero.client.util.CoreUtils;
import com.numhero.client.widget.combobox.ServerSuggestOracle;

public class TaskSelect extends Composite implements Focusable {

    public interface TaskSelectHandler {
        public void taskChanged(TaskC clientSupplierC);
    }

    interface TaskSelectUiBinder extends UiBinder<HTMLPanel, TaskSelect> {
    }

    private static TaskSelectUiBinder uiBinder = GWT.create(TaskSelectUiBinder.class);

    @UiField(provided = true)
    SuggestBox suggestBox;

    @UiField
    Anchor btAdd;

    private Service<SaveTaskRequest, SaveTaskResponse> saveService;
    private TaskC taskC;
    private TaskSelectHandler handler;
    private ClientSelect cs;

    public TaskSelect(
            Service<TaskListRequest, TaskListResponse> getListService,
            Service<SaveTaskRequest, SaveTaskResponse> saveService,
            final QuickTaskPanel taskPanel,
            ClientSelect cs) {

        this.cs = cs;
        this.saveService = saveService;

        taskC = new TaskC();

        suggestBox = new SuggestBox(new ServerSuggestOracle<TaskListRequest, TaskListResponse>(getListService, new TaskListRequest()));
        suggestBox.addSelectionHandler(new SelectionHandler<Suggestion>() {
            @Override
            public void onSelection(SelectionEvent<Suggestion> event) {
                if (event.getSelectedItem() instanceof TaskC) {
                    taskC = (TaskC) event.getSelectedItem();
                    handler.taskChanged(taskC);
                }
            }
        });
        suggestBox.getTextBox().addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                taskC.setId(null);
                taskC.setName(null);
                handler.taskChanged(taskC);
            }
        });

        initWidget(uiBinder.createAndBindUi(this));

        btAdd.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                createDialogBox(taskPanel).center();
            }
        });
    }

    public void setHandler(TaskSelectHandler handler) {
        this.handler = handler;
    }

    public void setTask(String taskId, String taskName) {
        CoreUtils.debug("TaskSelect.setTask");
        CoreUtils.debug("taskId = " + taskId);
        CoreUtils.debug("taskName = " + taskName);

        taskC.setId(taskId);
        taskC.setName(taskName);
    }

    public TaskC getTaskC() {
        return taskC;
    }

    public SuggestBox getSbTask() {
        return suggestBox;
    }

    @Override
    public int getTabIndex() {
        return suggestBox.getTabIndex();
    }

    @Override
    public void setAccessKey(char key) {
        suggestBox.setAccessKey(key);
    }

    @Override
    public void setFocus(boolean focused) {
        suggestBox.setFocus(focused);
    }

    @Override
    public void setTabIndex(int index) {
        suggestBox.setTabIndex(index);
    }

    private DialogBox createDialogBox(QuickTaskPanel taskPanel) {

        TaskDialog dialog = null;
        if (cs != null)
            dialog = new TaskDialog(saveService, taskPanel, suggestBox.getText(), cs.getSbClientSupplier().getText());
        else
            dialog = new TaskDialog(saveService, taskPanel, suggestBox.getText(), "");

        dialog.addCloseHandler(new CloseHandler<PopupPanel>() {
            @Override
            public void onClose(CloseEvent<PopupPanel> event) {
                TaskDialog dialog = (TaskDialog) event.getTarget();
                if (taskC.getId() != null) {
                    suggestBox.setValue(taskC.getReplacementString());
                    handler.taskChanged(taskC);
                }
            }
        });
        return dialog;
    }

    public SuggestBox getSuggestBox() {
        return suggestBox;
    }

    public void setSuggestBox(SuggestBox suggestBox) {
        this.suggestBox = suggestBox;
    }

    public Anchor getBtAdd() {
        return btAdd;
    }

    public void setBtAdd(Anchor btAdd) {
        this.btAdd = btAdd;
    }

    public Service<SaveTaskRequest, SaveTaskResponse> getSaveService() {
        return saveService;
    }

    public void setSaveService(Service<SaveTaskRequest, SaveTaskResponse> saveService) {
        this.saveService = saveService;
    }
}