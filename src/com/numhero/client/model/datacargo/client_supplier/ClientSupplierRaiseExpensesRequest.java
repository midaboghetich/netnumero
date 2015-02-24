package com.numhero.client.model.datacargo.client_supplier;

import com.numhero.shared.datacargo.BulkActionRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class ClientSupplierRaiseExpensesRequest extends BulkActionRequest {

    public ClientSupplierRaiseExpensesRequest() {
        setCommand(ApplicationCommandEnum.CommandCSRaiseExpenses);
    }

}