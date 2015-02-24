package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.auth.AuthRequest;
import com.numhero.client.model.datacargo.auth.AuthResponse;
import com.numhero.server.auth.Authenticator;
import com.numhero.server.auth.OneWayEncryptionService;
import com.numhero.server.model.dao.SessionDao;
import com.numhero.server.model.pojo.Session;
import com.numhero.server.model.pojo.User;
import com.numhero.shared.exception.NotAuthorizedException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandLogin extends AbstractAuthenticatedCommand<AuthRequest, AuthResponse> {
    private static Log log = LogFactory.getLog(CommandLogin.class);

    @Inject
    Authenticator authenticator;

    @Inject
    OneWayEncryptionService oneWayEncryption;

    @Inject
    SessionDao sessionDao;

    @Override
    public AuthResponse execute(AuthRequest request) {
        AuthResponse response = new AuthResponse();
        try {
            String passwordHash = oneWayEncryption.hexMD5(request.getPassword());
            User user = authenticator.authenticate(request.getUsername(), passwordHash);
            // setup a new session
            Session session = new Session(user.getId(), request.getHttpSessionID());
            sessionDao.save(session);

            response.setSessionID(session.getSessionID());
        } catch (NotAuthorizedException ex) {
            log.error("Error while processing credentials", ex);
            throw ex;
        }
        return response;
    }
}
