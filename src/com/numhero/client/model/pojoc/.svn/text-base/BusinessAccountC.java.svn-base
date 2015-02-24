package com.numhero.client.model.pojoc;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.numhero.shared.enums.CurrencyEnum;
import com.numhero.shared.enums.DateFormatEnum;
import com.numhero.shared.enums.PaymentMethodEnum;
import com.numhero.shared.enums.TimeFormatEnum;
import com.numhero.shared.pojoc.BasePojoC;

public class BusinessAccountC extends BasePojoC implements IsSerializable {

    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private static final String PHONE_NUMBER = "phoneNumber";
    private static final String FAX_NUMBER = "faxNumber";
    private static final String VAT = "vatRegistrationNumber";
    private static final String DATE_FORMAT = "dateFormat";
    private static final String TIME_FORMAT = "timeFormat";
    private static final String PREFIXES = "prefixes";
    private static final String CURRENCY = "currency";
    private static final String DEFAULT_DAYS_DUE = "defaultDaysDue";
    private static final String TERMS_CONDITIONS_PRODUCTS = "termsConditionsProducts";
    private static final String TERMS_CONDITIONS_SERVICES = "termsConditionsServices";
    private static final String TAXES = "taxes";
    private static final String PREFERRED_PAYMENT_METHODS = "preferredPaymentMethods";

    public BusinessAccountC() {
    }

    public String getName() {
        return getAttributeAsString(NAME);
    }

    public void setName(String name) {
        setAttribute(NAME, name);
    }

    public String getEmail() {
        return getAttributeAsString(EMAIL);
    }

    public void setEmail(String email) {
        setAttribute(EMAIL, email);
    }

    public String getPhoneNumber() {
        return getAttributeAsString(PHONE_NUMBER);
    }

    public void setPhoneNumber(String phoneNumber) {
        setAttribute(PHONE_NUMBER, phoneNumber);
    }

    public String getFaxNumber() {
        return getAttributeAsString(FAX_NUMBER);
    }

    public void setFaxNumber(String faxNumber) {
        setAttribute(FAX_NUMBER, faxNumber);
    }

    public String getVatRegistrationNumber() {
        return getAttributeAsString(VAT);
    }

    public void setVatRegistrationNumber(String vatRegistrationNumber) {
        setAttribute(VAT, vatRegistrationNumber);
    }

    public DateFormatEnum getDateFormat() {
        String type = getAttributeAsString(DATE_FORMAT);
        return type == null ? null : DateFormatEnum.getByValue(type);
    }

    public void setDateFormat(DateFormatEnum dateFormat) {
        if (dateFormat != null) {
            setAttribute(DATE_FORMAT, dateFormat.name());
        }
    }

    public TimeFormatEnum getTimeFormat() {
        String type = getAttributeAsString(TIME_FORMAT);
        return type == null ? null : TimeFormatEnum.getByValue(type);
    }

    public void setTimeFormat(TimeFormatEnum timeFormat) {
        if (timeFormat != null) {
            setAttribute(TIME_FORMAT, timeFormat.name());
        }
    }

    public String getPrefixes() {
        return getAttributeAsString(PREFIXES);
    }

    public void setPrefixes(String prefixes) {
        setAttribute(PREFIXES, prefixes);
    }

    public CurrencyEnum getCurrency() {
        String type = getAttributeAsString(CURRENCY);
        return type == null ? null : CurrencyEnum.valueOf(type);
    }

    public void setCurrency(CurrencyEnum currency) {
        if (currency != null) {
            setAttribute(CURRENCY, currency.name());
        }
    }

    public Integer getDefaultDaysDue() {
        return getAttributeAsInteger(DEFAULT_DAYS_DUE);
    }

    public void setDefaultDaysDue(Integer defaultDaysDue) {
        setAttribute(DEFAULT_DAYS_DUE, defaultDaysDue);
    }

    public String getTermsConditionsProducts() {
        return getAttributeAsString(TERMS_CONDITIONS_PRODUCTS);
    }

    public void setTermsConditionsProducts(String termsConditionsProducts) {
        setAttribute(TERMS_CONDITIONS_PRODUCTS, termsConditionsProducts);
    }

    public String getTermsConditionsServices() {
        return getAttributeAsString(TERMS_CONDITIONS_SERVICES);
    }

    public void setTermsConditionsServices(String termsConditionsServices) {
        setAttribute(TERMS_CONDITIONS_SERVICES, termsConditionsServices);
    }

    public String getTaxes() {
        return getAttributeAsString(TAXES);
    }

    public void setTaxes(String taxes) {
        setAttribute(TAXES, taxes);
    }

    public PaymentMethodEnum getPreferredPaymentMethods() {
        String method = getAttributeAsString(PREFERRED_PAYMENT_METHODS);
        return method == null ? null : PaymentMethodEnum.valueOf(method);
    }

    public void setPreferredPaymentMethods(PaymentMethodEnum preferredPaymentMethods) {
        if (preferredPaymentMethods != null) {
            setAttribute(PREFERRED_PAYMENT_METHODS, preferredPaymentMethods.name());
        }
    }
}
