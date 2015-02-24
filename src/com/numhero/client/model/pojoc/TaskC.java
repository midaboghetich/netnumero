package com.numhero.client.model.pojoc;

import com.google.gwt.user.client.ui.SuggestOracle;
import com.numhero.shared.enums.TaskStateEnum;
import com.numhero.shared.pojoc.BasePojoC;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskC extends BasePojoC implements SuggestOracle.Suggestion {

    private static final String NAME = "taskName";
    private static final String CREATED = "created";
    private static final String BILLABLE = "billable";
    private static final String PROJECT_ID = "projectId";
    private static final String DESCRIPTION = "description";
    private static final String RATE = "rate";
    private static final String STATE = "state";

    private static final String CLIENT_SUPPLIER_ID = "clientSupplierID";
    private static final String CLIENT_SUPPLIER_NAME = "clientSupplierName";

    protected List<TaskStaffDetailC> taskStaffDetailsC;

    public TaskC() {
        taskStaffDetailsC = new ArrayList<TaskStaffDetailC>();
    }

    public Date getCreated() {
        return getAttributeAsDate(CREATED);
    }

    public void setCreated(Date created) {
        setAttribute(CREATED, created);
    }

    public String getProjectId() {
        return getAttributeAsString(PROJECT_ID);
    }

    public void setProjectId(String projectId) {
        setAttribute(PROJECT_ID, projectId);
    }

    public String getDescription() {
        return getAttributeAsString(DESCRIPTION);
    }

    public void setDescription(String description) {
        setAttribute(DESCRIPTION, description);
    }

    public Boolean getBillable() {
        return getAttributeAsBoolean(BILLABLE);
    }

    public void setBillable(Boolean billable) {
        setAttribute(BILLABLE, billable);
    }

    public Double getRate() {
        return getAttributeAsDouble(RATE);
    }

    public void setRate(Double rate) {
        setAttribute(RATE, rate);
    }


    public String getName() {
        return getAttributeAsString(NAME);
    }

    public void setName(String name) {
        setAttribute(NAME, name);
    }

    public TaskStateEnum getState() {
        String type = getAttributeAsString(STATE);
        return type == null ? null : TaskStateEnum.valueOf(type);
    }

    public void setState(TaskStateEnum state) {
        if (state != null) {
            setAttribute(STATE, state.name());
        }
    }

    public List<TaskStaffDetailC> getTaskStaffDetailsC() {
        return taskStaffDetailsC;
    }

    public void setTaskStaffDetailsC(List<TaskStaffDetailC> taskStaffDetailsC) {
        this.taskStaffDetailsC = taskStaffDetailsC;
    }

    @Override
    public String getDisplayString() {
        return getName();
    }

    @Override
    public String getReplacementString() {
        return getName();
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
}