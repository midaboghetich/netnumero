package com.numhero.server.command;

import com.numhero.client.model.datacargo.timeentry.TimeEntriesRaiseInvoiceRequest;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandTimeEntriesRaiseInvoice extends AbstractAuthenticatedCommand<TimeEntriesRaiseInvoiceRequest, BulkActionResponse> {
    @Override
    public BulkActionResponse execute(TimeEntriesRaiseInvoiceRequest timeEntriesRaiseInvoiceRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = timeEntriesRaiseInvoiceRequest.getEntityIdList();

        resp.setSuccessIdList(timeEntriesRaiseInvoiceRequest.getEntityIdList());
        resp.setMessage("OK");

        return resp;
    }
}