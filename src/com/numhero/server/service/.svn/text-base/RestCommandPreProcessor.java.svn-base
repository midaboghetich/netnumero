package com.numhero.server.service;

import com.numhero.server.NumheroUtils;
import com.numhero.server.command.ICommandProcessor;
import com.numhero.server.utils.XmlEntityParser;
import com.numhero.server.utils.XmlUtils;
import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.datacargo.CommandResponse;
import com.numhero.shared.datacargo.GetSingleEntityRequest;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.pojoc.BasePojoC;
import com.numhero.shared.util.SharedUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.numhero.shared.util.SharedUtils.initialUppercaseAndCamel;

public class RestCommandPreProcessor {

    private static Log log = LogFactory.getLog(RestCommandPreProcessor.class);

	private ICommandProcessor cmdProcessor;

    public RestCommandPreProcessor() {
        cmdProcessor = NumheroUtils.injector.getInstance(ICommandProcessor.class);
    }

    public boolean isUriOk(String uri) {
        String[] p = SharedUtils.splitUri(uri);
        if (p != null && p.length == 5)
            return true;
        else
            return false;
    }

    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String uri = request.getRequestURI();
        String method = request.getMethod();


//        Enumeration pn = request.getParameterNames();
//        while (pn.hasMoreElements()){
//            String p = (String) pn.nextElement();
//            log.debug(" p " + p + " = " + request.getParameter(p));
//        }

        
        try {
            CommandRequest req = createRequest(uri, method, "" + request.getParameter("entity"));

            CommandResponse resp = cmdProcessor.process(req);

            if (resp == null) {
                response.sendError(404, "Entity not present");
            } else {
                serializeResponse(resp, response);
            }
        } catch (Throwable t) {
            t.printStackTrace();
            response.sendError(500, "Error " + t.getMessage());
        }
        
    }

    private void serializeResponse(CommandResponse resp, HttpServletResponse response) throws IOException {
		String xml = XmlUtils.serializeResp(resp);

		PrintWriter out = response.getWriter();
		out.println(xml);
		out.close();
	}
    
    protected CommandRequest createRequest(String uri, String method, String entity) {
        String[] p = SharedUtils.splitUri(uri);
		log.debug("entity " + entity + "    p[0]:" + p[0] + " p[1]:" + p[1] + " p[2]:" + p[2] + " p[3]:" + p[3] + " p[4]:" + p[4]);

        String id = p[4];
        String entityName = p[3];
        String baId = p[2];
        String reqName = createCommandRequestName(method, entityName);

		//TODO we need a better way to create the request
        String longName = "com.numhero.client.model.datacargo." + entityName + '.' + reqName;
        log.debug("longname " + longName);
        CommandRequest req;
        try {
            Class<CommandRequest> reqClazz = (Class<CommandRequest>) Class.forName(longName);
            req = reqClazz.newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("request not found " + longName, e);
        } catch (InstantiationException e) {
            throw new RuntimeException("newInstance error for " + reqName, e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("newInstance illegal error for" + reqName, e);
        }

        if (req instanceof GetSingleEntityRequest) {
            GetSingleEntityRequest ser = (GetSingleEntityRequest) req;
            ser.setEntityId(id);
        } else if (req instanceof SaveSingleEntityRequest) {
            SaveSingleEntityRequest ser = (SaveSingleEntityRequest) req;
            BasePojoC e;
            e = XmlEntityParser.parseEntityData(NumheroUtils.convertStringInInputStream(entity));
            ser.setEntity(e);
        }
        req.setBusinessAccountId(baId);

        req.setSessionID("777");
        return req;
    }


    protected String createCommandRequestName(String method, String entity) {
        String reqName;
        if ("GET".equals(method))
            reqName = "Get";
        else if ("POST".equals(method))
            reqName = "Save";
        else
            throw new RuntimeException("Not supported method " + method);

        reqName += initialUppercaseAndCamel(entity) + "Request";

        return reqName;
    }


}
