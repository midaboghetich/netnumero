package com.numhero.client.mvp.document;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Singleton;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.invoice.GetInvoiceRequest;
import com.numhero.client.model.datacargo.invoice.GetInvoiceResponse;
import com.numhero.client.model.datacargo.invoice.SaveInvoiceRequest;
import com.numhero.client.model.datacargo.invoice.SaveInvoiceResponse;
import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.client.mvp.AbstractPage;
import com.numhero.client.mvp.EditPresenter;
import com.numhero.client.place.PlaceChangedEvent;
import com.numhero.client.place.RestUrl;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.CoreUtils;

@Singleton
public abstract class AbstractInvoicePresenter extends EditPresenter {
    private Service<GetInvoiceRequest, GetInvoiceResponse> getService;
    private Service<SaveInvoiceRequest, SaveInvoiceResponse> saveService;

    private InvoiceC invoiceC;

    public AbstractInvoicePresenter(EventManager eventManager,
                                    Service<GetInvoiceRequest, GetInvoiceResponse> getService,
                                    Service<SaveInvoiceRequest, SaveInvoiceResponse> saveService,
                                    AbstractPage page) {
        super(eventManager, page);
        this.getService = getService;
        this.saveService = saveService;
    }

    @Override
    public AbstractPage getView() {
        return (AbstractPage) super.getView();
    }

    protected abstract InvoiceC createInvoiceC();

    protected abstract String getReturnUrl();

    @Override
    public void onShow() {
        String id = getUrl().getId();
        if (id == null) {
            getView().setDetailTitlePanel(getNewEntityTitle());
            invoiceC = createInvoiceC();
            getInvoicePanel().setInvoiceC(invoiceC);
        } else {
            getView().setDetailTitlePanel(getEditEntityTitle());
            GetInvoiceRequest request = new GetInvoiceRequest(id);
            getService.execute(request, new ServiceCallbackImpl<GetInvoiceResponse>() {
                @Override
                public void onSuccess(GetInvoiceResponse response) {
                    invoiceC = response.getInvoiceC();
                    getInvoicePanel().setInvoiceC(invoiceC);
                }
            });
        }
    }

    private InvoicePanel getInvoicePanel() {
        return ((InvoicePanel) getView().getContentPanel().getContentWidget());
    }

    @Override
    protected void onBind() {
        super.onBind();
        getInvoicePanel().getBtSearch().addClickHandler(getSaveHandler());
        getInvoicePanel().getBtCancel().setHref("#" + getReturnUrl());
    }

    private ClickHandler getSaveHandler() {
        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if (getInvoicePanel().saveValuesFromUi()) {
                    SaveInvoiceRequest request = new SaveInvoiceRequest();
                    request.setInvoiceC(invoiceC);
                    saveService.execute(request, new ServiceCallbackImpl<SaveInvoiceResponse>() {
                        @Override
                        public void onSuccess(SaveInvoiceResponse response) {
                            // TODO present message in parent view
                            eventManager.fireEvent(new PlaceChangedEvent(new RestUrl(getReturnUrl())));
                        }
                    });
                } else
                    CoreUtils.debug("does not validate");

            }
        };
        return ret;
    }

    protected abstract String getEditEntityTitle();

    protected abstract String getNewEntityTitle();
}
