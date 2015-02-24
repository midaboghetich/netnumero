package com.numhero.client.model.datacargo.client_supplier;

import com.numhero.shared.datacargo.SearcheableListCommandRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SupplierListRequest extends SearcheableListCommandRequest {

	public SupplierListRequest() {
		setCommand(ApplicationCommandEnum.CommandGetSuppliers);
	}
}
