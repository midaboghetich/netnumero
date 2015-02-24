package com.numhero.client.mvp.bankaccount;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ListBox;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest;
import com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse;
import com.numhero.client.model.datacargo.bankaccount.SaveBankAccountRequest;
import com.numhero.client.model.datacargo.bankaccount.SaveBankAccountResponse;
import com.numhero.client.model.pojoc.BankAccountC;
import com.numhero.client.mvp.BasePresenter;
import com.numhero.client.mvp.GenericAccountsTabPage;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.LocationUtils;
import com.numhero.shared.enums.CurrencyEnum;

@Singleton
public class BankAccountPresenter extends BasePresenter {

    Service<GetBankAccountRequest, GetBankAccountResponse> bankAccountGetService;
    Service<SaveBankAccountRequest, SaveBankAccountResponse> bankAccountSaveService;

    @Inject
    public BankAccountPresenter(EventManager eventManager,
                                Service<GetBankAccountRequest, GetBankAccountResponse> bankAccountGetService,
                                Service<SaveBankAccountRequest, SaveBankAccountResponse> bankAccountSaveService) {
        super(eventManager, new GenericAccountsTabPage(new BankAccountPanel()));
        this.bankAccountGetService = bankAccountGetService;
        this.bankAccountSaveService = bankAccountSaveService;
    }

    @Override
    protected String getPresenterUrl() {
        return "bankaccount";
    }

    @Override
    public GenericAccountsTabPage getView() {
        return (GenericAccountsTabPage) super.getView();
    }

    @Override
    public void onShow() {
        if (getUrl().getId() == null) {
            getBankAccountPanel().setBankAccountC(new BankAccountC());
            getView().setDetailTitlePanel(Application.getConstants().createNewBankAccount());
        } else {

            GetBankAccountRequest request = new GetBankAccountRequest();

            request.setEntityId(getUrl().getId());

            getView().setDetailTitlePanel(Application.getConstants().editBankAccount());

            bankAccountGetService.execute(request, new ServiceCallbackImpl<GetBankAccountResponse>() {
                @Override
                public void onSuccess(GetBankAccountResponse response) {
                    getBankAccountPanel().setBankAccountC(response.getBankAccountC());
                }

                @Override
                public void onFailure(Throwable th) {
                    Window.alert("problem getting BankAccount: " + th.toString());
                }
            });
        }
    }

    private BankAccountPanel getBankAccountPanel() {
        return ((BankAccountPanel) getView().getContentPanel().getContentWidget());
    }

    @Override
    protected void onBind() {
        super.onBind();
        BankAccountPanel panel = getBankAccountPanel();

        ListBox lbCurrency = panel.getCurrency();
        for (CurrencyEnum c : CurrencyEnum.values()) {
            lbCurrency.addItem(c.name());
        }

        getBankAccountPanel().getBtSearch().addClickHandler(saveBankAccountHandler());
    }

    @Override
    protected void onUnbind() {
        super.onUnbind();
    }

    private ClickHandler saveBankAccountHandler() {
        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                BankAccountPanel panel = getBankAccountPanel();
                BankAccountC bankAccountC = new BankAccountC();
                bankAccountC.setName(panel.getName().getText());
                bankAccountC.setDescription(panel.getDescription().getText());
                bankAccountC.setCurrency(CurrencyEnum.valueOf(panel.getListBoxSelectValue(panel.getCurrency())));
                bankAccountC.setAccount(panel.getAccount().getValue());
                bankAccountC.setBank(panel.getBank().getText());
                bankAccountC.setCurrentBalance(panel.getCurrentBalance().getAmount());
                bankAccountC.setOpeningBalance(panel.getOpeningBalance().getAmount());
                bankAccountC.setSwift(panel.getSwift().getValue());

                SaveBankAccountRequest request = new SaveBankAccountRequest();

                request.setBankAccountC(bankAccountC);

                bankAccountSaveService.execute(request, new ServiceCallbackImpl<SaveBankAccountResponse>() {
                    @Override
                    public void onSuccess(SaveBankAccountResponse response) {
                        Window.alert("Bank account saved.");
                        LocationUtils.redirect("#bankaccounts");
                    }

                    @Override
                    public void onFailure(Throwable th) {
                        Window.alert("problem saving bank account:" + th.toString());
                    }
                });
            }
        };
        return ret;
    }
}
