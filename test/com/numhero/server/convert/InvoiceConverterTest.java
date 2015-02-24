package com.numhero.server.convert;

import junit.framework.TestCase;

import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.server.model.pojo.Invoice;
import com.numhero.server.model.pojo.PojoTestUtils;

public class InvoiceConverterTest extends TestCase {

	Invoice				invoice;
	InvoiceC			invoiceC;
	InvoiceConverter	converter	= new InvoiceConverter();

	public void testMergeIntoInvoice() throws Exception {
		invoice = PojoTestUtils.createInvoice();
		invoiceC = converter.toInvoiceC(invoice);

		assertEquals(invoice.getInvoiceID(), invoiceC.getInvoiceID());
		assertEquals(invoice.getInvoiceType(), invoiceC.getInvoiceType());
		assertEquals(invoice.getInvoiceStatus(), invoiceC.getInvoiceStatus());
		assertEquals(invoice.getDateRaised(), invoiceC.getDateRaised());
		assertEquals(invoice.getDateDue(), invoiceC.getDateDue());
		assertEquals(invoice.getClientSupplierID(), invoiceC.getClientSupplierID());
		assertEquals(invoice.getPrice(), invoiceC.getPrice());
		assertEquals(invoice.getCurrency(), invoiceC.getCurrency());
		assertEquals(invoice.getNotes(), invoiceC.getNotes());
		assertEquals(invoice.getDiscount(), invoiceC.getDiscount());
		assertEquals(invoice.getTermsConditions(), invoiceC.getTermsConditions());
	}

	public void testToInvoiceC() throws Exception {
		invoice = new Invoice();
		invoiceC = converter.toInvoiceC(PojoTestUtils.createInvoice());
		converter.mergeIntoInvoice(invoiceC, invoice);

		assertEquals(invoice.getInvoiceID(), invoiceC.getInvoiceID());
		assertEquals(invoice.getInvoiceType(), invoiceC.getInvoiceType());
		assertEquals(invoice.getInvoiceStatus(), invoiceC.getInvoiceStatus());
		assertEquals(invoice.getDateRaised(), invoiceC.getDateRaised());
		assertEquals(invoice.getDateDue(), invoiceC.getDateDue());
		assertEquals(invoice.getClientSupplierID(), invoiceC.getClientSupplierID());
		assertEquals(invoice.getPrice(), invoiceC.getPrice());
		assertEquals(invoice.getCurrency(), invoiceC.getCurrency());
		assertEquals(invoice.getNotes(), invoiceC.getNotes());
		assertEquals(invoice.getDiscount(), invoiceC.getDiscount());
		assertEquals(invoice.getTermsConditions(), invoiceC.getTermsConditions());
	}
}
