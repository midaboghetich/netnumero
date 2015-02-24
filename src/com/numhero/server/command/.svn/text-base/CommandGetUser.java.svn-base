package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.user.GetUserRequest;
import com.numhero.client.model.datacargo.user.GetUserResponse;
import com.numhero.client.model.pojoc.UserC;
import com.numhero.server.convert.UserConverter;
import com.numhero.server.model.dao.UserDao;
import com.numhero.server.model.pojo.User;

public class CommandGetUser extends AbstractAuthenticatedCommand<GetUserRequest, GetUserResponse> {
    @Inject
    UserDao userDao;

    @Inject
    UserConverter userConverter;

    @Override
    public GetUserResponse execute(GetUserRequest request) throws Exception {
        GetUserResponse response = new GetUserResponse();

        User user = userDao.get(request.getEntityId());
        UserC userC = userConverter.toUserC(user);
        response.setUserC(userC);

        return response;
    }
}
