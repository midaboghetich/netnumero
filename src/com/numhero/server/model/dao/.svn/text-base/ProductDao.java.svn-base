package com.numhero.server.model.dao;

import java.util.List;

import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.Product;
import com.numhero.shared.enums.ProductTypeEnum;

public class ProductDao extends BaseSearchableDao<Product> {
	public List<Product> findAllByType(String businessAccountId, ProductTypeEnum type) {
		return findByCriteria(businessAccountId, JDOFilters.eq("type", JDOFilters.quote(type.name())));
	}
}
