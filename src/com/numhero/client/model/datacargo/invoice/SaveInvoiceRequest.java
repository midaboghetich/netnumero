package com.numhero.client.model.datacargo.invoice;

import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveInvoiceRequest  extends SaveSingleEntityRequest {

    public SaveInvoiceRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveInvoice);
    }

    public InvoiceC getInvoiceC() {
        return (InvoiceC) getEntity();
    }

    public void setInvoiceC(InvoiceC invoiceC) {
        setEntity(invoiceC);
    }
}
