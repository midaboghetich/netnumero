package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.project.ProjectListRequest;
import com.numhero.client.model.datacargo.project.ProjectListResponse;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.server.convert.ProjectConverter;
import com.numhero.server.model.dao.ProjectDao;
import com.numhero.server.model.pojo.Project;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

public class CommandGetProjects extends AbstractAuthenticatedCommand<ProjectListRequest, ProjectListResponse> {

    private static Log log = LogFactory.getLog(CommandGetProjects.class);

    @Inject
    ProjectDao projectDao;

    @Inject
    ProjectConverter projectConverter;

    @Override
    public ProjectListResponse execute(ProjectListRequest request) {
        ProjectListResponse response = new ProjectListResponse();

        List<Project> projects;
		if (request.getSuggestString() != null && !request.getSuggestString().isEmpty()) {
			projects = projectDao.searchForStartsWith(
					request.getSuggestString(),
					request.getMaxResults(),
					request.getBusinessAccountId());
		} else if (request.getSearchString() != null && !request.getSearchString().isEmpty()) {
			projects = projectDao.search(
					request.getSearchString(),
					request.getBusinessAccountId());
		} else {
			projects = projectDao.findAll(request.getBusinessAccountId());
		}

        for (Project project : projects) {
            ProjectC projectC = projectConverter.toProjectC(project);
            response.getProjectCList().add(projectC);
        }

        return response;
    }
}