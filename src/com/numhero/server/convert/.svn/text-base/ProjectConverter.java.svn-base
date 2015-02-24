package com.numhero.server.convert;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.client.model.pojoc.ProjectStaffDetailC;
import com.numhero.client.model.pojoc.ProjectTaskDetailC;
import com.numhero.server.model.pojo.Project;
import com.numhero.server.model.pojo.ProjectStaffDetail;
import com.numhero.server.model.pojo.ProjectTaskDetail;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Singleton
public class ProjectConverter {

    private static Log log = LogFactory.getLog(ProjectConverter.class);

    @Inject
    private ProjectStaffDetailConverter projectStaffDetailConverter;

    @Inject
    private ProjectTaskDetailConverter projectTaskDetailConverter;

    public void mergeIntoProject(ProjectC projectC, Project project) {

        project.setId(projectC.getId());
        project.setName(projectC.getName());
        project.setDescription(projectC.getDescription());
        project.setClientSupplierID(projectC.getClientSupplierID());
        project.setClientSupplierName(projectC.getClientSupplierName());
        project.setCreated(projectC.getCreated());
        project.setLastBilled(projectC.getLastBilled());
        project.setNotBilledHours(projectC.getNotBilledHours());
        project.setState(projectC.getState());
        project.setTotalHours(projectC.getTotalHours());
        project.setCreated(projectC.getCreated());

        for (ProjectStaffDetailC projectStaffDetailC : projectC.getProjectStaffDetails()) {
            if (projectStaffDetailC.getName() != null) {
                ProjectStaffDetail projectStaffDetail = new ProjectStaffDetail();
                projectStaffDetailConverter.mergeIntoProjectStaffDetail(projectStaffDetailC, projectStaffDetail);
                project.getProjectStaffDetails().add(projectStaffDetail);
            }
        }

        for (ProjectTaskDetailC taskC : projectC.getProjectTaskDetails()) {
            if (taskC.getName() != null) {
                ProjectTaskDetail projectTaskDetail = new ProjectTaskDetail();
                projectTaskDetailConverter.mergeIntoProjectTaskDetail(taskC, projectTaskDetail);
                project.getProjectTaskDetails().add(projectTaskDetail);
            }
        }
    }

    public ProjectC toProjectC(Project project) {

        ProjectC projectC = new ProjectC();
        projectC.setId(project.getId());
        projectC.setName(project.getName());
        projectC.setDescription(project.getDescription());
        projectC.setClientSupplierID(project.getClientSupplierID());
        projectC.setClientSupplierName(project.getClientSupplierName());
        projectC.setCreated(project.getCreated());
        projectC.setLastBilled(project.getLastBilled());
        projectC.setNotBilledHours(project.getNotBilledHours());
        projectC.setState(project.getState());
        projectC.setTotalHours(project.getTotalHours());
        projectC.setCreated(project.getCreated());
        
        for (ProjectStaffDetail projectStaffDetail : project.getProjectStaffDetails()) {
            ProjectStaffDetailC staffDetailC = projectStaffDetailConverter.toProjectStaffDetailC(projectStaffDetail);
            projectC.getProjectStaffDetails().add(staffDetailC);
        }

        for (ProjectTaskDetail task : project.getProjectTaskDetails()) {
            ProjectTaskDetailC taskC = projectTaskDetailConverter.toProjectTaskDetailC(task);
            projectC.getProjectTaskDetails().add(taskC);
        }

        return projectC;
    }
}