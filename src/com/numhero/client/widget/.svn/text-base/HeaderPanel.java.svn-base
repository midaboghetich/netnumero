package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;

public class HeaderPanel extends Widget {

    private static HeaderPanelUiBinder uiBinder = GWT.create(HeaderPanelUiBinder.class);

    interface HeaderPanelUiBinder extends UiBinder<Element, HeaderPanel> {
    }

    private HeaderLine headerLine;
    private TabBar tabBar;

    @UiField
    DivElement mainDivContainer;

    public HeaderPanel() {
        headerLine = new HeaderLine();

        tabBar = new TabBar();

        setElement(uiBinder.createAndBindUi(this));

        mainDivContainer.appendChild(headerLine.getElement());

        mainDivContainer.appendChild(tabBar.getElement());

//        TabLayoutPanel p = new TabLayoutPanel(20, Style.Unit.EM);
//
//        p.addBeforeSelectionHandler(new BeforeSelectionHandler() {
//            public void onBeforeSelection(BeforeSelectionEvent event) {
//                CoreUtils.debug(event.toString());
//            }
//        });
//
//        p.add(new HTML("this content"), "XXXXXXXXXXXXXXXXXX");
//        p.add(new HTML("that content"), "that");
//        p.add(new HTML("the other content"), "the other");
//
//        mainDivContainer.appendChild(p.getElement());

    }

    public HeaderLine getHeaderLine() {
        return headerLine;
    }

    public void setHeaderLine(HeaderLine headerLine) {
        this.headerLine = headerLine;
    }

    public TabBar getTabBar() {
        return tabBar;
    }

    public void setTabBar(TabBar tabBar) {
        this.tabBar = tabBar;
    }

}
