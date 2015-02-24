package com.numhero.client.mvp.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.Application;
import com.numhero.client.widget.MoneyinTitlePanel;

public class MoneyinPanel extends Composite {

    private static MoneyinPanelUiBinder uiBinder = GWT.create(MoneyinPanelUiBinder.class);

    interface MoneyinPanelUiBinder extends UiBinder<Widget, MoneyinPanel> {
    }

    @UiField
    MoneyinTitlePanel titlePanel;

    public MoneyinPanel() {
        initWidget(uiBinder.createAndBindUi(this));
        titlePanel.setPanelTitle(Application.getConstants().moneyIn());
        titlePanel.setButtonText(Application.getConstants().createAnInvoice());
        titlePanel.setButtonHref("#invoice");
    }
}
