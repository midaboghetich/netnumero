package com.numhero.client.mvp.businessaccount;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ListBox;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountRequest;
import com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountResponse;
import com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountRequest;
import com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountResponse;
import com.numhero.client.model.pojoc.BusinessAccountC;
import com.numhero.client.mvp.BasePresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.shared.enums.DateFormatEnum;
import com.numhero.shared.enums.PaymentMethodEnum;
import com.numhero.shared.enums.TimeFormatEnum;

@Singleton
public class BusinessAccountPresenter extends BasePresenter {
    Service<GetBusinessAccountRequest, GetBusinessAccountResponse> businessAccountGetService;
    Service<SaveBusinessAccountRequest, SaveBusinessAccountResponse> businessAccountSaveService;


    @Inject
    public BusinessAccountPresenter(EventManager eventManager,
                                    Service<GetBusinessAccountRequest, GetBusinessAccountResponse> businessAccountGetService,
                                    Service<SaveBusinessAccountRequest, SaveBusinessAccountResponse> businessAccountSaveService,
                                    BusinessAccountView businessAccountView) {
        super(eventManager, businessAccountView);
        this.businessAccountGetService = businessAccountGetService;
        this.businessAccountSaveService = businessAccountSaveService;
    }

    @Override
    protected String getPresenterUrl() {
        return "businessaccount";
    }

    @Override
    public BusinessAccountView getView() {
        return (BusinessAccountView) super.getView();
    }

    @Override
    public void onShow() {
        if (getUrl().getId() == null) {
            getView().getBusinessAccountPanel().setBusinessAccountC(new BusinessAccountC());
        } else {
            GetBusinessAccountRequest request = new GetBusinessAccountRequest();
            request.setEntityId(getUrl().getId());

            businessAccountGetService.execute(request, new ServiceCallbackImpl<GetBusinessAccountResponse>() {
                @Override
                public void onSuccess(GetBusinessAccountResponse response) {
                    getView().getBusinessAccountPanel().setBusinessAccountC(response.getBusinessAccountC());
                }
            });
        }
    }

    private ClickHandler saveBusinessAccountHandler() {

        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                BusinessAccountPanel panel = getView().getBusinessAccountPanel();
                boolean isValid = panel.saveValuesFromUi();
                if (isValid) {
                    SaveBusinessAccountRequest request = new SaveBusinessAccountRequest();
                    request.setBusinessAccountC(getView().getBusinessAccountPanel().getBusinessAccountC());
                    businessAccountSaveService.execute(request, new ServiceCallbackImpl<SaveBusinessAccountResponse>() {

                        @Override
                        public void onSuccess(SaveBusinessAccountResponse response) {
                            Window.alert(Application.getConstants().businessAccontSaved());
                        }

                        @Override
                        public void onFailure(Throwable th) {
                            Window.alert("problem saving business account:" + th.toString());
                        }
                    });
                }
            }
        };
        return ret;
    }

    @Override
    protected void onBind() {
        super.onBind();

        BusinessAccountPanel panel = getView().getBusinessAccountPanel();

        ListBox lbTimeFormat = panel.getTimeFormat();
        for (TimeFormatEnum c : TimeFormatEnum.values()) {
            lbTimeFormat.addItem(c.toString(), c.name());
        }

        ListBox lbDateFormat = panel.getDateFormat();
        for (DateFormatEnum c : DateFormatEnum.values()) {
            lbDateFormat.addItem(c.toString(), c.name());
        }

        ListBox lbPaymentMethod = panel.getPreferredPaymentMethods();
        for (PaymentMethodEnum c : PaymentMethodEnum.values()) {
            lbPaymentMethod.addItem(c.name());
        }

        panel.getBtSearch().addClickHandler(saveBusinessAccountHandler());
    }

}
