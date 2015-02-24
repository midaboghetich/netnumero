package com.numhero.client.model.pojoc;

import com.numhero.shared.enums.ServiceUnitEnum;
import com.numhero.shared.pojoc.BasePojoC;

public class ServiceC extends BasePojoC {

    private static final String SERVICE_UNIT = "serviceUnitType";
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";
    private static final String UNIT_COST = "unitCost";
    private static final String UNIT_PRICE = "unitPrice";
    private static final String COMPANY_ID = "companyId";

    public ServiceC() {
    }

    public ServiceC(String id) {
        setId(id);
    }

    public ServiceUnitEnum getServiceUnitType() {
        String type = getAttributeAsString(SERVICE_UNIT);
        return type == null ? null : ServiceUnitEnum.valueOf(type);
    }

    public void setServiceUnitType(ServiceUnitEnum serviceUnitType) {
        if (serviceUnitType != null) {
            setAttribute(SERVICE_UNIT, serviceUnitType.name());
        }
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

    public Double getUnitCost() {
        return getAttributeAsDouble(UNIT_COST);
    }

    public void setUnitCost(Double unitCost) {
        setAttribute(UNIT_COST, unitCost);
    }

    public Double getUnitPrice() {
        return getAttributeAsDouble(UNIT_PRICE);
    }

    public void setUnitPrice(Double unitPrice) {
        setAttribute(UNIT_PRICE, unitPrice);
    }

    public String getCompanyId() {
        return getAttributeAsString(COMPANY_ID);
    }

    public void setCompanyId(String companyId) {
        setAttribute(COMPANY_ID, companyId);
    }
}