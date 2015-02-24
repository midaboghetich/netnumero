package com.numhero.client.mvp.service;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.ProductC;
import com.numhero.client.widget.table.AbstractTableWithHeaderAndFooter;
import com.numhero.client.widget.textbox.NumberTextBox;

import java.util.List;

public class ServicesTable extends AbstractTableWithHeaderAndFooter {

    public void setServices(List<ProductC> productCs) {
        removeAllRows();
        for (int row = 0; row < productCs.size(); row++) {
            ProductC productC = productCs.get(row);
            HTML hID = new HTML("<a href='#service/" + productC.getId() + "'>" + productC.getName() + "</a>");

            setWidget(row, 0, getCheckbox(productC.getId()));
            setWidget(row, 1, hID);
            setText(row, 2, productC.getDescription());
            NumberTextBox nbPrice = new NumberTextBox(productC.getCurrency(), productC.getUnitPrice(), true);
            setWidget(row, 3, nbPrice);
            setText(row, 4, productC.getServiceUnit().name());
        }
    }

    protected void setHeader() {
        setHeader(0, "", HasHorizontalAlignment.ALIGN_CENTER, "20px");
        setHeader(1, Application.getConstants().name(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(2, Application.getConstants().description(), HasHorizontalAlignment.ALIGN_LEFT, "%");
        setHeader(3, Application.getConstants().price(), HasHorizontalAlignment.ALIGN_RIGHT, "80px");
        setHeader(4, Application.getConstants().serviceUnit(), HasHorizontalAlignment.ALIGN_RIGHT, "80px");
    }
}
