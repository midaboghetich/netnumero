package com.numhero.server.auth;

import com.numhero.server.model.pojo.User;


public interface Authenticator {
    public User authenticate(String username, String passwordHash);
}
