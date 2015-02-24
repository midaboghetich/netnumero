package com.numhero.client.mvp.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class InvoiceDetailToolbar extends Composite {
    interface InvoiceDetailToolbarUiBinder extends UiBinder<HTMLPanel, InvoiceDetailToolbar> {
    }

    private static InvoiceDetailToolbarUiBinder uiBinder = GWT.create(InvoiceDetailToolbarUiBinder.class);

    @UiField
    Anchor btDelete;

    @UiField
    Anchor btMoveUp;

    @UiField
    Anchor btMoveDown;

    public InvoiceDetailToolbar() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public Anchor getBtDelete() {
        return btDelete;
    }

    public Anchor getBtMoveUp() {
        return btMoveUp;
    }

    public Anchor getBtMoveDown() {
        return btMoveDown;
    }
}
