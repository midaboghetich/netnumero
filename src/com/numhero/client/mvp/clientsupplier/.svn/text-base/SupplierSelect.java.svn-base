package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.*;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse;
import com.numhero.client.model.datacargo.client_supplier.SupplierListRequest;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.service.Service;
import com.numhero.client.widget.combobox.ServerSuggestOracle;
import com.numhero.shared.enums.ClientSupplierEnum;

public class SupplierSelect extends Composite implements Focusable {
    public interface ClientSupplierSelectHandler {
        public void clientSupplierChanged(ClientSupplierC clientSupplierC);
    }

    interface ClientSupplierSelectUiBinder extends UiBinder<HTMLPanel, SupplierSelect> {
    }

    private static ClientSupplierSelectUiBinder uiBinder = GWT.create(ClientSupplierSelectUiBinder.class);

    @UiField(provided = true)
    SuggestBox suggestBox;

    @UiField
    Anchor btAdd;

    @UiField
    Anchor btSearch;

    private Service<SaveClientSupplierRequest, SaveClientSupplierResponse> saveService;
    private ClientSupplierC clientSupplierC;
    private ClientSupplierSelectHandler handler;

    public SupplierSelect(
            Service<SupplierListRequest, ClientSupplierListResponse> getListService,
            Service<SaveClientSupplierRequest, SaveClientSupplierResponse> saveService,
            final ClientSupplierEnum type) {
        this.saveService = saveService;

        clientSupplierC = new ClientSupplierC();
        clientSupplierC.setType(ClientSupplierEnum.supplier);

        suggestBox = new SuggestBox(new ServerSuggestOracle<SupplierListRequest, ClientSupplierListResponse>(getListService, new SupplierListRequest()));
        suggestBox.addSelectionHandler(new SelectionHandler<Suggestion>() {
            @Override
            public void onSelection(SelectionEvent<Suggestion> event) {
                if (event.getSelectedItem() instanceof ClientSupplierC) {
                    clientSupplierC = (ClientSupplierC) event.getSelectedItem();
                    handler.clientSupplierChanged(clientSupplierC);
                }
            }
        });
        suggestBox.getTextBox().addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                clientSupplierC.setId(null);
                clientSupplierC.setCompanyName(null);
                handler.clientSupplierChanged(clientSupplierC);
            }
        });

        initWidget(uiBinder.createAndBindUi(this));

        btAdd.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                createDialogBox(type).center();
            }
        });

    }

    public void setHandler(ClientSupplierSelectHandler handler) {
        this.handler = handler;
    }

    public void setClientSupplier(String clientSupplierId, String companyName) {
        clientSupplierC.setId(clientSupplierId);
        clientSupplierC.setCompanyName(companyName);
        suggestBox.setValue(companyName);
    }

    public ClientSupplierC getClientSupplierC() {
        return clientSupplierC;
    }

    public SuggestBox getSbClientSupplier() {
        return suggestBox;
    }

    public Anchor getBtAdd() {
        return btAdd;
    }

    @Override
    public int getTabIndex() {
        return suggestBox.getTabIndex();
    }

    @Override
    public void setAccessKey(char key) {
        suggestBox.setAccessKey(key);
    }

    @Override
    public void setFocus(boolean focused) {
        suggestBox.setFocus(focused);
    }

    @Override
    public void setTabIndex(int index) {
        suggestBox.setTabIndex(index);
    }

    private DialogBox createDialogBox(ClientSupplierEnum type) {
        ClientSupplierDialog dialog = new ClientSupplierDialog(saveService, type, suggestBox.getText());
        dialog.addCloseHandler(new CloseHandler<PopupPanel>() {
            @Override
            public void onClose(CloseEvent<PopupPanel> event) {
                ClientSupplierDialog dialog = (ClientSupplierDialog) event.getTarget();
                if (dialog.getClientSupplierC().getId() != null) {
                    suggestBox.setValue(dialog.getClientSupplierC().getReplacementString());
                    handler.clientSupplierChanged(dialog.getClientSupplierC());
                }
            }
        });
        return dialog;
    }
}