package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.invoice.DeleteDocumentsRequest;
import com.numhero.server.model.dao.InvoiceDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandDeleteDocuments extends AbstractAuthenticatedCommand<DeleteDocumentsRequest, BulkActionResponse> {

    @Inject
    InvoiceDao dao;

    @Override
    public BulkActionResponse execute(DeleteDocumentsRequest deleteDocumentsRequest) throws Exception {
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = deleteDocumentsRequest.getEntityIdList();
        deleteIdList(resp, ids, dao);
        return resp;
    }
}