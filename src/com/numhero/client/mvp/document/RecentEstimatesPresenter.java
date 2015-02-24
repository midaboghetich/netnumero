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
public class RecentEstimatesPresenter extends GridPresenter {

    private Service<InvoiceListRequest, InvoiceListResponse> invoiceListService;
    private Service<DeleteDocumentsRequest, BulkActionResponse> deleteDocumentsService;
    private Service<ArchiveDocumentsRequest, BulkActionResponse> archiveEstimateService;
    private Service<ConvertToInvoiceRequest, BulkActionResponse> convertToInvoicesService;

    @Inject
    public RecentEstimatesPresenter(EventManager eventManager,
                                    Service<InvoiceListRequest, InvoiceListResponse> invoiceListService,
                                    Service<DeleteDocumentsRequest, BulkActionResponse> deleteDocumentsService,
                                    Service<ArchiveDocumentsRequest, BulkActionResponse> archiveEstimateService,
                                    Service<ConvertToInvoiceRequest, BulkActionResponse> convertToInvoicesService) {
        super(eventManager, new GenericMoneyinTabPage(new InvoicesTable()));
        this.invoiceListService = invoiceListService;
        this.deleteDocumentsService = deleteDocumentsService;
        this.archiveEstimateService = archiveEstimateService;
        this.convertToInvoicesService = convertToInvoicesService;

        getView().setDetailTitlePanel(Application.getConstants().mostRecentEstimates());

        final InvoicesTable table = (InvoicesTable) getView().getContentPanel().getContentWidget();

        Command archiveEstimatesCommand = new Command() {
            public void execute() {
                archiveEstimates(table.getSelectedIds());
            }
        };

        Command deleteEstimatesCommand = new Command() {
            public void execute() {
                deleteDocuments(table.getSelectedIds());
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
        bulkActions.addItem(new MenuItem(Application.getConstants().archiveEstimates(), archiveEstimatesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteEstimates(), deleteEstimatesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().convertToInvoices(), convertToInvoicesCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void archiveEstimates(List<String> ids) {
        ArchiveDocumentsRequest request = new ArchiveDocumentsRequest();
        request.setEntityIdList(ids);
        archiveEstimateService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
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

    private void deleteDocuments(List<String> ids) {
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
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors converting to invoice");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem converting documents:" + th.toString());
            }
        });
    }

    @Override
    protected String getPresenterUrl() {
        return "estimates";
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
        InvoiceListRequest request = new InvoiceListRequest(InvoiceTypeEnum.Estimate);

        invoiceListService.execute(request, new ServiceCallbackImpl<InvoiceListResponse>() {
            @Override
            public void onSuccess(InvoiceListResponse response) {
                ((InvoicesTable) getView().getContentPanel().getContentWidget()).setInvoices(response.getInvoiceCList());
            }
        });
    }
}
