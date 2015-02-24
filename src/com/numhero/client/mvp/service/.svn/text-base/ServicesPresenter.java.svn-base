package com.numhero.client.mvp.service;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.product.DeleteProductsRequest;
import com.numhero.client.model.datacargo.product.ProductListRequest;
import com.numhero.client.model.datacargo.product.ProductListResponse;
import com.numhero.client.mvp.GenericMoneyinTabPage;
import com.numhero.client.mvp.GridPresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.shared.datacargo.BulkActionResponse;
import com.numhero.shared.service.ApplicationCommandEnum;

import java.util.List;

@Singleton
public class ServicesPresenter extends GridPresenter {

    private Service<ProductListRequest, ProductListResponse> listService;
    private Service<DeleteProductsRequest, BulkActionResponse> deleteProductsService;

    @Inject
    public ServicesPresenter(
            EventManager eventManager,
            Service<ProductListRequest, ProductListResponse> listService,
            Service<DeleteProductsRequest, BulkActionResponse> deleteProductsService) {
        super(eventManager, new GenericMoneyinTabPage(new ServicesTable()));

        this.listService = listService;
        this.deleteProductsService = deleteProductsService;

        getView().setDetailTitlePanel(Application.getConstants().manageServices());

        final ServicesTable table = (ServicesTable) getView().getContentPanel().getContentWidget();
        Command deleteServicesCommand = new Command() {
            public void execute() {
                deleteServices(table.getSelectedIds());
            }
        };

        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteServices(), deleteServicesCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void deleteServices(List<String> ids) {
        DeleteProductsRequest request = new DeleteProductsRequest();
        request.setEntityIdList(ids);
        deleteProductsService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors deleting services");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("Problem deleting services:" + th.toString());
            }
        });
    }

    @Override
    protected String getPresenterUrl() {
        return "services";
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
        ProductListRequest request = new ProductListRequest();
        request.setCommand(ApplicationCommandEnum.CommandGetServices);

        listService.execute(request, new ServiceCallbackImpl<ProductListResponse>() {
            @Override
            public void onSuccess(ProductListResponse response) {
                ((ServicesTable) getView().getContentPanel().getContentWidget()).setServices(response.getProductCList());
            }
        });
    }
}
