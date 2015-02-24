package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.task.DeleteTasksRequest;
import com.numhero.server.model.dao.TaskDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandDeleteTasks extends AbstractAuthenticatedCommand<DeleteTasksRequest, BulkActionResponse> {

    @Inject
    TaskDao dao;

    @Override
    public BulkActionResponse execute(DeleteTasksRequest deleteTasksRequest) throws Exception {
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = deleteTasksRequest.getEntityIdList();
        deleteIdList(resp, ids, dao);
        return resp;
    }
}