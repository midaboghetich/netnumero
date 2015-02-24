package com.numhero.server.command;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.server.NumheroUtils;
import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.datacargo.CommandResponse;
import com.numhero.shared.exception.ClientWarningException;
import com.numhero.shared.service.ApplicationCommandEnum;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

@Singleton
public class CommandProcessor implements ICommandProcessor {
    private static Log log = LogFactory.getLog(CommandProcessor.class);

    @Inject
    private PersistenceManagerFactory pmf;

    @Override
    public <REQUEST extends CommandRequest, RESPONSE extends CommandResponse> CommandResponse process(/*User user, BusinessAccount ba, */REQUEST request) throws ClientWarningException {
        ApplicationCommandEnum commandEnum = request.getCommand();
        ModelCommand<REQUEST, RESPONSE> command = getCommand(commandEnum);
        log.debug("processing command " + command.getClass().getSimpleName());

        RESPONSE response = null;
//        command.setUser(user);
//        command.setBusinessAccount(ba);

        // checkGrantsOnUser(command);
        PersistenceManager pm = pmf.getPersistenceManagerProxy();
        try {
            response = command.execute(request);
        } catch (Exception e) {
            log.error("process", e);
            throw new ClientWarningException(e.getMessage());
        } finally {
            pm.close();
        }
        return response;
    }

    // private <REQUEST extends CommandRequest, RESPONSE extends
    // CommandResponse> void checkGrantsOnUser(ModelCommand<REQUEST, RESPONSE>
    // commandBean) {
    // User user = commandBean.getUser();
    // TODO if (!user.getBAList.contains(baId)) throw new ValidationException
    // TODO if (!user.getCurrentBARole().isGrantsOk(commandBean)) throw new
    // ValidationException
    // }

    @SuppressWarnings("unchecked")
    private <REQUEST extends CommandRequest, RESPONSE extends CommandResponse> ModelCommand<REQUEST, RESPONSE> getCommand(ApplicationCommandEnum commandEnum) {
        try {
            // TODO use guice instead of Class.forName

            log.debug("\n\n\n************************ "+this.getClass().getPackage().getName() + '.' + commandEnum.name());


            Class<ModelCommand<REQUEST, RESPONSE>> clazz = (Class<ModelCommand<REQUEST, RESPONSE>>) Class.forName(this.getClass().getPackage().getName() + '.' + commandEnum.name());
            ModelCommand<REQUEST, RESPONSE> commandBean = NumheroUtils.injector.getInstance(clazz);
            return commandBean;
        } catch (Exception ex) {
            log.error("Could not find bean with name " + commandEnum.name(), ex);
            throw new IllegalArgumentException("No commandEnum with the name " + commandEnum.name() + " was found.");
        }
    }
}
