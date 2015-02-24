package com.numhero.client.place;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.events.EventManager;

@Singleton
public class PlaceManager implements ValueChangeHandler<String>, PlaceChangedHandler, PlaceRequestHandler {
	private final EventManager	eventManager;
	public static final String	HOME	= "dashboard";

	@Inject
	public PlaceManager(EventManager eventManager) {
		this.eventManager = eventManager;

		// Register ourselves with the History API.
		History.addValueChangeHandler(this);

		// Listen for manual place change events.
		eventManager.addHandler(PlaceChangedEvent.TYPE, this);
	}

	public void onValueChange(ValueChangeEvent<String> event) {
		eventManager.fireEvent(new PlaceRequestEvent(new RestUrl(event.getValue()), true));
	}

	public void onPlaceChange(PlaceChangedEvent event) {
		newPlace(event.getUrl());
	}

	private void newPlace(RestUrl url) {
		History.newItem(url.toString(), true);
	}

	public void onPlaceRequest(PlaceRequestEvent event) {
		if (!event.isFromHistory()) {
			newPlace(event.getUrl());
		}
	}

	public void fireCurrentPlace() {
		if (History.getToken().isEmpty()) {
			moveToPlace(HOME);
		} else {
			History.fireCurrentHistoryState();
		}
	}

	public void moveToPlace(String place) {
		PlaceChangedEvent placeChangedEvent = new PlaceChangedEvent(new RestUrl(place));
		eventManager.fireEvent(placeChangedEvent);
	}
}
