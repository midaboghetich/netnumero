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
import com.numhero.client.mvp.GenericMoneyinTabPage;
import com.numhero.client.mvp.GridPresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.shared.datacargo.BulkActionResponse;
import com.numhero.shared.enums.InvoiceTypeEnum;

import java.util.List;

@Singleton
public class RecentInvoicesPresenter extends GridPresenter {

    private Service<InvoiceListRequest, InvoiceListResponse> invoiceListService;
    private Service<DeleteDocumentsRequest, BulkActionResponse> deleteDocumentsService;
    private Service<ArchiveDocumentsRequest, BulkActionResponse> archiveInvoicesService;
    private Service<ChangeStatusToPaiedDocumentsRequest, BulkActionResponse> changeStatusToPaiedInvoicesService;
    private Service<ChangeStatusToOverdueDocumentsRequest, BulkActionResponse> changeStatusToOverdueInvoicesService;
    private Service<ChangeStatusToSentDocumentsRequest, BulkActionResponse> changeStatusToSentInvoicesService;

    @Inject
    public RecentInvoicesPresenter(EventManager eventManager,
                                   Service<InvoiceListRequest, InvoiceListResponse> invoiceListService,
                                   Service<DeleteDocumentsRequest, BulkActionResponse> deleteDocumentsService,
                                   Service<ArchiveDocumentsRequest, BulkActionResponse> archiveInvoicesService,
                                   Service<ChangeStatusToPaiedDocumentsRequest, BulkActionResponse> changeStatusToPaiedInvoicesService,
                                   Service<ChangeStatusToOverdueDocumentsRequest, BulkActionResponse> changeStatusToOverdueInvoicesService,
                                   Service<ChangeStatusToSentDocumentsRequest, BulkActionResponse> changeStatusToSentInvoicesService

    ) {
        super(eventManager, new GenericMoneyinTabPage(new InvoicesTable()));

        this.invoiceListService = invoiceListService;
        this.deleteDocumentsService = deleteDocumentsService;
        this.archiveInvoicesService = archiveInvoicesService;
        this.changeStatusToPaiedInvoicesService = changeStatusToPaiedInvoicesService;
        this.changeStatusToOverdueInvoicesService = changeStatusToOverdueInvoicesService;
        this.changeStatusToSentInvoicesService = changeStatusToSentInvoicesService;

        getView().setDetailTitlePanel(Application.getConstants().mostRecentInvoices());

        final InvoicesTable table = (InvoicesTable) getView().getContentPanel().getContentWidget();
        Command archiveInvoicesCommand = new Command() {
            public void execute() {
                archiveInvoices(table.getSelectedIds());
            }
        };

        Command deleteInvoicesCommand = new Command() {
            public void execute() {
                deleteInvoices(table.getSelectedIds());
            }
        };

        Command paiedInvoicesCommand = new Command() {
            public void execute() {
                paiedInvoices(table.getSelectedIds());
            }
        };

        Command overdueInvoicesCommand = new Command() {
            public void execute() {
                overdueInvoices(table.getSelectedIds());
            }
        };

        Command sentInvoicesCommand = new Command() {
            public void execute() {
                sentInvoices(table.getSelectedIds());
            }
        };

        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().archiveInvoices(), archiveInvoicesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteInvoices(), deleteInvoicesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().paiedInvoices(), paiedInvoicesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().overdueInvoices(), overdueInvoicesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().sentInvoices(), sentInvoicesCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void archiveInvoices(List<String> ids) {
        ArchiveDocumentsRequest request = new ArchiveDocumentsRequest();
        request.setEntityIdList(ids);
        archiveInvoicesService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
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

    private void paiedInvoices(List<String> ids) {
        ChangeStatusToPaiedDocumentsRequest request = new ChangeStatusToPaiedDocumentsRequest();
        request.setEntityIdList(ids);
        changeStatusToPaiedInvoicesService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors changing status to paied document");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem changing status to paied documents:" + th.toString());
            }
        });
    }

    private void deleteInvoices(List<String> ids) {
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


    private void overdueInvoices(List<String> ids) {
        ChangeStatusToOverdueDocumentsRequest request = new ChangeStatusToOverdueDocumentsRequest();
        request.setEntityIdList(ids);
        changeStatusToOverdueInvoicesService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors changing status to overdue document");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem changing status to overdue documents:" + th.toString());
            }
        });
    }

    private void sentInvoices(List<String> ids) {
        ChangeStatusToSentDocumentsRequest request = new ChangeStatusToSentDocumentsRequest();
        request.setEntityIdList(ids);
        changeStatusToSentInvoicesService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors changing status to sent document");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem changing status to sent documents:" + th.toString());
            }
        });
    }


    @Override
    protected String getPresenterUrl() {
        return "invoices";
    }

    @Override
    public GenericMoneyinTabPage getView() {
        return (GenericMoneyinTabPage) super.getView();
    }

    @Override
    public void onShow() {
        refreshFromServer();
    }

    private void refreshFromServer() {
        InvoiceListRequest request = new InvoiceListRequest(InvoiceTypeEnum.Invoice);

        invoiceListService.execute(request, new ServiceCallbackImpl<InvoiceListResponse>() {
            @Override
            public void onSuccess(InvoiceListResponse response) {
                ((InvoicesTable) getView().getContentPanel().getContentWidget()).setInvoices(response.getInvoiceCList());
            }
        });
    }
}
