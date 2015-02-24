package com.numhero.client.mvp.document;

import com.google.inject.Inject;
import com.numhero.client.events.EventManager;
import com.numhero.client.mvp.BasePresenter;

public class MoneyinPresenter extends BasePresenter {
    @Inject
    public MoneyinPresenter(EventManager eventManager, MoneyinView moneyInView) {
        super(eventManager, moneyInView);
    }

    @Override
    protected String getPresenterUrl() {
        return "moneyin";
    }

    @Override
    public MoneyinView getView() {
        return (MoneyinView) super.getView();
    }
}
