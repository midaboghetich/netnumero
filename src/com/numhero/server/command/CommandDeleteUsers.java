package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.user.DeleteUsersRequest;
import com.numhero.server.model.dao.UserDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandDeleteUsers extends AbstractAuthenticatedCommand<DeleteUsersRequest, BulkActionResponse> {

    @Inject
    UserDao dao;

    @Override
    public BulkActionResponse execute(DeleteUsersRequest deleteUsersRequest) throws Exception {
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = deleteUsersRequest.getEntityIdList();
        deleteIdList(resp, ids, dao);
        return resp;
    }

}