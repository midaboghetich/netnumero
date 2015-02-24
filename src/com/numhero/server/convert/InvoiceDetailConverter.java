package com.numhero.server.convert;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.InvoiceDetailC;
import com.numhero.client.model.pojoc.TaxInfoC;
import com.numhero.server.model.pojo.InvoiceDetail;
import com.numhero.server.model.pojo.TaxInfo;

@Singleton
public class InvoiceDetailConverter {

    @Inject
    private TaxInfoConverter taxInfoConverter;

    public void mergeIntoInvoiceDetail(InvoiceDetailC invoiceDetailC, InvoiceDetail invoiceDetail) {
        invoiceDetail.setId(invoiceDetailC.getId());
        invoiceDetail.setProductId(invoiceDetailC.getProductId());
        invoiceDetail.setName(invoiceDetailC.getName());
        invoiceDetail.setDescription(invoiceDetailC.getDescription());
        invoiceDetail.setQuantity(invoiceDetailC.getQuantity());
        invoiceDetail.setPrice(invoiceDetailC.getPrice());
        invoiceDetail.setCreated(invoiceDetailC.getCreated());

        invoiceDetail.getTaxesFk().clear();
        for (int i = 0; i < invoiceDetailC.getTaxes().size(); i++) {
            TaxInfoC taxInfoC = invoiceDetailC.getTaxes().get(i);
            if (taxInfoC.getId() != null && !taxInfoC.getId().isEmpty()) {
                invoiceDetail.addTax(taxInfoC.getId());
            }
        }
    }

    public InvoiceDetailC toInvoiceDetailC(InvoiceDetail invoiceDetail) {
        InvoiceDetailC invoiceDetailC = new InvoiceDetailC();

        invoiceDetailC.setId(invoiceDetail.getId());
        invoiceDetailC.setProductId(invoiceDetail.getProductId());
        invoiceDetailC.setName(invoiceDetail.getName());
        invoiceDetailC.setDescription(invoiceDetail.getDescription());
        invoiceDetailC.setQuantity(invoiceDetail.getQuantity());
        invoiceDetailC.setPrice(invoiceDetail.getPrice());
        invoiceDetailC.setCreated(invoiceDetail.getCreated());

        for (TaxInfo taxInfo : invoiceDetail.getTaxes()) {
            TaxInfoC taxInfoC = taxInfoConverter.toTaxInfoC(taxInfo);
            invoiceDetailC.addTax(taxInfoC);
        }

        return invoiceDetailC;
    }
}
