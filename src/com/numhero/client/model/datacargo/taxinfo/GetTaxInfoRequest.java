package com.numhero.client.model.datacargo.taxinfo;

import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class GetTaxInfoRequest extends CommandRequest {

    public GetTaxInfoRequest() {
        setCommand(ApplicationCommandEnum.CommandGetTaxInfo);
    }

}
