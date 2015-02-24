package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.product.SaveProductRequest;
import com.numhero.client.model.datacargo.product.SaveProductResponse;
import com.numhero.client.model.pojoc.ProductC;
import com.numhero.server.convert.ProductConverter;
import com.numhero.server.model.dao.ProductDao;
import com.numhero.server.model.pojo.Product;
import com.numhero.server.utils.DaoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandSaveProduct extends AbstractAuthenticatedCommand<SaveProductRequest, SaveProductResponse> {
    @SuppressWarnings("unused")
    private static Log log = LogFactory.getLog(CommandSaveProduct.class);

    @Inject
    ProductDao productDao;
    @Inject
    ProductConverter productConverter;

    @Override
    public SaveProductResponse execute(SaveProductRequest request) {
        Product product = null;

        ProductC productC = request.getProductC();
        String id = productC.getId();
        if (id == null || id.isEmpty()) {
            product = new Product();
        } else {
            product = productDao.get(id);
        }

        // validate
        productConverter.mergeIntoProduct(productC, product);
//        product.setBusinessAccountId(request.getBusinessAccountId());

        DaoUtils.setData(request, product);

        productDao.save(product);

        // createAudit
        SaveProductResponse response = new SaveProductResponse();
        response.setEntityId(product.getId());
        return response;
    }
}
