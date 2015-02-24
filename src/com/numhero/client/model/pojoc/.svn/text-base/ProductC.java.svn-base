package com.numhero.client.model.pojoc;

import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.shared.enums.CurrencyEnum;
import com.numhero.shared.enums.ProductTypeEnum;
import com.numhero.shared.enums.ServiceUnitEnum;
import com.numhero.shared.pojoc.BasePojoC;

public class ProductC extends BasePojoC implements Suggestion {

    private static final String PRODUCT_TYPE = "productType";
    private static final String SERVICE_UNIT = "serviceUnitType";
    private static final String CATEGORY_ID = "categoryId";
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";
    private static final String CURRENCY = "currency";
    private static final String UNIT_PRICE = "unitPrice";
    private static final String TRACKING_ENABLED = "trackingEnabled";
    private static final String QUANTITY = "quantity";
    private static final String COMPANY_ID = "companyId";

    public ProductC() {
        init();
    }

    public void init() {
        setName(null);
        setDescription(null);
        setCurrency(CurrencyEnum.EUR);
        setServiceUnit(ServiceUnitEnum.Hour);
        setUnitPrice(0d);
        setQuantity(0d);
        setTrackingEnabled(false);
    }

    public ProductTypeEnum getProductType() {
        String productType = getAttributeAsString(PRODUCT_TYPE);
        return productType == null ? null : ProductTypeEnum.valueOf(productType);
    }

    public void setProductType(ProductTypeEnum productType) {
        if (productType != null) {
            setAttribute(PRODUCT_TYPE, productType.name());
        }
    }

    public CurrencyEnum getCurrency() {
        String currency = getAttributeAsString(CURRENCY);
        return currency == null ? null : CurrencyEnum.valueOf(currency);
    }

    public void setCurrency(CurrencyEnum currency) {
        if (currency != null) {
            setAttribute(CURRENCY, currency.name());
        }
    }

    public ServiceUnitEnum getServiceUnit() {
        String serviceUnit = getAttributeAsString(SERVICE_UNIT);
        return serviceUnit == null ? null : ServiceUnitEnum.valueOf(serviceUnit);
    }

    public void setServiceUnit(ServiceUnitEnum serviceUnit) {
        if (serviceUnit != null) {
            setAttribute(SERVICE_UNIT, serviceUnit.name());
        }
    }

    public String getCategoryId() {
        return getAttributeAsString(CATEGORY_ID);
    }

    public void setCategoryId(String categoryId) {
        setAttribute(CATEGORY_ID, categoryId);
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

    public Double getUnitPrice() {
        return getAttributeAsDouble(UNIT_PRICE);
    }

    public void setUnitPrice(Double unitPrice) {
        setAttribute(UNIT_PRICE, unitPrice);
    }

    public Boolean isTrackingEnabled() {
        return getAttributeAsBoolean(TRACKING_ENABLED);
    }

    public void setTrackingEnabled(Boolean trackingEnabled) {
        setAttribute(TRACKING_ENABLED, trackingEnabled);
    }

    public Double getQuantity() {
        return getAttributeAsDouble(QUANTITY);
    }

    public void setQuantity(Double quantity) {
        setAttribute(QUANTITY, quantity);
    }

    public String getCompanyId() {
        return getAttributeAsString(COMPANY_ID);
    }

    public void setCompanyId(String companyId) {
        setAttribute(COMPANY_ID, companyId);
    }

    public String getDisplayString() {
        return getName();
    }

    public String getReplacementString() {
        return getName();
    }
}
