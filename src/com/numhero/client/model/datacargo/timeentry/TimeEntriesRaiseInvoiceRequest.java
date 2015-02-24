package com.numhero.client.model.datacargo.timeentry;

import com.numhero.shared.datacargo.BulkActionRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class TimeEntriesRaiseInvoiceRequest extends BulkActionRequest {

    public TimeEntriesRaiseInvoiceRequest() {
        setCommand(ApplicationCommandEnum.CommandTimeEntriesRaiseInvoice);
    }

}