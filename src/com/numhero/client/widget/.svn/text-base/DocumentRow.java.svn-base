package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.numhero.client.model.pojoc.InvoiceC;

public class DocumentRow extends BaseRow<InvoiceC> {

    private static DocumentRowBinder uiBinder = GWT.create(DocumentRowBinder.class);

    interface DocumentRowBinder extends UiBinder<Element, DocumentRow> {
    }

    @UiField
    AnchorElement editInvoice;

    @UiField
    SpanElement observations;

    @UiField
    SpanElement status;

    public DocumentRow() {
    }

    public void setPojo(InvoiceC d) {
        setElement(uiBinder.createAndBindUi(this));
        editInvoice.setInnerText(d.getInvoiceType() + " " + d.getInvoiceID());
        editInvoice.setHref("#invoice/" + d.getInvoiceID());
        observations.setInnerText(d.getNotes());

        status.setInnerText(d.getNotes());
    }
}
