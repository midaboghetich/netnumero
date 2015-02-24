package com.numhero.server.model.dao;

import com.numhero.server.model.pojo.BankAccount;

public class BankAccountDao extends BaseSearchableDao<BankAccount> {

	public BankAccount getByBusinessAccount(String businessAccountId) {
        BankAccount ba = getFirstElement(findByCriteria(businessAccountId));
        return ba;
    }
}
