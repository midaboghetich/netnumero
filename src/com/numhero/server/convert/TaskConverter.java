package com.numhero.server.convert;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.client.model.pojoc.TaskStaffDetailC;
import com.numhero.server.model.pojo.Task;
import com.numhero.server.model.pojo.TaskStaffDetail;

@Singleton
public class TaskConverter {

    @Inject
    private TaskStaffDetailConverter taskStaffDetailConverter;

    public void mergeIntoTask(TaskC taskC, Task task) {
        task.setId(taskC.getId());
        task.setName(taskC.getName());
        task.setBillable(taskC.getBillable());
        task.setCreated(taskC.getCreated());
        task.setDescription(taskC.getDescription());
        task.setClientSupplierID(taskC.getClientSupplierID());
        task.setClientSupplierName(taskC.getClientSupplierName());
        task.setProjectId(taskC.getProjectId());
        task.setRate(taskC.getRate());
        task.setState(taskC.getState());
        task.setCreated(taskC.getCreated());

        for (TaskStaffDetailC staffC : taskC.getTaskStaffDetailsC()) {
            TaskStaffDetail clientSupplier = new TaskStaffDetail();
            taskStaffDetailConverter.mergeIntoTaskStaffDetail(staffC, clientSupplier);
            task.getTaskStaffDetails().add(clientSupplier);
        }
    }

    public TaskC toTaskC(Task task) {
        TaskC taskC = new TaskC();
        taskC.setId(task.getId());
        taskC.setName(task.getName());
        taskC.setBillable(task.getBillable());
        taskC.setCreated(task.getCreated());
        taskC.setDescription(task.getDescription());
        taskC.setProjectId(task.getProjectId());
        taskC.setRate(task.getRate());
        taskC.setState(task.getState());
        taskC.setClientSupplierID(task.getClientSupplierID());
        taskC.setClientSupplierName(task.getClientSupplierName());
        taskC.setCreated(task.getCreated());
        

        for (TaskStaffDetail staff : task.getTaskStaffDetails()) {
            TaskStaffDetailC clientSupplierC = taskStaffDetailConverter.toTaskStaffDetailC(staff);
            taskC.getTaskStaffDetailsC().add(clientSupplierC);
        }
        return taskC;
    }
}