package com.numhero.client.mvp.project;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.client_supplier.ClientListRequest;
import com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.client.model.pojoc.ProjectStaffDetailC;
import com.numhero.client.model.pojoc.ProjectTaskDetailC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.mvp.clientsupplier.ClientSelect;
import com.numhero.client.service.Service;
import com.numhero.client.widget.CustomFormatDateBox;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.client.widget.combobox.ProjectStateEnumComboBox;
import com.numhero.shared.enums.ClientSupplierEnum;
import eu.maydu.gwt.validation.client.actions.FocusAction;
import eu.maydu.gwt.validation.client.actions.StyleAction;
import eu.maydu.gwt.validation.client.validators.standard.NotEmptyValidator;

public class ProjectPanel extends AbstractEditEntityPanel implements ClientSelect.ClientSupplierSelectHandler {
    interface ProjectUiBinder extends UiBinder<HTMLPanel, ProjectPanel> {
    }

    private static ProjectUiBinder uiBinder = GWT.create(ProjectUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField(provided = true)
    ClientSelect sbClient;

    @UiField
    TextBox name;

    @UiField
    TextBox description;

    @UiField
    CustomFormatDateBox created;

    @UiField
    CustomFormatDateBox lastBilled;

    @UiField
    TextBox totalHours;

    @UiField
    TextBox notBilledHours;

    @UiField
    ProjectStateEnumComboBox cbState;

    @UiField(provided = true)
    ProjectTasksDetailsTable projectTasksDetailsTable;

    @UiField(provided = true)
    ProjectStaffDetailsTable projectStaffDetailsTable;

    @UiField
    NetNumeroButton btAddTask;

    @UiField
    NetNumeroButton btAddStaff;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private ProjectC projectC;


    @Inject
    public ProjectPanel(Service<ClientListRequest, ClientSupplierListResponse> clientSuppliersService,
                        Service<SaveClientSupplierRequest, SaveClientSupplierResponse> clientSupplierSaveService,
                        ProjectTasksDetailsTable tdt,
                        ProjectStaffDetailsTable sdt) {

        sbClient = new ClientSelect(clientSuppliersService, clientSupplierSaveService, ClientSupplierEnum.client);
        sbClient.setHandler(this);

        projectTasksDetailsTable = tdt;
        projectStaffDetailsTable = sdt;

        projectTasksDetailsTable.setClientSupplierSelect(sbClient);

        initWidget(uiBinder.createAndBindUi(this));

        createValidator(errorsPanel);

        projectTasksDetailsTable.setValidator(validator);
        projectStaffDetailsTable.setValidator(validator);

        btAddTask.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                ProjectTaskDetailC idc1 = new ProjectTaskDetailC();
                projectC.getProjectTaskDetails().add(idc1);
                projectTasksDetailsTable.addLine(idc1);
                projectTasksDetailsTable.setValues();
            }
        });

        btAddStaff.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                ProjectStaffDetailC idc2 = new ProjectStaffDetailC();
                projectC.getProjectStaffDetails().add(idc2);
                projectStaffDetailsTable.addLine(idc2);
                projectStaffDetailsTable.setValues();
            }
        });
    }

    public NetNumeroButton getBtSearch() {
        return btSave;
    }

    public void setProjectC(ProjectC projectC) {
        this.projectC = projectC;

        resetValidator();

        projectTasksDetailsTable.setProjectC(projectC);
        projectStaffDetailsTable.setProjectC(projectC);

        sbClient.setClientSupplier(projectC.getClientSupplierID(), projectC.getClientSupplierName());

        created.setValue(projectC.getCreated());
        lastBilled.setValue(projectC.getLastBilled());
        notBilledHours.setValue(projectC.getNotBilledHours().toString());

        selectListBoxItem(cbState, projectC.getState().name());

        name.setValue(projectC.getName());
        description.setValue(projectC.getDescription());
        totalHours.setValue(projectC.getTotalHours().toString());

    }

    @Override
    public void clientSupplierChanged(ClientSupplierC clientSupplierC) {
        projectC.setClientSupplierID(clientSupplierC.getId());
        projectC.setClientSupplierName(clientSupplierC.getCompanyName());
    }

    public boolean saveValuesFromUi() {

        boolean ret = validator.validate();
        if (ret) {
            projectC.setName(name.getText());
            projectC.setDescription(description.getText());
            projectC.setCreated(created.getValue());
            projectC.setLastBilled(lastBilled.getValue());
            if (notBilledHours != null && !notBilledHours.getValue().isEmpty())
                projectC.setNotBilledHours(Double.parseDouble(notBilledHours.getValue()));

            if (totalHours != null && !totalHours.getValue().isEmpty())
                projectC.setTotalHours(Double.parseDouble(totalHours.getValue()));

            if (projectC.getState() != null)
                selectListBoxItem(cbState, projectC.getState().name());
            projectTasksDetailsTable.saveValuesFromUi();
            projectStaffDetailsTable.saveValuesFromUi();
        } else {
            errorsPanel.setVisible(true);
        }
        return ret;
    }

    public ClientSelect getSbClientSupplier() {
        return sbClient;
    }

    public TextBox getName() {
        return name;
    }

    public TextBox getDescription() {
        return description;
    }

    public CustomFormatDateBox getCreated() {
        return created;
    }

    public CustomFormatDateBox getLastBilled() {
        return lastBilled;
    }

    public TextBox getTotalHours() {
        return totalHours;
    }

    public TextBox getNotBilledHours() {
        return notBilledHours;
    }

    public ListBox getState() {
        return cbState;
    }

    public ProjectTasksDetailsTable getProjectTasksDetailsTable() {
        return projectTasksDetailsTable;
    }

    public ProjectStaffDetailsTable getProjectStaffDetailsTable() {
        return projectStaffDetailsTable;
    }

    public NetNumeroButton getBtAddTask() {
        return btAddTask;
    }

    public NetNumeroButton getBtAddStaff() {
        return btAddStaff;
    }

    public ProjectC getProjectC() {
        return projectC;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    @SuppressWarnings("unchecked")
    protected void addValidators() {
        FocusAction focusAction = new FocusAction();

        validator.addValidators(Application.getConstants().client(),
                new NotEmptyValidator(sbClient.getSbClientSupplier().getTextBox(), true, "required")
                        .addActionForFailure(focusAction)
                        .addActionForFailure(new StyleAction("validation-failed")));
        validator.addValidators(Application.getConstants().name(),
                new NotEmptyValidator(name, true, "required")
                        .addActionForFailure(focusAction)
                        .addActionForFailure(new StyleAction("validation-failed")));
    }

    protected DisclosurePanel getErrorsPanel() {
        return errorsPanel;
    }

}
