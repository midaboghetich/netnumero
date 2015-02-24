package com.numhero.client.mvp.product;

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
public class ProductsPresenter extends GridPresenter {

    private Service<ProductListRequest, ProductListResponse> listService;
    private Service<DeleteProductsRequest, BulkActionResponse> deleteProductsService;

    @Inject
    public ProductsPresenter(EventManager eventManager,
                             Service<ProductListRequest, ProductListResponse> listService,
                             Service<DeleteProductsRequest, BulkActionResponse> deleteProductsService) {
        super(eventManager, new GenericMoneyinTabPage(new ProductsTable()));

        this.listService = listService;
        this.deleteProductsService = deleteProductsService;

        getView().setDetailTitlePanel(Application.getConstants().manageProducts());

        final ProductsTable table = (ProductsTable) getView().getContentPanel().getContentWidget();
        Command deleteProductsCommand = new Command() {
            public void execute() {
                deleteProducts(table.getSelectedIds());
            }
        };

        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteProducts(), deleteProductsCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));

    }

    private void deleteProducts(List<String> ids) {
        DeleteProductsRequest request = new DeleteProductsRequest();
        request.setEntityIdList(ids);
        deleteProductsService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors deleting products");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem deleting products:" + th.toString());
            }
        });
    }

    @Override
    protected String getPresenterUrl() {
        return "products";
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
        request.setCommand(ApplicationCommandEnum.CommandGetProducts);

        listService.execute(request, new ServiceCallbackImpl<ProductListResponse>() {
            @Override
            public void onSuccess(ProductListResponse response) {
                ((ProductsTable) getView().getContentPanel().getContentWidget()).setProducts(response.getProductCList());
            }
        });
    }
}
