package com.numhero.client.mvp;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.widget.NetNumeroButton;

public abstract class AbstractPage extends TabbedPage {

    protected PageContentPanel contentPanel;
    protected NetNumeroButton rightButton;

    public AbstractPage() {
        this.contentPanel = new PageContentPanel();
        contentPanel.setMainTitlePanel(getPageTitle());

    }

    protected abstract String getPageTitle();

    public PageContentPanel getContentPanel() {
        return contentPanel;
    }

    public void setDetailTitlePanel(String detailTitle) {
        contentPanel.setDetailTitlePanel(detailTitle);
    }

    @Override
    public Widget getContent() {
        return contentPanel;
    }

    public void setSubmenu(Widget submenu) {
        contentPanel.setSubmenu(submenu);
    }


}
