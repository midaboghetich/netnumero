package com.numhero.server.command;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.taxinfo.TaxInfoListRequest;
import com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse;
import com.numhero.client.model.pojoc.TaxInfoC;
import com.numhero.server.convert.TaxInfoConverter;
import com.numhero.server.model.dao.TaxInfoDao;
import com.numhero.server.model.pojo.TaxInfo;

public class CommandGetTaxInfos extends AbstractAuthenticatedCommand<TaxInfoListRequest, TaxInfoListResponse> {

    private static Log log = LogFactory.getLog(CommandGetTaxInfos.class);

    @Inject
    TaxInfoDao taxInfoDao;

    @Inject
    TaxInfoConverter taxInfoConverter;

    @Override
    public TaxInfoListResponse execute(TaxInfoListRequest request) {
        TaxInfoListResponse response = new TaxInfoListResponse();

        List<TaxInfo> taxInfos;
		if (request.getSuggestString() != null && !request.getSuggestString().isEmpty()) {
			taxInfos = taxInfoDao.searchForStartsWith(
					request.getSuggestString(),
					request.getMaxResults(),
					request.getBusinessAccountId());
		} else if (request.getSearchString() != null && !request.getSearchString().isEmpty()) {
			taxInfos = taxInfoDao.search(
					request.getSearchString(),
					request.getBusinessAccountId());
		} else {
			taxInfos = taxInfoDao.findAll(request.getBusinessAccountId());
		}
        for (TaxInfo taxInfo : taxInfos) {
            TaxInfoC taxInfoC = taxInfoConverter.toTaxInfoC(taxInfo);
            response.getTaxInfoListC().add(taxInfoC);
        }
        log.debug("retrieved " + response.getTaxInfoListC());

        return response;
    }
}
