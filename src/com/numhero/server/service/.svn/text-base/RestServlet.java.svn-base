package com.numhero.server.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RestServlet extends HttpServlet {
    private static final long serialVersionUID = -4115549168287633545L;

    private static Log log = LogFactory.getLog(RestServlet.class);

	private RestCommandPreProcessor restCommandPreProcessor = new RestCommandPreProcessor();
	private RestCreateNewSession restCreateNewSession = new RestCreateNewSession();;


	public RestServlet() {
                                
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // userId=xxx, userVersion=zzz and a security hash=yyy
        // (MD5 of userid, userversion and saltphrase)

        // createNewSession

        String uri = request.getRequestURI();

        if (uri.startsWith("/rest/createNewSession")) {
			restCreateNewSession.process(request, response);
        } else if (restCommandPreProcessor.isUriOk(uri)) {
            restCommandPreProcessor.process(request, response);
        } else {
            log.info("bad request " + uri);
            response.sendError(400);
        }

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
