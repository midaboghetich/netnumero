package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.product.DeleteProductsRequest;
import com.numhero.server.model.dao.ProductDao;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

public class CommandDeleteProducts extends AbstractAuthenticatedCommand<DeleteProductsRequest, BulkActionResponse> {

    @Inject
    ProductDao dao;

    @Override
    public BulkActionResponse execute(DeleteProductsRequest deleteProductsRequest) throws Exception {
        BulkActionResponse resp = new BulkActionResponse();
        List<String> ids = deleteProductsRequest.getEntityIdList();
        deleteIdList(resp, ids, dao);
        return resp;
    }
}