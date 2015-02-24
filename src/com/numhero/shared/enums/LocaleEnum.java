package com.numhero.shared.enums;

public enum LocaleEnum {

    en("English"),
    it("Italian"),
    ja("Japanese");

    private String value;

    LocaleEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return value;
    }

    public static LocaleEnum getByValue(String value) {
        LocaleEnum[] a = LocaleEnum.values();
        for (int i = 0; i < a.length; i++) {
            LocaleEnum e = a[i];
            if (e.value.equalsIgnoreCase(value)) {
                return e;
            }
        }
        return null;
    }
}