package com.numhero.client.mvp.product;

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
public class ProductPresenter extends BasePresenter {
    private Service<GetProductRequest, GetProductResponse> getService;
    private Service<SaveProductRequest, SaveProductResponse> saveService;
    private ProductC productC;

    @Inject
    public ProductPresenter(EventManager eventManager, Service<GetProductRequest, GetProductResponse> getService, Service<SaveProductRequest, SaveProductResponse> saveService, ProductPanel productPanel) {
        super(eventManager, new GenericMoneyinTabPage(productPanel));
        this.getService = getService;
        this.saveService = saveService;
    }

    @Override
    protected String getPresenterUrl() {
        return "product";
    }

    @Override
    public GenericMoneyinTabPage getView() {
        return (GenericMoneyinTabPage) super.getView();
    }

    private ProductPanel getProductPanel() {
        return ((ProductPanel) getView().getContentPanel().getContentWidget());
    }

    @Override
    protected void onShow() {
        if (getUrl().getId() == null) {
            getView().setDetailTitlePanel(Application.getConstants().newProduct());
            productC = new ProductC();
            getProductPanel().setProductC(productC);
        } else {
            getView().setDetailTitlePanel(Application.getConstants().editProduct());
            GetProductRequest request = new GetProductRequest();
            request.setEntityId(getUrl().getId());

            getService.execute(request, new ServiceCallbackImpl<GetProductResponse>() {
                @Override
                public void onSuccess(GetProductResponse response) {
                    productC = response.getProductC();
                    getProductPanel().setProductC(productC);
                }
            });
        }
    }

    @Override
    protected void onBind() {
        super.onBind();
        getProductPanel().getBtSearch().addClickHandler(getSaveHandler());
        getProductPanel().getBtCancel().setHref("#products");
    }

    private ClickHandler getSaveHandler() {
        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if (getProductPanel().saveValuesFromUi()) {
                    SaveProductRequest request = new SaveProductRequest();
                    request.setProductC(productC);
                    saveService.execute(request, new ServiceCallbackImpl<SaveProductResponse>() {
                        @Override
                        public void onSuccess(SaveProductResponse response) {
                            // TODO present message in parent view
                            eventManager.fireEvent(new PlaceChangedEvent(new RestUrl("products")));
                        }
                    });
                }
            }
        };
        return ret;
    }
}
