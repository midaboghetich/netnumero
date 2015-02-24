package com.numhero.client.mvp;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.Application;
import com.numhero.client.widget.TabBar.INumheroTab;
import com.numhero.client.widget.panelsubmenu.MoneyinSubmenuPanel;

public class GenericMoneyinTabPage extends AbstractPage {

    public GenericMoneyinTabPage(Widget widget) {
        contentPanel.setContentWidget(widget);
        setSubmenu(new MoneyinSubmenuPanel());

        init();
    }

    @Override
    protected String getPageTitle() {
        return Application.getConstants().moneyIn();
    }

    @Override
    public INumheroTab getCurrentTab() {
        return INumheroTab.moneyin;
    }
}
