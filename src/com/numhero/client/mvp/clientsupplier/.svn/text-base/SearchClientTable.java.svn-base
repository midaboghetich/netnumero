package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.model.pojoc.ClientSupplierContactC;
import com.numhero.client.widget.table.AbstractTableWithHeaderAndFooter;
import com.numhero.shared.enums.ClientSupplierEnum;

import java.util.List;

public class SearchClientTable extends AbstractTableWithHeaderAndFooter {

    public void setClientSuppliers(List<ClientSupplierC> clientSuppliers) {
        removeAllRows();
        for (int row = 0; row < clientSuppliers.size(); row++) {
            ClientSupplierC csC = clientSuppliers.get(row);

            HTML hID = null;

            if (csC.getType() == ClientSupplierEnum.client)
                hID = new HTML("<a href='#client/" + csC.getId() + "'>"
                        + csC.getCompanyName() + "</a>");
            else
                hID = new HTML("<a href='#supplier/" + csC.getId() + "'>"
                        + csC.getCompanyName() + "</a>");

            if (!csC.getContacts().isEmpty()) {
                ClientSupplierContactC contact = csC.getContacts().get(0);
                setText(row, 1, contact.getEmail());
                setText(row, 2, contact.getName());
                setText(row, 3, contact.getPhone());
            }
            setWidget(row, 0, hID);
            setText(row, 4, csC.getAddress());
            setText(row, 5, csC.getNotes());

        }
    }

    protected void setHeader() {
        setHeader(0, Application.getConstants().companyName(), HasHorizontalAlignment.ALIGN_LEFT, "140px");
        setHeader(1, Application.getConstants().contactEmail(), HasHorizontalAlignment.ALIGN_LEFT, "140px");
        setHeader(2, Application.getConstants().contactName(), HasHorizontalAlignment.ALIGN_LEFT, "140px");
        setHeader(3, Application.getConstants().phone(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(4, Application.getConstants().address(), HasHorizontalAlignment.ALIGN_LEFT, "200px");
        setHeader(5, Application.getConstants().notes(), HasHorizontalAlignment.ALIGN_LEFT, "10px");
    }
}