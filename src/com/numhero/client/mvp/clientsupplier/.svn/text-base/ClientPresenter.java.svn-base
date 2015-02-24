package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.client_supplier.GetClientSupplierRequest;
import com.numhero.client.model.datacargo.client_supplier.GetClientSupplierResponse;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.mvp.BasePresenter;
import com.numhero.client.mvp.GenericClientTabPage;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.LocationUtils;
import com.numhero.shared.enums.ClientSupplierEnum;

@Singleton
public class ClientPresenter extends BasePresenter {
    private Service<GetClientSupplierRequest, GetClientSupplierResponse> clientSupplierGetService;
    private Service<SaveClientSupplierRequest, SaveClientSupplierResponse> clientSaveService;

    @Inject
    public ClientPresenter(EventManager eventManager,
                           Service<GetClientSupplierRequest, GetClientSupplierResponse> clientSupplierGetService,
                           Service<SaveClientSupplierRequest, SaveClientSupplierResponse> clientSaveService) {
        super(eventManager, new GenericClientTabPage(new ClientSupplierPanel()));
        this.clientSupplierGetService = clientSupplierGetService;
        this.clientSaveService = clientSaveService;
    }

    @Override
    protected String getPresenterUrl() {
        return "client";
    }

    @Override
    public GenericClientTabPage getView() {
        return (GenericClientTabPage) super.getView();
    }

    @Override
    protected void onShow() {
        if (getUrl().getId() == null) {
            getView().setDetailTitlePanel(Application.getConstants().newClient());
            ClientSupplierC client = new ClientSupplierC();
            client.setType(ClientSupplierEnum.client);
            getClientSupplierPanel().setClientSupplierC(client);
        } else {
            getView().setDetailTitlePanel(Application.getConstants().editClient());

            GetClientSupplierRequest request = new GetClientSupplierRequest();

            request.setEntityId(getUrl().getId());

            clientSupplierGetService.execute(request, new ServiceCallbackImpl<GetClientSupplierResponse>() {
                @Override
                public void onSuccess(GetClientSupplierResponse response) {
                    getClientSupplierPanel().setClientSupplierC(response.getClientSupplierC());
                }
            });
        }
    }

    protected ClientSupplierPanel getClientSupplierPanel() {
        return ((ClientSupplierPanel) getView().getContentPanel().getContentWidget());
    }

    @Override
    protected void onBind() {
        super.onBind();
        getClientSupplierPanel().getBtSearch().addClickHandler(getSaveHandler());
        getClientSupplierPanel().getBtCancel().setHref("#clients");
    }

    private ClickHandler getSaveHandler() {
        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                if (getClientSupplierPanel().saveValuesFromUi()) {
                    SaveClientSupplierRequest request = new SaveClientSupplierRequest();
                    request.setClientSupplierC(getClientSupplierPanel().getClientSupplierC());

                    clientSaveService.execute(request, new ServiceCallbackImpl<SaveClientSupplierResponse>() {
                        @Override
                        public void onSuccess(SaveClientSupplierResponse response) {
                            Window.alert(Application.getConstants().clientSavedSuccessfully());
                            LocationUtils.redirect("#clients");
                        }

//                        @Override
//                        public void onFailure(Throwable th) {
//                            Window.alert("problem saving client:" + th.toString());
//                        }

                    });
                }
            }
        };
        return ret;
    }
}
