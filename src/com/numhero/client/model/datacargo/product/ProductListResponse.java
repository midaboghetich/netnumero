package com.numhero.client.model.datacargo.product;

import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.client.model.pojoc.ProductC;
import com.numhero.shared.datacargo.SuggestCommandResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductListResponse extends SuggestCommandResponse {
    private ArrayList<ProductC> productCList = new ArrayList<ProductC>();

    public List<ProductC> getProductCList() {
        return productCList;
    }

    public Collection<? extends Suggestion> getSuggestions() {
        return productCList;
    }
}
