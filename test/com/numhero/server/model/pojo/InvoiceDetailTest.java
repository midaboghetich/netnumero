package com.numhero.server.model.pojo;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * InvoiceDetail Tester.
 *
 * @author Antonio Signore
 * @since <pre>03/25/2010</pre>
 * @version 1.0
 */
public class InvoiceDetailTest extends TestCase {

    InvoiceDetail detail = PojoTestUtils.createInvoiceDetail();

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testGetQuantity() throws Exception {
        assertEquals (20D, detail.getQuantity());
    }

    @Test
    public void testSetQuantity() throws Exception {
        detail.setQuantity(2000D);
        assertEquals (2000D, detail.getQuantity());
    }

    @Test
    public void testGetPrice() throws Exception {
        assertEquals (100D, detail.getPrice());
    }

    @Test
    public void testSetPrice() throws Exception {
        detail.setPrice(300D);
        assertEquals (300D, detail.getPrice());
    }

    @Test
    public void testGetProductId() throws Exception {
        assertEquals ("pid", detail.getProductId());
    }

    @Test
    public void testSetProductId() throws Exception {
        detail.setProductId("new_pid");
        assertEquals ("new_pid", detail.getProductId());
    }

    @Test
    public void testGetTaxes() throws Exception {
    	TaxInfo tax = detail.getTaxes().iterator().next();
        assertEquals ("VAT", tax.getName());
        assertEquals (17.5, tax.getValue());
    }

    @Test
    public void testSetTaxes() throws Exception {
        detail.addTax("tax2Id");
        assertEquals (2, detail.getTaxes().size());

        detail.deleteTax("tax2Id");
        assertEquals (1, detail.getTaxes().size());
    }

    @Test
    public void testHashCode() throws Exception {
        assertEquals (-1335223278, detail.hashCode());
    }

    @Test
    public void testEquals() throws Exception {
        assertEquals(true, detail.equals(detail));

        InvoiceDetail detail2 = new InvoiceDetail();
        detail2.setId("4");

        assertEquals(false, detail.equals(detail2));
    }

}
