package com.numhero.server.command;

import java.util.List;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.product.ProductListResponse;
import com.numhero.client.model.pojoc.ProductC;
import com.numhero.server.convert.ProductConverter;
import com.numhero.server.model.dao.ProductDao;
import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.Product;
import com.numhero.shared.datacargo.SearcheableListCommandRequest;
import com.numhero.shared.enums.ProductTypeEnum;

public abstract class AbstractCommandGetItems<REQUEST extends SearcheableListCommandRequest> extends AbstractAuthenticatedCommand<REQUEST, ProductListResponse> {

	@Inject
	ProductDao			productDao;

	@Inject
	ProductConverter	productConverter;

	protected ProductListResponse execute(REQUEST request, ProductTypeEnum type) {
		ProductListResponse response = new ProductListResponse();
		List<Product> Products;
		if (request.getSuggestString() != null && !request.getSuggestString().isEmpty()) {
			Products = productDao.searchForStartsWith(
					request.getSuggestString(),
					request.getMaxResults(),
					request.getBusinessAccountId());
		} else if (request.getSearchString() != null && !request.getSearchString().isEmpty()) {
			Products = productDao.search(
					request.getSearchString(),
					request.getBusinessAccountId(),
					JDOFilters.eq("type", JDOFilters.quote(type.name())));
		} else {
			Products = productDao.findAllByType(
					request.getBusinessAccountId(),
					type);
		}
		for (Product cs : Products) {
			ProductC csC = productConverter.toProductC(cs);
			response.getProductCList().add(csC);
		}
		return response;
	}
}
