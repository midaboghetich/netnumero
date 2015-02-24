package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.project.GetProjectRequest;
import com.numhero.client.model.datacargo.project.GetProjectResponse;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.server.convert.ProjectConverter;
import com.numhero.server.model.dao.ProjectDao;
import com.numhero.server.model.pojo.Project;

public class CommandGetProject extends AbstractAuthenticatedCommand<GetProjectRequest, GetProjectResponse> {
    @Inject
    ProjectDao projectDao;

    @Inject
    ProjectConverter projectConverter;

    @Override
    public GetProjectResponse execute(GetProjectRequest request) throws Exception {
        GetProjectResponse response = new GetProjectResponse();

        Project project = projectDao.get(request.getEntityId());
        ProjectC projectC = projectConverter.toProjectC(project);
        response.setProjectC(projectC);

        return response;
    }
}
