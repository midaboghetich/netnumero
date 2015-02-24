package com.numhero.client.mvp.staff;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.util.CoreUtils;
import com.numhero.client.widget.NetNumeroButton;

public class StaffPanel extends AbstractEditEntityPanel {
    @Override
    protected void addValidators() {

    }

    interface StaffUiBinder extends UiBinder<VerticalPanel, StaffPanel> {
    }

    private static StaffUiBinder uiBinder = GWT.create(StaffUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    // contacts
    @UiField
    TextBox name;

    @UiField
    TextBox tbEmail;

    @UiField
    TextBox tbPhone;

    @UiField
    TextBox tbMobile;

    @UiField
    TextBox tbFax;

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
    TextArea billingRate;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private StaffC staffC;

    public StaffPanel() {
        initWidget(uiBinder.createAndBindUi(this));
        createValidator(errorsPanel);
    }

    public void setStaffC(StaffC staffC) {
        this.staffC = staffC;
        resetValidator();
        name.setValue(staffC.getName());
        tbEmail.setValue(staffC.getEmail());
        tbPhone.setValue(staffC.getPhone());
        tbMobile.setValue(staffC.getMobile());
        tbFax.setValue(staffC.getFax());
        tbAddress.setValue(staffC.getAddress());
        tbCity.setValue(staffC.getCity());
        tbRegion.setValue(staffC.getRegion());
        tbZipCode.setValue(staffC.getZipCode());
        tbCountry.setValue(staffC.getCountry());
        taNotes.setValue(staffC.getNotes());
        if (staffC.getBillingRate() != null) billingRate.setValue(staffC.getBillingRate().toString());
    }

    public boolean saveValuesFromUi() {

        boolean ret = validator.validate();
        if (ret) {

            staffC.setName(name.getValue());
            staffC.setEmail(tbEmail.getValue());
            staffC.setPhone(tbPhone.getValue());
            staffC.setFax(tbFax.getValue());
            staffC.setMobile(tbMobile.getValue());
            if (billingRate != null && billingRate.getValue() != null && !billingRate.getValue().isEmpty()) {
                CoreUtils.debug("billingRate.getValue():" + billingRate.getValue());
                staffC.setBillingRate(Double.parseDouble(billingRate.getValue()));
            }

            staffC.setPhone(tbPhone.getValue());
            staffC.setFax(tbFax.getValue());
            staffC.setAddress(tbAddress.getValue());
            staffC.setCity(tbCity.getValue());
            staffC.setRegion(tbRegion.getValue());
            staffC.setZipCode(tbZipCode.getValue());
            staffC.setCountry(tbCountry.getValue());
            staffC.setNotes(taNotes.getValue());
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

    public StaffC getStaffC() {
        return staffC;
    }

    protected DisclosurePanel getErrorsPanel() {
        return errorsPanel;
    }

    public TextBox getName() {
        return name;
    }
}