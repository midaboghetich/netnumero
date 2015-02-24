package com.numhero.client.model.datacargo.product;

import com.numhero.client.model.pojoc.ProductC;
import com.numhero.shared.datacargo.GetSingleEntityResponse;

public class GetProductResponse extends GetSingleEntityResponse {

    public ProductC getProductC() {
        return (ProductC) getEntity();
    }

    public void setProductC(ProductC productC) {
        setEntity(productC);
    }
}