package com.numhero.client.mvp;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.Application;
import com.numhero.client.widget.TabBar.INumheroTab;
import com.numhero.client.widget.panelsubmenu.TimeSubmenuPanel;

public class GenericTimeTabPage extends AbstractPage {

    public GenericTimeTabPage(Widget widget) {
        contentPanel.setContentWidget(widget);
        setSubmenu(new TimeSubmenuPanel());
        init();
    }

    @Override
    protected String getPageTitle() {
        return Application.getConstants().time();
    }

    @Override
    public INumheroTab getCurrentTab() {
        return INumheroTab.time;
    }
}
