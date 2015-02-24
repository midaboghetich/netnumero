package com.numhero.server.command;

import com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse;
import com.numhero.client.model.datacargo.client_supplier.SupplierListRequest;
import com.numhero.shared.enums.ClientSupplierEnum;

public class CommandGetSuppliers extends AbstractCommandGetPartners<SupplierListRequest> {
	@Override
	public ClientSupplierListResponse execute(SupplierListRequest request) {
		return execute(request, ClientSupplierEnum.supplier);
	}
}
