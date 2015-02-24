package com.numhero.client.mvp.document;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.invoice.GetInvoiceRequest;
import com.numhero.client.model.datacargo.invoice.GetInvoiceResponse;
import com.numhero.client.model.datacargo.invoice.SaveInvoiceRequest;
import com.numhero.client.model.datacargo.invoice.SaveInvoiceResponse;
import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.client.mvp.GenericMoneyinTabPage;
import com.numhero.client.service.Service;
import com.numhero.shared.enums.InvoiceStatusEnum;
import com.numhero.shared.enums.InvoiceTypeEnum;

import java.util.Date;

@Singleton
public class InvoicePresenter extends AbstractInvoicePresenter {

    @Inject
    public InvoicePresenter(EventManager eventManager,
                            Service<GetInvoiceRequest, GetInvoiceResponse> invoiceGetService,
                            Service<SaveInvoiceRequest, SaveInvoiceResponse> invoiceSaveService,
                            InvoicePanel invoicePanel) {
        super(eventManager, invoiceGetService, invoiceSaveService, new GenericMoneyinTabPage(invoicePanel));
    }

    @Override
    protected String getPresenterUrl() {
        return "invoice";
    }

    @Override
    protected InvoiceC createInvoiceC() {
        InvoiceC ret = new InvoiceC();
        ret.setInvoiceType(InvoiceTypeEnum.Invoice);
        ret.setDiscount(0D);
        ret.setDateRaised(new Date());
        ret.setInvoiceStatus(InvoiceStatusEnum.Draft);
        ret.setPrice(0D);
        ret.setInvoiceID("XAB-");
        return ret;
    }

    @Override
    protected String getReturnUrl() {
        return "invoices";
    }

    @Override
    protected String getEditEntityTitle() {
        return Application.getConstants().editInvoice();
    }

    @Override
    protected String getNewEntityTitle() {
        return Application.getConstants().createAnInvoice();
    }
}
