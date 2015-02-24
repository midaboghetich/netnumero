package com.numhero.server.service;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.numhero.server.NumheroUtils;
import com.numhero.server.model.dao.SessionDao;
import com.numhero.server.model.dao.UserDao;
import com.numhero.server.model.pojo.Session;
import com.numhero.server.model.pojo.User;
import com.numhero.shared.exception.NotAuthorizedException;
import com.numhero.shared.util.Constants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AuthenticatedService extends RemoteServiceServlet {
    private static final long serialVersionUID = 9145191104113010534L;

    private static Log log = LogFactory.getLog(AuthenticatedService.class);
    private SessionDao sessionDao;
    private UserDao userDao;

    // private BusinessAccountDao baDao;

    protected AuthenticatedService() {
        sessionDao = NumheroUtils.injector.getInstance(SessionDao.class);
        userDao = NumheroUtils.injector.getInstance(UserDao.class);
        // baDao = NumheroUtils.injector.getInstance(BusinessAccountDao.class);
    }


    protected Cookie createCookie(String httpSessionID) {
        Cookie sessionCookie = new Cookie(Constants.SESSION_COOKIE_NAME, httpSessionID);
        sessionCookie.setMaxAge(30 * 60); // half an hour
        sessionCookie.setPath("/");
        return sessionCookie;
    }

    protected User authenticateUser() throws NotAuthorizedException {

        HttpServletRequest httpRequest = getThreadLocalRequest();
        String sessionIDFromClient = NumheroUtils.getSessionFromCookie(httpRequest);
        log.debug("sessionIDFromClient " + sessionIDFromClient);


        User ret;
        if (sessionIDFromClient == null) {
            throw new NotAuthorizedException();
        } else {
            // if (sessionIDFromClient == null ||
            // !sessionIDFromClient.equals(httpSessionID)) {
            // throw new NotAuthorizedException();
            // }
            ret = loadUserFromSession(sessionIDFromClient);


            Cookie sessionCookie = createCookie(sessionIDFromClient);

            HttpServletResponse httpResponse = getThreadLocalResponse();
            httpResponse.addCookie(sessionCookie); //extended of 30 min.
        }

        return ret;
    }

    // protected BusinessAccount getBusinessAccountFromRequest(CommandRequest
    // request) {
    // BusinessAccount ret = null;
    // if (request == null || request.getBusinessAccountId() == null) {
    // throw new ClientWarningException("BaId not present in the request!");
    // } else {
    // ret = getBusinessAccount(request.getBusinessAccountId());
    // }
    // return ret;
    // }

    private User loadUserFromSession(String httpSessionID) {
        Session session = sessionDao.findBySessionID(httpSessionID);
        User user = userDao.get(session.getUserId());

        return user;
    }

    // private BusinessAccount getBusinessAccount(String baId) {
    //
    //
    // BusinessAccount ba = baDao.getByName(baId);
    //
    // return ba;
    // }

}
