package com.numhero.client.model.datacargo.invoice;

import com.numhero.shared.datacargo.BulkActionRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class ChangeStatusToPaiedDocumentsRequest extends BulkActionRequest {

    public ChangeStatusToPaiedDocumentsRequest() {
        setCommand(ApplicationCommandEnum.CommandChangeStatusToPaiedDocuments);
    }

}