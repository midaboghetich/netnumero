package com.numhero.server.command;

import com.numhero.server.utils.DaoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.invoice.SaveInvoiceRequest;
import com.numhero.client.model.datacargo.invoice.SaveInvoiceResponse;
import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.server.convert.InvoiceConverter;
import com.numhero.server.model.dao.InvoiceDao;
import com.numhero.server.model.pojo.Invoice;
import com.numhero.shared.exception.ClientWarningException;

public class CommandSaveInvoice extends AbstractAuthenticatedCommand<SaveInvoiceRequest, SaveInvoiceResponse> {
    private static Log log = LogFactory.getLog(CommandSaveInvoice.class);

    @Inject
    InvoiceDao invoiceDao;
    @Inject
    InvoiceConverter invoiceConverter;

    @Override
    public SaveInvoiceResponse execute(SaveInvoiceRequest request) {
        Invoice invoice = null;

        InvoiceC invoiceC = request.getInvoiceC();
        if (invoiceC == null) throw new ClientWarningException("invoiceC in the request cannot be null"); 
        String id = invoiceC.getId();
        if (id == null || id.isEmpty()) {
            invoiceC.setId(null);
            invoice = new Invoice();
        } else {
            invoice = invoiceDao.get(id);
        }

        // TODO validate
        invoiceConverter.mergeIntoInvoice(invoiceC, invoice);
//        invoice.setBusinessAccountId(request.getBusinessAccountId());

        DaoUtils.setData(request, invoice);

        invoiceDao.save(invoice);
        log.debug("saved invoice: " + invoice);

        // createAudit
        SaveInvoiceResponse response = new SaveInvoiceResponse();
        response.setEntityId(invoice.getId());
        return response;
    }
}
