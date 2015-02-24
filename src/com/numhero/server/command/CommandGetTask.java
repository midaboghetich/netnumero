package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.task.GetTaskRequest;
import com.numhero.client.model.datacargo.task.GetTaskResponse;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.server.convert.TaskConverter;
import com.numhero.server.model.dao.TaskDao;
import com.numhero.server.model.pojo.Task;

public class CommandGetTask extends AbstractAuthenticatedCommand<GetTaskRequest, GetTaskResponse> {
    @Inject
    TaskDao taskDao;

    @Inject
    TaskConverter taskConverter;

    @Override
    public GetTaskResponse execute(GetTaskRequest request) throws Exception {
        GetTaskResponse response = new GetTaskResponse();

        Task task = taskDao.get(request.getEntityId());
        TaskC taskC = taskConverter.toTaskC(task);
        response.setTaskC(taskC);

        return response;
    }
}
