package com.numhero.server.convert;

import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.ProductC;
import com.numhero.server.model.pojo.Product;

@Singleton
public class ProductConverter {

    public void mergeIntoProduct(ProductC productC, Product product) {

        product.setId(productC.getId());
        product.setType(productC.getProductType());
        product.setServiceUnit(productC.getServiceUnit());
        product.setCurrency(productC.getCurrency());
        product.setName(productC.getName());
        product.setDescription(productC.getDescription());
        product.setCategoryId(productC.getCategoryId());
        product.setQuantity(productC.getQuantity());
        product.setTrackingEnabled(productC.isTrackingEnabled());
        product.setUnitPrice(productC.getUnitPrice());
        product.setCreated(productC.getCreated());
    }

    public ProductC toProductC(Product product) {
        ProductC productC = new ProductC();
        productC.setId(product.getId());

        productC.setProductType(product.getType());
        productC.setServiceUnit(product.getServiceUnit());
        productC.setCurrency(product.getCurrency());
        productC.setName(product.getName());
        productC.setDescription(product.getDescription());
        productC.setCategoryId(product.getCategoryId());
        productC.setQuantity(product.getQuantity());
        productC.setTrackingEnabled(product.getTrackingEnabled());
        productC.setUnitPrice(product.getUnitPrice());
        productC.setCreated(product.getCreated());
        
        return productC;
    }
}
