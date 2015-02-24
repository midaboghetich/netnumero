package com.numhero.client.mvp;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.Application;
import com.numhero.client.widget.TabBar.INumheroTab;

public class GenericAccountsTabPage extends AbstractPage {

    public GenericAccountsTabPage(Widget widget) {
        contentPanel.setContentWidget(widget);
        init();
    }

    @Override
    protected String getPageTitle() {
        return Application.getConstants().accounts();
    }

    @Override
    public INumheroTab getCurrentTab() {
        return INumheroTab.accounts;
    }
}
