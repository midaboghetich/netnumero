package com.numhero.client.model.datacargo.user;

import com.numhero.shared.datacargo.SearcheableListCommandRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class UserListRequest extends SearcheableListCommandRequest {

    public UserListRequest() {
        setCommand(ApplicationCommandEnum.CommandGetUsers);
    }
}