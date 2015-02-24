package com.numhero.client.model.pojoc;

import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.shared.enums.ClientSupplierEnum;
import com.numhero.shared.enums.SendInvoiceTypeEnum;
import com.numhero.shared.pojoc.NewBasePojoC;
import com.numhero.shared.pojoc.field.EnumField;
import com.numhero.shared.pojoc.field.StringField;

import java.util.ArrayList;
import java.util.List;

public class ClientSupplierC extends NewBasePojoC implements Suggestion {

    public EnumField<ClientSupplierEnum> fType = enumField("type", ClientSupplierEnum.both);
    public EnumField<SendInvoiceTypeEnum> fSendInvoiceType = enumField("sendInvoiceType", SendInvoiceTypeEnum.Email);
    public StringField fCompanyName = stringField("companyName", 30);
    public StringField fCompanyPhone = stringField("companyPhone", 15);
    public StringField fCompanyFax = stringField("companyFax", 15);
    public StringField fAddress = stringField("address", 30);
    public StringField fCity = stringField("city", 30);
    public StringField fRegion = stringField("region", 30);
    public StringField fZipCode = stringField("zipCode", 30);
    public StringField fCountry = stringField("country", 30);
    public StringField fNotes = stringField("notes", 3000);

    List<ClientSupplierContactC> contacts = new ArrayList<ClientSupplierContactC>();

    public ClientSupplierC() {
        super();
       
    }

    public ClientSupplierEnum getType() {
        return (ClientSupplierEnum) fType.getValue();
    }

    public void setType(ClientSupplierEnum value) {
        fType.setValue(value);
    }


    public SendInvoiceTypeEnum getSendInvoiceType() {
        return fSendInvoiceType.getValue();
    }

    public void setSendInvoiceType(SendInvoiceTypeEnum value) {
        fSendInvoiceType.setValue(value);
    }

    public String getCompanyName() {
        return fCompanyName.getValue();
    }

    public void setCompanyName(String name) {
        fCompanyName.setValue(name);
    }

    public String getCompanyPhone() {
        return fCompanyPhone.getValue();
    }

    public void setCompanyPhone(String phone) {
        fCompanyPhone.setValue(phone);
    }

    public String getCompanyFax() {
        return fCompanyFax.getValue();
    }

    public void setCompanyFax(String fax) {
        fCompanyFax.setValue(fax);
    }

    public String getAddress() {
        return fAddress.getValue();
    }

    public void setAddress(String address) {
        fAddress.setValue(address);
    }

    public String getCity() {
        return fCity.getValue();
    }

    public void setCity(String city) {
        fCity.setValue(city);
    }

    public String getRegion() {
        return fRegion.getValue();
    }

    public void setRegion(String region) {
        fRegion.setValue(region);
    }

    public String getZipCode() {
        return fZipCode.getValue();
    }

    public void setZipCode(String zipCode) {
        fZipCode.setValue(zipCode);
    }

    public String getCountry() {
        return fCountry.getValue();
    }

    public void setCountry(String country) {
        fCountry.setValue(country);
    }

    public String getNotes() {
        return fNotes.getValue();
    }

    public void setNotes(String notes) {
        fNotes.setValue(notes);
    }

    public List<ClientSupplierContactC> getContacts() {
        return contacts;
    }

    public void setContacts(List<ClientSupplierContactC> contacts) {
        this.contacts = contacts;
    }

    public void addContact(ClientSupplierContactC contact) {
        contacts.add(contact);
    }

    public void deleteContact(ClientSupplierContactC contact) {
        contacts.remove(contact);
    }

    public String getDisplayString() {
        return getCompanyName();
    }

    public String getReplacementString() {
        return getCompanyName();
    }

}
