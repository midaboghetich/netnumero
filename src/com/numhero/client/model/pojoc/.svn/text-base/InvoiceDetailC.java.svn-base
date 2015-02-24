package com.numhero.client.model.pojoc;

import com.numhero.shared.pojoc.BasePojoC;

import java.util.ArrayList;
import java.util.List;

public class InvoiceDetailC extends BasePojoC {
    public static final String PRODUCT_ID = "productId";
    public static final String SERVICE_ID = "serviceId";
    public static final String NAME = "name";
    public static final String DESCRIPTION = "description";
    public static final String QUANTITY = "quantity";
    public static final String PRICE = "price";

    private List<TaxInfoC> taxes = new ArrayList<TaxInfoC>();

    public InvoiceDetailC() {
        init();
    }

    public void init() {
        setPrice(0D);
        setQuantity(1D);
    }

    public String getProductId() {
        return getAttributeAsString(PRODUCT_ID);
    }

    public void setProductId(String productId) {
        setAttribute(PRODUCT_ID, productId);
    }

    public String getServiceId() {
        return getAttributeAsString(SERVICE_ID);
    }

    public void setServiceId(String serviceId) {
        setAttribute(SERVICE_ID, serviceId);
    }

    public String getName() {
        return getAttributeAsString(NAME);
    }

    public void setName(String name) {
        setAttribute(NAME, name);
    }

    public String getDescription() {
        return getAttributeAsString(DESCRIPTION);
    }

    public void setDescription(String description) {
        setAttribute(DESCRIPTION, description);
    }

    public Double getQuantity() {
        return getAttributeAsDouble(QUANTITY);
    }

    public void setQuantity(Double quantity) {
        setAttribute(QUANTITY, quantity);
    }

    public Double getPrice() {
        return getAttributeAsDouble(PRICE);
    }

    public void setPrice(Double price) {
        setAttribute(PRICE, price);
    }

    public List<TaxInfoC> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<TaxInfoC> taxes) {
        this.taxes = taxes;
    }

    public void addTax(TaxInfoC taxInfo) {
        taxes.add(taxInfo);
    }

    public void setTax(TaxInfoC taxInfo, int index) {
        while (index >= taxes.size()) {
            taxes.add(new TaxInfoC());
        }
        taxes.set(index, taxInfo);
    }

    public void deleteTax(TaxInfoC taxInfo) {
        taxes.remove(taxInfo);
    }
}
