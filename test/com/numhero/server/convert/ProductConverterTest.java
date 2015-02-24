package com.numhero.server.convert;

import junit.framework.TestCase;

import com.numhero.client.model.pojoc.ProductC;
import com.numhero.server.model.pojo.PojoTestUtils;
import com.numhero.server.model.pojo.Product;

public class ProductConverterTest extends TestCase {

    Product product;
    ProductC productC;
    ProductConverter converter = new ProductConverter();

    private void initTest() {
        product = PojoTestUtils.createProduct();
        productC = converter.toProductC(product);
    }
    
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testMergeIntoInvoice() throws Exception {
        initTest();

        assertEquals(productC.getName() , productC.getName());
        assertEquals(productC.getDescription() ,productC.getDescription());
        assertEquals(productC.getCategoryId() ,productC.getCategoryId());
        assertEquals(productC.getCompanyId() ,productC.getCompanyId());
        assertEquals(productC.getQuantity() ,productC.getQuantity());
        assertEquals(productC.isTrackingEnabled() ,productC.isTrackingEnabled());
        assertEquals(productC.getUnitPrice() , productC.getUnitPrice());
        
    }

    public void testToProductC() throws Exception {
        initTest();
        product = new Product();
        converter.mergeIntoProduct(productC, product);
        
        assertEquals(productC.getName() , productC.getName());
        assertEquals(productC.getDescription() ,productC.getDescription());
        assertEquals(productC.getCategoryId() ,productC.getCategoryId());
        assertEquals(productC.getCompanyId() ,productC.getCompanyId());
        assertEquals(productC.getQuantity() ,productC.getQuantity());
        assertEquals(productC.isTrackingEnabled() ,productC.isTrackingEnabled());
        assertEquals(productC.getUnitPrice() , productC.getUnitPrice());
    }


}
