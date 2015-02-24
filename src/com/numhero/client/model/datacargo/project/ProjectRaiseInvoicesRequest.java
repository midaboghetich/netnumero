package com.numhero.client.model.datacargo.project;

import com.numhero.shared.datacargo.BulkActionRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class ProjectRaiseInvoicesRequest extends BulkActionRequest {

    public ProjectRaiseInvoicesRequest() {
        setCommand(ApplicationCommandEnum.CommandProjectsRaiseInvoices);
    }

}