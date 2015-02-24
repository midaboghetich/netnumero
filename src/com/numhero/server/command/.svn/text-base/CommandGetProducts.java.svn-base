package com.numhero.server.command;

import com.numhero.client.model.datacargo.product.ProductListRequest;
import com.numhero.client.model.datacargo.product.ProductListResponse;
import com.numhero.shared.enums.ProductTypeEnum;

public class CommandGetProducts extends AbstractCommandGetItems<ProductListRequest> {
	@Override
	public ProductListResponse execute(ProductListRequest request) {
		return execute(request, ProductTypeEnum.product);
	}
}
