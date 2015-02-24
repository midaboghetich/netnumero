package com.numhero.client.mvp.service;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.product.GetProductRequest;
import com.numhero.client.model.datacargo.product.GetProductResponse;
import com.numhero.client.model.datacargo.product.SaveProductRequest;
import com.numhero.client.model.datacargo.product.SaveProductResponse;
import com.numhero.client.model.pojoc.ProductC;
import com.numhero.client.mvp.BasePresenter;
import com.numhero.client.mvp.GenericMoneyinTabPage;
import com.numhero.client.place.PlaceChangedEvent;
import com.numhero.client.place.RestUrl;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;

@Singleton
public class ServicePresenter extends BasePresenter {
    private Service<GetProductRequest, GetProductResponse> getService;
    private Service<SaveProductRequest, SaveProductResponse> saveService;
    private ProductC productC;

    @Inject
    public ServicePresenter(EventManager eventManager, Service<GetProductRequest, GetProductResponse> getService, Service<SaveProductRequest,
            SaveProductResponse> saveService) {
        super(eventManager, new GenericMoneyinTabPage(new ServicePanel()));
        this.getService = getService;
        this.saveService = saveService;
    }

    @Override
    protected String getPresenterUrl() {
        return "service";
    }

    @Override
    public GenericMoneyinTabPage getView() {
        return (GenericMoneyinTabPage) super.getView();
    }

    private ServicePanel getServicePanel() {
        return ((ServicePanel) getView().getContentPanel().getContentWidget());
    }

    @Override
    protected void onShow() {
        if (getUrl().getId() == null) {
            getView().setDetailTitlePanel(Application.getConstants().newService());
            productC = new ProductC();
            getServicePanel().setProductC(productC);
        } else {
            getView().setDetailTitlePanel(Application.getConstants().editService());
            GetProductRequest request = new GetProductRequest();
            request.setEntityId(getUrl().getId());

            getService.execute(request, new ServiceCallbackImpl<GetProductResponse>() {
                @Override
                public void onSuccess(GetProductResponse response) {
                    productC = response.getProductC();
                    getServicePanel().setProductC(productC);
                }
            });
        }
    }

    @Override
    protected void onBind() {
        super.onBind();
        getServicePanel().getBtSearch().addClickHandler(getSaveHandler());
        getServicePanel().getBtCancel().setHref("#services");
    }

    private ClickHandler getSaveHandler() {
        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if (getServicePanel().saveValuesFromUi()) {
                    SaveProductRequest request = new SaveProductRequest();
                    request.setProductC(productC);
                    saveService.execute(request, new ServiceCallbackImpl<SaveProductResponse>() {
                        @Override
                        public void onSuccess(SaveProductResponse response) {
                            // TODO present message in parent view
                            eventManager.fireEvent(new PlaceChangedEvent(new RestUrl("services")));
                        }
                    });
                }
            }
        };
        return ret;
    }
}
