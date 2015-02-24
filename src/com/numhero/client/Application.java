package com.numhero.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.numhero.client.place.PlaceManager;
import com.numhero.client.util.ApplicationInjector;

public class Application implements EntryPoint {
    public static ApplicationInjector injector = GWT.create(ApplicationInjector.class);

    private static LocalizableConstants constants = GWT.create(LocalizableConstants.class);
    private static LocalizableMessages messages = GWT.create(LocalizableMessages.class);

    private PlaceManager placeManager;

    public void onModuleLoad() {

        injector.getApplicationController();

        placeManager = injector.getPlaceManager();
        placeManager.fireCurrentPlace();

        //TODO fill context for first time
    }

    public static LocalizableConstants getConstants() {
        return constants;
    }

    public static LocalizableMessages getMessages() {
        return messages;
    }
}
