package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.staff.StaffListResponse;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.server.convert.StaffConverter;
import com.numhero.server.model.dao.StaffDao;
import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.Staff;
import com.numhero.shared.datacargo.SearcheableListCommandRequest;
import com.numhero.shared.enums.StaffTypeEnum;

import java.util.List;

public abstract class AbstractCommandGetStaffs<REQUEST extends SearcheableListCommandRequest> extends AbstractAuthenticatedCommand<REQUEST, StaffListResponse> {

	@Inject
	StaffDao		staffDao;

	@Inject
	StaffConverter	staffConverter;

	protected StaffListResponse execute(REQUEST request, StaffTypeEnum type) {
		StaffListResponse response = new StaffListResponse();
		List<Staff> staffs;
		if (request.getSuggestString() != null && !request.getSuggestString().isEmpty()) {
			staffs = staffDao.searchForStartsWith(
					request.getSuggestString(),
					request.getMaxResults(),
					request.getBusinessAccountId(),
					JDOFilters.eq("type", JDOFilters.quote(type.name())));
		} else if (request.getSearchString() != null && !request.getSearchString().isEmpty()) {
			staffs = staffDao.search(
					request.getSearchString(),
					request.getBusinessAccountId(),
					JDOFilters.eq("type", JDOFilters.quote(type.name())));
		} else {
			staffs = staffDao.findAllByType(
					request.getBusinessAccountId(),
					type);
		}

        System.out.println("staffs.size() = " + staffs.size());
		for (Staff pojo : staffs) {
			StaffC pojoC = staffConverter.toStaffC(pojo);
            System.out.println("pojoC.getName() = " + pojoC.getName());
			response.getStaffCList().add(pojoC);
		}
		return response;
	}
}
