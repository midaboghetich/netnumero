package com.numhero.client.model.datacargo.product;

import com.numhero.client.model.pojoc.ProductC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveProductRequest  extends SaveSingleEntityRequest {

    public SaveProductRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveProduct);
    }

    public ProductC getProductC() {
        return (ProductC) getEntity();
    }

    public void setProductC(ProductC productC) {
        setEntity(productC);
    }
}
