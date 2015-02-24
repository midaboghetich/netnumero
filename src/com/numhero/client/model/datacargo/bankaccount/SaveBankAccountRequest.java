package com.numhero.client.model.datacargo.bankaccount;

import com.numhero.client.model.pojoc.BankAccountC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveBankAccountRequest  extends SaveSingleEntityRequest {

    public SaveBankAccountRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveBankAccount);
    }

    public BankAccountC getBankAccountC() {
        return (BankAccountC) getEntity();
    }

    public void setBankAccountC(BankAccountC bankAccountC) {
        setEntity(bankAccountC);
    }
    
}
