package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.project.SaveProjectRequest;
import com.numhero.client.model.datacargo.project.SaveProjectResponse;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.server.convert.ProjectConverter;
import com.numhero.server.model.dao.ProjectDao;
import com.numhero.server.model.pojo.Project;
import com.numhero.server.utils.DaoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandSaveProject extends AbstractAuthenticatedCommand<SaveProjectRequest, SaveProjectResponse> {
    private static Log log = LogFactory.getLog(CommandSaveProject.class);

    @Inject
    ProjectDao projectDao;

    @Inject
    ProjectConverter projectConverter;

    @Override
    public SaveProjectResponse execute(SaveProjectRequest request) {

        Project project = null;

        ProjectC projectC = request.getProjectC();
        log.debug("projectC: " + projectC);

        String id = projectC.getId();
        if (id == null || id.isEmpty()) {
            project = new Project();
        } else project = projectDao.get(id);

        projectConverter.mergeIntoProject(projectC, project);
//        project.setBusinessAccountId(request.getBusinessAccountId());

        DaoUtils.setData(request, project);
        projectDao.save(project);

        SaveProjectResponse response = new SaveProjectResponse();
        response.setEntityId(project.getId());
        return response;
    }
}