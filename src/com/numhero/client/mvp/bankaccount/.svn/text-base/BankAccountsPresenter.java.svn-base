package com.numhero.client.mvp.bankaccount;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.bankaccount.BankAccountListRequest;
import com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse;
import com.numhero.client.model.datacargo.bankaccount.DeleteBankAccountsRequest;
import com.numhero.client.mvp.GenericAccountsTabPage;
import com.numhero.client.mvp.GridPresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

@Singleton
public class BankAccountsPresenter extends GridPresenter {

    private Service<DeleteBankAccountsRequest, BulkActionResponse> deleteBankAccountsService;
    private Service<BankAccountListRequest, BankAccountListResponse> bankAccountListService;

    @Inject
    public BankAccountsPresenter(EventManager eventManager,
                                 Service<BankAccountListRequest, BankAccountListResponse> bankAccountListService,
                                 Service<DeleteBankAccountsRequest, BulkActionResponse> deleteBankAccountsService) {
        super(eventManager, new GenericAccountsTabPage(new BankAccountsTable()));

        this.bankAccountListService = bankAccountListService;
        this.deleteBankAccountsService = deleteBankAccountsService;

        getView().setDetailTitlePanel(Application.getConstants().manageBankAccounts());

        setUpBulkActionsMenu();
    }

    private void setUpBulkActionsMenu() {
        final BankAccountsTable table = (BankAccountsTable) getView().getContentPanel().getContentWidget();
        Command deleteCommand = new Command() {
            public void execute() {
                deleteBankAccounts(table.getSelectedIds());
            }
        };
        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteBankAccounts(), deleteCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void deleteBankAccounts(List<String> ids) {
        DeleteBankAccountsRequest request = new DeleteBankAccountsRequest();
        request.setEntityIdList(ids);
        deleteBankAccountsService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors deleting bank accounts");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem deleting bank accounts:" + th.toString());
            }
        });
    }

    @Override
    protected String getPresenterUrl() {
        return "bankaccounts";
    }

    @Override
    public GenericAccountsTabPage getView() {
        return (GenericAccountsTabPage) super.getView();
    }

    @Override
    public void onShow() {
        refreshFromServer();
    }

    private void refreshFromServer() {
        BankAccountListRequest request = new BankAccountListRequest();

        bankAccountListService.execute(request, new ServiceCallbackImpl<BankAccountListResponse>() {
            @Override
            public void onSuccess(BankAccountListResponse response) {
                ((BankAccountsTable) getView().getContentPanel().getContentWidget()).setBankAccounts(response.getBankAccountCList());
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem retrieving bank accounts:" + th.toString());
            }
        });
    }
}
