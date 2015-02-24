package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.staff.GetStaffRequest;
import com.numhero.client.model.datacargo.staff.GetStaffResponse;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.server.convert.StaffConverter;
import com.numhero.server.model.dao.StaffDao;
import com.numhero.server.model.pojo.Staff;

public class CommandGetStaff extends AbstractAuthenticatedCommand<GetStaffRequest, GetStaffResponse> {

    @Inject
    StaffDao staffDao;

    @Inject
    StaffConverter staffConverter;

    @Override
    public GetStaffResponse execute(GetStaffRequest request) throws Exception {
        GetStaffResponse response = new GetStaffResponse();

        Staff staff = staffDao.get(request.getEntityId());
        StaffC staffC = staffConverter.toStaffC(staff);
        response.setStaffC(staffC);

        return response;
    }
}
