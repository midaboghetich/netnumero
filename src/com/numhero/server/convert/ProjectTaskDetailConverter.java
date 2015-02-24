package com.numhero.server.convert;

import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.ProjectTaskDetailC;
import com.numhero.server.model.pojo.ProjectTaskDetail;

@Singleton
public class ProjectTaskDetailConverter {

    public void mergeIntoProjectTaskDetail(ProjectTaskDetailC projectTaskDetailC, ProjectTaskDetail projectTaskDetail) {
        projectTaskDetail.setId(projectTaskDetailC.getId());
        projectTaskDetail.setTaskId(projectTaskDetailC.getTaskId());
        projectTaskDetail.setName(projectTaskDetailC.getName());
        projectTaskDetail.setDescription(projectTaskDetailC.getDescription());
        projectTaskDetail.setCreated(projectTaskDetailC.getCreated());
    }

    public ProjectTaskDetailC toProjectTaskDetailC(ProjectTaskDetail projectTaskDetail) {
        ProjectTaskDetailC projectTaskDetailC = new ProjectTaskDetailC();
        projectTaskDetailC.setId(projectTaskDetail.getId());
        projectTaskDetailC.setTaskId(projectTaskDetail.getTaskId());
        projectTaskDetailC.setName(projectTaskDetail.getName());
        projectTaskDetailC.setDescription(projectTaskDetail.getDescription());
        projectTaskDetailC.setCreated(projectTaskDetail.getCreated());
        
        return projectTaskDetailC;
    }
}