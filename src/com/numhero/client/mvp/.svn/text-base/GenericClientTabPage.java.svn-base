package com.numhero.client.mvp;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.Application;
import com.numhero.client.widget.TabBar.INumheroTab;
import com.numhero.client.widget.panelsubmenu.ClientsSubmenuPanel;

public class GenericClientTabPage extends AbstractPage {

    public GenericClientTabPage(Widget widget) {
        contentPanel.setContentWidget(widget);
        setSubmenu(new ClientsSubmenuPanel());
        init();
    }

    @Override
    protected String getPageTitle() {
        return Application.getConstants().clients();
    }

    @Override
    public INumheroTab getCurrentTab() {
        return INumheroTab.clients;
    }
}
