package com.numhero.client.mvp.task;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.staff.SaveStaffRequest;
import com.numhero.client.model.datacargo.staff.SaveStaffResponse;
import com.numhero.client.model.datacargo.staff.StaffListRequest;
import com.numhero.client.model.datacargo.staff.StaffListResponse;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.client.model.pojoc.TaskStaffDetailC;
import com.numhero.client.mvp.document.InvoiceDetailToolbar;
import com.numhero.client.mvp.staff.StaffSelect;
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

public class TaskStaffDetailsTable extends FlexTableWithHeader implements MouseHandler {

    private List<StaffLine> taskStaffLines;

    private Service<StaffListRequest, StaffListResponse> staffService;
    private Service<SaveStaffRequest, SaveStaffResponse> staffSaveService;

    private TaskC taskC;
    private ValidationProcessor validator;

    @Inject
    public TaskStaffDetailsTable(Service<StaffListRequest, StaffListResponse> staffService,
                                 Service<SaveStaffRequest, SaveStaffResponse> staffSaveService) {
        this.staffService = staffService;
        this.staffSaveService = staffSaveService;
        this.taskStaffLines = new ArrayList<StaffLine>();
        setHeader();
        setValues();
        addMouseHandler(this);
    }

    public void setTaskC(TaskC pC) {

        this.taskC = pC;

        if (taskC.getTaskStaffDetailsC().isEmpty()) {

            TaskStaffDetailC idc1 = new TaskStaffDetailC();
            taskC.getTaskStaffDetailsC().add(idc1);

            TaskStaffDetailC idc2 = new TaskStaffDetailC();
            taskC.getTaskStaffDetailsC().add(idc2);

            TaskStaffDetailC idc3 = new TaskStaffDetailC();
            taskC.getTaskStaffDetailsC().add(idc3);
        }

        taskStaffLines.clear();
        for (TaskStaffDetailC idc : taskC.getTaskStaffDetailsC()) {
            addLine(idc);
        }
        setValues();
    }

    public void addLine(TaskStaffDetailC idc) {
        taskStaffLines.add(new StaffLine(idc));
    }


    public void setValues() {
        removeAllRows();
        for (int row = 0; row < taskStaffLines.size(); row++) {
            StaffLine idline = taskStaffLines.get(row);
            setWidget(row, 0, idline.sbStaff);
            setWidget(row, 1, idline.txName);
            setWidget(row, 2, idline.toolbar);
            getCellFormatter().setStyleName(row, 2, "invoiceDetailsToolbar");
        }
    }

    private void setHeader() {
        setHeader(0, Application.getConstants().item(), HasHorizontalAlignment.ALIGN_RIGHT, "70px");
        setHeader(1, Application.getConstants().name(), HasHorizontalAlignment.ALIGN_RIGHT, "70px");
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
        for (int row = 0; row < taskStaffLines.size(); row++) {
            StaffLine idline = taskStaffLines.get(row);
            idline.sbStaff.getBtAdd().setVisible(row == event.getRow() && 0 == event.getColumn());
            idline.toolbar.setVisible(row == event.getRow());
        }
    }

    public void setValidator(ValidationProcessor validator) {
        this.validator = validator;
    }

    // inner classes ------------------
    private class StaffLine implements StaffSelect.StaffSelectHandler {

        TaskStaffDetailC taskStaffDetailC;
        TextBox txName;
        InvoiceDetailToolbar toolbar;
        StaffSelect sbStaff;

        StaffLine(TaskStaffDetailC idc) {

            taskStaffDetailC = idc;

            sbStaff = new StaffSelect(staffService, staffSaveService);
            sbStaff.setHandler(this);
            sbStaff.getBtAdd().setVisible(false);
            sbStaff.setStaff(taskStaffDetailC.getId(), taskStaffDetailC.getName());

            txName = new TextBox();

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
            txName.setText(taskStaffDetailC.getName());
        }

        int getRow() {
            return taskStaffLines.indexOf(StaffLine.this);
        }

        void moveUp() {
            int row = getRow();
            if (row > 0) {
                taskStaffLines.set(row, taskStaffLines.get(row - 1));
                taskStaffLines.set(row - 1, StaffLine.this);
                setValues();
            }
        }

        void moveDown() {
            int row = getRow();
            if (row < taskStaffLines.size() - 1) {
                taskStaffLines.set(row, taskStaffLines.get(row + 1));
                taskStaffLines.set(row + 1, StaffLine.this);
                setValues();
            }
        }

        void destroy() {
            validator.removeValidators("Description" + this);
            removeRow(getRow());
            taskStaffLines.remove(StaffLine.this);
        }

        @Override
        public void staffChanged(StaffC staffC) {
            taskStaffDetailC.setStaffId(staffC.getId());
            taskStaffDetailC.setName(staffC.getName());
            valuesChanged();
        }

        void valuesChanged() {
            setLineValues();
        }

        @SuppressWarnings("unchecked")
        private void addValidators() {
            FocusAction focusAction = new FocusAction();
            validator.addValidators("Description" + this,
                    new NotEmptyValidator(txName, true, "required")
                            .addActionForFailure(focusAction)
                            .addActionForFailure(new StyleAction("validation-failed")));
        }
    }
}