package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest;
import com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse;
import com.numhero.client.model.pojoc.BankAccountC;
import com.numhero.server.convert.BankAccountConverter;
import com.numhero.server.model.dao.BankAccountDao;
import com.numhero.server.model.pojo.BankAccount;

public class CommandGetBankAccount extends AbstractAuthenticatedCommand<GetBankAccountRequest, GetBankAccountResponse> {

    @Inject
    BankAccountDao dao;

    @Inject
    BankAccountConverter converter;

    @Override
    public GetBankAccountResponse execute(GetBankAccountRequest request) {
        GetBankAccountResponse response = new GetBankAccountResponse();

        BankAccount ba = dao.get(request.getEntityId());
        BankAccountC baC = converter.toBankAccountC(ba);
        response.setBankAccount(baC);

        return response;
    }
}
