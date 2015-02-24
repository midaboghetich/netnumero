package com.numhero.server.convert;

import junit.framework.TestCase;

import com.numhero.client.model.pojoc.InvoiceDetailC;
import com.numhero.server.model.pojo.InvoiceDetail;
import com.numhero.server.model.pojo.PojoTestUtils;

public class InvoiceDetailConverterTest extends TestCase {

	InvoiceDetail			invoiceDetail;
	InvoiceDetailC			invoiceDetailC;
	InvoiceDetailConverter	converter	= new InvoiceDetailConverter();

	private void initTest() {
		invoiceDetail = PojoTestUtils.createInvoiceDetail();
		invoiceDetailC = converter.toInvoiceDetailC(invoiceDetail);
	}

	public void setUp() throws Exception {
		super.setUp();
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMergeIntoInvoiceDetail() throws Exception {
		initTest();

		assertEquals(invoiceDetailC.getPrice(), invoiceDetailC.getPrice());
		assertEquals(invoiceDetailC.getQuantity(), invoiceDetailC.getQuantity());
		assertEquals(invoiceDetailC.getProductId(), invoiceDetailC.getProductId());
		assertEquals(invoiceDetailC.getServiceId(), invoiceDetailC.getServiceId());
		assertEquals(invoiceDetailC.getName(), invoiceDetailC.getName());
		assertEquals(invoiceDetailC.getDescription(), invoiceDetailC.getDescription());
	}

	public void testToInvoiceDetailC() throws Exception {
		initTest();
		invoiceDetail = new InvoiceDetail();
		converter.mergeIntoInvoiceDetail(invoiceDetailC, invoiceDetail);

		assertEquals(invoiceDetailC.getPrice(), invoiceDetailC.getPrice());
		assertEquals(invoiceDetailC.getQuantity(), invoiceDetailC.getQuantity());
		assertEquals(invoiceDetailC.getProductId(), invoiceDetailC.getProductId());
		assertEquals(invoiceDetailC.getServiceId(), invoiceDetailC.getServiceId());
		assertEquals(invoiceDetailC.getName(), invoiceDetailC.getName());
		assertEquals(invoiceDetailC.getDescription(), invoiceDetailC.getDescription());
	}
}
