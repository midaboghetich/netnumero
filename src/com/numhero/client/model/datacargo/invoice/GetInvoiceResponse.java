package com.numhero.client.model.datacargo.invoice;

import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.shared.datacargo.GetSingleEntityResponse;

public class GetInvoiceResponse extends GetSingleEntityResponse {

    public InvoiceC getInvoiceC() {
        return (InvoiceC) getEntity();
    }

    public void setInvoiceC(InvoiceC invoiceC) {
        setEntity(invoiceC);
    }
}