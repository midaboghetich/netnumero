package com.numhero.client.mvp.timeentry;

import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.numhero.client.mvp.TabbedPage;
import com.numhero.client.widget.TabBar.INumheroTab;

public class TimeEntryView extends TabbedPage {

    TimeEntryPanel timeEntryPanel;

    @Inject
    public TimeEntryView(TimeEntryPanel timeEntryPanel) {
        this.timeEntryPanel = timeEntryPanel;
        init();
    }

    @Override
    public INumheroTab getCurrentTab() {
        return INumheroTab.time;
    }

    @Override
    public Widget getContent() {
        return timeEntryPanel;
    }

    public TimeEntryPanel getTimeEntryPanel() {
        return timeEntryPanel;
    }
}