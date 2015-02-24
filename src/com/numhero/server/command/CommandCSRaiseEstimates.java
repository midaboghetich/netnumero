package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseEstimatesRequest;
import com.numhero.server.model.dao.InvoiceDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandCSRaiseEstimates extends AbstractAuthenticatedCommand<ClientSupplierRaiseEstimatesRequest, BulkActionResponse> {

    @Inject
    InvoiceDao dao;


    @Override
    public BulkActionResponse execute(ClientSupplierRaiseEstimatesRequest clientSupplierRaiseEstimatesRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = clientSupplierRaiseEstimatesRequest.getEntityIdList();
        resp.setSuccessIdList(clientSupplierRaiseEstimatesRequest.getEntityIdList());
        resp.setMessage("OK");

        return resp;
    }
}