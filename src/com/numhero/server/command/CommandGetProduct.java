package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.product.GetProductRequest;
import com.numhero.client.model.datacargo.product.GetProductResponse;
import com.numhero.client.model.pojoc.ProductC;
import com.numhero.server.convert.ProductConverter;
import com.numhero.server.model.dao.ProductDao;
import com.numhero.server.model.pojo.Product;

public class CommandGetProduct extends AbstractAuthenticatedCommand<GetProductRequest, GetProductResponse> {

	@Inject
	ProductDao			productDao;

	@Inject
	ProductConverter	productConverter;

	@Override
	public GetProductResponse execute(GetProductRequest request) throws Exception {
		GetProductResponse response = new GetProductResponse();

		Product product = productDao.get(request.getEntityId());
		ProductC productC = productConverter.toProductC(product);
		response.setProductC(productC);

		return response;
	}
}
