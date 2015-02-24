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
import com.numhero.shared.enums.InvoiceTypeEnum;

@Singleton
public class EstimatePresenter extends AbstractInvoicePresenter {
    @Inject
    public EstimatePresenter(EventManager eventManager, Service<GetInvoiceRequest, GetInvoiceResponse> invoiceGetService, Service<SaveInvoiceRequest, SaveInvoiceResponse> invoiceSaveService,
                             InvoicePanel invoicePanel) {
        super(eventManager, invoiceGetService, invoiceSaveService, new GenericMoneyinTabPage(invoicePanel));
    }

    @Override
    protected String getPresenterUrl() {
        return "estimate";
    }

    @Override
    protected InvoiceC createInvoiceC() {
        InvoiceC ret = new InvoiceC();
        ret.setInvoiceType(InvoiceTypeEnum.Estimate);
        return ret;
    }

    @Override
    protected String getReturnUrl() {
        return "estimates";
    }

    @Override
    protected String getEditEntityTitle() {
        return Application.getConstants().editEstimate();
    }

    @Override
    protected String getNewEntityTitle() {
        return Application.getConstants().newEstimate();
    }
}
