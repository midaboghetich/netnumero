package com.numhero.server.model.pojo;

import junit.framework.TestCase;

import org.junit.Test;

import com.numhero.shared.enums.CurrencyEnum;
import com.numhero.shared.enums.DateFormatEnum;
import com.numhero.shared.enums.PaymentMethodEnum;
import com.numhero.shared.enums.TimeFormatEnum;

/**
 * BusinessAccountPanel Tester.
 *
 * @author Antonio Signore
 * @version 1.0
 * @since <pre>03/25/2010</pre>
 */
public class BusinessAccountTest extends TestCase {

    BusinessAccount businessAccount = PojoTestUtils.createBusinessAccount();

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("name", businessAccount.getName());
    }

    @Test
    public void testSetName() throws Exception {
        businessAccount.setName("xxx");
        assertEquals("xxx", businessAccount.getName());
    }

    @Test
    public void testGetEmail() throws Exception {
        assertEquals("me@b.com", businessAccount.getEmail());
    }

    @Test
    public void testSetEmail() throws Exception {
        businessAccount.setEmail("blah@p.com");
        assertEquals("blah@p.com", businessAccount.getEmail());
    }

    @Test
    public void testGetPhoneNumber() throws Exception {
        assertEquals("490088345", businessAccount.getPhoneNumber());
    }

    @Test
    public void testSetPhoneNumber() throws Exception {
        businessAccount.setPhoneNumber("12345");
        assertEquals("12345", businessAccount.getPhoneNumber());
    }

    @Test
    public void testGetVatRegistrationNumber() throws Exception {
        assertEquals("vat_number", businessAccount.getVatRegistrationNumber());
    }

    @Test
    public void testSetVatRegistrationNumber() throws Exception {
        businessAccount.setVatRegistrationNumber("blah");
        assertEquals("blah", businessAccount.getVatRegistrationNumber());
    }

    @Test
    public void testGetDateFormat() throws Exception {
        assertEquals(DateFormatEnum.ddmmyyyycolon, businessAccount.getDateFormat());
    }

    @Test
    public void testSetDateFormat() throws Exception {
        businessAccount.setDateFormat(DateFormatEnum.ddmmyyyycolon);
        assertEquals(DateFormatEnum.ddmmyyyycolon, businessAccount.getDateFormat());
    }

    @Test
    public void testGetTimeFormat() throws Exception {
        assertEquals(TimeFormatEnum.hhmmssscolon, businessAccount.getTimeFormat());
    }

    @Test
    public void testSetTimeFormat() throws Exception {
        businessAccount.setTimeFormat(TimeFormatEnum.hhmmssscolon);
        assertEquals(TimeFormatEnum.hhmmssscolon, businessAccount.getTimeFormat());
    }

    @Test
    public void testGetCurrency() throws Exception {
        assertEquals(CurrencyEnum.EUR, businessAccount.getCurrency());
    }

    @Test
    public void testSetCurrency() throws Exception {
        businessAccount.setCurrency(CurrencyEnum.BRL);
        assertEquals(CurrencyEnum.BRL, businessAccount.getCurrency());
    }

    @Test
    public void testGetDefaultDaysDue() throws Exception {
        assertEquals(30, (int) businessAccount.getDefaultDaysDue());
    }

    @Test
    public void testSetDefaultDaysDue() throws Exception {
        businessAccount.setDefaultDaysDue(10);
        assertEquals(10, (int)businessAccount.getDefaultDaysDue());
    }

    @Test
    public void testGetTermsConditionsProducts() throws Exception {
        assertEquals("my terms for products", businessAccount.getTermsConditionsProducts());
    }

    @Test
    public void testSetTermsConditionsProducts() throws Exception {
        businessAccount.setTermsConditionsProducts("products");
        assertEquals("products", businessAccount.getTermsConditionsProducts());
    }

    @Test
    public void testGetTermsConditionsServices() throws Exception {
        assertEquals("my terms for services", businessAccount.getTermsConditionsServices());
    }

    @Test
    public void testSetTermsConditionsServices() throws Exception {
        businessAccount.setTermsConditionsServices("services");
        assertEquals("services", businessAccount.getTermsConditionsServices());
    }

    @Test
    public void testGetPreferredPaymentMethods() throws Exception {
        assertEquals(PaymentMethodEnum.BANK_PAYMENT, businessAccount.getPreferredPaymentMethods());
    }

    @Test
    public void testSetPreferredPaymentMethods() throws Exception {
        businessAccount.setPreferredPaymentMethods(PaymentMethodEnum.INVOICE);
        assertEquals(PaymentMethodEnum.INVOICE, businessAccount.getPreferredPaymentMethods());

    }
}
