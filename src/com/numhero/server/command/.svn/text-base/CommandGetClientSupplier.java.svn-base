package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.client_supplier.GetClientSupplierRequest;
import com.numhero.client.model.datacargo.client_supplier.GetClientSupplierResponse;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.server.convert.ClientSupplierConverter;
import com.numhero.server.model.dao.ClientSupplierDao;
import com.numhero.server.model.pojo.ClientSupplier;

public class CommandGetClientSupplier extends AbstractAuthenticatedCommand<GetClientSupplierRequest, GetClientSupplierResponse> {

    @Inject
    ClientSupplierDao clientSupplierDao;

    @Inject
    ClientSupplierConverter clientSupplierConverter;

    @Override
    public GetClientSupplierResponse execute(GetClientSupplierRequest request) throws Exception {
        GetClientSupplierResponse response = new GetClientSupplierResponse();

        ClientSupplier clientSupplier = clientSupplierDao.get(request.getEntityId());
        ClientSupplierC clientSupplierC = clientSupplierConverter.toClientSupplierC(clientSupplier);
        response.setClientSupplierC(clientSupplierC);

        return response;
    }
}
