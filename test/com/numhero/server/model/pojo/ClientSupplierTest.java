package com.numhero.server.model.pojo;

import junit.framework.TestCase;

import org.junit.Test;

import com.numhero.shared.enums.ClientSupplierEnum;

/**
 * ClientSupplierPanel Tester.
 *
 * @author Antonio Signore
 * @since <pre>03/25/2010</pre>
 * @version 1.0
 */
public class ClientSupplierTest extends TestCase {

    ClientSupplier clientSupplier = PojoTestUtils.createClientSupplier();

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /*
        clientSupplier.setAddress("kaiserswertherstr 115");
        clientSupplier.setBusinessAccountId("bizId");
        clientSupplier.setCity("Dusseldorf");
        clientSupplier.setCountry("DE");
        clientSupplier.setEmail("a@me.com");
        clientSupplier.setConcurrencyVersion(1);
        clientSupplier.setFax("+4909120909");
        clientSupplier.setMobile("+491732131694");
        clientSupplier.setName("antonio");
        clientSupplier.setPhone("+49129128093812");
        clientSupplier.setRegion("NRW");
        clientSupplier.setType(ClientSupplierEnum.client_supplier);
        clientSupplier.setZipCode("40474");
     */

    @Test
    public void testGetType() throws Exception {
        assertEquals(ClientSupplierEnum.client, clientSupplier.getPartnerType());
    }

    @Test
    public void testSetType() throws Exception {
        clientSupplier.setPartnerType(ClientSupplierEnum.both);
        assertEquals(ClientSupplierEnum.both, clientSupplier.getPartnerType());
    }

    @Test
    public void testGetBusinessAccountId() throws Exception {
        assertEquals("ba1", clientSupplier.getBusinessAccountId());
    }

    @Test
    public void testSetBusinessAccountId() throws Exception {
        clientSupplier.setBusinessAccountId("new_bizId");
        assertEquals("new_bizId", clientSupplier.getBusinessAccountId());
    }

    @Test
    public void testGetCountry() throws Exception {
        assertEquals("DE", clientSupplier.getCountry());
    }

    @Test
    public void testSetCountry() throws Exception {
        clientSupplier.setCountry("US");
        assertEquals("US", clientSupplier.getCountry());
    }

    @Test
    public void testGetAddress() throws Exception {
        assertEquals("kaiserswertherstr 115", clientSupplier.getAddress());
    }

    @Test
    public void testSetAddress() throws Exception {
        clientSupplier.setAddress("blah");
        assertEquals("blah", clientSupplier.getAddress());
    }

    @Test
    public void testGetCity() throws Exception {
        assertEquals("Dusseldorf", clientSupplier.getCity());
    }

    @Test
    public void testSetCity() throws Exception {
        clientSupplier.setCity("Rome");
        assertEquals("Rome", clientSupplier.getCity());
    }

    @Test
    public void testGetRegion() throws Exception {
        assertEquals("NRW", clientSupplier.getRegion());
    }

    @Test
    public void testSetRegion() throws Exception {
        clientSupplier.setRegion("BLAH");
        assertEquals("BLAH", clientSupplier.getRegion());
    }

    @Test
    public void testGetZipCode() throws Exception {
        assertEquals("40474", clientSupplier.getZipCode());
    }

    @Test
    public void testSetZipCode() throws Exception {
        clientSupplier.setZipCode("11111");
        assertEquals("11111", clientSupplier.getZipCode());
    }
}
