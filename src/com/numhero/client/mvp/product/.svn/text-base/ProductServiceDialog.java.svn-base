package com.numhero.client.mvp.product;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.DialogBox;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.product.SaveProductRequest;
import com.numhero.client.model.datacargo.product.SaveProductResponse;
import com.numhero.client.model.pojoc.ProductC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;

public class ProductServiceDialog extends DialogBox {
    private AbstractEditEntityPanel panel;
    private ProductC productC;

    public ProductServiceDialog(final Service<SaveProductRequest, SaveProductResponse> saveService,
                                AbstractEditEntityPanel p,
                                String productName) {

        setText(Application.getConstants().product());
        setModal(true);
        setGlassEnabled(true);
        setAnimationEnabled(true);

        this.panel = p;
        productC = new ProductC();
        panel.setPojoC(productC);
        panel.getName().setValue(productName);
        panel.getBtSearch().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                if (panel.saveValuesFromUi()) {
                    SaveProductRequest request = new SaveProductRequest();
                    request.setProductC(productC);
                    saveService.execute(request, new ServiceCallbackImpl<SaveProductResponse>() {
                        @Override
                        public void onSuccess(SaveProductResponse response) {
                            productC.setId(response.getEntityId());
                            ProductServiceDialog.this.hide();
                        }
                    });
                }
            }
        });
        panel.getBtCancel().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                ProductServiceDialog.this.hide();
            }
        });
        setWidget(panel);
    }

    public ProductC getProductC() {
        return productC;
    }
}
