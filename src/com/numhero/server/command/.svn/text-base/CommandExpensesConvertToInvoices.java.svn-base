package com.numhero.server.command;

import com.numhero.client.model.datacargo.expense.ExpensesConvertToInvoicesRequest;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandExpensesConvertToInvoices extends AbstractAuthenticatedCommand<ExpensesConvertToInvoicesRequest, BulkActionResponse> {
    @Override
    public BulkActionResponse execute(ExpensesConvertToInvoicesRequest expensesConvertToInvoicesRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = expensesConvertToInvoicesRequest.getEntityIdList();

        resp.setSuccessIdList(expensesConvertToInvoicesRequest.getEntityIdList());
        resp.setMessage("OK");
        return resp;
    }
}