package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.Widget;

public class NetNumeroButton extends Composite implements HasClickHandlers, HasHTML {

    private static NetNumeroButtonUiBinder uiBinder = GWT.create(NetNumeroButtonUiBinder.class);

    interface NetNumeroButtonUiBinder extends UiBinder<Widget, NetNumeroButton> {
    }

    @UiField
    Anchor anchor;

    public NetNumeroButton() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public NetNumeroButton(String label) {
        this();
        this.anchor.setText(label);
    }

    public void setText(String label) {
        anchor.setText(label);
    }

    public void setHref(String href) {
        anchor.setHref(href);
    }

    @Override
    public HandlerRegistration addClickHandler(ClickHandler handler) {
        return anchor.addClickHandler(handler);
    }

    @Override
    public String getHTML() {
        return this.anchor.getHTML();
    }

    @Override
    public void setHTML(String html) {
        this.anchor.setHTML(html);
    }

    @Override
    public String getText() {
        return this.anchor.getText();
    }
}
