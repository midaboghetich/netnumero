package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MoneyinTitlePanel extends Composite {

    private static MoneyinTitlePanelUiBinder uiBinder = GWT.create(MoneyinTitlePanelUiBinder.class);

    interface MoneyinTitlePanelUiBinder extends UiBinder<Widget, MoneyinTitlePanel> {
    }

    @UiField
    NetNumeroButton btRightButton;

    @UiField
    TitleLevelOne txTitle;

    public MoneyinTitlePanel() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public void setPanelTitle(String title) {
        txTitle.setText(title);
    }

    public void setButtonText(String buttonText) {
        btRightButton.setText(buttonText);
    }

    public void setButtonHref(String buttonHref) {
        btRightButton.setHref(buttonHref);
    }
}
