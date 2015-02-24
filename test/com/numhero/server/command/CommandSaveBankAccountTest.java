package com.numhero.server.command;

import com.google.inject.*;
import com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountRequest;
import com.numhero.client.model.pojoc.BusinessAccountC;
import com.numhero.server.model.dao.BusinessAccountDao;
import com.numhero.server.model.pojo.BusinessAccount;
import com.numhero.server.model.pojo.PojoTestUtils;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CommandSaveBankAccountTest extends TestCase {

	BusinessAccountDao			dao;
	CommandSaveBusinessAccount	commandSaveBusinessAccount;

	public void setUp() throws Exception {
		super.setUp();

		commandSaveBusinessAccount = new CommandSaveBusinessAccount();
		Injector injector = Guice.createInjector(new GuiceModule());
		dao = injector.getInstance(BusinessAccountDao.class);
		injector.injectMembers(commandSaveBusinessAccount);
	}

	@Test
	public void testSaveBusinessAccountC() throws Exception {
		SaveBusinessAccountRequest request = new SaveBusinessAccountRequest();
		BusinessAccount businessAccount = PojoTestUtils.createBusinessAccount();
		businessAccount.setId("ba1");

		BusinessAccountC businessAccountC = commandSaveBusinessAccount.businessAccountConverter.toBusinessAccountC(businessAccount);
		request.setBusinessAccountC(businessAccountC);

		commandSaveBusinessAccount.execute(request);

		verify(dao).save(businessAccount);
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