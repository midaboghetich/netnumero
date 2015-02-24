package com.numhero.server.utils;

public class StringUtils {

    public static int strToIntDef(String strValue, int defValue) {

        Integer r = null;
        try {
            r = Integer.valueOf(strValue);
        } catch (NumberFormatException e) {
            return defValue;
        }
        return r;

    }

    public static Enum strToEnumDef(String strValue, Enum defValue) {
        Enum ret = null;
        try {
            ret = Enum.valueOf(defValue.getClass(), strValue);
        } catch (Exception e) {
            return defValue;
        }
        return ret;

    }

}

