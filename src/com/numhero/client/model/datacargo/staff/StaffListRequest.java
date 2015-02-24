package com.numhero.client.model.datacargo.staff;

import com.numhero.shared.datacargo.SearcheableListCommandRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class StaffListRequest extends SearcheableListCommandRequest {

    public StaffListRequest() {
            setCommand(ApplicationCommandEnum.CommandGetStaffs);
    }

}