package com.numhero.server.convert;

import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.BusinessAccountC;
import com.numhero.server.model.pojo.BusinessAccount;

@Singleton
public class BusinessAccountConverter {

    public void mergeIntoBusinessAccount(BusinessAccountC baC, BusinessAccount ba) {
        ba.setId(baC.getId());
        if (baC.getName() != null) ba.setName(baC.getName());
        if (baC.getEmail() != null) ba.setEmail(baC.getEmail());
        if (baC.getPhoneNumber() != null) ba.setPhoneNumber(baC.getPhoneNumber());
        if (baC.getFaxNumber() != null) ba.setFaxNumber(baC.getFaxNumber());
        if (baC.getVatRegistrationNumber() != null) ba.setVatRegistrationNumber(baC.getVatRegistrationNumber());
        if (baC.getDateFormat() != null) ba.setDateFormat(baC.getDateFormat());
        if (baC.getTimeFormat() != null) ba.setTimeFormat(baC.getTimeFormat());
        if (baC.getPrefixes() != null) ba.setPrefixes(baC.getPrefixes());
        if (baC.getCurrency() != null) ba.setCurrency(baC.getCurrency());
        if (baC.getDefaultDaysDue() != null) ba.setDefaultDaysDue(baC.getDefaultDaysDue());
        if (baC.getTermsConditionsProducts() != null) ba.setTermsConditionsProducts(baC.getTermsConditionsProducts());
        if (baC.getTermsConditionsServices() != null) ba.setTermsConditionsServices(baC.getTermsConditionsServices());
        if (baC.getTaxes() != null) ba.setTaxes(baC.getTaxes());
        if (baC.getPreferredPaymentMethods() != null) ba.setPreferredPaymentMethods(baC.getPreferredPaymentMethods());
        if (baC.getCreated() != null) ba.setCreated(baC.getCreated());

    }

    public BusinessAccountC toBusinessAccountC(BusinessAccount ba) {

        BusinessAccountC baC = new BusinessAccountC();

        baC.setId(ba.getId());
        baC.setName(ba.getName());
        baC.setEmail(ba.getEmail());
        baC.setPhoneNumber(ba.getPhoneNumber());
        baC.setFaxNumber(ba.getFaxNumber());
        baC.setVatRegistrationNumber(ba.getVatRegistrationNumber());
        baC.setDateFormat(ba.getDateFormat());
        baC.setTimeFormat(ba.getTimeFormat());
        baC.setPrefixes(ba.getPrefixes());
        baC.setCurrency(ba.getCurrency());
        baC.setDefaultDaysDue(ba.getDefaultDaysDue());
        baC.setTermsConditionsProducts(ba.getTermsConditionsProducts());
        baC.setTermsConditionsServices(ba.getTermsConditionsServices());
        baC.setTaxes(ba.getTaxes());
        baC.setPreferredPaymentMethods(ba.getPreferredPaymentMethods());
        baC.setCreated(ba.getCreated());

        return baC;
    }
}
