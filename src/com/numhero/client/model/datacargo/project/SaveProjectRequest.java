package com.numhero.client.model.datacargo.project;

import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveProjectRequest  extends SaveSingleEntityRequest {

    public SaveProjectRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveProject);
    }

    public ProjectC getProjectC() {
        return (ProjectC) getEntity();
    }

    public void setProjectC(ProjectC projectC) {
        setEntity(projectC);
    }
}
