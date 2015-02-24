package com.numhero.client.model.datacargo.client_supplier;

import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.shared.datacargo.GetSingleEntityResponse;

public class GetClientSupplierResponse extends GetSingleEntityResponse {

    public ClientSupplierC getClientSupplierC() {
        return (ClientSupplierC) getEntity();
    }

    public void setClientSupplierC(ClientSupplierC clientSupplierC) {
        setEntity(clientSupplierC);
    }
}