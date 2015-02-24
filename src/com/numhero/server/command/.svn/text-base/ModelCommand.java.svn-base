package com.numhero.server.command;

import com.numhero.server.model.pojo.BusinessAccount;
import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.datacargo.CommandResponse;

public interface ModelCommand<REQUEST extends CommandRequest, RESPONSE extends CommandResponse> {

    public void setBusinessAccount(BusinessAccount ba);

    public BusinessAccount getBusinessAccount();

    public RESPONSE execute(REQUEST request) throws Exception;
}
