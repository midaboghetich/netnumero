package com.numhero.client.mvp;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.Application;
import com.numhero.client.widget.TabBar.INumheroTab;
import com.numhero.client.widget.panelsubmenu.StaffSubmenuPanel;

public class GenericStaffTabPage extends AbstractPage {

    public GenericStaffTabPage(Widget widget) {
        contentPanel.setContentWidget(widget);
        setSubmenu(new StaffSubmenuPanel());
        init();
    }

    @Override
    protected String getPageTitle() {
        return Application.getConstants().staff();
    }

    @Override
    public INumheroTab getCurrentTab() {
        return INumheroTab.staff;
    }
}
