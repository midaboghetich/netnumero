package com.numhero.client.mvp;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.widget.Footer;
import com.numhero.client.widget.HeaderPanel;
import com.numhero.client.widget.TabBar.INumheroTab;

public abstract class TabbedPage extends Composite {

    private static TabbedPageUiBinder uiBinder = GWT.create(TabbedPageUiBinder.class);

    interface TabbedPageUiBinder extends UiBinder<Widget, TabbedPage> {
    }

    @UiField
    protected HeaderPanel headerPanel;

    @UiField
    protected Footer footerPanel;

    @UiField
    protected AbsolutePanel contentPanel;

    public TabbedPage() {
        initWidget(uiBinder.createAndBindUi(this));

    }

    public abstract INumheroTab getCurrentTab();

    public void setActiveTab(INumheroTab tab) {
        this.headerPanel.getTabBar().setActiveTab(tab);
    }

    public abstract Widget getContent();

    protected void init() {
        contentPanel.add(getContent());
        setActiveTab(getCurrentTab());
    }

}
