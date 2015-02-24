package com.numhero.server.model.dao;

import com.google.inject.Singleton;
import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.User;

@Singleton
public class UserDao extends BaseSearchableDao<User> {
//    public User authenticate(String username, String passwordHash) {
//        User ret = null;
//        User user = findByUsername(username);
//        if (user == null) {
//            throw new ClientWarningException("The username you have entered does not exist.");
//        }
//
//        if (user.isLocked()) {
//            throw new ClientWarningException("This account is locked.");
//        }
//
//        if (user.getPassword().equals(passwordHash)) {
//            user.setLockCount(0);
//            save(user);
//            ret = user;
//        } else {
//            // increase lock count for this account
//            user.setLockCount(user.getLockCount() + 1);
//            save(user);
//        }
//
//        if (ret == null) {
//            throw new ClientWarningException("Password does not match the username entered.");
//        }
//        return ret;
//    }
//
//    public User findByUsername(String username) {
//        User u = getFirstElement(findByCriteria(null, JDOFilters.eq("username", JDOFilters.quote(username))));
//        return u;
//    }

    public User findByPortalUserId(String userId) {
        User u = getFirstElement(findByCriteria(null, JDOFilters.eq("portalUserId", JDOFilters.quote(userId))));
        return u;
    }
}
