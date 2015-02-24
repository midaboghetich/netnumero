package com.numhero.server.service;

import com.numhero.client.model.datacargo.auth.AuthRequest;
import com.numhero.client.model.datacargo.auth.AuthResponse;
import com.numhero.server.NumheroUtils;
import com.numhero.server.command.ICommandProcessor;
import com.numhero.shared.exception.NotAuthorizedException;
import com.numhero.shared.util.Constants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AuthService extends HttpServlet {

    private static Log log = LogFactory.getLog(AuthService.class);

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long startTime = System.currentTimeMillis();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        HttpSession httpSession = request.getSession(true);
        AuthRequest commandRequest = new AuthRequest();
        commandRequest.setUsername(username);
        commandRequest.setPassword(password);
        commandRequest.setHttpSessionID(httpSession.getId());

        ICommandProcessor cp = NumheroUtils.injector.getInstance(ICommandProcessor.class);
        try {
            // TODO maybe we need the businessAccount here
            AuthResponse commandResponse = (AuthResponse) cp.process(commandRequest);
            Cookie sessionCookie = new Cookie(Constants.SESSION_COOKIE_NAME, commandResponse.getSessionID());
            response.addCookie(sessionCookie);
            response.sendRedirect("application/Application.html");
        } catch (NotAuthorizedException ex) {
            response.getWriter().println("Error while processing credentials");
        }

        long endTime = System.currentTimeMillis();
        log.info("CommandLogin successfully processed in " + (endTime - startTime) + " ms");
    }
}
