package com.numhero.shared.util;

import java.util.Date;

public class SharedUtils {

    public static String[] splitUri(String uri) {
        int ei = uri.indexOf('#');
        String server;
        if (ei > 1) {
            server = uri.substring(0, ei);
        } else {
            server = uri;
        }
        String[] p = server.split("/");
        return p;
    }

    public static String initialUppercase(String s) {

		if (s == null || s.length() == 0)
			return "";
		else if (s.length() == 1)
			return s.toUpperCase();
		else
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }

	public static String initialUppercaseAndCamel(String str) {
		String newStr = "";
		if(str != null && str.indexOf("_") > -1) {
			String[] ls = str.split("_");

			for (String s : ls) {
				newStr += initialUppercase(s);

			}

		} else {
			newStr = initialUppercase(str);
		}

		return newStr;
	}

    public static Date strToDate(String value) {
        if (value == null)
            return null;
        try {
            return new Date(value);
        } catch (Exception e) {
            return null;
        }

    }

    public static Double strToDouble(String value) {
        if (value == null)
            return null;
        try {
            return new Double(value);
        } catch (Exception e) {
            return null;
        }

    }

    public static Integer strToInteger(String value) {
        if (value == null)
            return null;
        try {
            return new Integer(value);
        } catch (Exception e) {
            return null;
        }

    }

    public static Boolean strToBoolean(String value) {
        if (value == null)
            return null;
        try {
            return new Boolean(value);
        } catch (Exception e) {
            return null;
        }

    }

}
