package com.numhero.client.mvp.bankaccount;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.mvp.TabbedPage;
import com.numhero.client.widget.TabBar;

public class BankAccountView extends TabbedPage {

    BankAccountPanel bankAccountPanel;

    public BankAccountView() {
        init();
    }

    @Override
    public TabBar.INumheroTab getCurrentTab() {
        return TabBar.INumheroTab.dashboard;
    }

    @Override
    public Widget getContent() {
        bankAccountPanel = new BankAccountPanel();
        return bankAccountPanel;
    }

    public BankAccountPanel getBankAccountPanel() {
        return bankAccountPanel;
    }

    public void setBankAccountPanel(BankAccountPanel bankAccountPanel) {
        this.bankAccountPanel = bankAccountPanel;
    }

    public HasClickHandlers getSaveButton() {
        return bankAccountPanel.getBtSearch();
    }
}
