package com.numhero.server.command;

import com.numhero.client.model.datacargo.user.ReactivateUsersRequest;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandReactivateUsers extends AbstractAuthenticatedCommand<ReactivateUsersRequest, BulkActionResponse> {
    @Override
    public BulkActionResponse execute(ReactivateUsersRequest reactivateUsersRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = reactivateUsersRequest.getEntityIdList();

        resp.setSuccessIdList(reactivateUsersRequest.getEntityIdList());
        resp.setMessage("OK");
        return resp;
    }

}