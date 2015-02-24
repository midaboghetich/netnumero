package com.numhero.client.model.datacargo.bankaccount;

import com.numhero.shared.datacargo.SearcheableListCommandRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class BankAccountListRequest extends SearcheableListCommandRequest {

    public BankAccountListRequest() {
        setCommand(ApplicationCommandEnum.CommandGetBankAccounts);
    }
}
