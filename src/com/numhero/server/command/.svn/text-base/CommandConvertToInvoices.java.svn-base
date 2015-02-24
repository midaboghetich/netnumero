package com.numhero.server.command;

import com.numhero.client.model.datacargo.invoice.ConvertToInvoiceRequest;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandConvertToInvoices extends AbstractAuthenticatedCommand<ConvertToInvoiceRequest, BulkActionResponse> {
    @Override
    public BulkActionResponse execute(ConvertToInvoiceRequest convertToInvoiceRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = convertToInvoiceRequest.getEntityIdList();

        resp.setSuccessIdList(convertToInvoiceRequest.getEntityIdList());
        resp.setMessage("OK");

        return resp;
    }
}
