package com.numhero.client.model.datacargo.staff;

import com.numhero.client.model.pojoc.StaffC;
import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.enums.StaffTypeEnum;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveContractorRequest extends CommandRequest {
    private StaffC staffC;

    public SaveContractorRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveContractor);
    }

    public StaffC getStaffC() {
        return staffC;
    }

    public void setStaffC(StaffC staffC) {
        this.staffC = staffC;
    }
}