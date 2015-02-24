package com.numhero.server.model.pojo;

import com.numhero.server.search.IsSearchable;
import com.numhero.shared.enums.CurrencyEnum;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class BankAccount extends Searchable implements Serializable {
    private static final long serialVersionUID = -6635503334297673111L;

    @Persistent
    @IsSearchable(byStartWith = true)
    private String bank;

    @Persistent
    private String iban;

    @Persistent
    private String swift;

    @Persistent
    private String name;

    @Persistent
    private String description;

    @Persistent
    private CurrencyEnum currency;

    @Persistent
    private String account;

    @Persistent
    private Double openingBalance;

    @Persistent
    private Double currentBalance;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(Double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public boolean isComplete() {
        return bank != null && bank.length() > 0 && iban != null && iban.length() > 0 && currency != null;
    }
}
