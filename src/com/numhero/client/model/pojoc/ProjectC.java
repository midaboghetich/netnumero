package com.numhero.client.model.pojoc;

import com.google.gwt.user.client.ui.SuggestOracle;
import com.numhero.shared.enums.ProjectStateEnum;
import com.numhero.shared.pojoc.BasePojoC;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectC extends BasePojoC implements SuggestOracle.Suggestion {

    private static final String NAME =                  "projectName";
    private static final String CREATED =               "created";
    private static final String DESCRIPTION =           "description";
    private static final String LAST_BILLED =           "lastBilled";
    private static final String TOTAL_HOURS =           "totalHours";
    private static final String NOT_BILLED_HOURS =      "notBilledHours";
    private static final String STATE =                 "state";
    private static final String CLIENT_SUPPLIER_ID =    "clientSupplierID";
    private static final String CLIENT_SUPPLIER_NAME =  "clientSupplierName";

    protected List<ProjectTaskDetailC> projectTaskDetails;
    protected List<ProjectStaffDetailC> projectStaffDetails;

    public ProjectC() {
        init();
    }

    public void init() {
        projectTaskDetails = new ArrayList<ProjectTaskDetailC>();
        projectStaffDetails = new ArrayList<ProjectStaffDetailC>();

        setTotalHours(0d);
        setNotBilledHours(0d);
        setState(ProjectStateEnum.active);
    }

    public Date getCreated() {
        return getAttributeAsDate(CREATED);
    }

    public void setCreated(Date created) {
        setAttribute(CREATED, created);
    }

    public String getName() {
        return getAttributeAsString(NAME);
    }

    public void setName(String name) {
        setAttribute(NAME, name);
    }

    public Date getLastBilled() {
        return getAttributeAsDate(LAST_BILLED);
    }

    public void setLastBilled(Date lastBilled) {
        setAttribute(LAST_BILLED, lastBilled);
    }

    public Double getTotalHours() {
        return getAttributeAsDouble(TOTAL_HOURS);
    }

    public void setTotalHours(Double totalHours) {
        setAttribute(TOTAL_HOURS, totalHours);
    }

    public Double getNotBilledHours() {
        return getAttributeAsDouble(NOT_BILLED_HOURS);
    }

    public void setNotBilledHours(Double notBilledHours) {
        setAttribute(NOT_BILLED_HOURS, notBilledHours);
    }

    public String getDescription() {
        return getAttributeAsString(DESCRIPTION);
    }

    public void setDescription(String description) {
        setAttribute(DESCRIPTION, description);
    }

    public ProjectStateEnum getState() {
        String type = getAttributeAsString(STATE);
        return type == null ? null : ProjectStateEnum.valueOf(type);
    }

    public void setState(ProjectStateEnum state) {
        if (state != null) {
            setAttribute(STATE, state.name());
        }
    }

    public String getClientSupplierID() {
        return getAttributeAsString(CLIENT_SUPPLIER_ID);
    }

    public void setClientSupplierID(String clientSupplierID) {
        setAttribute(CLIENT_SUPPLIER_ID, clientSupplierID);
    }

    public String getClientSupplierName() {
        return getAttributeAsString(CLIENT_SUPPLIER_NAME);
    }

    public void setClientSupplierName(String clientSupplierName) {
        setAttribute(CLIENT_SUPPLIER_NAME, clientSupplierName);
    }

    public List<ProjectTaskDetailC> getProjectTaskDetails() {
        return projectTaskDetails;
    }

    public void setProjectTaskDetails(List<ProjectTaskDetailC> projectTaskDetails) {
        this.projectTaskDetails = projectTaskDetails;
    }

    public List<ProjectStaffDetailC> getProjectStaffDetails() {
        return projectStaffDetails;
    }

    public void setProjectStaffDetails(List<ProjectStaffDetailC> projectStaffDetails) {
        this.projectStaffDetails = projectStaffDetails;
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