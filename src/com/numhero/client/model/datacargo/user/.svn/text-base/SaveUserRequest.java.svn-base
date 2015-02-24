package com.numhero.client.model.datacargo.user;

import com.numhero.client.model.pojoc.UserC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveUserRequest  extends SaveSingleEntityRequest {

    public SaveUserRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveUser);
    }

    public UserC getUserC() {
        return (UserC) getEntity();
    }

    public void setUserC(UserC userC) {
        setEntity(userC);
    }
    
}
