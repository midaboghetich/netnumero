package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseInvoicesRequest;
import com.numhero.server.model.dao.InvoiceDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandCSRaiseInvoices extends AbstractAuthenticatedCommand<ClientSupplierRaiseInvoicesRequest, BulkActionResponse> {

    @Inject
    InvoiceDao dao;


    @Override
    public BulkActionResponse execute(ClientSupplierRaiseInvoicesRequest clientSupplierRaiseInvoicesRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = clientSupplierRaiseInvoicesRequest.getEntityIdList();

        resp.setSuccessIdList(clientSupplierRaiseInvoicesRequest.getEntityIdList());
        resp.setMessage("OK");

        return resp;
    }
}