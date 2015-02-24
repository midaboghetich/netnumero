package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.user.SaveUserRequest;
import com.numhero.client.model.datacargo.user.SaveUserResponse;
import com.numhero.client.model.pojoc.UserC;
import com.numhero.server.convert.UserConverter;
import com.numhero.server.model.dao.UserDao;
import com.numhero.server.model.pojo.User;
import com.numhero.server.utils.DaoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandSaveUser extends AbstractAuthenticatedCommand<SaveUserRequest, SaveUserResponse> {
    private static Log log = LogFactory.getLog(CommandSaveUser.class);

    @Inject
    UserDao userDao;

    @Inject
    UserConverter userConverter;

    @Override
    public SaveUserResponse execute(SaveUserRequest request) {
        log.debug("CommandSaveUser.execute");

        User user = null;

        UserC userC = request.getUserC();
        log.debug("userC: " + userC);

        String id = userC.getId();
        if (id == null || id.isEmpty()) {
            user = new User();
        } else
            user = userDao.get(id);

        userConverter.mergeIntoUser(userC, user);
        DaoUtils.setData(request, user);
        userDao.save(user);

        SaveUserResponse response = new SaveUserResponse();
        response.setEntityId(user.getId());
        return response;
    }
}
