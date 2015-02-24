package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountRequest;
import com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountResponse;
import com.numhero.client.model.pojoc.BusinessAccountC;
import com.numhero.server.convert.BusinessAccountConverter;
import com.numhero.server.model.dao.BusinessAccountDao;
import com.numhero.server.model.pojo.BusinessAccount;
import com.numhero.server.utils.DaoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandSaveBusinessAccount extends AbstractAuthenticatedCommand<SaveBusinessAccountRequest, SaveBusinessAccountResponse> {
    @SuppressWarnings("unused")
    private static Log log = LogFactory.getLog(CommandSaveBusinessAccount.class);

    @Inject
    public
    BusinessAccountDao businessAccountDao;
    
    @Inject
    public
    BusinessAccountConverter businessAccountConverter;

    @Override
    public SaveBusinessAccountResponse execute(SaveBusinessAccountRequest request) {

        BusinessAccount businessAccount = null;

        BusinessAccountC baC = request.getBusinessAccountC();
        String id = baC.getId();
        if (id == null || id.isEmpty()) {
            baC.setId(null);
            businessAccount = new BusinessAccount();
            log.debug("created new BusinessAccount");
        } else {
            businessAccount = businessAccountDao.get(id);
            log.debug("retrieved BusinessAccount " + businessAccount);
        }

        // validate
        businessAccountConverter.mergeIntoBusinessAccount(baC, businessAccount);
        DaoUtils.setData(request, businessAccount);
        businessAccountDao.save(businessAccount);

        // createAudit
        SaveBusinessAccountResponse response = new SaveBusinessAccountResponse();
        response.setEntityId(businessAccount.getId());
        return response;

    }
}
