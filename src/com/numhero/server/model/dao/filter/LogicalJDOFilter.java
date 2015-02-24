package com.numhero.server.model.dao.filter;

public class LogicalJDOFilter implements IJDOFilter {
	private IJDOFilter[]	filters;
	private String			operator;

	LogicalJDOFilter(String operator, IJDOFilter... f) {
		this.operator = operator;
		this.filters = f;
	}

	public String toString() {
		StringBuffer ret = new StringBuffer();
		int i = 0;
		for (IJDOFilter filter : filters) {
			if (i == 0) {
				ret.append('(');
			} else {
				ret.append(' ');
				ret.append(operator);
                ret.append(' ');
			}
			ret.append(filter);
			i++;
		}
		ret.append(')');
		return ret.toString();
	}
}
