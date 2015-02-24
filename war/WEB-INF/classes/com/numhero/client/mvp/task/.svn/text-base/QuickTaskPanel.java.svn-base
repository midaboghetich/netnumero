package com.numhero.client.mvp.task;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.inject.Inject;
import com.numhero.client.model.datacargo.client_supplier.ClientListRequest;
import com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.mvp.clientsupplier.ClientSelect;
import com.numhero.client.service.Service;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.shared.enums.ClientSupplierEnum;

public class QuickTaskPanel extends AbstractEditEntityPanel implements ClientSelect.ClientSupplierSelectHandler {
    interface TaskUiBinder extends UiBinder<VerticalPanel, QuickTaskPanel> {
    }

    private static TaskUiBinder uiBinder = GWT.create(TaskUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField(provided = true)
    ClientSelect sbClient;

    @UiField
    TextBox name;

    @UiField
    TextBox description;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private TaskC taskC;

    @Inject
    public QuickTaskPanel(
            Service<ClientListRequest, ClientSupplierListResponse> clientSuppliersService,
            Service<SaveClientSupplierRequest, SaveClientSupplierResponse> clientSupplierSaveService) {

        sbClient = new ClientSelect(clientSuppliersService, clientSupplierSaveService, ClientSupplierEnum.client);
        sbClient.setHandler(this);

        initWidget(uiBinder.createAndBindUi(this));

        createValidator(errorsPanel);
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
        } else {
            errorsPanel.setVisible(true);
        }
        return ret;
    }

    public void setTask(TaskC t) {
        this.taskC = t;
        resetValidator();
        sbClient.setClientSupplier(taskC.getClientSupplierID(), taskC.getClientSupplierName());
        name.setValue(taskC.getName());
        description.setValue(taskC.getDescription());
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