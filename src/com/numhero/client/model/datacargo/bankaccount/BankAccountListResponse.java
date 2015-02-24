package com.numhero.client.model.datacargo.bankaccount;

import com.numhero.client.model.pojoc.BankAccountC;
import com.numhero.shared.datacargo.CommandResponse;

import java.util.ArrayList;
import java.util.List;

public class BankAccountListResponse implements CommandResponse {
    private ArrayList<BankAccountC> bankAccountCList = new ArrayList<BankAccountC>();

    public List<BankAccountC> getBankAccountCList() {
        return bankAccountCList;
    }

}