package com.numhero.client.model.datacargo.user;

import com.numhero.client.model.pojoc.UserC;
import com.numhero.shared.datacargo.GetSingleEntityResponse;

public class GetUserResponse extends GetSingleEntityResponse {

    public UserC getUserC() {
        return (UserC) getEntity();
    }

    public void setUserC(UserC userC) {
        setEntity(userC);
    }
}