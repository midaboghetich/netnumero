package com.numhero.server.convert;

import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.BankAccountC;
import com.numhero.server.model.pojo.BankAccount;

@Singleton
public class BankAccountConverter {

    public void mergeIntoBankAccount(BankAccountC bankAccountC, BankAccount bankAccount) {
        bankAccount.setId(bankAccountC.getId());
        bankAccount.setAccount(bankAccountC.getAccount());
        bankAccount.setBank(bankAccountC.getBank());
        bankAccount.setName(bankAccountC.getName());
            bankAccount.setBusinessAccountId(bankAccountC.getBusinessAccountId());
        bankAccount.setCurrency(bankAccountC.getCurrency());
        bankAccount.setCurrentBalance(bankAccountC.getCurrentBalance());
        bankAccount.setDescription(bankAccountC.getDescription());
        bankAccount.setIban(bankAccountC.getIban());
        bankAccount.setOpeningBalance(bankAccountC.getOpeningBalance());
        bankAccount.setSwift(bankAccountC.getSwift());
        bankAccount.setCreated(bankAccountC.getCreated());
    }

    public BankAccountC toBankAccountC(BankAccount bankAccount) {
        BankAccountC bankAccountC = new BankAccountC();
        bankAccountC.setId(bankAccount.getId());
        bankAccountC.setAccount(bankAccount.getAccount());
        bankAccountC.setBank(bankAccount.getBank());
        bankAccountC.setName(bankAccount.getName());
        bankAccountC.setBusinessAccountId(bankAccount.getBusinessAccountId());
        bankAccountC.setCurrency(bankAccount.getCurrency());
        bankAccountC.setCurrentBalance(bankAccount.getCurrentBalance());
        bankAccountC.setDescription(bankAccount.getDescription());
        bankAccountC.setIban(bankAccount.getIban());
        bankAccountC.setOpeningBalance(bankAccount.getOpeningBalance());
        bankAccountC.setSwift(bankAccount.getSwift());
        bankAccountC.setCreated(bankAccount.getCreated());
        return bankAccountC;
    }
}