package com.numhero.client.model.datacargo.invoice;

import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.enums.InvoiceTypeEnum;
import com.numhero.shared.service.ApplicationCommandEnum;

public class InvoiceListRequest extends CommandRequest {
	private InvoiceTypeEnum invoiceType;

    public InvoiceListRequest() {
        setCommand(ApplicationCommandEnum.CommandGetInvoices);
    }

    public InvoiceListRequest(InvoiceTypeEnum invoiceType) {
    	this();
    	this.invoiceType = invoiceType;
    }

	public InvoiceTypeEnum getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(InvoiceTypeEnum invoiceType) {
		this.invoiceType = invoiceType;
	}
}
