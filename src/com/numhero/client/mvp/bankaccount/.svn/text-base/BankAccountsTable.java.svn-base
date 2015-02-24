package com.numhero.client.mvp.bankaccount;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.BankAccountC;
import com.numhero.client.widget.table.AbstractTableWithHeaderAndFooter;

import java.util.List;

public class BankAccountsTable extends AbstractTableWithHeaderAndFooter {

    public void setBankAccounts(List<BankAccountC> bankAccountCs) {
        removeAllRows();
        for (int row = 0; row < bankAccountCs.size(); row++) {
            BankAccountC bankAccountC = bankAccountCs.get(row);

            HTML hID = new HTML("<a href='#bankaccount/" + bankAccountC.getId()
                    + "'>" + bankAccountC.getName() + "</a>");

            setWidget(row, 0, getCheckbox(bankAccountC.getId()));
            setWidget(row, 1, hID);
            setText(row, 2, bankAccountC.getDescription());
            setText(row, 3, bankAccountC.getBank());
            setText(row, 4, bankAccountC.getCurrency().name());
            setText(row, 5, bankAccountC.getCurrentBalance().toString());
        }
    }

    @Override
    protected void setHeader() {
        setHeader(0, "", HasHorizontalAlignment.ALIGN_CENTER, "20px");
        setHeader(1, Application.getConstants().name(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(2, Application.getConstants().description(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(3, Application.getConstants().bank(), HasHorizontalAlignment.ALIGN_LEFT, "140px");
        setHeader(4, Application.getConstants().currency(), HasHorizontalAlignment.ALIGN_LEFT, "%");
        setHeader(5, Application.getConstants().currentBalance(), HasHorizontalAlignment.ALIGN_LEFT, "50px");
    }

}