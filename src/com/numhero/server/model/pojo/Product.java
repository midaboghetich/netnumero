package com.numhero.server.model.pojo;

import com.numhero.server.search.IsSearchable;
import com.numhero.shared.enums.CurrencyEnum;
import com.numhero.shared.enums.ProductTypeEnum;
import com.numhero.shared.enums.ServiceUnitEnum;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class Product extends Searchable implements Serializable {
    private static final long serialVersionUID = 5456769940788488660L;

    @Persistent
    private ProductTypeEnum type;

    @Persistent
    private ServiceUnitEnum serviceUnit;

    @Persistent
    private String categoryId;

    @Persistent
    @IsSearchable(byStartWith = true)
    private String name;

    @Persistent
    @IsSearchable
    private String description;

    @Persistent
    private CurrencyEnum currency;

    @Persistent
    private Double unitPrice;

    @Persistent
    private Boolean trackingEnabled;

    @Persistent
    private Double quantity;

    public Product() {
    }

    public ProductTypeEnum getType() {
        return type;
    }

    public void setType(ProductTypeEnum type) {
        this.type = type;
    }

    public ServiceUnitEnum getServiceUnit() {
        return serviceUnit;
    }

    public void setServiceUnit(ServiceUnitEnum serviceUnit) {
        this.serviceUnit = serviceUnit;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Boolean getTrackingEnabled() {
        return trackingEnabled;
    }

    public void setTrackingEnabled(Boolean trackingEnabled) {
        this.trackingEnabled = trackingEnabled;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
