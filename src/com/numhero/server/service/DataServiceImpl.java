package com.numhero.server.service;

import com.numhero.client.service.DataService;
import com.numhero.server.NumheroUtils;
import com.numhero.server.command.ICommandProcessor;
import com.numhero.server.model.pojo.User;
import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.datacargo.CommandResponse;
import com.numhero.shared.exception.ClientWarningException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataServiceImpl extends AuthenticatedService implements DataService {
    private static final long serialVersionUID = 1698618107320369423L;
    private static Log log = LogFactory.getLog(DataServiceImpl.class);
    private ICommandProcessor cprocessor;

    public DataServiceImpl() {
        cprocessor = NumheroUtils.injector.getInstance(ICommandProcessor.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <REQUEST extends CommandRequest, RESPONSE extends CommandResponse> RESPONSE execute(REQUEST request) throws ClientWarningException {



        User user = authenticateUser();

        long startTime = System.currentTimeMillis();

        log.info("Processing request " + request.getClass().getSimpleName());

        RESPONSE response = null;

        response = (RESPONSE) cprocessor.process(request);

        long endTime = System.currentTimeMillis();
        log.info("Request " + request.getClass().getSimpleName() + " successfully processed in " + (endTime - startTime) + " ms");


 
        return response;
    }
}
