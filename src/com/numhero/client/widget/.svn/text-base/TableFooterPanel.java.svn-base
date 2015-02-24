package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.Widget;

public class TableFooterPanel extends Composite {

    private static TableFooterPanelUiBinder uiBinder = GWT.create(TableFooterPanelUiBinder.class);

    @UiField
    MenuBar tableFooterActionsCombo;

    public MenuBar getTableFooterActionsCombo() {
        return tableFooterActionsCombo;
    }

    interface TableFooterPanelUiBinder extends
            UiBinder<Widget, TableFooterPanel> {
    }

    public TableFooterPanel() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
