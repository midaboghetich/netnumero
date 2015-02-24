package com.numhero.server.model.pojo;

import com.numhero.shared.enums.InvoiceTypeEnum;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

/**
 * Invoice Tester.
 * 
 * @author Antonio Signore
 * @since <pre>
 * 03 / 25 / 2010
 * </pre>
 * @version 1.0
 */
public class InvoiceTest extends TestCase {

	Invoice	invoice	= PojoTestUtils.createInvoice();

	public void setUp() throws Exception {
		super.setUp();
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetDateRaised() throws Exception {
		assertEquals(PojoTestUtils.raisedDate, invoice.getDateRaised());
	}

	@Test
	public void testSetDateRaised() throws Exception {
		Date date = new Date();
		invoice.setDateRaised(date);
		assertEquals(date, invoice.getDateRaised());
	}

	@Test
	public void testGetDateDue() throws Exception {
		assertEquals(PojoTestUtils.dueDate, invoice.getDateDue());
	}

	@Test
	public void testSetDateDue() throws Exception {
		Date date = new Date();
		invoice.setDateDue(date);
		assertEquals(date, invoice.getDateDue());
	}

	@Test
	public void testGetInvoiceID() throws Exception {
		assertEquals("invoice", invoice.getInvoiceID());
	}

	@Test
	public void testSetInvoiceID() throws Exception {
		invoice.setInvoiceID("new_name");
		assertEquals("new_name", invoice.getInvoiceID());
	}

	@Test
	public void testGetNotes() throws Exception {
		assertEquals("brown lasy fox jumps over the green fence", invoice.getNotes());
	}

	@Test
	public void testSetNotes() throws Exception {
		invoice.setNotes("new_notes");
		assertEquals("new_notes", invoice.getNotes());
	}

	@Test
	public void testGetDiscounts() throws Exception {
		assertEquals(1.5, invoice.getDiscount());
	}

	@Test
	public void testSetDiscounts() throws Exception {
		invoice.setDiscount(2.5);
		assertEquals(2.5, invoice.getDiscount());
	}

	@Test
	public void testGetInvoiceType() {
		assertEquals(InvoiceTypeEnum.Estimate, invoice.getInvoiceType());
	}

	@Test
	public void testSetInvoiceType() {
		invoice.setInvoiceType(InvoiceTypeEnum.Invoice);
		assertEquals(InvoiceTypeEnum.Invoice, invoice.getInvoiceType());
	}

	@Test
	public void testAddInvoiceDetail() {

		InvoiceDetail detail1 = new InvoiceDetail();
		invoice.addInvoiceDetail(detail1);

		InvoiceDetail detail2 = new InvoiceDetail();
		invoice.addInvoiceDetail(detail2);

		InvoiceDetail detail3 = new InvoiceDetail();
		invoice.addInvoiceDetail(detail3);

		assertEquals(3, invoice.getDetails().size());

	}
}
