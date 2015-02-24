package com.numhero.server.model.dao;

import com.google.inject.Singleton;
import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.Staff;
import com.numhero.shared.enums.StaffTypeEnum;

import java.util.List;

@Singleton
public class StaffDao extends BaseSearchableDao<Staff> {

    public List<Staff> findAllByType(String businessAccountId, StaffTypeEnum type) {
        return findByCriteria(businessAccountId, JDOFilters.eq("type", JDOFilters.quote(type.name())));
    }

}
