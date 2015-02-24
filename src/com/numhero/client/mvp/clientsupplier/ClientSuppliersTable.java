package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.model.pojoc.ClientSupplierContactC;
import com.numhero.client.widget.table.AbstractTableWithHeaderAndFooter;
import com.numhero.shared.enums.ClientSupplierEnum;

import java.util.List;

public class ClientSuppliersTable extends AbstractTableWithHeaderAndFooter {

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

            setWidget(row, 0, getCheckbox(csC.getId()));

            if (!csC.getContacts().isEmpty()) {
                ClientSupplierContactC contact = csC.getContacts().get(0);
                setText(row, 2, contact.getEmail());
                setText(row, 3, contact.getName());
                setText(row, 4, contact.getPhone());
            }
            setWidget(row, 1, hID);
            setText(row, 5, csC.getAddress());
            setText(row, 6, csC.getNotes());

        }
    }

    protected void setHeader() {
        setHeader(0, "", HasHorizontalAlignment.ALIGN_CENTER, "20px");
        setHeader(1, Application.getConstants().companyName(), HasHorizontalAlignment.ALIGN_LEFT, "140px");
        setHeader(2, Application.getConstants().contactEmail(), HasHorizontalAlignment.ALIGN_LEFT, "140px");
        setHeader(3, Application.getConstants().contactName(), HasHorizontalAlignment.ALIGN_LEFT, "140px");
        setHeader(4, Application.getConstants().phone(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(5, Application.getConstants().address(), HasHorizontalAlignment.ALIGN_LEFT, "200px");
        setHeader(6, Application.getConstants().notes(), HasHorizontalAlignment.ALIGN_LEFT, "10px");
    }
}
