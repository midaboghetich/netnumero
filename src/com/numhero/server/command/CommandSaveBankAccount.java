package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.bankaccount.SaveBankAccountRequest;
import com.numhero.client.model.datacargo.bankaccount.SaveBankAccountResponse;
import com.numhero.client.model.pojoc.BankAccountC;
import com.numhero.server.convert.BankAccountConverter;
import com.numhero.server.model.dao.BankAccountDao;
import com.numhero.server.model.pojo.BankAccount;
import com.numhero.server.utils.DaoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandSaveBankAccount extends AbstractAuthenticatedCommand<SaveBankAccountRequest, SaveBankAccountResponse> {
    @SuppressWarnings("unused")
    private static Log log = LogFactory.getLog(CommandSaveBankAccount.class);

    @Inject
    BankAccountDao bankAccountDao;
    
    @Inject
    BankAccountConverter bankAccountConverter;

    @Override
    public SaveBankAccountResponse execute(SaveBankAccountRequest request) {
        BankAccount bankAccount = null;

        BankAccountC bankAccountC = request.getBankAccountC();
        String id = bankAccountC.getId();
        if (id == null || id.isEmpty()) {
            bankAccount = new BankAccount();
        } else {
            bankAccount = bankAccountDao.get(id);
        }

        // validate
        bankAccountConverter.mergeIntoBankAccount(bankAccountC, bankAccount);

        DaoUtils.setData(request, bankAccount);
        
        bankAccountDao.save(bankAccount);

        // createAudit
        SaveBankAccountResponse response = new SaveBankAccountResponse();
        response.setEntityId(bankAccount.getId());
        return response;
    }
}