package com.numhero.client.util;

import java.util.HashMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;

public final class LocationUtils {

	public static void doLogout(String errorMessage) {
		String redirectUrl = "/blueprint/Authentication/Authentication.html";
		if (errorMessage != null) {
			redirectUrl += "?error=" + errorMessage;
		}
		setNeedToConfirmExit(false);
		redirect(redirectUrl);
	}

	public static native void setNeedToConfirmExit(boolean needToConfirmExit) /*-{
		$wnd.needToConfirmExit = needToConfirmExit;
	}-*/;

	public static void redirect(String url) {
		Window.Location.assign(URL.encode(url));
	}

	public static HashMap<String, String> parseParamString(String string) {
		String[] ray = string.split("&");
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < ray.length; i++) {
			GWT.log("ray[" + i + "]=" + ray[i], null);
			String[] substrRay = ray[i].split("=");
			if (substrRay.length >= 2)
				map.put(substrRay[0], substrRay[1]);
		}
		return map;
	}
}
