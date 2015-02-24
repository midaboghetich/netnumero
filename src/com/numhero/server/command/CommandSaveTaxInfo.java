package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoRequest;
import com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoResponse;
import com.numhero.client.model.pojoc.TaxInfoC;
import com.numhero.server.convert.TaxInfoConverter;
import com.numhero.server.model.dao.TaxInfoDao;
import com.numhero.server.model.pojo.TaxInfo;
import com.numhero.server.utils.DaoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandSaveTaxInfo extends AbstractAuthenticatedCommand<SaveTaxInfoRequest, SaveTaxInfoResponse> {
    @SuppressWarnings("unused")
    private static Log log = LogFactory.getLog(CommandSaveTaxInfo.class);

    @Inject
    TaxInfoDao taxInfoDao;
    @Inject
    TaxInfoConverter taxInfoConverter;

    @Override
    public SaveTaxInfoResponse execute(SaveTaxInfoRequest request) {
        TaxInfo taxInfo = null;

        TaxInfoC taxInfoC = request.getTaxInfoC();
        String id = taxInfoC.getId();
        if (id == null || id.isEmpty()) {
            taxInfo = new TaxInfo();
        } else {
            taxInfo = taxInfoDao.get(id);
        }

        // validate
        taxInfoConverter.mergeIntoTaxInfo(taxInfoC, taxInfo);
//        taxInfo.setBusinessAccountId(request.getBusinessAccountId());
        DaoUtils.setData(request, taxInfo);
        taxInfoDao.save(taxInfo);

        // createAudit
        SaveTaxInfoResponse response = new SaveTaxInfoResponse();
        response.setEntityId(taxInfo.getId());
        return response;
    }
}
