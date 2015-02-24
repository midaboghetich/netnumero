package com.numhero.server.model.dao;

import com.numhero.server.NumheroUtils;
import com.numhero.server.model.pojo.BusinessAccount;
import org.junit.Test;

public class BusinessAccountDaoTest extends BaseDaoTest {
    
	private BusinessAccountDao businessAccountDao;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		businessAccountDao = NumheroUtils.injector.getInstance(BusinessAccountDao.class);
	}

	@Test
	public void testInjection() throws Exception {
		assertNotNull(businessAccountDao);
	}

	@Test
	public void testSaveAndRetrieve() throws Exception {

        BusinessAccount project = createBusinessAccount();

		businessAccountDao.save(project);
		pm.flush();
		pm.evictAll();

		BusinessAccount u2 = businessAccountDao.get(project.getId());
        
		assertEquals(project.getId(), u2.getId());
	}

    private BusinessAccount createBusinessAccount() {
        BusinessAccount project = new BusinessAccount();
        project.setName("a time entry");
        return project;
    }

}