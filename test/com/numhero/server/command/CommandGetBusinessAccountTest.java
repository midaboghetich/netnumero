package com.numhero.server.command;

import com.google.inject.*;
import com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountRequest;
import com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountResponse;
import com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountRequest;
import com.numhero.client.model.pojoc.BusinessAccountC;
import com.numhero.server.model.dao.BusinessAccountDao;
import com.numhero.server.model.pojo.BusinessAccount;
import com.numhero.server.model.pojo.PojoTestUtils;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

public class CommandGetBusinessAccountTest extends TestCase {

	BusinessAccountDao			dao;

	CommandGetBusinessAccount	commandGetBusinessAccount;
    CommandSaveBusinessAccount	commandSaveBusinessAccount;


	@Before
	public void setUp() throws Exception {
		super.setUp();

		commandGetBusinessAccount = new CommandGetBusinessAccount();
//		User user = PojoTestUtils.createUser();
//		user.setBusinessAccountId("ba1");
//		commandGetBusinessAccount.setUser(user);

        commandSaveBusinessAccount = new CommandSaveBusinessAccount();
        Injector injector = Guice.createInjector(new GuiceModule());
        dao = injector.getInstance(BusinessAccountDao.class);
        injector.injectMembers(commandSaveBusinessAccount);
		injector.injectMembers(commandGetBusinessAccount);
	}

	@Test
	public void testGetBusinessAccountC() throws Exception {

        BusinessAccount businessAccount = saveTestBusinessAccount();

        GetBusinessAccountRequest request = new GetBusinessAccountRequest();
        request.setBusinessAccountId(businessAccount.getId());
		GetBusinessAccountResponse response = commandGetBusinessAccount.execute(request);

		BusinessAccountC baC = response.getBusinessAccountC();
		assertEquals(businessAccount.getId(), baC.getId());

	}

    private BusinessAccount saveTestBusinessAccount() {
        SaveBusinessAccountRequest saverequest = new SaveBusinessAccountRequest();
        BusinessAccount businessAccount = PojoTestUtils.createBusinessAccount();
        BusinessAccountC businessAccountC = commandSaveBusinessAccount.businessAccountConverter.toBusinessAccountC(businessAccount);
        saverequest.setBusinessAccountC(businessAccountC);
        commandSaveBusinessAccount.execute(saverequest);
        return businessAccount;
    }

    // inner class --------------------------------------
	private class GuiceModule extends AbstractModule {
		@Override
		protected void configure() {
		}

		@SuppressWarnings("unused")
		@Provides
		@Singleton
		BusinessAccountDao getDao() {
			BusinessAccountDao dao = mock(BusinessAccountDao.class);
	        doAnswer(new Answer<BusinessAccount>() {
				@Override
				public BusinessAccount answer(InvocationOnMock invocation) throws Throwable {
					String id = (String) invocation.getArguments()[0];
					BusinessAccount ba = new BusinessAccount();
					ba.setId(id);
					return ba;
				}
			}).when(dao).get(anyString());

			return dao;
		}
	}
}
