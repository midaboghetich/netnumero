package com.numhero.server.model.pojo;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * TaxInfo Tester.
 * 
 * @author Antonio Signore
 * @since <pre>
 * 03 / 25 / 2010
 * </pre>
 * @version 1.0
 */
public class TaxInfoTest extends TestCase {

	TaxInfo	taxInfo	= PojoTestUtils.createTaxInfo();

	public void setUp() throws Exception {
		super.setUp();
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetPercent() throws Exception {
		assertEquals(15.0D, taxInfo.getPercent());
	}

	@Test
	public void testSetPercent() throws Exception {
		taxInfo.setPercent(0.2D);
		assertEquals(0.2D, taxInfo.getPercent());
	}

	@Test
	public void testGetValue() throws Exception {
		assertEquals(100D, taxInfo.getValue());
	}

	@Test
	public void testSetValue() throws Exception {
		taxInfo.setValue(1D);
		assertEquals(1D, taxInfo.getValue());
	}

	@Test
	public void testIsValue() throws Exception {

		taxInfo.setValue(1D);
		assertEquals(true, taxInfo.isValue());

		taxInfo.setValue(0D);
		assertEquals(false, taxInfo.isValue());

	}
}
