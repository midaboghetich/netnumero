package com.numhero.client.model.datacargo.invoice;

import com.numhero.shared.datacargo.BulkActionRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class ChangeStatusToOverdueDocumentsRequest extends BulkActionRequest {

    public ChangeStatusToOverdueDocumentsRequest() {
        setCommand(ApplicationCommandEnum.CommandChangeStatusToOverdueDocuments);
    }

}