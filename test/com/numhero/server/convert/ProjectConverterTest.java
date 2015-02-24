package com.numhero.server.convert;

import junit.framework.TestCase;

import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.server.model.pojo.PojoTestUtils;
import com.numhero.server.model.pojo.Project;

public class ProjectConverterTest extends TestCase {

    Project project;
    ProjectC projectC;
    ProjectConverter converter = new ProjectConverter();

    private void initTest() {
        project = PojoTestUtils.createProject();
        projectC = converter.toProjectC(project);
    }
    
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testMergeIntoInvoice() throws Exception {
        initTest();
        
        assertEquals(projectC.getDescription() ,projectC.getDescription());
        assertEquals(projectC.getClientSupplierID() ,projectC.getClientSupplierID());
        assertEquals(projectC.getCreated() ,projectC.getCreated());
        assertEquals(projectC.getLastBilled() ,projectC.getLastBilled());
        assertEquals(projectC.getNotBilledHours() ,projectC.getNotBilledHours());
        assertEquals(projectC.getState() ,projectC.getState());
        assertEquals(projectC.getTotalHours() ,projectC.getTotalHours());

    }

    public void testToProjectC() throws Exception {
        initTest();
        project = new Project();
        converter.mergeIntoProject(projectC, project);
        
        assertEquals(projectC.getDescription() ,projectC.getDescription());
        assertEquals(projectC.getClientSupplierID() ,projectC.getClientSupplierID());
        assertEquals(projectC.getCreated() ,projectC.getCreated());
        assertEquals(projectC.getLastBilled() ,projectC.getLastBilled());
        assertEquals(projectC.getNotBilledHours() ,projectC.getNotBilledHours());
        assertEquals(projectC.getState() ,projectC.getState());
        assertEquals(projectC.getTotalHours() ,projectC.getTotalHours());

    }
}
