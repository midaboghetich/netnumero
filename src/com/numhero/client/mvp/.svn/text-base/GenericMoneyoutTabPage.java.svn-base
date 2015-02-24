package com.numhero.client.mvp;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.Application;
import com.numhero.client.widget.TabBar.INumheroTab;
import com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel;

public class GenericMoneyoutTabPage extends AbstractPage {
    public GenericMoneyoutTabPage(Widget widget) {
        contentPanel.setContentWidget(widget);
        setSubmenu(new MoneyoutSubmenuPanel());
        init();
    }

    @Override
    protected String getPageTitle() {
        return Application.getConstants().moneyOut();
    }

    @Override
    public INumheroTab getCurrentTab() {
        return INumheroTab.moneyout;
    }
}
