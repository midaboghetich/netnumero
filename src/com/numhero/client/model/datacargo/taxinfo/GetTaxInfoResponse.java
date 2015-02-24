package com.numhero.client.model.datacargo.taxinfo;

import com.numhero.client.model.pojoc.TaxInfoC;
import com.numhero.shared.datacargo.GetSingleEntityResponse;

public class GetTaxInfoResponse extends GetSingleEntityResponse {

    public TaxInfoC getTaxInfoC() {
        return (TaxInfoC) getEntity();
    }

    public void setTaxInfoC(TaxInfoC taxInfoC) {
        setEntity(taxInfoC);
    }
}