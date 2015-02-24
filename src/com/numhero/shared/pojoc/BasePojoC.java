package com.numhero.shared.pojoc;

import java.util.Date;

public class BasePojoC extends DataCargoRecord {

    private static final String ID = "id";
    private static final String CREATED = "created";

    public String getId() {
        return getAttributeAsString(ID);
    }

    public void setId(String id) {
        setAttribute(ID, id);
    }

    public Date getCreated() {
        return getAttributeAsDate(CREATED);
    }

    public void setCreated(Date created) {
        setAttribute(CREATED, created);
    }

}
