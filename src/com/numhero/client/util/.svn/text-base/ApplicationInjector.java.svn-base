package com.numhero.client.util;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.numhero.client.ClientContext;
import com.numhero.client.mvp.ApplicationController;
import com.numhero.client.place.PlaceManager;

@GinModules(com.numhero.client.util.ApplicationModule.class)
public interface ApplicationInjector extends Ginjector {

    ClientContext getContext();

    ApplicationController getApplicationController();

    PlaceManager getPlaceManager();
}
