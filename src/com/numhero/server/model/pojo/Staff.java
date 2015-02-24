package com.numhero.server.model.pojo;

import com.numhero.server.search.IsSearchable;
import com.numhero.shared.enums.StaffTypeEnum;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;


@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class Staff extends Searchable implements Serializable {

    @Persistent
    private StaffTypeEnum type;

    @Persistent
    @IsSearchable(byStartWith = true)
    private String name;

    @Persistent
    private String email;

    @Persistent
    private Double billingRate;

    @Persistent
    private String contactPhone;

    @Persistent
    private String mobile;

    @Persistent
    private String companyFax;

    @Persistent
    private String address;

    @Persistent
    private String city;

    @Persistent
    private String region;

    @Persistent
    private String zipCode;

    @Persistent
    private String country;

    @Persistent
    private String notes;

    @Persistent
    private String projectId;

    @Persistent
    private String taskId;

    public Staff() {
    }

    public StaffTypeEnum getType() {
        return type;
    }

    public void setType(StaffTypeEnum type) {
        this.type = type;
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

    public Double getBillingRate() {
        return billingRate;
    }

    public void setBillingRate(Double billingRate) {
        this.billingRate = billingRate;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getCompanyFax() {
        return companyFax;
    }

    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
