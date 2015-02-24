package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DialogBox;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.client_supplier.ClientListRequest;
import com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;

public class SearchClientDialog extends DialogBox {

    private ClientSupplierC clientSupplierC;

    public SearchClientDialog() {
        super();
    }

    public SearchClientDialog(
            Service<ClientListRequest, ClientSupplierListResponse> getListService,
            String text) {

        setText(Application.getConstants().searchClients());
        setModal(true);
        setGlassEnabled(true);
        setAnimationEnabled(true);

        clientSupplierC = new ClientSupplierC();

        final SearchClientSupplierPanel searchPanel = new SearchClientSupplierPanel(this);

        ClientListRequest request = new ClientListRequest();
        request.setSearchString(text);

        getListService.execute(request, new ServiceCallbackImpl<ClientSupplierListResponse>() {
            @Override
            public void onSuccess(ClientSupplierListResponse response) {
                searchPanel.getSearchClientTable().setClientSuppliers(response.getClientSupplierCList());
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem getting clients:" + th.toString());
            }
        });
        setWidget(searchPanel);
    }

    public ClientSupplierC getClientSupplierC() {
        return clientSupplierC;
    }

    public void setClientSupplierC(ClientSupplierC clientSupplierC) {
        this.clientSupplierC = clientSupplierC;
    }
}
