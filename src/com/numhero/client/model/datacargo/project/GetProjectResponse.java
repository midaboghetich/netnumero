package com.numhero.client.model.datacargo.project;

import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.shared.datacargo.GetSingleEntityResponse;

public class GetProjectResponse extends GetSingleEntityResponse {

    public ProjectC getProjectC() {
        return (ProjectC) getEntity();
    }

    public void setProjectC(ProjectC projectC) {
        setEntity(projectC);
    }
}