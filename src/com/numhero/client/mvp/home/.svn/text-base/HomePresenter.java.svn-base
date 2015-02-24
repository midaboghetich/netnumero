package com.numhero.client.mvp.home;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.events.EventManager;
import com.numhero.client.mvp.InfoPresenter;

@Singleton
public class HomePresenter extends InfoPresenter {
    @Inject
    public HomePresenter(EventManager eventManager, HomeView view) {
        super(eventManager, view);
    }

    @Override
    protected String getPresenterUrl() {
        return "dashboard";
    }
}
