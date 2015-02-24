package com.numhero.client.model.pojoc;

import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.shared.enums.CurrencyEnum;
import com.numhero.shared.pojoc.BasePojoC;

public class TaxInfoC extends BasePojoC implements Suggestion {

    private static final String NAME = "name";
    private static final String PERCENT = "percent";
    private static final String VALUE = "value";
    private static final String CURRENCY = "currency";

    public TaxInfoC() {
        init();
    }

    public void init() {
        setName(null);
        setPercent(0d);
        setValue(null);
    }

    public String getName() {
        return getAttributeAsString(NAME);
    }

    public void setName(String name) {
        setAttribute(NAME, name);
    }

    public Double getPercent() {
        return getAttributeAsDouble(PERCENT);
    }

    public void setPercent(Double percent) {
        setAttribute(PERCENT, percent);
    }

    public Double getValue() {
        return getAttributeAsDouble(VALUE);
    }

    public void setValue(Double value) {
        setAttribute(VALUE, value);
    }

    public boolean isPercent() {
        return getPercent() != null;
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

    public String getDisplayString() {
        return getName();
    }

    public String getReplacementString() {
        return getName();
    }
}
