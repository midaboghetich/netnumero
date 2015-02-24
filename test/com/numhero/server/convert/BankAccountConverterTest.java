package com.numhero.server.convert;

import junit.framework.TestCase;

import org.junit.Test;

import com.numhero.client.model.pojoc.BankAccountC;
import com.numhero.server.model.pojo.BankAccount;
import com.numhero.server.model.pojo.PojoTestUtils;

public class BankAccountConverterTest extends TestCase {

    BankAccount bankAccount ;
    BankAccountC bankAccountC;
    BankAccountConverter converter = new BankAccountConverter();

    private void initTest() {
        bankAccount = PojoTestUtils.createBankAccount();
        bankAccountC = converter.toBankAccountC(bankAccount);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testToBankAccountC() throws Exception {

        initTest();

        assertEquals(bankAccountC.getAccount(),bankAccount.getAccount());
        assertEquals(bankAccountC.getBank(),bankAccount.getBank());
        assertEquals(bankAccountC.getName(),bankAccount.getName());
        assertEquals(bankAccountC.getBusinessAccountId(),bankAccount.getBusinessAccountId());
        assertEquals(bankAccountC.getCurrency(),bankAccount.getCurrency());
        assertEquals(bankAccountC.getCurrentBalance(),bankAccount.getCurrentBalance());
        assertEquals(bankAccountC.getDescription(),bankAccount.getDescription());
        assertEquals(bankAccountC.getIban(),bankAccount.getIban());
        assertEquals(bankAccountC.getOpeningBalance(),bankAccount.getOpeningBalance());
        assertEquals(bankAccountC.getSwift(),bankAccount.getSwift());

    }


    @Test
    public void testMergeIntoBankAccount() throws Exception {

        initTest();
        bankAccount = new BankAccount();
        converter.mergeIntoBankAccount(bankAccountC, bankAccount);

        assertEquals(bankAccountC.getAccount(),bankAccount.getAccount());
        assertEquals(bankAccountC.getBank(),bankAccount.getBank());
        assertEquals(bankAccountC.getName(),bankAccount.getName());
        assertEquals(bankAccountC.getBusinessAccountId(),bankAccount.getBusinessAccountId());
        assertEquals(bankAccountC.getCurrency(),bankAccount.getCurrency());
        assertEquals(bankAccountC.getCurrentBalance(),bankAccount.getCurrentBalance());
        assertEquals(bankAccountC.getDescription(),bankAccount.getDescription());
        assertEquals(bankAccountC.getIban(),bankAccount.getIban());
        assertEquals(bankAccountC.getOpeningBalance(),bankAccount.getOpeningBalance());
        assertEquals(bankAccountC.getSwift(),bankAccount.getSwift());
        
    }

}
