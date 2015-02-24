package com.numhero.server.convert;

import junit.framework.TestCase;

import org.junit.Test;

import com.numhero.client.model.pojoc.BusinessAccountC;
import com.numhero.server.model.pojo.BusinessAccount;
import com.numhero.server.model.pojo.PojoTestUtils;

public class BusinessAccountConverterTest extends TestCase {

    BusinessAccount businessAccount ;
    BusinessAccountC businessAccountC;
    BusinessAccountConverter converter = new BusinessAccountConverter();

    private void initTest() {
        businessAccount = PojoTestUtils.createBusinessAccount();
        businessAccountC = converter.toBusinessAccountC(businessAccount);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testToBusinessAccountC() throws Exception {

        initTest();

        assertEquals(businessAccountC.getId(),businessAccount.getId());
        assertEquals(businessAccountC.getName(),businessAccount.getName());
        assertEquals(businessAccountC.getEmail(),businessAccount.getEmail());
        assertEquals(businessAccountC.getPhoneNumber(),businessAccount.getPhoneNumber());
        assertEquals(businessAccountC.getFaxNumber(),businessAccount.getFaxNumber());
        assertEquals(businessAccountC.getVatRegistrationNumber(),businessAccount.getVatRegistrationNumber());
        assertEquals(businessAccountC.getDateFormat(),businessAccount.getDateFormat());
        assertEquals(businessAccountC.getTimeFormat(),businessAccount.getTimeFormat());
        assertEquals(businessAccountC.getPrefixes(),businessAccount.getPrefixes());
        assertEquals(businessAccountC.getCurrency(),businessAccount.getCurrency());
        assertEquals(businessAccountC.getDefaultDaysDue(),businessAccount.getDefaultDaysDue());
        assertEquals(businessAccountC.getTermsConditionsProducts(),businessAccount.getTermsConditionsProducts());
        assertEquals(businessAccountC.getTermsConditionsServices(),businessAccount.getTermsConditionsServices());
        assertEquals(businessAccountC.getTaxes(),businessAccount.getTaxes());
        assertEquals(businessAccountC.getPreferredPaymentMethods(),businessAccount.getPreferredPaymentMethods());

    }

    @Test
    public void testMergeIntoBusinessAccount() throws Exception {

        initTest();
        businessAccount = new BusinessAccount();
        converter.mergeIntoBusinessAccount(businessAccountC, businessAccount);

        assertEquals(businessAccountC.getId(),businessAccount.getId());
        assertEquals(businessAccountC.getName(),businessAccount.getName());
        assertEquals(businessAccountC.getEmail(),businessAccount.getEmail());
        assertEquals(businessAccountC.getPhoneNumber(),businessAccount.getPhoneNumber());
        assertEquals(businessAccountC.getFaxNumber(),businessAccount.getFaxNumber());
        assertEquals(businessAccountC.getVatRegistrationNumber(),businessAccount.getVatRegistrationNumber());
        assertEquals(businessAccountC.getDateFormat(),businessAccount.getDateFormat());
        assertEquals(businessAccountC.getTimeFormat(),businessAccount.getTimeFormat());
        assertEquals(businessAccountC.getPrefixes(),businessAccount.getPrefixes());
        assertEquals(businessAccountC.getCurrency(),businessAccount.getCurrency());
        assertEquals(businessAccountC.getDefaultDaysDue(),businessAccount.getDefaultDaysDue());
        assertEquals(businessAccountC.getTermsConditionsProducts(),businessAccount.getTermsConditionsProducts());
        assertEquals(businessAccountC.getTermsConditionsServices(),businessAccount.getTermsConditionsServices());
        assertEquals(businessAccountC.getTaxes(),businessAccount.getTaxes());
        assertEquals(businessAccountC.getPreferredPaymentMethods(),businessAccount.getPreferredPaymentMethods());

    }

}
