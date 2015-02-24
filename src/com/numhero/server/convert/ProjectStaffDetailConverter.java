package com.numhero.server.convert;

import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.ProjectStaffDetailC;
import com.numhero.server.model.pojo.ProjectStaffDetail;

@Singleton
public class ProjectStaffDetailConverter {

    public void mergeIntoProjectStaffDetail(ProjectStaffDetailC projectStaffDetailC,
                                            ProjectStaffDetail projectStaffDetail) {
        projectStaffDetail.setId(projectStaffDetailC.getId());
        projectStaffDetail.setName(projectStaffDetailC.getName());
        projectStaffDetail.setStaffId(projectStaffDetailC.getStaffId());
        projectStaffDetail.setCreated(projectStaffDetailC.getCreated());
    }

    public ProjectStaffDetailC toProjectStaffDetailC(ProjectStaffDetail projectStaffDetail) {
        ProjectStaffDetailC projectStaffDetailC = new ProjectStaffDetailC();
        projectStaffDetailC.setId(projectStaffDetail.getId());
        projectStaffDetailC.setStaffId(projectStaffDetail.getStaffId());
        projectStaffDetailC.setName(projectStaffDetail.getName());
        projectStaffDetailC.setCreated(projectStaffDetail.getCreated());
        
        return projectStaffDetailC;
    }
}