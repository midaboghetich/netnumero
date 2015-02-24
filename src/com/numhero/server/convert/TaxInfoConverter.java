package com.numhero.server.convert;

import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.TaxInfoC;
import com.numhero.server.model.pojo.TaxInfo;

@Singleton
public class TaxInfoConverter {

    public void mergeIntoTaxInfo(TaxInfoC taxInfoC, TaxInfo taxInfo) {

        taxInfo.setId(taxInfoC.getId());
        taxInfo.setName(taxInfoC.getName());
        taxInfo.setPercent(taxInfoC.getPercent());
        taxInfo.setValue(taxInfoC.getValue());
        taxInfo.setCurrency(taxInfoC.getCurrency());
        taxInfo.setCreated(taxInfoC.getCreated());
    }

    public TaxInfoC toTaxInfoC(TaxInfo taxInfo) {

        TaxInfoC taxInfoC = new TaxInfoC();
        taxInfoC.setId(taxInfo.getId());
        taxInfoC.setName(taxInfo.getName());
        taxInfoC.setPercent(taxInfo.getPercent());
        taxInfoC.setValue(taxInfo.getValue());
        taxInfoC.setCurrency(taxInfo.getCurrency());
        taxInfoC.setCreated(taxInfo.getCreated());
        return taxInfoC;

    }
}
