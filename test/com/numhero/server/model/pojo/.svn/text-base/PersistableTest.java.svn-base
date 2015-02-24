package com.numhero.server.model.pojo;

import java.util.Date;

import junit.framework.TestCase;

/**
 * Persistable Tester.
 *
 * @author Antonio Signore
 * @since <pre>03/25/2010</pre>
 * @version 1.0
 */
public class PersistableTest extends TestCase {

    Date dueDate = new Date();
    Date raisedDate = new Date();
    Invoice invoice = createInvoice();

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    private Invoice createInvoice(){

        Invoice invoice = new Invoice();

        invoice.setConcurrencyVersion(1);
        invoice.setDateDue( dueDate );
        invoice.setDateRaised( raisedDate );
        invoice.setDiscount(1.5);
        invoice.setId("100");
        invoice.setInvoiceID("invoice");
        invoice.setNotes("notes");

        return invoice;
    }


    public void testGetId() throws Exception {

        assertEquals("100", invoice.getId());

    }

    public void testSetId() throws Exception {

        invoice.setId("200");
        assertEquals("200", invoice.getId());

    }

    public void testIsNew() throws Exception {
        assertEquals(false, invoice.isNew());

        invoice.setId(null);
        assertEquals(true, invoice.isNew());

    }

    public void testHashCode() throws Exception {

        assertEquals(48656, invoice.hashCode());

    }

    public void testEquals() throws Exception {

        assertEquals(true, invoice.equals(invoice));

        Invoice invoice2 = new Invoice();
        invoice2.setId("300");
        assertEquals(false, invoice.equals(invoice2));

    }

}
