package com.numhero.client.util;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Provides;
import com.numhero.client.service.DataService;
import com.numhero.client.service.DataServiceAsync;

public class ApplicationModule extends AbstractGinModule {
    @Override
    protected void configure() {
    }

    @Provides
    DataServiceAsync getDataService() {
        DataServiceAsync asyncService = (DataServiceAsync) GWT.create(DataService.class);
        return asyncService;
    }
}
