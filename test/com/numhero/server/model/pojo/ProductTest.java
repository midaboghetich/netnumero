package com.numhero.server.model.pojo;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Product Tester.
 *
 * @author Antonio Signore
 * @since <pre>03/25/2010</pre>
 * @version 1.0
 */
public class ProductTest extends TestCase {

    Product product = PojoTestUtils.createProduct();

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testGetCategoryId() throws Exception {
        assertEquals("catId",product.getCategoryId());
    }

    @Test
    public void testSetCategoryId() throws Exception {
        product.setCategoryId("my_catId");
        assertEquals("my_catId",product.getCategoryId());
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("product 1",product.getName());
    }

    @Test
    public void testSetName() throws Exception {
        product.setName("bah");
        assertEquals("bah",product.getName());
    }

    @Test
    public void testGetDescription() throws Exception {
        assertEquals("description",product.getDescription());
    }

    @Test
    public void testSetDescription() throws Exception {
        product.setDescription("blah");
        assertEquals("blah",product.getDescription());
    }

    @Test
    public void testGetUnitPrice() throws Exception {
        assertEquals(20D,product.getUnitPrice());
    }

    @Test
    public void testSetUnitPrice() throws Exception {
        product.setUnitPrice(1D);
        assertEquals(1D,product.getUnitPrice());
    }

    @Test
    public void testGetTrackingEnabled() throws Exception {
        assertEquals(true,product.getTrackingEnabled().booleanValue());
    }

    @Test
    public void testSetTrackingEnabled() throws Exception {
        product.setTrackingEnabled(false);
        assertEquals(false,product.getTrackingEnabled().booleanValue());
    }

    @Test
    public void testGetQuantity() throws Exception {
        assertEquals(1000D,product.getQuantity());
    }

    @Test
    public void testSetQuantity() throws Exception {
        product.setQuantity(1D);
        assertEquals(1D,product.getQuantity());
    }
}
