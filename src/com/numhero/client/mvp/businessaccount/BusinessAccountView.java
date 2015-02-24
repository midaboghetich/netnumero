package com.numhero.client.mvp.businessaccount;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.mvp.TabbedPage;
import com.numhero.client.widget.TabBar;

public class BusinessAccountView extends TabbedPage {

    private BusinessAccountPanel businessAccountPanel;

    public BusinessAccountView() {
        init();
    }

    @Override
    public TabBar.INumheroTab getCurrentTab() {
        return TabBar.INumheroTab.dashboard;
    }

    @Override
    public Widget getContent() {
        return getBusinessAccountPanel();
    }

    public BusinessAccountPanel getBusinessAccountPanel() {
        if (businessAccountPanel == null) {
            businessAccountPanel = new BusinessAccountPanel();
        }
        return businessAccountPanel;
    }

}
