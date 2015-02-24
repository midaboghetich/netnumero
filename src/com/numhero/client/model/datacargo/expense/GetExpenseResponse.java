package com.numhero.client.model.datacargo.expense;

import com.numhero.client.model.pojoc.ExpenseC;
import com.numhero.shared.datacargo.CommandResponse;
import com.numhero.shared.datacargo.GetSingleEntityResponse;

public class GetExpenseResponse extends GetSingleEntityResponse {
 
    public ExpenseC getExpenseC() {
        return (ExpenseC) getEntity();
    }

    public void setExpenseC(ExpenseC expenseC) {
        setEntity(expenseC);
    }
}