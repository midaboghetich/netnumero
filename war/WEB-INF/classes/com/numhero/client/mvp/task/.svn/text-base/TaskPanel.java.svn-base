package com.numhero.client.mvp.task;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.client_supplier.ClientListRequest;
import com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.client.model.pojoc.TaskStaffDetailC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.mvp.clientsupplier.ClientSelect;
import com.numhero.client.service.Service;
import com.numhero.client.widget.CustomFormatDateBox;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.client.widget.TitleLevelOne;
import com.numhero.shared.enums.ClientSupplierEnum;

public class TaskPanel extends AbstractEditEntityPanel implements ClientSelect.ClientSupplierSelectHandler {
    interface TaskUiBinder extends UiBinder<VerticalPanel, TaskPanel> {
    }

    private static TaskUiBinder uiBinder = GWT.create(TaskUiBinder.class);

    @UiField
    TitleLevelOne hdTitle;

    @UiField
    DisclosurePanel errorsPanel;

    @UiField(provided = true)
    ClientSelect sbClient;

    @UiField
    TextBox name;

    @UiField
    TextBox description;

    @UiField
    TextBox rate;

    @UiField
    CustomFormatDateBox created;

    @UiField
    CheckBox billable;

    @UiField
    TextBox timeUnit;

    @UiField
    ListBox timeEntryUnit;

    @UiField
    ListBox state;

    @UiField(provided = true)
    TaskStaffDetailsTable taskStaffDetailsTable;

    @UiField
    NetNumeroButton btAddStaff;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private TaskC taskC;

    @Inject
    public TaskPanel(
            Service<ClientListRequest, ClientSupplierListResponse> clientSuppliersService,
            Service<SaveClientSupplierRequest, SaveClientSupplierResponse> clientSupplierSaveService,
            TaskStaffDetailsTable sdt) {
        taskStaffDetailsTable = sdt;

        sbClient = new ClientSelect(clientSuppliersService, clientSupplierSaveService, ClientSupplierEnum.client);
        sbClient.setHandler(this);

        initWidget(uiBinder.createAndBindUi(this));

        createValidator(errorsPanel);
        taskStaffDetailsTable.setValidator(validator);

        btAddStaff.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                TaskStaffDetailC idc2 = new TaskStaffDetailC();
                taskC.getTaskStaffDetailsC().add(idc2);
                taskStaffDetailsTable.addLine(idc2);
                taskStaffDetailsTable.setValues();
            }
        });
    }

    @Override
    public void clientSupplierChanged(ClientSupplierC clientSupplierC) {
        taskC.setClientSupplierID(clientSupplierC.getId());
        taskC.setClientSupplierName(clientSupplierC.getCompanyName());
    }

    public TextBox getName() {
        return name;
    }

    public void setName(TextBox name) {
        this.name = name;
    }

    public TextBox getDescription() {
        return description;
    }

    public void setDescription(TextBox description) {
        this.description = description;
    }

    public TextBox getRate() {
        return rate;
    }

    public void setRate(TextBox rate) {
        this.rate = rate;
    }

    public CustomFormatDateBox getCreated() {
        return created;
    }

    public void setCreated(CustomFormatDateBox created) {
        this.created = created;
    }

    public CheckBox getBillable() {
        return billable;
    }

    public void setBillable(CheckBox billable) {
        this.billable = billable;
    }

    public ListBox getState() {
        return state;
    }

    public void setState(ListBox state) {
        this.state = state;
    }

    public NetNumeroButton getBtSearch() {
        return btSave;
    }

    public void setBtSave(NetNumeroButton btSave) {
        this.btSave = btSave;
    }

    public boolean saveValuesFromUi() {
        boolean ret = validator.validate();
        if (ret) {

            taskC.setName(getName().getText());
            taskC.setDescription(getDescription().getText());
            taskC.setCreated(getCreated().getValue());
            taskC.setBillable(getBillable().getValue());
            if (taskC.getState() != null) selectListBoxItem(getState(), taskC.getState().name());
            if (getRate().getValue() != null && !getRate().getValue().isEmpty())
                taskC.setRate(Double.parseDouble(getRate().getValue()));
        } else {
            errorsPanel.setVisible(true);
        }
        return ret;
    }

    public void setTask(TaskC t) {

        this.taskC = t;

        resetValidator();


        if (taskC.getId() == null) {
            hdTitle.setHTML(Application.getConstants().createNewTask());
        } else {
            hdTitle.setHTML(Application.getConstants().editTask());
        }

        sbClient.setClientSupplier(taskC.getClientSupplierID(), taskC.getClientSupplierName());
        taskStaffDetailsTable.setTaskC(taskC);
        created.setValue(taskC.getCreated());
        name.setValue(taskC.getName());
        description.setValue(taskC.getDescription());

        billable.setValue(taskC.getBillable());
        if (taskC.getRate() != null) rate.setValue(taskC.getRate().toString());
        if (taskC.getState() != null) selectListBoxItem(state, taskC.getState().name());
    }

    public TitleLevelOne getHdTitle() {
        return hdTitle;
    }

    public void setHdTitle(TitleLevelOne hdTitle) {
        this.hdTitle = hdTitle;
    }

    public TextBox getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TextBox timeUnit) {
        this.timeUnit = timeUnit;
    }

    public ListBox getTimeEntryUnit() {
        return timeEntryUnit;
    }

    public void setTimeEntryUnit(ListBox timeEntryUnit) {
        this.timeEntryUnit = timeEntryUnit;
    }

    public TaskStaffDetailsTable getTaskStaffDetailsTable() {
        return taskStaffDetailsTable;
    }

    public void setTaskStaffDetailsTable(TaskStaffDetailsTable taskStaffDetailsTable) {
        this.taskStaffDetailsTable = taskStaffDetailsTable;
    }

    public NetNumeroButton getBtAddStaff() {
        return btAddStaff;
    }

    public void setBtAddStaff(NetNumeroButton btAddStaff) {
        this.btAddStaff = btAddStaff;
    }

    public ClientSelect getSbClientSupplier() {
        return sbClient;
    }

    public void setSbClientSupplier(ClientSelect sbClient) {
        this.sbClient = sbClient;
    }

    public ClientSelect getSbClient() {
        return sbClient;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    public TaskC getTaskC() {
        return taskC;
    }

    @Override
    protected void addValidators() {

    }

    protected DisclosurePanel getErrorsPanel() {
        return errorsPanel;
    }

}