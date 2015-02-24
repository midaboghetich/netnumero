package com.numhero.client.mvp.project;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.task.SaveTaskRequest;
import com.numhero.client.model.datacargo.task.SaveTaskResponse;
import com.numhero.client.model.datacargo.task.TaskListRequest;
import com.numhero.client.model.datacargo.task.TaskListResponse;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.client.model.pojoc.ProjectTaskDetailC;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.client.mvp.clientsupplier.ClientSelect;
import com.numhero.client.mvp.document.InvoiceDetailToolbar;
import com.numhero.client.mvp.task.QuickTaskPanel;
import com.numhero.client.mvp.task.TaskSelect;
import com.numhero.client.service.Service;
import com.numhero.client.widget.table.FlexTableWithHeader;
import com.numhero.client.widget.table.MouseEvent;
import com.numhero.client.widget.table.MouseHandler;
import eu.maydu.gwt.validation.client.ValidationProcessor;
import eu.maydu.gwt.validation.client.actions.FocusAction;
import eu.maydu.gwt.validation.client.actions.StyleAction;
import eu.maydu.gwt.validation.client.validators.standard.NotEmptyValidator;

import java.util.ArrayList;
import java.util.List;

public class ProjectTasksDetailsTable extends FlexTableWithHeader implements MouseHandler {

    private List<TaskLine> tasklines;

    private Service<TaskListRequest, TaskListResponse> taskService;
    private Service<SaveTaskRequest, SaveTaskResponse> taskSaveService;

    QuickTaskPanel taskPanel;
    private ProjectC projectC;
    private ValidationProcessor validator;
    private ClientSelect clientSupplierSelect;


    @Inject
    public ProjectTasksDetailsTable(Service<TaskListRequest, TaskListResponse> taskService,
                                    Service<SaveTaskRequest, SaveTaskResponse> taskSaveService,
                                    QuickTaskPanel taskPanel) {

        this.tasklines = new ArrayList<TaskLine>();
        this.taskService = taskService;
        this.taskSaveService = taskSaveService;
        this.taskPanel = taskPanel;

        setHeader();
        setValues();

        addMouseHandler(this);
    }

    public void setProjectC(ProjectC pC) {
        this.projectC = pC;

        if (projectC.getProjectTaskDetails().isEmpty()) {
            ProjectTaskDetailC idc1 = new ProjectTaskDetailC();
            projectC.getProjectTaskDetails().add(idc1);

            ProjectTaskDetailC idc2 = new ProjectTaskDetailC();
            projectC.getProjectTaskDetails().add(idc2);

            ProjectTaskDetailC idc3 = new ProjectTaskDetailC();
            projectC.getProjectTaskDetails().add(idc3);
        }

        tasklines.clear();
        for (ProjectTaskDetailC idc : projectC.getProjectTaskDetails()) {
            addLine(idc);
        }
        setValues();
    }

    public void addLine(ProjectTaskDetailC idc) {
        tasklines.add(new TaskLine(idc));
    }

    public void setValues() {
        removeAllRows();
        for (int row = 0; row < tasklines.size(); row++) {
            TaskLine idline = tasklines.get(row);
            setWidget(row, 0, idline.suggestBoxTask);
            setWidget(row, 1, idline.txDescription);
            setWidget(row, 2, idline.toolbar);
            getCellFormatter().setStyleName(row, 2, "invoiceDetailsToolbar");
        }
    }

    private void setHeader() {
        setHeader(0, Application.getConstants().item(), HasHorizontalAlignment.ALIGN_RIGHT, "70px");
        setHeader(1, Application.getConstants().description(), HasHorizontalAlignment.ALIGN_LEFT, "%");
        setHeader(2, "", HasHorizontalAlignment.ALIGN_RIGHT, "52px", "invoiceDetailsToolbar");
    }

    @Override
    public void onMouseOver(MouseEvent event) {
        showRowControls(event);
    }

    @Override
    public void onMouseOut(MouseEvent event) {
        showRowControls(event);
    }

    private void showRowControls(MouseEvent event) {
        for (int row = 0; row < tasklines.size(); row++) {
            TaskLine idline = tasklines.get(row);
            idline.suggestBoxTask.getBtAdd().setVisible(row == event.getRow() && 0 == event.getColumn());
            idline.toolbar.setVisible(row == event.getRow());
        }
    }

    public void saveValuesFromUi() {
        projectC.getProjectTaskDetails().clear();
        for (int row = 0; row < tasklines.size(); row++) {
            TaskLine idline = tasklines.get(row);
            idline.saveValuesFromUi();
            projectC.getProjectTaskDetails().add(idline.projectTaskDetailC);
        }
    }

    public void setValidator(ValidationProcessor validator) {
        this.validator = validator;
    }

    public void setClientSupplierSelect(ClientSelect clientSupplierSelect) {
        this.clientSupplierSelect = clientSupplierSelect;
    }

    // inner classes ------------------
    private class TaskLine implements TaskSelect.TaskSelectHandler {

        ProjectTaskDetailC projectTaskDetailC;
        TaskSelect suggestBoxTask;
        TextBox txDescription;
        InvoiceDetailToolbar toolbar;

        TaskLine(ProjectTaskDetailC idc) {
            projectTaskDetailC = idc;

            suggestBoxTask = new TaskSelect(taskService, taskSaveService, taskPanel, clientSupplierSelect);
            suggestBoxTask.setHandler(this);
            suggestBoxTask.getBtAdd().setVisible(false);
            suggestBoxTask.setTask(projectTaskDetailC.getTaskId(), projectTaskDetailC.getName());

            txDescription = new TextBox();
            toolbar = new InvoiceDetailToolbar();
            toolbar.setVisible(false);
            toolbar.getBtDelete().addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    destroy();
                }
            });
            toolbar.getBtMoveUp().addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    moveUp();
                }
            });
            toolbar.getBtMoveDown().addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    moveDown();
                }
            });

            addValidators();
            setLineValues();
        }

        void setLineValues() {
            txDescription.setText(projectTaskDetailC.getDescription());
        }

        int getRow() {
            return tasklines.indexOf(TaskLine.this);
        }

        void moveUp() {
            int row = getRow();
            if (row > 0) {
                tasklines.set(row, tasklines.get(row - 1));
                tasklines.set(row - 1, TaskLine.this);
                setValues();
            }
        }

        void moveDown() {
            int row = getRow();
            if (row < tasklines.size() - 1) {
                tasklines.set(row, tasklines.get(row + 1));
                tasklines.set(row + 1, TaskLine.this);
                setValues();
            }
        }

        void destroy() {
            validator.removeValidators("Description" + this);
            removeRow(getRow());
            tasklines.remove(TaskLine.this);
        }

        public void saveValuesFromUi() {
            projectTaskDetailC.setDescription(txDescription.getText());
        }

        @Override
        public void taskChanged(TaskC taskC) {
            projectTaskDetailC.setName(taskC.getName());
            projectTaskDetailC.setDescription(taskC.getDescription());
            projectTaskDetailC.setTaskId(taskC.getId());
            valuesChanged();
        }

        void valuesChanged() {
            setLineValues();
        }

        @SuppressWarnings("unchecked")
        private void addValidators() {
            FocusAction focusAction = new FocusAction();
            validator.addValidators("Description" + this,
                    new NotEmptyValidator(txDescription, true, "required")
                            .addActionForFailure(focusAction)
                            .addActionForFailure(new StyleAction("validation-failed")));
        }
    }
}