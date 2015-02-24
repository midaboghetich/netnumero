package com.numhero.client.model.datacargo.expense;

import com.numhero.client.model.pojoc.ExpenseC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveExpenseRequest extends SaveSingleEntityRequest {

    public SaveExpenseRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveExpense);
    }

    public ExpenseC getExpenseC() {
        return (ExpenseC) getEntity();
    }

    public void setExpenseC(ExpenseC expenseC) {
        setEntity(expenseC);
    }
}
