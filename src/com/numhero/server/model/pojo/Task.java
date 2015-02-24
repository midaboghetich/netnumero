package com.numhero.server.model.pojo;

import com.numhero.server.search.IsSearchable;
import com.numhero.shared.enums.TaskStateEnum;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class Task extends Searchable implements Serializable {

    @Persistent
    Date created;

    @Persistent
    String projectId;

    @Persistent
    private String clientSupplierID;

    @Persistent
    private String clientSupplierName;

    @Persistent
    @IsSearchable(byStartWith = true)
    String name;

    @Persistent
    @IsSearchable
    String description;

    @Persistent
    Boolean billable;

    @Persistent
    Double rate;

    @Persistent
    private TaskStateEnum state;

    @Persistent
    @Element(dependent = "true")
    private List<TaskStaffDetail> taskStaffDetails = new ArrayList<TaskStaffDetail>();

    @Persistent
    private Double estimatedDuration;

    @Persistent
    private Date startDate;

    @Persistent
    private Date endDate;

    public Task() {
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getBillable() {
        return billable;
    }

    public void setBillable(Boolean billable) {
        this.billable = billable;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public TaskStateEnum getState() {
        return state;
    }

    public void setState(TaskStateEnum state) {
        this.state = state;
    }

    public List<TaskStaffDetail> getTaskStaffDetails() {
        return taskStaffDetails;
    }

    public void setTaskStaffDetails(List<TaskStaffDetail> taskStaffDetails) {
        this.taskStaffDetails = taskStaffDetails;
    }

    public String getClientSupplierID() {
        return clientSupplierID;
    }

    public void setClientSupplierID(String clientSupplierID) {
        this.clientSupplierID = clientSupplierID;
    }

    public String getClientSupplierName() {
        return clientSupplierName;
    }

    public void setClientSupplierName(String clientSupplierName) {
        this.clientSupplierName = clientSupplierName;
    }

    public Double getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(Double estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Task task = (Task) o;

        if (getBusinessAccountId() != null ? !getBusinessAccountId().equals(task.getBusinessAccountId()) :
                task.getBusinessAccountId() != null)
            return false;
        if (description != null ? !description.equals(task.description) : task.description != null) return false;
        if (name != null ? !name.equals(task.name) : task.name != null) return false;
        if (projectId != null ? !projectId.equals(task.projectId) : task.projectId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (getBusinessAccountId() != null ? getBusinessAccountId().hashCode() : 0);
        return result;
    }
}