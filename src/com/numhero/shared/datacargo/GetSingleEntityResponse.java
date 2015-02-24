package com.numhero.shared.datacargo;

import com.numhero.shared.pojoc.BasePojoC;


public class GetSingleEntityResponse implements CommandResponse {
    private BasePojoC entity;

    public BasePojoC getEntity() {
        return entity;
    }

    protected void setEntity(BasePojoC entity) {
        this.entity = entity;
    }
}
