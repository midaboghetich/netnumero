package com.numhero.client.mvp.settings;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.mvp.TabbedPage;
import com.numhero.client.util.CoreUtils;
import com.numhero.client.widget.TabBar;

public class SettingsView extends TabbedPage {

    private SettingsPanel settingsPanel;

    public SettingsView() {
        CoreUtils.debug("SettingsView.SettingsView");
        init();
    }

    @Override
    public TabBar.INumheroTab getCurrentTab() {
        return TabBar.INumheroTab.dashboard;
    }

    @Override
    public Widget getContent() {
        return getSettingsPanel();
    }

    public SettingsPanel getSettingsPanel() {
        if (settingsPanel == null) {
            settingsPanel = new SettingsPanel();
        }
        return settingsPanel;
    }

}

