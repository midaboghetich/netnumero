package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.staff.DeleteStaffRequest;
import com.numhero.server.model.dao.StaffDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandDeleteStaff extends AbstractAuthenticatedCommand<DeleteStaffRequest, BulkActionResponse> {

    @Inject
    StaffDao dao;

    @Override
    public BulkActionResponse execute(DeleteStaffRequest deleteStaffRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = deleteStaffRequest.getEntityIdList();
        deleteIdList(resp, ids, dao);
        return resp;
    }

}