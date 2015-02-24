package com.numhero.client.mvp;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.events.EventManager;


public abstract class EditPresenter extends BasePresenter {

    public EditPresenter(EventManager eventManager, Widget view) {
        super(eventManager, view);
    }
}
