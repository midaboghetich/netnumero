package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.bankaccount.DeleteBankAccountsRequest;
import com.numhero.server.model.dao.BankAccountDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandDeleteBankAccounts extends AbstractAuthenticatedCommand<DeleteBankAccountsRequest, BulkActionResponse> {

    @Inject
    BankAccountDao dao;

    @Override
    public BulkActionResponse execute(DeleteBankAccountsRequest deleteBankAccountsRequest) throws Exception {
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = deleteBankAccountsRequest.getEntityIdList();
        deleteIdList(resp, ids, dao);
        return resp;
    }

}