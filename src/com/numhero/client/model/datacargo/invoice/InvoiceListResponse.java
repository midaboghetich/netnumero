package com.numhero.client.model.datacargo.invoice;

import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.shared.datacargo.CommandResponse;

import java.util.ArrayList;
import java.util.List;

public class InvoiceListResponse implements CommandResponse {
    private ArrayList<InvoiceC> invoiceCList = new ArrayList<InvoiceC>();

    public List<InvoiceC> getInvoiceCList() {
        return invoiceCList;
    }

}