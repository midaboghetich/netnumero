package com.numhero.server.model.dao;

import com.numhero.server.NumheroUtils;
import com.numhero.server.model.pojo.Invoice;
import com.numhero.server.model.pojo.InvoiceDetail;
import com.numhero.server.model.pojo.PojoTestUtils;
import org.junit.Test;

import java.util.List;

public class InvoiceDaoTest extends BaseDaoTest {

	InvoiceDao	invoiceDao;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		invoiceDao = NumheroUtils.injector.getInstance(InvoiceDao.class);
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testInjection() throws Exception {
		assertNotNull(invoiceDao);
	}

	@Test
	public void testSave() {
		Invoice invoice = PojoTestUtils.createInvoice();
		invoiceDao.save(invoice);
		assertNotNull(invoiceDao.get(invoice.getId()));

		InvoiceDetail id = PojoTestUtils.createInvoiceDetail();
		invoice.addInvoiceDetail(id);
		invoiceDao.save(invoice);
		assertNotNull(invoiceDao.get(invoice.getId()));
	}

	@Test
	public void testDelete() {
		Invoice invoice = PojoTestUtils.createInvoice();
		invoiceDao.save(invoice);
		String id = invoice.getId();
		assertNotNull(invoiceDao.get(id));
		invoiceDao.delete(invoice);
		invoiceDao.flush();
		assertNull(invoiceDao.get(id));
		System.out.println("invoice = " + invoice.getId());
	}

	@Test
	public void testSearch() {
		Invoice invoice = PojoTestUtils.createInvoice();
		invoiceDao.save(invoice);

		List<Invoice> searchRet = invoiceDao.search("jumps", "ba1");
		assertEquals(1, searchRet.size());

		searchRet = invoiceDao.search("jump", "ba1");
		assertEquals(1, searchRet.size());

		searchRet = invoiceDao.search("fence", "ba1");
		assertEquals(1, searchRet.size());

		searchRet = invoiceDao.search("brown", "ba1");
		assertEquals(1, searchRet.size());

		// the is not a word, so search should not return
		searchRet = invoiceDao.search("the", "ba1");
		assertEquals(0, searchRet.size());

		// the searches in another ba
		searchRet = invoiceDao.search("jumps", "ba2");
		assertEquals(0, searchRet.size());
	}
}
