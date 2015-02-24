package com.numhero.client.model.datacargo.businessaccount;

import com.numhero.client.model.pojoc.BusinessAccountC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveBusinessAccountRequest  extends SaveSingleEntityRequest {

  public SaveBusinessAccountRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveBusinessAccount);
    }

    public BusinessAccountC getBusinessAccountC() {
        return (BusinessAccountC) getEntity();
    }

    public void setBusinessAccountC(BusinessAccountC baC) {
        setEntity(baC);
    }
 
}
