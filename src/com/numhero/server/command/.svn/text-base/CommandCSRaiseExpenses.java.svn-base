package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseExpensesRequest;
import com.numhero.server.model.dao.InvoiceDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandCSRaiseExpenses extends AbstractAuthenticatedCommand<ClientSupplierRaiseExpensesRequest, BulkActionResponse> {

    @Inject
    InvoiceDao dao;


    @Override
    public BulkActionResponse execute(ClientSupplierRaiseExpensesRequest clientSupplierRaiseExpensesRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = clientSupplierRaiseExpensesRequest.getEntityIdList();

        resp.setSuccessIdList(clientSupplierRaiseExpensesRequest.getEntityIdList());
        resp.setMessage("OK");

        return resp;
    }
}