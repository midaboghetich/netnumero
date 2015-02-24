package com.numhero.server.model.pojo;

import com.numhero.server.search.IsSearchable;
import com.numhero.shared.enums.CurrencyEnum;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class TaxInfo extends Searchable implements Serializable {
    private static final long serialVersionUID = 587722857875200357L;

    @Persistent
    @IsSearchable(byStartWith = true)
    private String name;

    @Persistent
    private Double percent;

    @Persistent
    private Double value;

    @Persistent
    private CurrencyEnum currency;

    public TaxInfo() {
    }

    public TaxInfo(String name, Double percent, Double value) {
        this.name = name;
        this.percent = percent;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public boolean isValue() {
        return value != null && value != 0;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }
}
