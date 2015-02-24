package com.numhero.client.model.pojoc;

import com.numhero.shared.enums.LocaleEnum;
import com.numhero.shared.pojoc.BasePojoC;

public class SettingsC extends BasePojoC {

    private static final String LOCALE = "locale";

    public SettingsC() {
    }

    public LocaleEnum getLocale() {
        String type = getAttributeAsString(LOCALE);
        return type == null ? null : LocaleEnum.getByValue(type);
    }

    public void setLocale(LocaleEnum langiage) {
        if (langiage != null) {
            setAttribute(LOCALE, langiage.name());
        }
    }
}
