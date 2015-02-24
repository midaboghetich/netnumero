package com.numhero.client.mvp.document;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.client.widget.table.AbstractTableWithHeaderAndFooter;
import com.numhero.client.widget.textbox.NumberTextBox;

import java.util.List;

public class InvoicesTable extends AbstractTableWithHeaderAndFooter {

    public void setInvoices(List<InvoiceC> invoices) {
        removeAllRows();
        for (int row = 0; row < invoices.size(); row++) {
            InvoiceC invoiceC = invoices.get(row);
            HTML hID = new HTML("<a href='#invoice/" + invoiceC.getId() + "'>" + invoiceC.getInvoiceID() + "</a>");

            setWidget(row, 0, getCheckbox(invoiceC.getId()));
            setWidget(row, 1, hID);
            setText(row, 2, invoiceC.getClientSupplierName());
            setText(row, 3, invoiceC.getNotes());
            if (invoiceC.getDateRaised() != null) {
                setText(row, 4, DateTimeFormat.getShortDateFormat().format(invoiceC.getDateRaised()));
            } else {
                setText(row, 4, "");
            }
            NumberTextBox nbPrice = new NumberTextBox(invoiceC.getCurrency(), invoiceC.getPrice(), true);
            setWidget(row, 5, nbPrice);
            if (invoiceC.getInvoiceStatus() != null) {
                setText(row, 6, invoiceC.getInvoiceStatus().name());
            } else {
                setText(row, 6, "");
            }
        }
    }

    protected void setHeader() {
        setHeader(0, "", HasHorizontalAlignment.ALIGN_CENTER, "20px");
        setHeader(1, Application.getConstants().invoice(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(2, Application.getConstants().clientSupplier(), HasHorizontalAlignment.ALIGN_LEFT, "140px");
        setHeader(3, Application.getConstants().description(), HasHorizontalAlignment.ALIGN_LEFT, "%");
        setHeader(4, Application.getConstants().date(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(5, Application.getConstants().total(), HasHorizontalAlignment.ALIGN_RIGHT, "80px");
        setHeader(6, Application.getConstants().status(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
    }
}
