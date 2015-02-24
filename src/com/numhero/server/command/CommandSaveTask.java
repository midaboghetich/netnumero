package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.task.SaveTaskRequest;
import com.numhero.client.model.datacargo.task.SaveTaskResponse;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.server.convert.TaskConverter;
import com.numhero.server.model.dao.TaskDao;
import com.numhero.server.model.pojo.Task;
import com.numhero.server.utils.DaoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandSaveTask extends AbstractAuthenticatedCommand<SaveTaskRequest, SaveTaskResponse> {
    private static Log log = LogFactory.getLog(CommandSaveTask.class);

    @Inject
    TaskDao taskDao;

    @Inject
    TaskConverter taskConverter;

    @Override
    public SaveTaskResponse execute(SaveTaskRequest request) {

        log.debug("CommandSaveTask.execute");

        Task task = null;

        TaskC taskC = request.getTaskC();
        log.debug("taskC: " + taskC);

        String id = taskC.getId();
        if (id == null || id.isEmpty()) {
            task = new Task();
        } else task = taskDao.get(id);

        taskConverter.mergeIntoTask(taskC, task);
//        task.setBusinessAccountId(request.getBusinessAccountId());
//
        log.debug("saving task: " + task);
        DaoUtils.setData(request, task);

        taskDao.save(task);

        SaveTaskResponse response = new SaveTaskResponse();
        response.setEntityId(task.getId());
        return response;
    }
}