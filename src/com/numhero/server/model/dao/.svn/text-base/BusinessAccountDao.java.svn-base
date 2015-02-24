package com.numhero.server.model.dao;

import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.BusinessAccount;

public class BusinessAccountDao extends BaseDao<BusinessAccount> {

	public BusinessAccount getByName(String name) {
		return getFirstElement(findByCriteria(null, JDOFilters.eq("name", JDOFilters.quote(name))));
	}
}
