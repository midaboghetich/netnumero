package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.bankaccount.BankAccountListRequest;
import com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse;
import com.numhero.client.model.pojoc.BankAccountC;
import com.numhero.server.convert.BankAccountConverter;
import com.numhero.server.model.dao.BankAccountDao;
import com.numhero.server.model.pojo.BankAccount;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

public class CommandGetBankAccounts extends AbstractAuthenticatedCommand<BankAccountListRequest, BankAccountListResponse> {

   private static Log log = LogFactory.getLog(CommandGetTasks.class);

    @Inject
    BankAccountDao bankAccountDao;

    @Inject
    BankAccountConverter bankAccountConverter;

    @Override
    public BankAccountListResponse execute(BankAccountListRequest request) {
        BankAccountListResponse response = new BankAccountListResponse();

        List<BankAccount> bankAccounts;
		if (request.getSuggestString() != null && !request.getSuggestString().isEmpty()) {
			bankAccounts = bankAccountDao.searchForStartsWith(
					request.getSuggestString(),
					request.getMaxResults(),
					request.getBusinessAccountId());
		} else if (request.getSearchString() != null && !request.getSearchString().isEmpty()) {
			bankAccounts = bankAccountDao.search(
					request.getSearchString(),
					request.getBusinessAccountId());
		} else {
			bankAccounts = bankAccountDao.findAll(request.getBusinessAccountId());
		}

        if (bankAccounts !=null) log.debug("numero di bankAccount: " + bankAccounts.size());
        for (BankAccount bankAccount : bankAccounts) {
            BankAccountC bankAccountC = bankAccountConverter.toBankAccountC(bankAccount);
            response.getBankAccountCList().add(bankAccountC);
        }

        return response;
    }
}