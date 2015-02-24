package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.timeentry.DeleteTimeEntriesRequest;
import com.numhero.server.model.dao.TimeEntryDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandDeleteTimeEntries extends AbstractAuthenticatedCommand<DeleteTimeEntriesRequest, BulkActionResponse> {

    @Inject
    TimeEntryDao dao;

    @Override
    public BulkActionResponse execute(DeleteTimeEntriesRequest deleteTimeEntriesRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = deleteTimeEntriesRequest.getEntityIdList();
        deleteIdList(resp, ids, dao);
        return resp;
    }
}