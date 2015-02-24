package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.client_supplier.*;
import com.numhero.client.mvp.GenericClientTabPage;
import com.numhero.client.mvp.GridPresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.CoreUtils;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

@Singleton
public class ClientsPresenter extends GridPresenter {

    private Service<ClientListRequest, ClientSupplierListResponse> clientSupplierListService;
    private Service<DeleteClientsSuppliersRequest, BulkActionResponse> deleteClientsSuppliersService;

    private Service<ClientSupplierRaiseInvoicesRequest, BulkActionResponse> raiseInvoicesService;
    private Service<ClientSupplierRaiseEstimatesRequest, BulkActionResponse> raiseEstimatesService;
    private Service<ClientSupplierRaiseExpensesRequest, BulkActionResponse> raiseExpensesService;


    @Inject
    public ClientsPresenter(EventManager eventManager,
                            Service<ClientListRequest, ClientSupplierListResponse> clientSupplierListService,
                            Service<DeleteClientsSuppliersRequest, BulkActionResponse> deleteClientsSuppliersService,
                            Service<ClientSupplierRaiseInvoicesRequest, BulkActionResponse> raiseInvoicesService,
                            Service<ClientSupplierRaiseEstimatesRequest, BulkActionResponse> raiseEstimatesService,
                            Service<ClientSupplierRaiseExpensesRequest, BulkActionResponse> raiseExpensesService

    ) {

        super(eventManager, new GenericClientTabPage(new ClientSuppliersTable()));

        this.clientSupplierListService = clientSupplierListService;
        this.deleteClientsSuppliersService = deleteClientsSuppliersService;

        this.raiseInvoicesService = raiseInvoicesService;
        this.raiseEstimatesService = raiseEstimatesService;
        this.raiseExpensesService = raiseExpensesService;

        getView().setDetailTitlePanel(Application.getConstants().manageClients());

        setupBulkActionMenu();
    }

    private void setupBulkActionMenu() {
        final ClientSuppliersTable table = (ClientSuppliersTable) getView().getContentPanel().getContentWidget();
        Command raiseInvoicesCommand = new Command() {
            public void execute() {
                raiseInvoices(table.getSelectedIds());
            }
        };

        Command raiseEstimatesCommand = new Command() {
            public void execute() {
                raiseEstimates(table.getSelectedIds());
            }
        };

        Command raiseExpensesCommand = new Command() {
            public void execute() {
                raiseExpenses(table.getSelectedIds());
            }
        };
        Command deleteClientsCommand = new Command() {
            public void execute() {
                deleteClients(table.getSelectedIds());
            }
        };

        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().raiseInvoices(), raiseInvoicesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().raiseEstimates(), raiseEstimatesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().raiseExpenses(), raiseExpensesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteClients(), deleteClientsCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void raiseInvoices(List<String> ids) {
        ClientSupplierRaiseInvoicesRequest request = new ClientSupplierRaiseInvoicesRequest();
        request.setEntityIdList(ids);
        raiseInvoicesService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors raising invoices");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("Errors raising invoices:" + th.toString());
            }
        });
    }

    private void raiseEstimates(List<String> ids) {
        CoreUtils.debug("raiseEstimates");
        ClientSupplierRaiseEstimatesRequest request = new ClientSupplierRaiseEstimatesRequest();
        request.setEntityIdList(ids);
        raiseEstimatesService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors raising invoices");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("Errors raising invoices:" + th.toString());
            }
        });
    }

    private void raiseExpenses(List<String> ids) {
        CoreUtils.debug("raiseExpenses");
        ClientSupplierRaiseExpensesRequest request = new ClientSupplierRaiseExpensesRequest();
        request.setEntityIdList(ids);
        raiseExpensesService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors raising invoices");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("Errors raising invoices:" + th.toString());
            }
        });
    }

    private void deleteClients(List<String> ids) {
        DeleteClientsSuppliersRequest request = new DeleteClientsSuppliersRequest();
        request.setEntityIdList(ids);
        deleteClientsSuppliersService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors deleting clients");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem deleting clients:" + th.toString());
            }
        });
    }

    @Override
    protected String getPresenterUrl() {
        return "clients";
    }

    @Override
    public GenericClientTabPage getView() {
        return (GenericClientTabPage) super.getView();
    }

    @Override
    public void onShow() {
        refreshFromServer();
    }

    private void refreshFromServer() {

        ClientListRequest request = new ClientListRequest();

        clientSupplierListService.execute(request, new ServiceCallbackImpl<ClientSupplierListResponse>() {
            @Override
            public void onSuccess(ClientSupplierListResponse response) {
                ((ClientSuppliersTable) getView().getContentPanel().getContentWidget()).setClientSuppliers(response.getClientSupplierCList());
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem getting clients:" + th.toString());
            }

        });
    }
}
