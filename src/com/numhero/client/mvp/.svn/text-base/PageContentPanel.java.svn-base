package com.numhero.client.mvp;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.widget.DetailTitlePanel;
import com.numhero.client.widget.MainTitlePanel;
import com.numhero.client.widget.NetNumeroButton;

public class PageContentPanel extends Composite {

    private static PageContentPanelUiBinder uiBinder = GWT
            .create(PageContentPanelUiBinder.class);

    interface PageContentPanelUiBinder extends UiBinder<Widget, PageContentPanel> {
    }

    @UiField
    MainTitlePanel titlePanel;

    @UiField
    DetailTitlePanel detailTitlePanel;

    @UiField
    VerticalPanel tableContainer;


    public PageContentPanel() {
        initWidget(uiBinder.createAndBindUi(this));

    }

    public MainTitlePanel getTitlePanel() {
        return titlePanel;
    }

    public void setMainTitlePanel(String mainPanelTitle) {
        titlePanel.setPanelTitle(mainPanelTitle);
    }

    public void setDetailTitlePanel(String detailPanelTitle) {
        detailTitlePanel.setHTML(detailPanelTitle);

    }

    public void setSubmenu(Widget submenuPanel) {
        titlePanel.getSubMenubar().add(submenuPanel);
    }

    public void setContentWidget(Widget table) {
        this.tableContainer.clear();
        this.tableContainer.add(table);
    }

    public void setRightButton(NetNumeroButton button) {
        titlePanel.getRightButtonSpace().add(button);
    }

    public Widget getContentWidget() {
        return this.tableContainer.getWidget(0);
    }

}
