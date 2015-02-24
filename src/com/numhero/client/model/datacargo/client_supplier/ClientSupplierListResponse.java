package com.numhero.client.model.datacargo.client_supplier;

import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.shared.datacargo.SuggestCommandResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClientSupplierListResponse extends SuggestCommandResponse {
    private List<ClientSupplierC> clientSupplierCList = new ArrayList<ClientSupplierC>();

    public List<ClientSupplierC> getClientSupplierCList() {
        return clientSupplierCList;
    }

    public void setClientSupplierCList(List<ClientSupplierC> clientSupplierCList) {
        this.clientSupplierCList = clientSupplierCList;
    }

    public Collection<? extends Suggestion> getSuggestions() {
        return clientSupplierCList;
    }
}