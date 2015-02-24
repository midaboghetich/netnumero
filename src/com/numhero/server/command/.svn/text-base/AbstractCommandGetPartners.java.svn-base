package com.numhero.server.command;

import java.util.List;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.server.convert.ClientSupplierConverter;
import com.numhero.server.model.dao.ClientSupplierDao;
import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.ClientSupplier;
import com.numhero.shared.datacargo.SearcheableListCommandRequest;
import com.numhero.shared.enums.ClientSupplierEnum;

public abstract class AbstractCommandGetPartners<REQUEST extends SearcheableListCommandRequest> extends AbstractAuthenticatedCommand<REQUEST, ClientSupplierListResponse> {

	@Inject
	ClientSupplierDao		clientSupplierDao;

	@Inject
	ClientSupplierConverter	clientSupplierConverter;

	protected ClientSupplierListResponse execute(REQUEST request, ClientSupplierEnum type) {
		ClientSupplierListResponse response = new ClientSupplierListResponse();
		List<ClientSupplier> clientSuppliers;
		if (request.getSuggestString() != null && !request.getSuggestString().isEmpty()) {
			clientSuppliers = clientSupplierDao.searchForStartsWith(
					request.getSuggestString(),
					request.getMaxResults(),
					request.getBusinessAccountId(),
					JDOFilters.eq("partnerType", JDOFilters.quote(type.name())));
		} else if (request.getSearchString() != null && !request.getSearchString().isEmpty()) {
			clientSuppliers = clientSupplierDao.search(
					request.getSearchString(),
					request.getBusinessAccountId(),
					JDOFilters.eq("partnerType", JDOFilters.quote(type.name())));
		} else {
			clientSuppliers = clientSupplierDao.findAllByType(
					request.getBusinessAccountId(),
					type);
		}
		for (ClientSupplier cs : clientSuppliers) {
			ClientSupplierC csC = clientSupplierConverter.toClientSupplierC(cs);
			response.getClientSupplierCList().add(csC);
		}
		return response;
	}
}
