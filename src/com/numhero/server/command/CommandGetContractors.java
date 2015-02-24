package com.numhero.server.command;

import com.numhero.client.model.datacargo.staff.ContractorListRequest;
import com.numhero.client.model.datacargo.staff.StaffListResponse;
import com.numhero.shared.enums.StaffTypeEnum;

public class CommandGetContractors extends AbstractCommandGetStaffs<ContractorListRequest> {

	@Override
	public StaffListResponse execute(ContractorListRequest request) {
		return execute(request, StaffTypeEnum.Contractor);
	}

}
