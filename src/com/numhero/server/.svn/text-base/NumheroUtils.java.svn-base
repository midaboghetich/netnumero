package com.numhero.server;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import com.numhero.server.service.AuthenticatedService;
import com.numhero.shared.util.Constants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class NumheroUtils {
    private static Log log = LogFactory.getLog(AuthenticatedService.class);

    public static final Injector injector = Guice.createInjector(Stage.PRODUCTION, new GuiceModule());

    public static String createRandomSessionId() {
        Random r = new Random();
        String httpSessionID = "$$" + r.nextInt();
        return httpSessionID;
    }

    public static String getSessionFromCookie(HttpServletRequest httpRequest) {
        String sessionIDFromClient = null;


        if (httpRequest.getCookies() != null) {
            for (Cookie cookie : httpRequest.getCookies()) {
                log.debug("cookie " + cookie.getName() + "  " + cookie.getValue());
                if (cookie.getName().equals(Constants.SESSION_COOKIE_NAME)) {
                    sessionIDFromClient = cookie.getValue();
                    break;
                }
            }
        }
        return sessionIDFromClient;
    }


    public static InputStream convertStringInInputStream(String orig) {
        try {
            InputStream is = new ByteArrayInputStream(orig.getBytes("UTF-8"));
            return is;
        } catch (UnsupportedEncodingException e) {
            //e.printStackTrace();
        }
        return null;
    }
}
