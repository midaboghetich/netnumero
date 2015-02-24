package com.numhero.client.mvp.staff;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.client.widget.table.AbstractTableWithHeaderAndFooter;
import com.numhero.shared.enums.StaffTypeEnum;

import java.util.List;

public class StaffsTable extends AbstractTableWithHeaderAndFooter {

    public void setStaffs(List<StaffC> staffCs) {
        removeAllRows();
        for (int row = 0; row < staffCs.size(); row++) {
            StaffC csC = staffCs.get(row);
            HTML hID;
            if (csC.getStaffType() == StaffTypeEnum.Internal)
                hID = new HTML("<a href='#internal/" + csC.getId() + "'>" + csC.getName() + "</a>");
            else
                hID = new HTML("<a href='#contractor/" + csC.getId() + "'>" + csC.getName() + "</a>");
            setWidget(row, 0, getCheckbox(csC.getId()));
            setText(row, 1, csC.getEmail());
            setText(row, 3, csC.getName());
            setText(row, 4, csC.getPhone());
            setWidget(row, 2, hID);
            setText(row, 5, csC.getAddress());
            setText(row, 6, csC.getNotes());
        }
    }

    protected void setHeader() {
        setHeader(0, "", HasHorizontalAlignment.ALIGN_CENTER, "20px");
        setHeader(1, Application.getConstants().contactEmail(), HasHorizontalAlignment.ALIGN_LEFT, "140px");
        setHeader(2, Application.getConstants().companyName(), HasHorizontalAlignment.ALIGN_LEFT, "140px");
        setHeader(3, Application.getConstants().contactName(), HasHorizontalAlignment.ALIGN_LEFT, "140px");
        setHeader(4, Application.getConstants().phone(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(5, Application.getConstants().address(), HasHorizontalAlignment.ALIGN_LEFT, "200px");
        setHeader(6, Application.getConstants().notes(), HasHorizontalAlignment.ALIGN_LEFT, "%");
    }
}