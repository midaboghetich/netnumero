package com.numhero.server.convert;

import junit.framework.TestCase;

import com.numhero.client.model.pojoc.TaxInfoC;
import com.numhero.server.model.pojo.PojoTestUtils;
import com.numhero.server.model.pojo.TaxInfo;

public class TaxInfoConverterTest extends TestCase {

	TaxInfo				taxInfo;
	TaxInfoC			taxInfoC;
	TaxInfoConverter	converter	= new TaxInfoConverter();

	private void initTest() {
		taxInfo = PojoTestUtils.createTaxInfo();
		taxInfoC = converter.toTaxInfoC(taxInfo);
	}

	public void setUp() throws Exception {
		super.setUp();
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMergeIntoInvoice() throws Exception {
		initTest();

		assertEquals(taxInfoC.getName(), taxInfoC.getName());
		assertEquals(taxInfoC.getPercent(), taxInfoC.getPercent());
		assertEquals(taxInfoC.getValue(), taxInfoC.getValue());
	}

	public void testToTaxInfoC() throws Exception {
		initTest();
		taxInfo = new TaxInfo();
		converter.mergeIntoTaxInfo(taxInfoC, taxInfo);

		assertEquals(taxInfoC.getName(), taxInfoC.getName());
		assertEquals(taxInfoC.getPercent(), taxInfoC.getPercent());
		assertEquals(taxInfoC.getValue(), taxInfoC.getValue());
	}
}
