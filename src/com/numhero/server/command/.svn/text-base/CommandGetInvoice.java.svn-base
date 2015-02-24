package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.invoice.GetInvoiceRequest;
import com.numhero.client.model.datacargo.invoice.GetInvoiceResponse;
import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.server.convert.InvoiceConverter;
import com.numhero.server.model.dao.ClientSupplierDao;
import com.numhero.server.model.dao.InvoiceDao;
import com.numhero.server.model.dao.TaxInfoDao;
import com.numhero.server.model.pojo.ClientSupplier;
import com.numhero.server.model.pojo.Invoice;
import com.numhero.server.model.pojo.InvoiceDetail;
import com.numhero.server.model.pojo.TaxInfo;

import java.util.HashSet;
import java.util.Set;

public class CommandGetInvoice extends AbstractAuthenticatedCommand<GetInvoiceRequest, GetInvoiceResponse> {
    @Inject
    InvoiceDao invoiceDao;

    @Inject
    ClientSupplierDao clientSupplierDao;

    @Inject
    TaxInfoDao taxInfoDao;

    @Inject
    InvoiceConverter invoiceConverter;

    @Override
    public GetInvoiceResponse execute(GetInvoiceRequest request) throws Exception {

        GetInvoiceResponse response = new GetInvoiceResponse();

        Invoice invoice = invoiceDao.get(request.getEntityId());

        for (InvoiceDetail invoiceDetail : invoice.getDetails()) {
            Set<TaxInfo> taxes = new HashSet<TaxInfo>();
            for (String taxId : invoiceDetail.getTaxesFk()) {
                TaxInfo tax = taxInfoDao.get(taxId);
                taxes.add(tax);
            }
            invoiceDetail.setTaxes(taxes);
        }

        ClientSupplier cl = clientSupplierDao.get(invoice.getClientSupplierID());

        invoice.setClientSupplierName(cl.getCompanyName());
        InvoiceC invoiceC = invoiceConverter.toInvoiceC(invoice);
        response.setInvoiceC(invoiceC);

        return response;
    }
}
