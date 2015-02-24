package com.numhero.client.model.pojoc;

import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.shared.enums.StaffTypeEnum;
import com.numhero.shared.pojoc.BasePojoC;

public class StaffC extends BasePojoC implements Suggestion {

    private static final String STAFF_TYPE =    "staffType";
    private static final String NAME =          "name";
    private static final String EMAIL =         "email";
    private static final String BILLING_RATE =  "billingRate";
    private static final String PHONE =         "contactPhone";
    private static final String MOBILE =        "mobile";
    private static final String FAX =           "companyFax";
    private static final String ADDRESS =       "address";
    private static final String CITY =          "city";
    private static final String REGION =        "region";
    private static final String ZIP_CODE =      "zipCode";
    private static final String COUNTRY =       "country";
    private static final String NOTES =         "notes";
    private static final String PROJECT_ID =    "projectId";
    private static final String TASK_ID =       "taskId";

    public StaffC() {
        init();
    }

    public void init() {
        setName(null);
    }

    public StaffTypeEnum getStaffType() {
        String type = getAttributeAsString(STAFF_TYPE);
        return type == null ? null : StaffTypeEnum.valueOf(type);
    }

    public void setStaffType(StaffTypeEnum staffType) {
        if (staffType != null) {
            setAttribute(STAFF_TYPE, staffType.name());
        }
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

    public Double getBillingRate() {
        return getAttributeAsDouble(BILLING_RATE);
    }

    public void setBillingRate(Double billingRate) {
        setAttribute(BILLING_RATE, billingRate);
    }

    public String getPhone() {
        return getAttributeAsString(PHONE);
    }

    public void setPhone(String contactPhone) {
        setAttribute(PHONE, contactPhone);
    }

    public String getMobile() {
        return getAttributeAsString(MOBILE);
    }

    public void setMobile(String contactPhone) {
        setAttribute(MOBILE, contactPhone);
    }

    public String getFax() {
        return getAttributeAsString(FAX);
    }

    public void setFax(String companyFax) {
        setAttribute(FAX, companyFax);
    }

    public String getAddress() {
        return getAttributeAsString(ADDRESS);
    }

    public void setAddress(String address) {
        setAttribute(ADDRESS, address);
    }

    public String getCity() {
        return getAttributeAsString(CITY);
    }

    public void setCity(String city) {
        setAttribute(CITY, city);
    }

    public String getRegion() {
        return getAttributeAsString(REGION);
    }

    public void setRegion(String region) {
        setAttribute(REGION, region);
    }

    public String getZipCode() {
        return getAttributeAsString(ZIP_CODE);
    }

    public void setZipCode(String zipCode) {
        setAttribute(ZIP_CODE, zipCode);
    }

    public String getCountry() {
        return getAttributeAsString(COUNTRY);
    }

    public void setCountry(String country) {
        setAttribute(COUNTRY, country);
    }

    public String getNotes() {
        return getAttributeAsString(NOTES);
    }

    public void setNotes(String notes) {
        setAttribute(NOTES, notes);
    }

    public String getProjectId() {
        return getAttributeAsString(PROJECT_ID);
    }

    public void setProjectId(String projectId) {
        setAttribute(PROJECT_ID, projectId);
    }

    public String getTaskId() {
        return getAttributeAsString(TASK_ID);
    }

    public void setTaskId(String taskId) {
        setAttribute(TASK_ID, taskId);
    }

    @Override
    public String getDisplayString() {
        return getName();
    }

    @Override
    public String getReplacementString() {
        return getName();
    }
}