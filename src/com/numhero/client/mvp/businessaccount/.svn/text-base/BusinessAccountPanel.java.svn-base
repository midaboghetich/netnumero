package com.numhero.client.mvp.businessaccount;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.BusinessAccountC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.client.widget.TitleLevelOne;
import com.numhero.client.widget.combobox.CurrencyEnumComboBox;
import com.numhero.client.widget.textbox.NumberTextBox;
import com.numhero.shared.enums.DateFormatEnum;
import com.numhero.shared.enums.PaymentMethodEnum;
import com.numhero.shared.enums.TimeFormatEnum;

public class BusinessAccountPanel extends AbstractEditEntityPanel {

    interface BusinessAccountUiBinder extends UiBinder<VerticalPanel, BusinessAccountPanel> {
    }

    private static BusinessAccountUiBinder uiBinder = GWT.create(BusinessAccountUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField
    TitleLevelOne hdTitle;

    @UiField
    TextBox name;

    @UiField
    TextBox email;

    @UiField
    TextBox phoneNumber;

    @UiField
    TextBox faxNumber;

    @UiField
    TextBox vatRegistrationNumber;

    @UiField
    ListBox dateFormat;

    @UiField
    ListBox timeFormat;

    @UiField
    TextBox prefixes;

    @UiField
    CurrencyEnumComboBox currency;

    @UiField
    NumberTextBox defaultDaysDue;

    @UiField
    TextArea termsConditionsProducts;

    @UiField
    TextArea termsConditionsServices;

    @UiField
    TextBox taxes;

    @UiField
    ListBox preferredPaymentMethods;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private BusinessAccountC businessAccountC;


    public BusinessAccountC getBusinessAccountC() {
        return businessAccountC;
    }

    public BusinessAccountPanel() {
        initWidget(uiBinder.createAndBindUi(this));
        createValidator(errorsPanel);
    }

    public TextBox getName() {
        return name;
    }

    public TextBox getEmail() {
        return email;
    }

    public TextBox getPhoneNumber() {
        return phoneNumber;
    }

    public TextBox getFaxNumber() {
        return faxNumber;
    }

    public TextBox getVatRegistrationNumber() {
        return vatRegistrationNumber;
    }

    public ListBox getDateFormat() {
        return dateFormat;
    }

    public ListBox getTimeFormat() {
        return timeFormat;
    }

    public TextBox getPrefixes() {
        return prefixes;
    }


    public NumberTextBox getDefaultDaysDue() {
        return defaultDaysDue;
    }

    public TextArea getTermsConditionsProducts() {
        return termsConditionsProducts;
    }

    public TextArea getTermsConditionsServices() {
        return termsConditionsServices;
    }

    public TextBox getTaxes() {
        return taxes;
    }

    public ListBox getPreferredPaymentMethods() {
        return preferredPaymentMethods;
    }

    public TitleLevelOne getHdTitle() {
        return hdTitle;
    }

    public CurrencyEnumComboBox getCurrency() {
        return currency;
    }

    public void setName(TextBox name) {
        this.name = name;
    }

    public void setEmail(TextBox email) {
        this.email = email;
    }

    public void setPhoneNumber(TextBox phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaxNumber(TextBox faxNumber) {
        this.faxNumber = faxNumber;
    }

    public void setVatRegistrationNumber(TextBox vatRegistrationNumber) {
        this.vatRegistrationNumber = vatRegistrationNumber;
    }

    public void setDateFormat(ListBox dateFormat) {
        this.dateFormat = dateFormat;
    }

    public void setTimeFormat(ListBox timeFormat) {
        this.timeFormat = timeFormat;
    }

    public void setPrefixes(TextBox prefixes) {
        this.prefixes = prefixes;
    }

    public void setCurrency(CurrencyEnumComboBox currency) {
        this.currency = currency;
    }

    public void setDefaultDaysDue(NumberTextBox defaultDaysDue) {
        this.defaultDaysDue = defaultDaysDue;
    }

    public void setTermsConditionsProducts(TextArea termsConditionsProducts) {
        this.termsConditionsProducts = termsConditionsProducts;
    }

    public void setTermsConditionsServices(TextArea termsConditionsServices) {
        this.termsConditionsServices = termsConditionsServices;
    }

    public void setTaxes(TextBox taxes) {
        this.taxes = taxes;
    }

    public void setPreferredPaymentMethods(ListBox preferredPaymentMethods) {
        this.preferredPaymentMethods = preferredPaymentMethods;
    }

    public void setHdTitle(TitleLevelOne hdTitle) {
        this.hdTitle = hdTitle;
    }

    public NetNumeroButton getBtSearch() {
        return btSave;
    }

    public void setBtSave(NetNumeroButton btSave) {
        this.btSave = btSave;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    public void setBtCancel(NetNumeroButton btCancel) {
        this.btCancel = btCancel;
    }

    public void setBusinessAccountC(BusinessAccountC businessAccountC) {

        errorsPanel.setVisible(false);

        this.businessAccountC = businessAccountC;

        if (businessAccountC.getId() == null)
            hdTitle.setHTML(Application.getConstants().createNewSettings());
        else
            hdTitle.setHTML(Application.getConstants().editProject());

        getName().setText(businessAccountC.getName());
        getEmail().setText(businessAccountC.getEmail());
        getPhoneNumber().setText(businessAccountC.getPhoneNumber());
        getFaxNumber().setText(businessAccountC.getFaxNumber());
        getVatRegistrationNumber().setText(businessAccountC.getVatRegistrationNumber());
        if (businessAccountC.getDateFormat() != null)
            selectListBoxItem(getDateFormat(), businessAccountC.getDateFormat().name());
        if (businessAccountC.getTimeFormat() != null)
            selectListBoxItem(getTimeFormat(), businessAccountC.getTimeFormat().name());
        getPrefixes().setText(businessAccountC.getPrefixes());
        currency.setValue(businessAccountC.getCurrency());
        if (businessAccountC.getDefaultDaysDue() != null)
            getDefaultDaysDue().setAmount(businessAccountC.getDefaultDaysDue());
        getTermsConditionsProducts().setText(businessAccountC.getTermsConditionsProducts());
        getTermsConditionsServices().setText(businessAccountC.getTermsConditionsServices());
        getTaxes().setText(businessAccountC.getTaxes());
        if (businessAccountC.getPreferredPaymentMethods() != null)
            selectListBoxItem(getPreferredPaymentMethods(), businessAccountC.getPreferredPaymentMethods().name());

    }

    public boolean saveValuesFromUi() {
        boolean ret = validator.validate();
        if (ret) {
            businessAccountC.setName(getName().getText());
            businessAccountC.setEmail(getEmail().getText());
            businessAccountC.setPhoneNumber(getPhoneNumber().getText());
            businessAccountC.setFaxNumber(getFaxNumber().getText());
            businessAccountC.setVatRegistrationNumber(getVatRegistrationNumber().getText());
            businessAccountC.setDateFormat(DateFormatEnum.valueOf(getListBoxSelectValue(getDateFormat())));
            businessAccountC.setTimeFormat(TimeFormatEnum.valueOf(getListBoxSelectValue(getTimeFormat())));
            businessAccountC.setPrefixes(getPrefixes().getText());
            businessAccountC.setCurrency(currency.getValue());
            businessAccountC.setDefaultDaysDue((int) getDefaultDaysDue().getAmount());
            businessAccountC.setTermsConditionsProducts(getTermsConditionsProducts().getText());
            businessAccountC.setTermsConditionsServices(getTermsConditionsServices().getText());
            businessAccountC.setTaxes(getTaxes().getText());
            businessAccountC.setPreferredPaymentMethods(PaymentMethodEnum.valueOf(getListBoxSelectValue(getPreferredPaymentMethods())));
        } else {
            errorsPanel.setVisible(true);
        }
        return ret;
    }

    @Override
    protected void addValidators() {
    }

}
