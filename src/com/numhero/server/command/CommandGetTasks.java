package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.task.TaskListRequest;
import com.numhero.client.model.datacargo.task.TaskListResponse;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.server.convert.TaskConverter;
import com.numhero.server.model.dao.TaskDao;
import com.numhero.server.model.pojo.Task;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

public class CommandGetTasks extends AbstractAuthenticatedCommand<TaskListRequest, TaskListResponse> {

    private static Log log = LogFactory.getLog(CommandGetTasks.class);

    @Inject
    TaskDao taskDao;

    @Inject
    TaskConverter taskConverter;

    @Override
    public TaskListResponse execute(TaskListRequest request) {
        TaskListResponse response = new TaskListResponse();

        List<Task> tasks;
		if (request.getSuggestString() != null && !request.getSuggestString().isEmpty()) {
			tasks = taskDao.searchForStartsWith(
					request.getSuggestString(),
					request.getMaxResults(),
					request.getBusinessAccountId());
		} else if (request.getSearchString() != null && !request.getSearchString().isEmpty()) {
			tasks = taskDao.search(
					request.getSearchString(),
					request.getBusinessAccountId());
		} else {
			tasks = taskDao.findAll(request.getBusinessAccountId());
		}

        if (tasks !=null) log.debug("numero di task: " + tasks.size());
        for (Task task : tasks) {
            TaskC taskC = taskConverter.toTaskC(task);
            response.getTaskCList().add(taskC);
        }

        return response;
    }
}