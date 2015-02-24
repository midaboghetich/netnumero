package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.invoice.ChangeStatusToPaiedDocumentsRequest;
import com.numhero.server.model.dao.InvoiceDao;
import com.numhero.server.model.pojo.Invoice;
import com.numhero.server.model.pojo.Persistable;
import com.numhero.shared.datacargo.BulkActionResponse;
import com.numhero.shared.enums.InvoiceStatusEnum;
import com.numhero.shared.exception.ClientWarningException;

import java.util.List;

public class CommandChangeStatusToPaiedDocuments extends AbstractAuthenticatedCommand<ChangeStatusToPaiedDocumentsRequest, BulkActionResponse> {

    @Inject
    InvoiceDao dao;

    @Override
    public BulkActionResponse execute(ChangeStatusToPaiedDocumentsRequest changeStatusToPaiedDocumentsRequest) throws Exception {

        BulkActionResponse resp = new BulkActionResponse();

        List<String> ids = changeStatusToPaiedDocumentsRequest.getEntityIdList();
        if (ids.isEmpty()) throw new ClientWarningException("ids cannot be null");
        log.debug("id List:" + ids);

        for (String s : ids) {
            log.debug("s:" + s);
            Persistable ba = dao.get(s);
            log.debug("ba:" + ba.getId());

            Invoice invoice = dao.get(s);
            invoice.setInvoiceStatus(InvoiceStatusEnum.Paid);

            if (dao.save(invoice))
                resp.getSuccessIdList().add(s);
            else
                resp.getFailureIdList().add(s);
        }
        log.debug("resp.getSuccessIdList().size() = " + resp.getSuccessIdList().size());
        log.debug("resp.getFailureIdList().size() = " + resp.getFailureIdList().size());

        resp.setMessage("OK");
        return resp;

    }
}