package com.numhero.client.util;

import com.numhero.client.Application;
import com.numhero.shared.pojoc.BasePojoC;

import static com.numhero.shared.util.SharedUtils.splitUri;

public class ClientUtils {

    public static String getCompanyNameFromUri(String uri) {
        String[] p = splitUri(uri);

        if (p.length != 3) {
            Log.debug("Error in uri. Wrong number of elements should be 3 but it's " + p.length);
            return null;
        } else if (!p[1].equals("company")) {
            Log.debug("Wrong uri. This should be 'company' " + p[1]);
            return null;
        } else {
            return p[2];
        }
    }

    public static String getTitleOfOperation(BasePojoC pojoC) {
		String title;
		if (pojoC.getId() == null) {
			title = Application.getConstants().newAction();
		} else {
			title = Application.getConstants().editAction();
		}
		return title;
    }
}
