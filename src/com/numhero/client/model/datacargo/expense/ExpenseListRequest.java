package com.numhero.client.model.datacargo.expense;

import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class ExpenseListRequest extends CommandRequest {

    public ExpenseListRequest() {
        setCommand(ApplicationCommandEnum.CommandGetExpenses);
    }
}
