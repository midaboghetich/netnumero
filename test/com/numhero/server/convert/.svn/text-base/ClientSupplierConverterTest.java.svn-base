package com.numhero.server.convert;

import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.server.model.pojo.ClientSupplier;
import com.numhero.server.model.pojo.PojoTestUtils;
import com.numhero.shared.enums.ClientSupplierEnum;
import junit.framework.TestCase;

public class ClientSupplierConverterTest extends TestCase {

    ClientSupplier clientSupplier;
    ClientSupplierC clientSupplierC;
    ClientSupplierConverter converter = new ClientSupplierConverter();

    private void initTest() {
        clientSupplier = PojoTestUtils.createClientSupplier();
        clientSupplierC = converter.toClientSupplierC(clientSupplier);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testMergeIntoClientSupplier() throws Exception {

        initTest();

        assertEquals(clientSupplierC.getId() ,clientSupplierC.getId());
        assertEquals(clientSupplierC.getType() ,clientSupplierC.getType());
        assertEquals(clientSupplierC.getSendInvoiceType() ,clientSupplierC.getSendInvoiceType());
        assertEquals(clientSupplierC.getCompanyName() ,clientSupplierC.getCompanyName());
        assertEquals(clientSupplierC.getCompanyPhone() ,clientSupplierC.getCompanyPhone());
        assertEquals(clientSupplierC.getCompanyFax() ,clientSupplierC.getCompanyFax());
		assertEquals(clientSupplierC.getAddress() ,clientSupplierC.getAddress());
        assertEquals(clientSupplierC.getCity() ,clientSupplierC.getCity());
        assertEquals(clientSupplierC.getRegion() ,clientSupplierC.getRegion());
        assertEquals(clientSupplierC.getZipCode() ,clientSupplierC.getZipCode());
        assertEquals(clientSupplierC.getCountry() ,clientSupplierC.getCountry());
        assertEquals(clientSupplierC.getNotes() ,clientSupplierC.getNotes());
    }

    public void testToClientSupplierC() throws Exception {
        initTest();
        clientSupplier = new ClientSupplier();
        converter.mergeIntoClientSupplier(clientSupplierC, clientSupplier);

        assertEquals(clientSupplierC.getId() ,clientSupplierC.getId());
        assertEquals(clientSupplierC.getType() ,clientSupplierC.getType());
        assertEquals(clientSupplierC.getSendInvoiceType() ,clientSupplierC.getSendInvoiceType());
        assertEquals(clientSupplierC.getCompanyName() ,clientSupplierC.getCompanyName());
        assertEquals(clientSupplierC.getCompanyPhone() ,clientSupplierC.getCompanyPhone());
        assertEquals(clientSupplierC.getCompanyFax() ,clientSupplierC.getCompanyFax());
		assertEquals(clientSupplierC.getAddress() ,clientSupplierC.getAddress());
        assertEquals(clientSupplierC.getCity() ,clientSupplierC.getCity());
        assertEquals(clientSupplierC.getRegion() ,clientSupplierC.getRegion());
        assertEquals(clientSupplierC.getZipCode() ,clientSupplierC.getZipCode());
        assertEquals(clientSupplierC.getCountry() ,clientSupplierC.getCountry());
        assertEquals(clientSupplierC.getNotes() ,clientSupplierC.getNotes());
    }

    public void testEnum() throws Exception {
        initTest();
       clientSupplierC.fType.setValue(ClientSupplierEnum.client);

        assertEquals(ClientSupplierEnum.client, clientSupplierC.getType());
        assertEquals(ClientSupplierEnum.client, clientSupplierC.fType.getValue());

        clientSupplierC.fType.setValue(null);
        assertNull(clientSupplierC.fType.getValue());

        clientSupplierC.fType.setValueAsString(null);
        assertNull(clientSupplierC.fType.getValue());

        clientSupplierC.fType.setValueAsString("supplier");
        assertEquals(ClientSupplierEnum.supplier, clientSupplierC.fType.getValue());

//        try {
//            clientSupplierC.fType2.setValue(SendInvoiceTypeEnum.Email);
//            fail("we need an expection");
//        } catch (RuntimeException e) {
//            assertEquals("Wrong enum Email for field type2", e.getMessage());
//             assertEquals(ClientSupplierEnum.client, clientSupplierC.fType2.getValue());
//        }

    }
}
