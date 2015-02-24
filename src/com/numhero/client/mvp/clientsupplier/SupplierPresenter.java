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
public class SupplierPresenter extends BasePresenter {
    private Service<GetClientSupplierRequest, GetClientSupplierResponse> clientSupplierGetService;
    private Service<SaveClientSupplierRequest, SaveClientSupplierResponse> supplierSaveService;

    @Inject
    public SupplierPresenter(EventManager eventManager,
                             Service<GetClientSupplierRequest, GetClientSupplierResponse> clientSupplierGetService,
                             Service<SaveClientSupplierRequest, SaveClientSupplierResponse> supplierSaveService) {
        super(eventManager, new GenericClientTabPage(new ClientSupplierPanel()));
        this.clientSupplierGetService = clientSupplierGetService;
        this.supplierSaveService = supplierSaveService;
    }

    @Override
    protected String getPresenterUrl() {
        return "supplier";
    }

    @Override
    public GenericClientTabPage getView() {
        return (GenericClientTabPage) super.getView();
    }

    @Override
    protected void onShow() {
        if (getUrl().getId() == null) {
            getView().setDetailTitlePanel(Application.getConstants().newSupplier());
            ClientSupplierC supplier = new ClientSupplierC();
            supplier.setType(ClientSupplierEnum.supplier);
            getClientSupplierPanel().setClientSupplierC(supplier);
        } else {
            getView().setDetailTitlePanel(Application.getConstants().editSupplier());
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

    private ClientSupplierPanel getClientSupplierPanel() {
        return ((ClientSupplierPanel) getView().getContentPanel().getContentWidget());
    }

    @Override
    protected void onBind() {
        super.onBind();

        getClientSupplierPanel().getBtSearch().addClickHandler(getSaveHandler());
        getClientSupplierPanel().getBtCancel().setHref("#suppliers");
    }

    private ClickHandler getSaveHandler() {
        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if (getClientSupplierPanel().saveValuesFromUi()) {


                    SaveClientSupplierRequest request = new SaveClientSupplierRequest();

                    request.setClientSupplierC(getClientSupplierPanel().getClientSupplierC());

                    supplierSaveService.execute(request, new ServiceCallbackImpl<SaveClientSupplierResponse>() {
                        @Override
                        public void onSuccess(SaveClientSupplierResponse response) {
                            Window.alert(Application.getConstants().supplierSavedSuccessfully());
                            LocationUtils.redirect("#suppliers");
                        }

                        @Override
                        public void onFailure(Throwable th) {
                            Window.alert("problem saving supplier:" + th.toString());
                        }

                    });
                }
            }
        };
        return ret;
    }
}
