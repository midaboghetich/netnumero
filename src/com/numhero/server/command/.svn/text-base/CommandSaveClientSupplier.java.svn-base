package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.server.convert.ClientSupplierConverter;
import com.numhero.server.model.dao.ClientSupplierDao;
import com.numhero.server.model.pojo.ClientSupplier;
import com.numhero.server.utils.DaoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandSaveClientSupplier extends AbstractAuthenticatedCommand<SaveClientSupplierRequest, SaveClientSupplierResponse> {
    private static Log log = LogFactory.getLog(CommandSaveClientSupplier.class);

    @Inject
    ClientSupplierDao clientSupplierDao;
    @Inject
    ClientSupplierConverter clientSupplierConverter;

    @Override
    public SaveClientSupplierResponse execute(SaveClientSupplierRequest request) {
        ClientSupplier clientSupplier = null;

        ClientSupplierC clientSupplierC = request.getClientSupplierC();
        String id = clientSupplierC.getId();
        if (id == null || id.isEmpty()) {
            clientSupplierC.setId(null);
            clientSupplier = new ClientSupplier();
            clientSupplier.setBusinessAccountId(request.getBusinessAccountId());
            log.debug("created new ClientSupplier");
        } else {
            clientSupplier = clientSupplierDao.get(id);
            log.debug("retrieved ClientSupplier " + clientSupplier);
        }

        // validate
        clientSupplierConverter.mergeIntoClientSupplier(clientSupplierC, clientSupplier);
        DaoUtils.setData(request, clientSupplier);
        clientSupplierDao.save(clientSupplier);

        // createAudit
        SaveClientSupplierResponse response = new SaveClientSupplierResponse();
        response.setEntityId(clientSupplier.getId());
        return response;
    }
}
