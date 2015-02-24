package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.widget.NetNumeroButton;

public class SearchClientSupplierPanel extends Composite {
    interface ClientSupplierUiBinder extends UiBinder<Widget, SearchClientSupplierPanel> {
    }

    private static ClientSupplierUiBinder uiBinder = GWT.create(ClientSupplierUiBinder.class);

    @UiField
    TextBox name;

    @UiField
    NetNumeroButton btSearch;

    @UiField
    NetNumeroButton btCancel;

    @UiField(provided = true)
    SearchClientTable searchClientTable;

    public SearchClientSupplierPanel(final SearchClientDialog searchClientDialog) {
        searchClientTable = new SearchClientTable();
        initWidget(uiBinder.createAndBindUi(this));

        btCancel.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                searchClientDialog.hide();
            }
        });
    }

    public NetNumeroButton getBtSearch() {
        return btSearch;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    public TextBox getName() {
        return name;
    }

    public void setName(TextBox name) {
        this.name = name;
    }

    public SearchClientTable getSearchClientTable() {
        return searchClientTable;
    }

    public void setSearchClientTable(SearchClientTable searchClientTable) {
        this.searchClientTable = searchClientTable;
    }
}