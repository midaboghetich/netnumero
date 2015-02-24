package com.numhero.server.model.dao;

import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.Invoice;
import com.numhero.shared.enums.InvoiceTypeEnum;

import java.util.List;

public class InvoiceDao extends BaseSearchableDao<Invoice> {
	public List<Invoice> findByType(String businessAccountId, InvoiceTypeEnum invoiceType) {
		return findByCriteria(businessAccountId, JDOFilters.eq("invoiceType", JDOFilters.quote(invoiceType.name())));
	}
}
