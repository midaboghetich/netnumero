package com.numhero.server.model.pojo;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;
import java.util.Date;


@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class TimeEntry extends Persistable implements Serializable {

    @Persistent
    Integer dayOfYear;

    @Persistent
    Integer weekOfYear;

    @Persistent
    Integer monthOfYear;

    @Persistent
    Integer year;

    @Persistent
    String projectId;

    @Persistent
    String taskId;

    @Persistent
    String projectName;

    @Persistent
    String taskName;

    @Persistent
    String description;

    @Persistent
    Double timeUnit;

    @Persistent
    String notes;

    @Persistent
    private Date date;

    public TimeEntry() {
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(Double timeUnit) {
        this.timeUnit = timeUnit;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(Integer dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public Integer getWeekOfYear() {
        return weekOfYear;
    }

    public void setWeekOfYear(Integer weekOfYear) {
        this.weekOfYear = weekOfYear;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonthOfYear() {
        return monthOfYear;
    }

    public void setMonthOfYear(Integer monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

}
