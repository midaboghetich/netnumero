package com.numhero.server.model.pojo;

import com.numhero.server.search.IsSearchable;
import com.numhero.shared.enums.ProjectStateEnum;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class Project extends Searchable implements Serializable {

    @Persistent
    @IsSearchable(byStartWith = true)
    String name;

    @Persistent
    Date created;

    @Persistent
    private String clientSupplierID;

    @Persistent
    private String clientSupplierName;

    @Persistent
    @IsSearchable
    String description;

    @Persistent
    Date lastBilled;

    @Persistent
    Double totalHours;

    @Persistent
    Double notBilledHours;

    @Persistent
    private ProjectStateEnum state;

    @Persistent
    @Element(dependent = "true")
    private List<ProjectStaffDetail> projectStaffDetails = new ArrayList<ProjectStaffDetail>();

    @Persistent
    @Element(dependent = "true")
    private List<ProjectTaskDetail> projectTaskDetails = new ArrayList<ProjectTaskDetail>();

    public Project() {
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastBilled() {
        return lastBilled;
    }

    public void setLastBilled(Date lastBilled) {
        this.lastBilled = lastBilled;
    }

    public Double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Double totalHours) {
        this.totalHours = totalHours;
    }

    public Double getNotBilledHours() {
        return notBilledHours;
    }

    public void setNotBilledHours(Double notBilledHours) {
        this.notBilledHours = notBilledHours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectStateEnum getState() {
        return state;
    }

    public void setState(ProjectStateEnum state) {
        this.state = state;
    }

    public List<ProjectStaffDetail> getProjectStaffDetails() {
        return projectStaffDetails;
    }

    public void setProjectStaffDetails(List<ProjectStaffDetail> projectStaffDetails) {
        this.projectStaffDetails = projectStaffDetails;
    }

    public List<ProjectTaskDetail> getProjectTaskDetails() {
        return projectTaskDetails;
    }

    public void setProjectTaskDetails(List<ProjectTaskDetail> projectTaskDetails) {
        this.projectTaskDetails = projectTaskDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}