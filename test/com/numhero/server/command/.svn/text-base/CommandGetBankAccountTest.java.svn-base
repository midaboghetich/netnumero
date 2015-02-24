package com.numhero.server.command;

import com.google.inject.*;
import com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest;
import com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse;
import com.numhero.client.model.datacargo.bankaccount.SaveBankAccountRequest;
import com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountRequest;
import com.numhero.client.model.pojoc.BankAccountC;
import com.numhero.client.model.pojoc.BusinessAccountC;
import com.numhero.server.model.dao.BankAccountDao;
import com.numhero.server.model.dao.BusinessAccountDao;
import com.numhero.server.model.pojo.BankAccount;
import com.numhero.server.model.pojo.BusinessAccount;
import com.numhero.server.model.pojo.PojoTestUtils;
import com.numhero.server.model.pojo.User;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

public class CommandGetBankAccountTest extends TestCase {

    BankAccountDao bankAccountDao;
    BusinessAccountDao dao;

    CommandGetBankAccount commandGetBankAccount;
    CommandSaveBankAccount commandSaveBankAccount;
    CommandSaveBusinessAccount commandSaveBusinessAccount;

    User user = PojoTestUtils.createUser();

    @Before
    public void setUp() throws Exception {
        super.setUp();

        commandGetBankAccount = new CommandGetBankAccount();
//        commandGetBankAccount.setUser(user);

        commandSaveBankAccount = new CommandSaveBankAccount();
//        commandSaveBankAccount.setUser(user);


        Injector injector = Guice.createInjector(new GuiceModule());
        bankAccountDao = injector.getInstance(BankAccountDao.class);
        injector.injectMembers(commandGetBankAccount);
        injector.injectMembers(commandSaveBankAccount);

        commandSaveBusinessAccount = new CommandSaveBusinessAccount();
//        commandSaveBusinessAccount.setUser(user);

        dao = injector.getInstance(BusinessAccountDao.class);
        injector.injectMembers(commandSaveBusinessAccount);
    }

    private BusinessAccount saveTestBusinessAccount() {
        SaveBusinessAccountRequest saverequest = new SaveBusinessAccountRequest();
        BusinessAccount businessAccount = PojoTestUtils.createBusinessAccount();
        BusinessAccountC businessAccountC = commandSaveBusinessAccount.businessAccountConverter.toBusinessAccountC(businessAccount);
        saverequest.setBusinessAccountC(businessAccountC);
        commandSaveBusinessAccount.execute(saverequest);
        return businessAccount;
    }

    private BankAccount saveTestBankAccount(BusinessAccount ba) {
        SaveBankAccountRequest saverequest = new SaveBankAccountRequest();
        BankAccount bankAccount = PojoTestUtils.createBankAccount();
        bankAccount.setBusinessAccountId(ba.getId());
        
        BankAccountC bankAccountC = commandSaveBankAccount.bankAccountConverter.toBankAccountC(bankAccount);
        saverequest.setBankAccountC(bankAccountC);

//        commandSaveBankAccount.setBusinessAccount(ba);
        commandSaveBankAccount.execute(saverequest);
        return bankAccount;
    }

    @Test
    public void testGetBankAccountC() throws Exception {

        BusinessAccount businessAccount = saveTestBusinessAccount();
        BankAccount bankAccount = saveTestBankAccount(businessAccount);

        GetBankAccountRequest request = new GetBankAccountRequest();
        request.setEntityId(bankAccount.getId());
        request.setBusinessAccountId(businessAccount.getId());

        GetBankAccountResponse response = commandGetBankAccount.execute(request);
        BankAccountC baC = response.getBankAccountC();
        assertEquals(bankAccount.getId(), baC.getId());

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

        @SuppressWarnings("unused")
        @Provides
        @Singleton
        BankAccountDao getBankAccountDao() {
            BankAccountDao dao = mock(BankAccountDao.class);
            doAnswer(new Answer<BankAccount>() {
                @Override
                public BankAccount answer(InvocationOnMock invocation) throws Throwable {
                    String id = (String) invocation.getArguments()[0];
                    BankAccount ba = new BankAccount();
                    ba.setId(id);
                    return ba;
                }
            }).when(dao).get(anyString());

            return dao;
        }

    }
}
