package com.numhero.server.model.dao.filter;


public class JDOFilters {
    private JDOFilters() {
    }

    public static IJDOFilter eq(String name, Object value) {
        return new SimpleJDOFilter(name, "==", value.toString());
    }

    public static IJDOFilter ne(String name, Object value) {
        return new SimpleJDOFilter(name, "!=", value.toString());
    }

    public static IJDOFilter ls(String name, Object value) {
        return new SimpleJDOFilter(name, "<", value.toString());
    }

    public static IJDOFilter le(String name, Object value) {
        return new SimpleJDOFilter(name, "<=", value.toString());
    }

    public static IJDOFilter gt(String name, Object value) {
        return new SimpleJDOFilter(name, ">", value.toString());
    }

    public static IJDOFilter ge(String name, Object value) {
        return new SimpleJDOFilter(name, ">=", value.toString());
    }

    public static IJDOFilter and(IJDOFilter... filters) {
        return new LogicalJDOFilter("&&", filters);
    }

    public static IJDOFilter or(IJDOFilter... filters) {
        return new LogicalJDOFilter("||", filters);
    }

    public static IJDOFilter[] createArray(IJDOFilter[] f1, IJDOFilter... f2) {
    	IJDOFilter[] ret = new IJDOFilter[f1.length + f2.length];
        System.arraycopy(f1, 0, ret, 0, f1.length);
        System.arraycopy(f2, 0, ret, f1.length, f2.length);
    	return ret;
    }

    public static String quote(String value) {
    	return "'" + value + "'";
    }
}
