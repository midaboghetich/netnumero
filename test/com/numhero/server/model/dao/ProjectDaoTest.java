package com.numhero.server.model.dao;

import com.numhero.server.NumheroUtils;
import com.numhero.server.model.pojo.Project;
import com.numhero.server.model.pojo.ProjectTaskDetail;
import org.junit.Test;

import java.util.List;

public class ProjectDaoTest extends BaseDaoTest {

    private ProjectDao projectDao;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        projectDao = NumheroUtils.injector.getInstance(ProjectDao.class);
    }

    @Test
    public void testInjection() throws Exception {
        assertNotNull(projectDao);
    }

    @Test
    public void testSaveAndRetrieve() throws Exception {

        Project project = createProject();

        projectDao.save(project);
        pm.flush();
        pm.evictAll();

        Project u2 = projectDao.get(project.getId());

        assertEquals(project.getId(), u2.getId());

        String pk = project.getId();
        projectDao.delete(project);

        Project u3 = projectDao.get(pk);
        assertNull(u3);


    }

    private Project createProject() {
        Project project = new Project();
        project.setDescription("a time entry");
        project.setBusinessAccountId("ba1");
        return project;
    }

    private ProjectTaskDetail createTask() {
        ProjectTaskDetail task = new ProjectTaskDetail();
        task.setDescription("a certain task");
        return task;
    }

    @Test
    public void testSave() throws Exception {
        Project project = createProject();

        ProjectTaskDetail task = createTask();
        project.getProjectTaskDetails().add(task);

        projectDao.save(project);
        assertNotNull("failed to create project id", project.getId());

        pm.flush();
        pm.evictAll();

        Project project2 = projectDao.get(project.getId());

        assertEquals(project.getId(), project2.getId());
        assertEquals(1, project2.getProjectTaskDetails().size());

    }

    @Test
    public void testOrphans() throws Exception {
        Project project = createProject();

        ProjectTaskDetail task = createTask();
        project.getProjectTaskDetails().add(task);

        projectDao.save(project);
        assertNotNull("failed to create project id", project.getId());

        pm.flush();
        pm.evictAll();

        Project project2 = projectDao.get(project.getId());

        assertEquals(project.getId(), project2.getId());
        assertEquals(1, project2.getProjectTaskDetails().size());

        ProjectTaskDetail task2 = createTask();
        project.getProjectTaskDetails().add(task2);
        projectDao.save(project);
        assertEquals(2, project2.getProjectTaskDetails().size());

        project.getProjectTaskDetails().clear();
        projectDao.save(project);
        assertEquals(0, project2.getProjectTaskDetails().size());

        List<Project> projects = projectDao.findAll("ba1");
        assertEquals(1, projects.size());
    }
}
