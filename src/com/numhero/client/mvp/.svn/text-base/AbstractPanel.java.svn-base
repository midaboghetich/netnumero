package com.numhero.client.mvp;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;

public abstract class AbstractPanel extends Composite {

    public void selectListBoxItem(ListBox lb, String value) {
        for (int i = 0; i < lb.getItemCount(); i++) {
            if (value.equals(lb.getValue(i))) {
                lb.setSelectedIndex(i);
                break;
            }
        }
    }

    public String getListBoxSelectValue(ListBox lb) {
        return lb.getValue(lb.getSelectedIndex());
    }
}
