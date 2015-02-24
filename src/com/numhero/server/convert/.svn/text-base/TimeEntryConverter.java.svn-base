package com.numhero.server.convert;

import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.TimeEntryC;
import com.numhero.server.model.pojo.TimeEntry;

@Singleton
public class TimeEntryConverter {

    public void mergeIntoTimeEntry(TimeEntryC timeEntryC, TimeEntry timeEntry) {
        timeEntry.setId(timeEntryC.getId());
        timeEntry.setDescription(timeEntryC.getDescription());
        timeEntry.setCreated(timeEntryC.getCreated());
        timeEntry.setTaskId(timeEntryC.getTaskId());
        timeEntry.setProjectId(timeEntryC.getProjectId());
        timeEntry.setNotes(timeEntryC.getNotes());
        timeEntry.setDate(timeEntryC.getDate());
        timeEntry.setProjectName(timeEntryC.getProjectName());
        timeEntry.setTaskName(timeEntryC.getTaskName());
        timeEntry.setTimeUnit(timeEntryC.getTimeUnit());
    }

    public TimeEntryC toTimeEntryC(TimeEntry timeEntry) {
        TimeEntryC timeEntryC = new TimeEntryC();
        timeEntryC.setId(timeEntry.getId());
        timeEntryC.setDescription(timeEntry.getDescription());
        timeEntryC.setNotes(timeEntry.getNotes());
        timeEntryC.setCreated(timeEntry.getCreated());
        timeEntryC.setTaskId(timeEntry.getTaskId());
        timeEntryC.setProjectId(timeEntry.getProjectId());
        timeEntryC.setDate(timeEntry.getDate());
        timeEntryC.setProjectName(timeEntry.getProjectName());
        timeEntryC.setTaskName(timeEntry.getTaskName());
        timeEntryC.setTimeUnit(timeEntry.getTimeUnit());
        return timeEntryC;
    }
}