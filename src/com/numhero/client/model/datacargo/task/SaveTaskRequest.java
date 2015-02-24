package com.numhero.client.model.datacargo.task;

import com.numhero.client.model.pojoc.TaskC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveTaskRequest  extends SaveSingleEntityRequest {

    public SaveTaskRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveTask);
    }

    public TaskC getTaskC() {
        return (TaskC) getEntity();
    }

    public void setTaskC(TaskC taskC) {
        setEntity(taskC);
    }
}
