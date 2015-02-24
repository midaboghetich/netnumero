package com.numhero.client.mvp.bankaccount;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.numhero.client.model.pojoc.BankAccountC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.client.widget.combobox.CurrencyEnumComboBox;
import com.numhero.client.widget.textbox.NumberTextBox;

public class BankAccountPanel extends AbstractEditEntityPanel {


    interface BankAccountUiBinder extends UiBinder<VerticalPanel, BankAccountPanel> {
    }

    private static BankAccountUiBinder uiBinder = GWT.create(BankAccountUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField
    TextBox name = new TextBox();

    @UiField
    TextBox description = new TextBox();

    @UiField
    TextBox bank = new TextBox();

    @UiField
    TextBox swift = new TextBox();

    @UiField
    CurrencyEnumComboBox currency;

    @UiField
    TextBox account = new TextBox();

    @UiField
    TextBox iban = new TextBox();

    @UiField
    NumberTextBox openingBalance;

    @UiField
    NumberTextBox currentBalance;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private BankAccountC bankAccountC;
//

    public BankAccountPanel() {
        initWidget(uiBinder.createAndBindUi(this));
        createValidator(errorsPanel);
    }

    public TextBox getName() {
        return name;
    }

    public void setName(TextBox name) {
        this.name = name;
    }

    public TextBox getDescription() {
        return description;
    }

    public void setDescription(TextBox description) {
        this.description = description;
    }

    public TextBox getBank() {
        return bank;
    }

    public void setBank(TextBox bank) {
        this.bank = bank;
    }

    public TextBox getSwift() {
        return swift;
    }

    public void setSwift(TextBox swift) {
        this.swift = swift;
    }

    public CurrencyEnumComboBox getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnumComboBox currency) {
        this.currency = currency;
    }

    public TextBox getAccount() {
        return account;
    }

    public TextBox getIban() {
        return iban;
    }

    public void setIban(TextBox iban) {
        this.iban = iban;
    }

    public void setAccount(TextBox account) {
        this.account = account;
    }

    public NumberTextBox getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(NumberTextBox openingBalance) {
        this.openingBalance = openingBalance;
    }

    public NumberTextBox getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(NumberTextBox currentBalance) {
        this.currentBalance = currentBalance;
    }

    public NetNumeroButton getBtSearch() {
        return btSave;
    }

    public void setBtSave(NetNumeroButton btSave) {
        this.btSave = btSave;
    }

    public void setBtCancel(NetNumeroButton btCancel) {
        this.btCancel = btCancel;
    }

    public void setBankAccountC(BankAccountC bankAccountC) {
        this.bankAccountC = bankAccountC;

        resetValidator();

        name.setValue(bankAccountC.getName());
        currency.setValue(bankAccountC.getCurrency());
        currentBalance.setAmount(bankAccountC.getCurrentBalance());
        openingBalance.setAmount(bankAccountC.getOpeningBalance());
        bank.setValue(bankAccountC.getBank());
        description.setValue(bankAccountC.getDescription());
        account.setValue(bankAccountC.getAccount());
        iban.setValue(bankAccountC.getIban());
        swift.setValue(bankAccountC.getSwift());
    }

    public boolean saveValuesFromUi() {

        boolean ret = validator.validate();
        if (ret) {

            bankAccountC.setName(name.getValue());
            bankAccountC.setCurrency(currency.getValue());
            bankAccountC.setCurrency(currency.getValue());
            bankAccountC.setAccount(account.getValue());
            bankAccountC.setBank(bank.getValue());
            bankAccountC.setCurrentBalance(currentBalance.getAmount());
            bankAccountC.setDescription(description.getValue());
            bankAccountC.setIban(iban.getValue());
            bankAccountC.setOpeningBalance(openingBalance.getAmount());
            bankAccountC.setSwift(swift.getValue());
        } else {
            errorsPanel.setVisible(true);
        }
        return ret;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    public BankAccountC getBankAccountC() {
        return bankAccountC;
    }

    @Override
    protected void addValidators() {

    }

}

