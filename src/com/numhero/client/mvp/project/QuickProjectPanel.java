package com.numhero.client.mvp.project;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.client_supplier.ClientListRequest;
import com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.mvp.clientsupplier.ClientSelect;
import com.numhero.client.service.Service;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.shared.enums.ClientSupplierEnum;
import eu.maydu.gwt.validation.client.actions.FocusAction;
import eu.maydu.gwt.validation.client.actions.StyleAction;
import eu.maydu.gwt.validation.client.validators.standard.NotEmptyValidator;

public class QuickProjectPanel extends AbstractEditEntityPanel implements ClientSelect.ClientSupplierSelectHandler {
    interface ProjectUiBinder extends UiBinder<HTMLPanel, QuickProjectPanel> {
    }

    private static ProjectUiBinder uiBinder = GWT.create(ProjectUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField(provided = true)
    ClientSelect sbClient;

    @UiField
    TextBox name;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private ProjectC projectC;


    @Inject
    public QuickProjectPanel(Service<ClientListRequest, ClientSupplierListResponse> clientSuppliersService,
                             Service<SaveClientSupplierRequest, SaveClientSupplierResponse> clientSupplierSaveService) {

        sbClient = new ClientSelect(clientSuppliersService, clientSupplierSaveService, ClientSupplierEnum.client);
        sbClient.setHandler(this);
        initWidget(uiBinder.createAndBindUi(this));
        createValidator(errorsPanel);
    }

    public NetNumeroButton getBtSearch() {
        return btSave;
    }

    public void setProjectC(ProjectC projectC) {
        this.projectC = projectC;
        resetValidator();
        sbClient.setClientSupplier(projectC.getClientSupplierID(), projectC.getClientSupplierName());
        name.setValue(projectC.getName());
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