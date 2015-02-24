package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.invoice.InvoiceListRequest;
import com.numhero.client.model.datacargo.invoice.InvoiceListResponse;
import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.server.convert.InvoiceConverter;
import com.numhero.server.model.dao.ClientSupplierDao;
import com.numhero.server.model.dao.InvoiceDao;
import com.numhero.server.model.pojo.ClientSupplier;
import com.numhero.server.model.pojo.Invoice;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

public class CommandGetInvoices extends AbstractAuthenticatedCommand<InvoiceListRequest, InvoiceListResponse> {

    private static Log log = LogFactory.getLog(CommandGetInvoices.class);

    @Inject
    InvoiceDao invoiceDao;
    @Inject
    ClientSupplierDao clientSupplierDao;
    @Inject
    InvoiceConverter invoiceConverter;

    @Override
    public InvoiceListResponse execute(InvoiceListRequest request) {
        InvoiceListResponse response = new InvoiceListResponse();

        List<Invoice> invoices = invoiceDao.findByType(request.getBusinessAccountId(), request.getInvoiceType());
        for (Invoice invoice : invoices) {
            ClientSupplier cl = clientSupplierDao.get(invoice.getClientSupplierID());
            invoice.setClientSupplierName(cl.getCompanyName());
            InvoiceC invoiceC = invoiceConverter.toInvoiceC(invoice);
            response.getInvoiceCList().add(invoiceC);
        }
        log.debug("retrieved " + response.getInvoiceCList());
        return response;
    }
}
