package com.numhero.client.mvp.task;

import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.numhero.client.mvp.TabbedPage;
import com.numhero.client.widget.TabBar;
import com.numhero.client.widget.TabBar.INumheroTab;

public class TaskView extends TabbedPage {

    TaskPanel taskPanel;

    @Inject
    public TaskView(TaskPanel taskPanel) {
        this.taskPanel = taskPanel;
        init();
    }

    @Override
    public INumheroTab getCurrentTab() {
        return TabBar.INumheroTab.time;
    }

    @Override
    public Widget getContent() {
        return taskPanel;
    }

    public TaskPanel getTaskPanel() {
        return taskPanel;
    }
}
