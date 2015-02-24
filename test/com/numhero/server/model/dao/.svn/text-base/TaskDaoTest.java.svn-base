package com.numhero.server.model.dao;

import com.numhero.server.NumheroUtils;
import com.numhero.server.model.pojo.Task;
import org.junit.Test;

import java.util.List;

public class TaskDaoTest extends BaseDaoTest {
    
	private TaskDao taskDao;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		taskDao = NumheroUtils.injector.getInstance(TaskDao.class);
	}

	@Test
	public void testInjection() throws Exception {
		assertNotNull(taskDao);
	}

	@Test
	public void testSaveAndRetrieve() throws Exception {

        Task u = createTask();

		taskDao.save(u);
		pm.flush();
		pm.evictAll();

		Task u2 = taskDao.get(u.getId());
        
		assertEquals(u.getId(), u2.getId());
	}

    private Task createTask() {
        Task task = new Task();
        task.setDescription("a certain task");
        task.setBusinessAccountId("ba1");
        return task;
    }

    @Test

	public void testSave() throws Exception {
        Task u = createTask();

		taskDao.save(u);
		assertNotNull("failed to create task id", u.getId());

		List<Task> tasks = taskDao.findAll("ba1");

        assertEquals(1, tasks.size());
    }
}