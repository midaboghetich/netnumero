package com.numhero.client.mvp.task;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.inject.Inject;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.task.SaveTaskRequest;
import com.numhero.client.model.datacargo.task.SaveTaskResponse;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;

public class TaskDialog extends DialogBox {

    private TaskC taskC;

    @Inject
    public TaskDialog(final Service<SaveTaskRequest, SaveTaskResponse> taskSaveService,
                      final QuickTaskPanel taskPanel,
                      String taskName,
                      String clientSupplierName) {
        setText(Application.getConstants().createNewTask());
        setModal(true);
        setGlassEnabled(true);
        setAnimationEnabled(true);

        taskC = new TaskC();
        taskC.setName(taskName);
        taskC.setClientSupplierName(clientSupplierName);

        taskPanel.setTask(taskC);

        taskPanel.btSave.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if (taskPanel.saveValuesFromUi()) {
                    SaveTaskRequest request = new SaveTaskRequest();
                    request.setTaskC(taskC);
                    taskSaveService.execute(request, new ServiceCallbackImpl<SaveTaskResponse>() {
                        @Override
                        public void onSuccess(SaveTaskResponse response) {
                            taskC.setId(response.getEntityId());
                            TaskDialog.this.hide();
                        }
                    });
                }
            }
        });
        taskPanel.btCancel.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                TaskDialog.this.hide();
            }
        });
        setWidget(taskPanel);
    }

    public TaskC getTaskC() {
        return taskC;
    }
}