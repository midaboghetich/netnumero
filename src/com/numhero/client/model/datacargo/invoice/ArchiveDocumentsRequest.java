package com.numhero.client.model.datacargo.invoice;

import com.numhero.shared.datacargo.BulkActionRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class ArchiveDocumentsRequest extends BulkActionRequest {

    public ArchiveDocumentsRequest() {
        setCommand(ApplicationCommandEnum.CommandArchiveDocuments);
    }

}