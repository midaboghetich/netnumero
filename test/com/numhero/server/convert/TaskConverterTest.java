package com.numhero.server.convert;

import junit.framework.TestCase;

import com.numhero.client.model.pojoc.TaskC;
import com.numhero.server.model.pojo.PojoTestUtils;
import com.numhero.server.model.pojo.Task;

public class TaskConverterTest extends TestCase {

    Task task;
    TaskC taskC;
    TaskConverter converter = new TaskConverter();

    private void initTest() {
        task = PojoTestUtils.createTask();
        taskC = converter.toTaskC(task);
    }
    
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testMergeIntoTask() throws Exception {
        initTest();
        
        assertEquals(taskC.getBillable(),taskC.getBillable());
        assertEquals(taskC.getCreated(),taskC.getCreated());
        assertEquals(taskC.getDescription(),taskC.getDescription());
        assertEquals(taskC.getProjectId(),taskC.getProjectId());
        assertEquals(taskC.getRate(),taskC.getRate());
    }

    public void testToTaskC() throws Exception {
        initTest();
        task = new Task();
        converter.mergeIntoTask(taskC, task);

        assertEquals(taskC.getBillable(),taskC.getBillable());
        assertEquals(taskC.getCreated(),taskC.getCreated());
        assertEquals(taskC.getDescription(),taskC.getDescription());
        assertEquals(taskC.getProjectId(),taskC.getProjectId());
        assertEquals(taskC.getRate(),taskC.getRate());

    }


}
