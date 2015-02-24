package com.numhero.client.mvp;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.events.EventManager;
import com.numhero.client.place.PlaceRequestEvent;
import com.numhero.client.place.PlaceRequestHandler;
import com.numhero.client.place.RestUrl;

import java.util.List;

public abstract class BasePresenter {

    private Widget view;

    private RestUrl url;

    private class MyPlaceRequestHandler implements PlaceRequestHandler {

        public void onPlaceRequest(PlaceRequestEvent event) {
            RestUrl newPlace = event.getUrl();
            if (newPlace.getPresenter().equals(getPresenterUrl())) {
                doActivation(newPlace);
                return;
            }
        }
    }

    protected abstract String getPresenterUrl();

    protected EventManager eventManager;

    private List<HandlerRegistration> handlerRegistrations = new java.util.ArrayList<HandlerRegistration>();

    public BasePresenter(EventManager eventManager, Widget view) {
        this.eventManager = eventManager;
        this.view = view;
        assert view != null;
        doBind();
    }

    protected void doBind() {
        onBind();
        if (getPresenterUrl() != null) {
            registerHandler(eventManager.addHandler(PlaceRequestEvent.TYPE, new MyPlaceRequestHandler()));
        }
    }

    protected void registerHandler(HandlerRegistration handlerRegistration) {
        handlerRegistrations.add(handlerRegistration);
    }

    public RestUrl getUrl() {
        return url;
    }

    public Widget getView() {
        return view;
    }

    public void doActivation() {
        doActivation(null);
    }

    public void doActivation(RestUrl newUrl) {
        url = newUrl;

        RootPanel.get("wrapper").clear();
        RootPanel.get("wrapper").add(getView());

        onShow();
    }


    protected void onShow() {
    }


    /**
     * This method is called when binding the presenter. Any additional bindings
     * should be done here.
     */
    protected void onBind() {
    }

    /**
     * This method is called when unbinding the presenter. Any handler
     * registrations recorded with {@link #registerHandler(HandlerRegistration)}
     * will have already been removed at this point.
     */
    protected void onUnbind() {
    }
}
