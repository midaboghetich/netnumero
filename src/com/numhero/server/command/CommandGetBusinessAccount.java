package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountRequest;
import com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountResponse;
import com.numhero.client.model.pojoc.BusinessAccountC;
import com.numhero.server.convert.BusinessAccountConverter;
import com.numhero.server.model.dao.BusinessAccountDao;
import com.numhero.server.model.pojo.BusinessAccount;

public class CommandGetBusinessAccount extends AbstractAuthenticatedCommand<GetBusinessAccountRequest, GetBusinessAccountResponse> {

    @Inject
    BusinessAccountDao businessAccountDao;

    @Inject
    BusinessAccountConverter businessAccountconverter;

    @Override
    public GetBusinessAccountResponse execute(GetBusinessAccountRequest request) {

        GetBusinessAccountResponse response = new GetBusinessAccountResponse();

        BusinessAccount businessAccount = businessAccountDao.get(request.getEntityId());
        BusinessAccountC baC = businessAccountconverter.toBusinessAccountC(businessAccount);
        response.setBusinessAccountC(baC);

        return response;
    }
}
