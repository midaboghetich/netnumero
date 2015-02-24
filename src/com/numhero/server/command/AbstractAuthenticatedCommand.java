package com.numhero.server.command;

import com.numhero.server.model.dao.BaseDao;
import com.numhero.server.model.pojo.BusinessAccount;
import com.numhero.server.model.pojo.Persistable;
import com.numhero.shared.datacargo.BulkActionResponse;
import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.datacargo.CommandResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

public abstract class AbstractAuthenticatedCommand<REQUEST extends CommandRequest, RESPONSE extends CommandResponse> implements ModelCommand<REQUEST, RESPONSE> {

    protected static Log log = LogFactory.getLog(AbstractAuthenticatedCommand.class);

    private BusinessAccount ba;

    @Override
    public BusinessAccount getBusinessAccount() {
        return ba;
    }

    @Override
    public void setBusinessAccount(BusinessAccount ba) {
        this.ba = ba;
    }

    protected void deleteIdList(BulkActionResponse resp, List<String> ids, BaseDao dao) {
        log.debug("deleteIdList:" + ids);

        for (String s : ids) {
            log.debug("s:" + s);
            Persistable ba = dao.get(s);
            log.debug("ba:" + ba.getId());
            if (dao.delete(ba))
                resp.getSuccessIdList().add(s);
            else
                resp.getFailureIdList().add(s);
        }
        log.debug("resp.getSuccessIdList().size() = " + resp.getSuccessIdList().size());
        log.debug("resp.getFailureIdList().size() = " + resp.getFailureIdList().size());

        resp.setMessage("OK");
    }
}
