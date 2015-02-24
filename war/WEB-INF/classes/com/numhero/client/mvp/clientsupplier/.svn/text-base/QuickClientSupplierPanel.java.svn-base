package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.model.pojoc.ClientSupplierContactC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.widget.NetNumeroButton;
import eu.maydu.gwt.validation.client.actions.FocusAction;
import eu.maydu.gwt.validation.client.actions.StyleAction;
import eu.maydu.gwt.validation.client.validators.standard.NotEmptyValidator;

public class QuickClientSupplierPanel extends AbstractEditEntityPanel {
    interface ClientSupplierUiBinder extends UiBinder<Widget, QuickClientSupplierPanel> {
    }

    private static ClientSupplierUiBinder uiBinder = GWT.create(ClientSupplierUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField
    TextBox name;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private ClientSupplierC clientSupplierC;

    public QuickClientSupplierPanel() {
        initWidget(uiBinder.createAndBindUi(this));
        createValidator(errorsPanel);
    }

    public void setClientSupplierC(ClientSupplierC clientSupplierC) {
        this.clientSupplierC = clientSupplierC;
        errorsPanel.setVisible(false);
        resetValidator();
        name.setValue(clientSupplierC.getCompanyName());
    }

    public boolean saveValuesFromUi() {
        boolean ret = validator.validate();
        if (ret) {
            if (clientSupplierC.getContacts().isEmpty()) {
                clientSupplierC.addContact(new ClientSupplierContactC());
            }
            clientSupplierC.setCompanyName(name.getValue());
        } else {
            errorsPanel.setVisible(true);
        }
        return ret;
    }

    public NetNumeroButton getBtSearch() {
        return btSave;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    public TextBox getName() {
        return name;
    }

    public void setName(TextBox name) {
        this.name = name;
    }

    protected DisclosurePanel getErrorsPanel() {
        return errorsPanel;
    }


    public ClientSupplierC getClientSupplierC() {
        return clientSupplierC;
    }

    @Override
    protected void addValidators() {
        FocusAction<FocusWidget> focusAction = new FocusAction<FocusWidget>();
        validator.addValidators("Description" + this,
                new NotEmptyValidator(name, true, "required")
                        .addActionForFailure(focusAction)
                        .addActionForFailure(new StyleAction<UIObject>("validation-failed")));

    }


}