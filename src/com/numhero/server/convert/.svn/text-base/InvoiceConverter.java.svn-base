package com.numhero.server.convert;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.client.model.pojoc.InvoiceDetailC;
import com.numhero.server.model.pojo.Invoice;
import com.numhero.server.model.pojo.InvoiceDetail;

@Singleton
public class InvoiceConverter {

    @Inject
    private InvoiceDetailConverter invoiceDetailConverter;

    public void mergeIntoInvoice(InvoiceC invoiceC, Invoice invoice) {
        invoice.setId(invoiceC.getId());
        invoice.setInvoiceID(invoiceC.getInvoiceID());
        invoice.setInvoiceType(invoiceC.getInvoiceType());
        invoice.setInvoiceStatus(invoiceC.getInvoiceStatus());
        invoice.setDateRaised(invoiceC.getDateRaised());
        invoice.setDateDue(invoiceC.getDateDue());
        invoice.setClientSupplierID(invoiceC.getClientSupplierID());
        invoice.setClientSupplierName(invoiceC.getClientSupplierName());
        invoice.setPrice(invoiceC.getPrice());
        invoice.setCurrency(invoiceC.getCurrency());
        invoice.setNotes(invoiceC.getNotes());
        invoice.setDiscount(invoiceC.getDiscount());
        invoice.setTermsConditions(invoiceC.getTermsConditions());
        invoice.setCreated(invoiceC.getCreated());

        invoice.getDetails().clear();
        for (InvoiceDetailC invoiceDetailC : invoiceC.getDetails()) {
            if (invoiceDetailC.getDescription() != null && !invoiceDetailC.getDescription().isEmpty() &&
                    invoiceDetailC.getPrice() != null && invoiceDetailC.getPrice() != 0) {
                InvoiceDetail invoiceDetail = new InvoiceDetail();
                invoiceDetailConverter.mergeIntoInvoiceDetail(invoiceDetailC, invoiceDetail);
                invoice.addInvoiceDetail(invoiceDetail);
            }
        }
    }

    public InvoiceC toInvoiceC(Invoice invoice) {
        InvoiceC invoiceC = new InvoiceC();
        invoiceC.setId(invoice.getId());
        invoiceC.setInvoiceID(invoice.getInvoiceID());
        invoiceC.setInvoiceType(invoice.getInvoiceType());
        invoiceC.setInvoiceStatus(invoice.getInvoiceStatus());
        invoiceC.setDateRaised(invoice.getDateRaised());
        invoiceC.setDateDue(invoice.getDateDue());
        invoiceC.setClientSupplierID(invoice.getClientSupplierID());
        invoiceC.setClientSupplierName(invoice.getClientSupplierName());
        invoiceC.setPrice(invoice.getPrice());
        invoiceC.setCurrency(invoice.getCurrency());
        invoiceC.setNotes(invoice.getNotes());
        invoiceC.setDiscount(invoice.getDiscount());
        invoiceC.setTermsConditions(invoice.getTermsConditions());
        invoiceC.setCreated(invoice.getCreated());

        if (invoiceC.getCreated() != null) invoiceC.setCreated(invoice.getCreated());
        for (InvoiceDetail invoiceDetail : invoice.getDetails()) {
            InvoiceDetailC invoiceDetailC = invoiceDetailConverter.toInvoiceDetailC(invoiceDetail);
            invoiceC.addInvoiceDetail(invoiceDetailC);
        }

        return invoiceC;
    }
}
