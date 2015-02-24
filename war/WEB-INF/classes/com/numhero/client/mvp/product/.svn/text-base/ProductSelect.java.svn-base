package com.numhero.client.mvp.product;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.*;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.product.ProductListRequest;
import com.numhero.client.model.datacargo.product.ProductListResponse;
import com.numhero.client.model.datacargo.product.SaveProductRequest;
import com.numhero.client.model.datacargo.product.SaveProductResponse;
import com.numhero.client.model.pojoc.ProductC;
import com.numhero.client.mvp.service.ServicePanel;
import com.numhero.client.service.Service;
import com.numhero.client.widget.combobox.ServerSuggestOracle;

public class ProductSelect extends Composite {

    public interface ProductSelectHandler {
        public void productChanged(ProductC productC);
    }

    interface ProductSelectUiBinder extends UiBinder<HTMLPanel, ProductSelect> {
    }

    private static ProductSelectUiBinder uiBinder = GWT.create(ProductSelectUiBinder.class);

    @UiField(provided = true)
    SuggestBox suggestBox;

    @UiField
    Anchor btAdd;

    PopupPanel ppAdd;

    Anchor btAddProduct;

    Anchor btAddService;

    private Service<SaveProductRequest, SaveProductResponse> saveService;
    private ProductC pojoC;
    private ProductSelectHandler handler;

    public ProductSelect(Service<ProductListRequest, ProductListResponse> getListService,
                         Service<SaveProductRequest, SaveProductResponse> saveService) {

        this.saveService = saveService;

        pojoC = new ProductC();
        suggestBox = new SuggestBox(new ServerSuggestOracle<ProductListRequest, ProductListResponse>(getListService, new ProductListRequest()));
        suggestBox.addSelectionHandler(new SelectionHandler<Suggestion>() {
            @Override
            public void onSelection(SelectionEvent<Suggestion> event) {
                if (event.getSelectedItem() instanceof ProductC) {
                    pojoC = (ProductC) event.getSelectedItem();
                    handler.productChanged(pojoC);
                }
            }
        });
        suggestBox.getTextBox().addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                pojoC.init();
                handler.productChanged(pojoC);
            }
        });

        initWidget(uiBinder.createAndBindUi(this));

        btAdd.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                getPpAdd().showRelativeTo(btAdd);
            }
        });
    }

    public void setHandler(ProductSelectHandler handler) {
        this.handler = handler;
    }

    public void setProduct(String productId, String name, String description, Double unitPrice) {
        pojoC.setId(productId);
        pojoC.setName(name);
        pojoC.setDescription(description);
        pojoC.setUnitPrice(unitPrice);
        suggestBox.setValue(pojoC.getName());
    }

    public Anchor getBtAdd() {
        return btAdd;
    }

    private PopupPanel getPpAdd() {
        if (ppAdd == null) {
            ppAdd = new DecoratedPopupPanel();
            ppAdd.setAutoHideEnabled(true);
            ppAdd.setAnimationEnabled(true);
            VerticalPanel vp = new VerticalPanel();
            btAddProduct = new Anchor(Application.getConstants().newProduct());
            btAddProduct.addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    ppAdd.hide();
                    ProductServiceDialog serviceDialog = new ProductServiceDialog(saveService, new ProductPanel(), suggestBox.getText());
                    addDialogHandler(serviceDialog);
                    serviceDialog.center();
                }
            });
            vp.add(btAddProduct);
            btAddService = new Anchor(Application.getConstants().newService());
            btAddService.addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    ppAdd.hide();
                    ProductServiceDialog serviceDialog = new ProductServiceDialog(saveService, new ServicePanel(), suggestBox.getText());
                    addDialogHandler(serviceDialog);
                    serviceDialog.center();
                }
            });
            vp.add(btAddService);
            ppAdd.setWidget(vp);
        }
        return ppAdd;
    }

    private void addDialogHandler(DialogBox dialog) {
        dialog.addCloseHandler(new CloseHandler<PopupPanel>() {
            @Override
            public void onClose(CloseEvent<PopupPanel> event) {
                ProductServiceDialog serviceDialog = (ProductServiceDialog) event.getTarget();
                if (serviceDialog.getProductC().getId() != null) {
                    suggestBox.setValue(serviceDialog.getProductC().getReplacementString());
                    handler.productChanged(serviceDialog.getProductC());
                }
            }
        });
    }
}
