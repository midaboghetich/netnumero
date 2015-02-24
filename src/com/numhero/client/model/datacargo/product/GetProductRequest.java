package com.numhero.client.model.datacargo.product;

import com.numhero.shared.datacargo.GetSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class GetProductRequest extends GetSingleEntityRequest {

    public GetProductRequest() {
        setCommand(ApplicationCommandEnum.CommandGetProduct);
    }

}
