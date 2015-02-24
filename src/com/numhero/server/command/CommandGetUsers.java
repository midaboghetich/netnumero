package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.user.UserListRequest;
import com.numhero.client.model.datacargo.user.UserListResponse;
import com.numhero.client.model.pojoc.UserC;
import com.numhero.server.convert.UserConverter;
import com.numhero.server.model.dao.UserDao;
import com.numhero.server.model.pojo.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

public class CommandGetUsers extends AbstractAuthenticatedCommand<UserListRequest, UserListResponse> {

    private static Log log = LogFactory.getLog(CommandGetUsers.class);

    @Inject
    UserDao userDao;

    @Inject
    UserConverter userConverter;

    @Override
    public UserListResponse execute(UserListRequest request) {
        UserListResponse response = new UserListResponse();

        List<User> users;
		if (request.getSuggestString() != null && !request.getSuggestString().isEmpty()) {
			users = userDao.searchForStartsWith(
					request.getSuggestString(),
					request.getMaxResults(),
					request.getBusinessAccountId());
		} else if (request.getSearchString() != null && !request.getSearchString().isEmpty()) {
			users = userDao.search(
					request.getSearchString(),
					request.getBusinessAccountId());
		} else {
			users = userDao.findAll(request.getBusinessAccountId());
		}

        for (User user : users) {
            UserC userC = userConverter.toUserC(user);
            response.getUserCList().add(userC);
        }

        return response;
    }
}