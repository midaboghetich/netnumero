package com.numhero.server.command;

import com.numhero.client.model.datacargo.staff.InternalListRequest;
import com.numhero.client.model.datacargo.staff.StaffListResponse;
import com.numhero.shared.enums.StaffTypeEnum;

public class CommandGetInternals extends AbstractCommandGetStaffs<InternalListRequest> {
	@Override
	public StaffListResponse execute(InternalListRequest request) {
		return execute(request, StaffTypeEnum.Internal);
	}
}
