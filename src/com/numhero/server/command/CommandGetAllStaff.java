package com.numhero.server.command;

import java.util.List;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.staff.InternalListRequest;
import com.numhero.client.model.datacargo.staff.StaffListResponse;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.server.convert.StaffConverter;
import com.numhero.server.model.dao.StaffDao;
import com.numhero.server.model.pojo.Staff;

public class CommandGetAllStaff extends AbstractAuthenticatedCommand<InternalListRequest, StaffListResponse> {

    @Inject
    StaffDao staffDao;

    @Inject
    StaffConverter staffConverter;

    @Override
    public StaffListResponse execute(InternalListRequest request) {

        StaffListResponse response = new StaffListResponse();
        List<Staff> staffs;
		if (request.getSuggestString() != null && !request.getSuggestString().isEmpty()) {
			staffs = staffDao.searchForStartsWith(
					request.getSuggestString(),
					request.getMaxResults(),
					request.getBusinessAccountId());
		} else if (request.getSearchString() != null && !request.getSearchString().isEmpty()) {
			staffs = staffDao.search(
					request.getSearchString(),
					request.getBusinessAccountId());
		} else {
			staffs = staffDao.findAll(request.getBusinessAccountId());
		}

        for (Staff cs : staffs) {
            StaffC csC = staffConverter.toStaffC(cs);
            response.getStaffCList().add(csC);
        }
        return response;
    }
}