package com.numhero.server.command;

import com.numhero.client.model.datacargo.project.ProjectRaiseInvoicesRequest;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandProjectsRaiseInvoices extends AbstractAuthenticatedCommand<ProjectRaiseInvoicesRequest, BulkActionResponse> {
    @Override
    public BulkActionResponse execute(ProjectRaiseInvoicesRequest projectRaiseInvoicesRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = projectRaiseInvoicesRequest.getEntityIdList();

        resp.setSuccessIdList(projectRaiseInvoicesRequest.getEntityIdList());
        resp.setMessage("OK");
        return resp;
    }
}