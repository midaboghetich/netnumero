package com.numhero.server.model.dao;

import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.ClientSupplier;
import com.numhero.shared.enums.ClientSupplierEnum;

import java.util.List;

public class ClientSupplierDao extends BaseSearchableDao<ClientSupplier> {

    public List<ClientSupplier> findAllByType(String businessAccountId, ClientSupplierEnum type) {
        return findByCriteria(businessAccountId, JDOFilters.eq("partnerType", JDOFilters.quote(type.name())));
    }

    public ClientSupplier getByBusinessAccount(String businessAccountId) {
        ClientSupplier ba = getFirstElement(findByCriteria(businessAccountId));
        return ba;
    }
}
