package com.numhero.server.command;

import com.numhero.server.model.dao.ClientSupplierDao;
import junit.framework.TestCase;
import org.junit.Before;


public class CommandDeleteClientsSuppliersTest extends TestCase {

    ClientSupplierDao dao;

    CommandDeleteClientsSuppliers cmd;

    @Before
    public void setUp() throws Exception {
        super.setUp();

        cmd = new CommandDeleteClientsSuppliers();
//		User user = PojoTestUtils.createUser();
//		user.setBusinessAccountId("ba1");
//		commandGetBusinessAccount.setUser(user);
//
//      commandSaveBusinessAccount = new CommandSaveBusinessAccount();
//      Injector injector = Guice.createInjector(new GuiceModule());
//      dao = injector.getInstance(BusinessAccountDao.class);
//      injector.injectMembers(commandSaveBusinessAccount);
//		injector.injectMembers(commandGetBusinessAccount);
    }
}
