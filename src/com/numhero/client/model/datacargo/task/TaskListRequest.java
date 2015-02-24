package com.numhero.client.model.datacargo.task;

import com.numhero.shared.datacargo.SearcheableListCommandRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class TaskListRequest extends SearcheableListCommandRequest {

    public TaskListRequest() {
        setCommand(ApplicationCommandEnum.CommandGetTasks);
    }
}
