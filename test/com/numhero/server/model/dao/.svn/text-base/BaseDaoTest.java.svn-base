package com.numhero.server.model.dao;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.numhero.server.NumheroUtils;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

public abstract class BaseDaoTest extends TestCase {
	protected PersistenceManager pm;

    private final LocalServiceTestHelper helper =
            new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());

    @Before
	protected void setUp() throws Exception {
		super.setUp();
        helper.setUp();
		pm = NumheroUtils.injector.getInstance(PersistenceManagerFactory.class).getPersistenceManagerProxy();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
        helper.tearDown();
	}
}

