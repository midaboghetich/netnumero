package com.numhero.client.model.pojoc;

import com.numhero.shared.pojoc.BasePojoC;

public class TaskStaffDetailC extends BasePojoC {
    public static final String STAFF_ID = "staffId";
    public static final String NAME = "name";

    public TaskStaffDetailC() {
        init();
    }

    public void init() {
    }

    public String getStaffId() {
        return getAttributeAsString(STAFF_ID);
    }

    public void setStaffId(String productId) {
        setAttribute(STAFF_ID, productId);
    }

    public String getName() {
        return getAttributeAsString(NAME);
    }

    public void setName(String productId) {
        setAttribute(NAME, productId);
    }

}