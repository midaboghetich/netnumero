package com.numhero.client.model.datacargo.taxinfo;

import com.numhero.client.model.pojoc.TaxInfoC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveTaxInfoRequest  extends SaveSingleEntityRequest {

    public SaveTaxInfoRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveTaxInfo);
    }

    public TaxInfoC getTaxInfoC() {
        return (TaxInfoC) getEntity();
    }

    public void setTaxInfoC(TaxInfoC taxInfoC) {
        setEntity(taxInfoC);
    }
}
