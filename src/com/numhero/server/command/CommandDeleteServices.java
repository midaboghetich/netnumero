package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.settings.DeleteServicesRequest;
import com.numhero.server.model.dao.ProductDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandDeleteServices extends AbstractAuthenticatedCommand<DeleteServicesRequest, BulkActionResponse> {

    @Inject
    ProductDao dao;

    @Override
    public BulkActionResponse execute(DeleteServicesRequest deleteServicesRequest) throws Exception {

        // todo
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = deleteServicesRequest.getEntityIdList();
        deleteIdList(resp, ids, dao);
        return resp;

    }

}