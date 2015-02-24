package com.numhero.client.mvp.document;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.invoice.*;
import com.numhero.client.mvp.GenericMoneyoutTabPage;
import com.numhero.client.mvp.GridPresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.shared.datacargo.BulkActionResponse;
import com.numhero.shared.enums.InvoiceTypeEnum;

import java.util.List;

@Singleton
public class RecentExpensesPresenter extends GridPresenter {

    private Service<InvoiceListRequest, InvoiceListResponse> invoiceListService;
    private Service<DeleteDocumentsRequest, BulkActionResponse> deleteDocumentsService;
    private Service<ArchiveDocumentsRequest, BulkActionResponse> archiveExpenseService;
    private Service<ConvertToInvoiceRequest, BulkActionResponse> convertToInvoicesService;

    @Inject
    public RecentExpensesPresenter(EventManager eventManager,
                                   Service<InvoiceListRequest, InvoiceListResponse> invoiceListService,
                                   Service<DeleteDocumentsRequest, BulkActionResponse> deleteDocumentsService,
                                   Service<ArchiveDocumentsRequest, BulkActionResponse> archiveExpenseService,
                                   Service<ConvertToInvoiceRequest, BulkActionResponse> convertToInvoicesService) {

        super(eventManager, new GenericMoneyoutTabPage(new InvoicesTable()));

        this.invoiceListService = invoiceListService;
        this.deleteDocumentsService = deleteDocumentsService;
        this.archiveExpenseService = archiveExpenseService;
        this.convertToInvoicesService = convertToInvoicesService;

        getView().setDetailTitlePanel(Application.getConstants().mostRecentExpenses());

        final InvoicesTable table = (InvoicesTable) getView().getContentPanel().getContentWidget();
        Command archiveExpensesCommand = new Command() {
            public void execute() {
                archiveExpenses(table.getSelectedIds());
            }
        };

        Command deleteExpensesCommand = new Command() {
            public void execute() {
                deleteExpenses(table.getSelectedIds());
            }
        };
        Command convertToInvoicesCommand = new Command() {
            public void execute() {
                convertToInvoices(table.getSelectedIds());
            }
        };

        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().archiveExpenses(), archiveExpensesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteExpenses(), deleteExpensesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().convertToInvoices(), convertToInvoicesCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void archiveExpenses(List<String> ids) {
        ArchiveDocumentsRequest request = new ArchiveDocumentsRequest();
        request.setEntityIdList(ids);
        archiveExpenseService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors archiving document");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem archiving documents:" + th.toString());
            }
        });
    }

    private void deleteExpenses(List<String> ids) {
        DeleteDocumentsRequest request = new DeleteDocumentsRequest();
        request.setEntityIdList(ids);
        deleteDocumentsService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors deleting document");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem deleting documents:" + th.toString());
            }
        });
    }

    private void convertToInvoices(List<String> ids) {
        ConvertToInvoiceRequest request = new ConvertToInvoiceRequest();
        request.setEntityIdList(ids);
        convertToInvoicesService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors deleting document");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem deleting documents:" + th.toString());
            }
        });
    }

    @Override
    protected String getPresenterUrl() {
        return "expenses";
    }

    @Override
    public GenericMoneyoutTabPage getView() {
        return (GenericMoneyoutTabPage) super.getView();
    }

    @Override
    public void onShow() {
        refreshFromServer();
    }

    private void refreshFromServer() {
        InvoiceListRequest request = new InvoiceListRequest(InvoiceTypeEnum.Expense);

        invoiceListService.execute(request, new ServiceCallbackImpl<InvoiceListResponse>() {
            @Override
            public void onSuccess(InvoiceListResponse response) {
                ((InvoicesTable) getView().getContentPanel().getContentWidget()).setInvoices(response.getInvoiceCList());
            }
        });
    }
}
