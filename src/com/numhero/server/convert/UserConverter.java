package com.numhero.server.convert;

import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.UserC;
import com.numhero.server.model.pojo.User;

@Singleton
public class UserConverter {

    public void mergeIntoUser(UserC userC, User user) {
        user.setId(userC.getId());
		user.setBusinessAccountId(userC.getBusinessAccountId());
        user.setFirstName(userC.getFirstName());
        user.setLastLogin(userC.getLastLogin());
        user.setLastName(userC.getLastName());
    	user.addRelationToBa(userC.getBusinessAccountId(), userC.getUserProfile());
        user.setCreated(userC.getCreated());
    }

    public UserC toUserC(User user) {
        UserC userC = new UserC();
        userC.setId(user.getId());

        userC.setFirstName(user.getFirstName());
        userC.setLastLogin(user.getLastLogin());
        userC.setLastName(user.getLastName());
        userC.setBusinessAccountId(user.getBusinessAccountId());
        userC.setUserProfile(user.getCurrentRole());
        userC.setCreated(user.getCreated());

        return userC;
    }
}
