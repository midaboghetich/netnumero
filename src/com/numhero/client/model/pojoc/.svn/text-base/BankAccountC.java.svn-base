package com.numhero.client.model.pojoc;

import com.numhero.shared.enums.CurrencyEnum;
import com.numhero.shared.pojoc.BasePojoC;

public class BankAccountC extends BasePojoC {

    private static final String BANK = "bank";
    private static final String IBAN = "iban";
    private static final String SWIFT = "swift";
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";
    private static final String CURRENCY = "currency";
    private static final String ACCOUNT = "account";
    private static final String OPENING_BALANCE = "openingBalance";
    private static final String CURRENT_BALANCE = "currentBalance";
    private static final String BUSINESS_ACCOUNT_ID = "businessAccountId";

    public BankAccountC() {
    }

    public String getBank() {
        return getAttributeAsString(BANK);
    }

    public void setBank(String bank) {
        setAttribute(BANK, bank);
    }

    public String getIban() {
        return getAttributeAsString(IBAN);
    }

    public void setIban(String iban) {
        setAttribute(IBAN, iban);
    }

    public String getSwift() {
        return getAttributeAsString(SWIFT);
    }

    public void setSwift(String swift) {
        setAttribute(SWIFT, swift);
    }

    public String getName() {
        return getAttributeAsString(NAME);
    }

    public void setName(String name) {
        setAttribute(NAME, name);
    }

    public String getDescription() {
        return getAttributeAsString(DESCRIPTION);
    }

    public void setDescription(String description) {
        setAttribute(DESCRIPTION, description);
    }

    public CurrencyEnum getCurrency() {
        String type = getAttributeAsString(CURRENCY);
        return type == null ? null : CurrencyEnum.valueOf(type);
    }

    public void setCurrency(CurrencyEnum currency) {
        if (currency != null) {
            setAttribute(CURRENCY, currency.name());
        }
    }

    public String getAccount() {
        return getAttributeAsString(ACCOUNT);
    }

    public void setAccount(String account) {
        setAttribute(ACCOUNT, account);
    }

    public Double getOpeningBalance() {
        return getAttributeAsDouble(OPENING_BALANCE);
    }

    public void setOpeningBalance(Double openingBalance) {
        setAttribute(OPENING_BALANCE, openingBalance);
    }

    public Double getCurrentBalance() {
        return getAttributeAsDouble(CURRENT_BALANCE);
    }

    public void setCurrentBalance(Double currentBalance) {
        setAttribute(CURRENT_BALANCE, currentBalance);
    }

    public String getBusinessAccountId() {
        return getAttributeAsString(BUSINESS_ACCOUNT_ID);
    }

    public void setBusinessAccountId(String businessAccountId) {
        setAttribute(BUSINESS_ACCOUNT_ID, businessAccountId);
    }
}