package com.numhero.client.mvp;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.events.EventManager;

public abstract class InfoPresenter extends BasePresenter {

    public InfoPresenter(EventManager eventManager, Widget view) {
        super(eventManager, view);
    }
}
