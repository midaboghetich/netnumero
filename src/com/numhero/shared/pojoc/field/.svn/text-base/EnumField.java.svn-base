package com.numhero.shared.pojoc.field;

public class EnumField<T extends Enum> extends PojoCField<T> {

    private Enum defaultValue;

    public EnumField() {
        defaultValue = null;
    }

    public Class<? extends Enum> getEnumClass() {
        return defaultValue.getClass();
    }

    @Override
    public void setValueAsString(String value) {
        if (value == null) {
            setValue(null);
        } else {
            T a = (T) Enum.valueOf(getEnumClass(),value);
            setValue(a);
        }
    }

    public void setDefaultValue(Enum defaultValue) {
        this.defaultValue = defaultValue;
    }

    

}
