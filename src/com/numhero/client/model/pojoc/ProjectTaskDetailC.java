package com.numhero.client.model.pojoc;

import com.numhero.shared.pojoc.BasePojoC;

public class ProjectTaskDetailC extends BasePojoC {

    public static final String TASK_ID = "taskId";
    public static final String TASK_NAME = "taskName";
    public static final String TASK_DESCRIPTION = "taskDescription";

    public ProjectTaskDetailC() {
        init();
    }

    public void init() {
    }

    public String getTaskId() {
        return getAttributeAsString(TASK_ID);
    }

    public void setTaskId(String taskId) {
        setAttribute(TASK_ID, taskId);
    }

    public String getName() {
        return getAttributeAsString(TASK_NAME);
    }

    public void setName(String productId) {
        setAttribute(TASK_NAME, productId);
    }

    public String getDescription() {
        return getAttributeAsString(TASK_DESCRIPTION);
    }

    public void setDescription(String description) {
        setAttribute(TASK_DESCRIPTION, description);
    }

}