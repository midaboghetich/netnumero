package com.numhero.server.model.pojo;

import junit.framework.TestCase;

import org.junit.Test;

import com.numhero.shared.enums.CurrencyEnum;

/**
 * BankAccountPanel Tester.
 *
 * @author Antonio Signore
 * @since <pre>03/25/2010</pre>
 * @version 1.0
 */
public class BankAccountTest extends TestCase {

    BankAccount bankAccount = PojoTestUtils.createBankAccount();

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testGetBank() throws Exception {
        assertEquals("my_bank", bankAccount.getBank());
    }

    @Test
    public void testSetBank() throws Exception {
        bankAccount.setBank("my_new_bank");
        assertEquals("my_new_bank", bankAccount.getBank());
    }

    @Test
    public void testGetIban() throws Exception {
        assertEquals("DEIT81374-1234", bankAccount.getIban());
    }

    @Test
    public void testSetIban() throws Exception {
        bankAccount.setIban("new_iban");
        assertEquals("new_iban", bankAccount.getIban());
    }

    @Test
    public void testGetSwift() throws Exception {
        assertEquals("BIC_CODE", bankAccount.getSwift());
    }

    @Test
    public void testSetSwift() throws Exception {
        bankAccount.setSwift("swift_code");
        assertEquals("swift_code", bankAccount.getSwift());
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("name", bankAccount.getName());
    }

    @Test
    public void testSetName() throws Exception {
        bankAccount.setName("new_name");
        assertEquals("new_name", bankAccount.getName());
    }

    @Test
    public void testGetCurrency() throws Exception {
        assertEquals(CurrencyEnum.EUR, bankAccount.getCurrency());
    }

    @Test
    public void testSetCurrency() throws Exception {
        bankAccount.setCurrency(CurrencyEnum.BRL);
        assertEquals(CurrencyEnum.BRL, bankAccount.getCurrency());
    }

    @Test
    public void testGetAccount() throws Exception {
        assertEquals("my_account", bankAccount.getAccount());
    }

    @Test
    public void testSetAccount() throws Exception {
        bankAccount.setAccount("account");
        assertEquals("account", bankAccount.getAccount());
    }

    @Test
    public void testIsComplete() throws Exception {

        assertEquals(true, bankAccount.isComplete());

        bankAccount.setIban(null);
        assertEquals(false, bankAccount.isComplete());

        bankAccount.setIban("blah");
        assertEquals(true, bankAccount.isComplete());

        bankAccount.setCurrency(null);
        assertEquals(false, bankAccount.isComplete());

        bankAccount.setCurrency(CurrencyEnum.EUR);
        assertEquals(true, bankAccount.isComplete());

        bankAccount.setBank(null);
        assertEquals(false, bankAccount.isComplete());
    }

    @Test
    public void testGetDescription() throws Exception {
        assertEquals("description", bankAccount.getDescription());
    }

    @Test
    public void testSetDescription() throws Exception {
        bankAccount.setDescription("my_desc");
        assertEquals("my_desc", bankAccount.getDescription());
    }

    @Test
    public void testGetOpeningBalance() {
        assertEquals(100D, bankAccount.getOpeningBalance());
    }

    @Test
    public void testSetOpeningBalance(Double openingBalance) {
        bankAccount.setOpeningBalance(0D);
        assertEquals(0D, bankAccount.getOpeningBalance());
    }

    @Test
    public void testGetCurrentBalance() {
        assertEquals(200D, bankAccount.getCurrentBalance());
    }

    @Test
    public void testSetCurrentBalance(Double currentBalance) {
        bankAccount.setCurrentBalance(0D);
        assertEquals(0D, bankAccount.getCurrentBalance());
    }

}
