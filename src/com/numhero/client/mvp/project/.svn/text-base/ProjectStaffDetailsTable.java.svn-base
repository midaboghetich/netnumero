package com.numhero.client.mvp.project;

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
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.client.model.pojoc.ProjectStaffDetailC;
import com.numhero.client.model.pojoc.StaffC;
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

public class ProjectStaffDetailsTable extends FlexTableWithHeader implements MouseHandler {

    private List<StaffLine> projectStaffLines;

    private Service<StaffListRequest, StaffListResponse> staffService;
    private Service<SaveStaffRequest, SaveStaffResponse> staffSaveService;

    private ProjectC projectC;
    private ValidationProcessor validator;

    @Inject
    public ProjectStaffDetailsTable(Service<StaffListRequest, StaffListResponse> staffService,
                                    Service<SaveStaffRequest, SaveStaffResponse> staffSaveService) {

        this.staffService = staffService;
        this.staffSaveService = staffSaveService;
        this.projectStaffLines = new ArrayList<StaffLine>();
        setHeader();
        setValues();
        addMouseHandler(this);
    }

    public void setProjectC(ProjectC pC) {

        this.projectC = pC;

        if (projectC.getProjectStaffDetails().isEmpty()) {
            ProjectStaffDetailC idc1 = new ProjectStaffDetailC();
            projectC.getProjectStaffDetails().add(idc1);

            ProjectStaffDetailC idc2 = new ProjectStaffDetailC();
            projectC.getProjectStaffDetails().add(idc2);

            ProjectStaffDetailC idc3 = new ProjectStaffDetailC();
            projectC.getProjectStaffDetails().add(idc3);
        }

        projectStaffLines.clear();

        for (ProjectStaffDetailC idc : projectC.getProjectStaffDetails()) {
            addLine(idc);
        }
        setValues();
    }

    public void addLine(ProjectStaffDetailC idc) {
        projectStaffLines.add(new StaffLine(idc));
    }

    public void setValues() {
        removeAllRows();
        for (int row = 0; row < projectStaffLines.size(); row++) {
            StaffLine idline = projectStaffLines.get(row);
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
        for (int row = 0; row < projectStaffLines.size(); row++) {
            StaffLine idline = projectStaffLines.get(row);
            idline.sbStaff.getBtAdd().setVisible(row == event.getRow() && 0 == event.getColumn());
            idline.toolbar.setVisible(row == event.getRow());
        }
    }

    public void saveValuesFromUi() {
        projectC.getProjectStaffDetails().clear();
        for (int row = 0; row < projectStaffLines.size(); row++) {
            StaffLine idline = projectStaffLines.get(row);
            idline.saveValuesFromUi();
            projectC.getProjectStaffDetails().add(idline.projectStaffDetailC);
        }
    }

    public void setValidator(ValidationProcessor validator) {
        this.validator = validator;
    }

    // inner classes ------------------
    private class StaffLine implements StaffSelect.StaffSelectHandler {

        ProjectStaffDetailC projectStaffDetailC;
        TextBox txName;
        StaffSelect sbStaff;

        InvoiceDetailToolbar toolbar;

        StaffLine(ProjectStaffDetailC idc) {
            projectStaffDetailC = idc;

            sbStaff = new StaffSelect(staffService, staffSaveService);
            sbStaff.setHandler(this);
            sbStaff.getBtAdd().setVisible(false);
            sbStaff.setStaff(projectStaffDetailC.getId(), projectStaffDetailC.getName());

            txName = new TextBox();
            txName.setText(projectStaffDetailC.getName());

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
            txName.setText(projectStaffDetailC.getName());
        }

        int getRow() {
            return projectStaffLines.indexOf(StaffLine.this);
        }

        void moveUp() {
            int row = getRow();
            if (row > 0) {
                projectStaffLines.set(row, projectStaffLines.get(row - 1));
                projectStaffLines.set(row - 1, StaffLine.this);
                setValues();
            }
        }

        void moveDown() {
            int row = getRow();
            if (row < projectStaffLines.size() - 1) {
                projectStaffLines.set(row, projectStaffLines.get(row + 1));
                projectStaffLines.set(row + 1, StaffLine.this);
                setValues();
            }
        }

        void destroy() {
            validator.removeValidators("Description" + this);
            removeRow(getRow());
            projectStaffLines.remove(StaffLine.this);
        }

        public void saveValuesFromUi() {
            projectStaffDetailC.setName(txName.getText());
        }

        @Override
        public void staffChanged(StaffC staffC) {
            projectStaffDetailC.setName(staffC.getName());
            projectStaffDetailC.setStaffId(staffC.getId());
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