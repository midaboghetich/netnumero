package com.numhero.server.model.pojo;

import com.numhero.shared.enums.CurrencyEnum;
import com.numhero.shared.enums.DateFormatEnum;
import com.numhero.shared.enums.PaymentMethodEnum;
import com.numhero.shared.enums.TimeFormatEnum;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;


@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class BusinessAccount extends Versionable implements Serializable {
    private static final long serialVersionUID = -242375757859030316L;

    //how to make it unique?? UB
    @Persistent
    private String name;

    @Persistent
    private String email;

    @Persistent
    private String phoneNumber;

    @Persistent
    private String faxNumber;

    @Persistent
    private String vatRegistrationNumber;

    @Persistent
    private DateFormatEnum dateFormat;

    @Persistent
    private TimeFormatEnum timeFormat;

    @Persistent
    private String prefixes;

    @Persistent
    private CurrencyEnum currency;

    @Persistent
    private Integer defaultDaysDue;

    @Persistent
    private String termsConditionsProducts;

    @Persistent
    private String termsConditionsServices;

    @Persistent
    private String taxes;

    @Persistent
    private PaymentMethodEnum preferredPaymentMethods;

    /*  todo
    @Persistent
    private Blob companyLogo;
    */

    public BusinessAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getVatRegistrationNumber() {
        return vatRegistrationNumber;
    }

    public void setVatRegistrationNumber(String vatRegistrationNumber) {
        this.vatRegistrationNumber = vatRegistrationNumber;
    }

    public DateFormatEnum getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormatEnum dateFormat) {
        this.dateFormat = dateFormat;
    }

    public TimeFormatEnum getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(TimeFormatEnum timeFormat) {
        this.timeFormat = timeFormat;
    }

    public String getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(String prefixes) {
        this.prefixes = prefixes;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    public Integer getDefaultDaysDue() {
        return defaultDaysDue;
    }

    public void setDefaultDaysDue(Integer defaultDaysDue) {
        this.defaultDaysDue = defaultDaysDue;
    }

    public String getTermsConditionsProducts() {
        return termsConditionsProducts;
    }

    public void setTermsConditionsProducts(String termsConditionsProducts) {
        this.termsConditionsProducts = termsConditionsProducts;
    }

    public String getTermsConditionsServices() {
        return termsConditionsServices;
    }

    public void setTermsConditionsServices(String termsConditionsServices) {
        this.termsConditionsServices = termsConditionsServices;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    public PaymentMethodEnum getPreferredPaymentMethods() {
        return preferredPaymentMethods;
    }

    public void setPreferredPaymentMethods(PaymentMethodEnum preferredPaymentMethods) {
        this.preferredPaymentMethods = preferredPaymentMethods;
    }
}
