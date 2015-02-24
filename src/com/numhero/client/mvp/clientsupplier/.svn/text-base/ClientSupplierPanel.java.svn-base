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

public class ClientSupplierPanel extends AbstractEditEntityPanel {

    interface ClientSupplierUiBinder extends UiBinder<Widget, ClientSupplierPanel> {
    }

    private static ClientSupplierUiBinder uiBinder = GWT.create(ClientSupplierUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField
    TextBox name;

    @UiField
    TextBox tbEmail;

    @UiField
    TextBox tbPhone;

    @UiField
    TextBox tbMobile;

    @UiField
    TextBox tbCompanyName;

    @UiField
    TextBox tbCompanyPhone;

    @UiField
    TextBox tbCompanyFax;

    @UiField
    TextBox tbAddress;

    @UiField
    TextBox tbCity;

    @UiField
    TextBox tbRegion;

    @UiField
    TextBox tbZipCode;

    @UiField
    TextBox tbCountry;

    @UiField
    TextArea taNotes;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private ClientSupplierC clientSupplierC;


    public ClientSupplierPanel() {
        initWidget(uiBinder.createAndBindUi(this));
        createValidator(errorsPanel);
    }

    public void setClientSupplierC(ClientSupplierC clientSupplierC) {
        this.clientSupplierC = clientSupplierC;

        errorsPanel.setVisible(false);

        resetValidator();

        if (!clientSupplierC.getContacts().isEmpty()) {
            ClientSupplierContactC contact = clientSupplierC.getContacts().get(0);
            name.setValue(contact.getName());
            tbEmail.setValue(contact.getEmail());
            tbPhone.setValue(contact.getPhone());
            tbMobile.setValue(contact.getMobile());
        }

        tbCompanyName.setValue(clientSupplierC.getCompanyName());
        tbAddress.setValue(clientSupplierC.getAddress());
        tbCity.setValue(clientSupplierC.getCity());
        tbRegion.setValue(clientSupplierC.getRegion());
        tbZipCode.setValue(clientSupplierC.getZipCode());
        tbCountry.setValue(clientSupplierC.getCountry());
        taNotes.setValue(clientSupplierC.getNotes());
    }

    public boolean saveValuesFromUi() {

        boolean ret = validator.validate();
        if (ret) {

            if (clientSupplierC.getContacts().isEmpty()) {
                clientSupplierC.addContact(new ClientSupplierContactC());
            }

            ClientSupplierContactC contact = clientSupplierC.getContacts().get(0);
            contact.setName(name.getValue());
            contact.setEmail(tbEmail.getValue());
            contact.setPhone(tbPhone.getValue());
            contact.setMobile(tbMobile.getValue());

            clientSupplierC.setCompanyName(tbCompanyName.getValue());
            clientSupplierC.setCompanyPhone(tbCompanyPhone.getValue());
            clientSupplierC.setCompanyFax(tbCompanyFax.getValue());
            clientSupplierC.setAddress(tbAddress.getValue());
            clientSupplierC.setCity(tbCity.getValue());
            clientSupplierC.setRegion(tbRegion.getValue());
            clientSupplierC.setZipCode(tbZipCode.getValue());
            clientSupplierC.setCountry(tbCountry.getValue());
            clientSupplierC.setNotes(taNotes.getValue());
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

    public TextBox getTbEmail() {
        return tbEmail;
    }

    public void setTbEmail(TextBox tbEmail) {
        this.tbEmail = tbEmail;
    }

    public TextBox getTbPhone() {
        return tbPhone;
    }

    public void setTbPhone(TextBox tbPhone) {
        this.tbPhone = tbPhone;
    }

    public TextBox getTbMobile() {
        return tbMobile;
    }

    public void setTbMobile(TextBox tbMobile) {
        this.tbMobile = tbMobile;
    }

    public TextBox getTbCompanyName() {
        return tbCompanyName;
    }

    public void setTbCompanyName(TextBox tbCompanyName) {
        this.tbCompanyName = tbCompanyName;
    }

    public TextBox getTbCompanyPhone() {
        return tbCompanyPhone;
    }

    public void setTbCompanyPhone(TextBox tbCompanyPhone) {
        this.tbCompanyPhone = tbCompanyPhone;
    }

    public TextBox getTbCompanyFax() {
        return tbCompanyFax;
    }

    public void setTbCompanyFax(TextBox tbCompanyFax) {
        this.tbCompanyFax = tbCompanyFax;
    }

    public TextBox getTbAddress() {
        return tbAddress;
    }

    public void setTbAddress(TextBox tbAddress) {
        this.tbAddress = tbAddress;
    }

    public TextBox getTbCity() {
        return tbCity;
    }

    public void setTbCity(TextBox tbCity) {
        this.tbCity = tbCity;
    }

    public TextBox getTbRegion() {
        return tbRegion;
    }

    public void setTbRegion(TextBox tbRegion) {
        this.tbRegion = tbRegion;
    }

    public TextBox getTbZipCode() {
        return tbZipCode;
    }

    public void setTbZipCode(TextBox tbZipCode) {
        this.tbZipCode = tbZipCode;
    }

    public TextBox getTbCountry() {
        return tbCountry;
    }

    public void setTbCountry(TextBox tbCountry) {
        this.tbCountry = tbCountry;
    }

    public TextArea getTaNotes() {
        return taNotes;
    }

    public void setTaNotes(TextArea taNotes) {
        this.taNotes = taNotes;
    }

    public ClientSupplierC getClientSupplierC() {
        return clientSupplierC;
    }

    public void setBtSave(NetNumeroButton btSave) {
        this.btSave = btSave;
    }

    public void setBtCancel(NetNumeroButton btCancel) {
        this.btCancel = btCancel;
    }

    protected DisclosurePanel getErrorsPanel() {
        return errorsPanel;
    }

    @Override
    protected void addValidators() {
        FocusAction<FocusWidget> focusAction = new FocusAction<FocusWidget>();
        validator.addValidators("Description" + this,
                new NotEmptyValidator(tbCompanyName, true, "required")
                        .addActionForFailure(focusAction)
                        .addActionForFailure(new StyleAction<UIObject>("validation-failed")));
    }
}
