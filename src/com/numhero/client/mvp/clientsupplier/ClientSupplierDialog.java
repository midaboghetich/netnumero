package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.DialogBox;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.shared.enums.ClientSupplierEnum;

public class ClientSupplierDialog extends DialogBox {
    private QuickClientSupplierPanel clientSupplierPanel;
    private ClientSupplierC clientSupplierC;

    public ClientSupplierDialog(final Service<SaveClientSupplierRequest, SaveClientSupplierResponse> clientSupplierSaveService,
                                ClientSupplierEnum type,
                                String s) {

        if (type == ClientSupplierEnum.client)
            setText(Application.getConstants().newClient());
        else
            setText(Application.getConstants().newSupplier());

        setModal(true);
        setGlassEnabled(true);
        setAnimationEnabled(true);

        clientSupplierPanel = new QuickClientSupplierPanel();

        clientSupplierC = new ClientSupplierC();
        clientSupplierC.setCompanyName(s);
        clientSupplierC.setType(type);
        clientSupplierPanel.setClientSupplierC(clientSupplierC);

        clientSupplierPanel.btSave.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                boolean isValid = clientSupplierPanel.saveValuesFromUi();
                if (isValid) {
                    SaveClientSupplierRequest request = new SaveClientSupplierRequest();
                    request.setClientSupplierC(clientSupplierC);
                    clientSupplierSaveService.execute(request, new ServiceCallbackImpl<SaveClientSupplierResponse>() {
                        @Override
                        public void onSuccess(SaveClientSupplierResponse response) {
                            clientSupplierC.setId(response.getEntityId());
                            ClientSupplierDialog.this.hide();
                        }

                        @Override
                        public void onFailure(Throwable th) {
                            super.onFailure(th);
                        }
                    });
                }
            }
        });
        clientSupplierPanel.btCancel.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                ClientSupplierDialog.this.hide();
            }
        });
        setWidget(clientSupplierPanel);
    }

    public ClientSupplierC getClientSupplierC() {
        return clientSupplierC;
    }
}