package com.numhero.client.model.datacargo.staff;

import com.numhero.client.model.pojoc.StaffC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveInternalRequest  extends SaveSingleEntityRequest {

    public SaveInternalRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveInternal);
    }

    public StaffC getStaffC() {
        return (StaffC) getEntity();
    }

    public void setStaffC(StaffC staffC) {
        setEntity(staffC);
    }
}
