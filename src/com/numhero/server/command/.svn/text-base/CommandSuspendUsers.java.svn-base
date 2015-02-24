package com.numhero.server.command;

import com.numhero.client.model.datacargo.user.SuspendUsersRequest;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandSuspendUsers extends AbstractAuthenticatedCommand<SuspendUsersRequest, BulkActionResponse> {
    @Override
    public BulkActionResponse execute(SuspendUsersRequest suspendUsersRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = suspendUsersRequest.getEntityIdList();

        resp.setSuccessIdList(suspendUsersRequest.getEntityIdList());
        resp.setMessage("OK");
        return resp;
    }

}