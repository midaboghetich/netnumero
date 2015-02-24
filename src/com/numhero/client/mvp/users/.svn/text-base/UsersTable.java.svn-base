package com.numhero.client.mvp.users;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.UserC;
import com.numhero.client.widget.table.AbstractTableWithHeaderAndFooter;

import java.util.List;

public class UsersTable extends AbstractTableWithHeaderAndFooter {

    public void setUsers(List<UserC> userCs) {
        removeAllRows();
        for (int row = 0; row < userCs.size(); row++) {
            UserC userC = userCs.get(row);
            HTML hID = new HTML("<a href='#user/" + userC.getId() + "'>" + userC.getDisplayString() + "</a>");
            setWidget(row, 0, getCheckbox(userC.getId()));
            setWidget(row, 1, hID);
            if (userC.getFirstName() != null) setText(row, 2, userC.getFirstName());
            if (userC.getLastName() != null) setText(row, 3, userC.getLastName());
            if (userC.getUserProfile() != null) setText(row, 4, userC.getUserProfile().name());
            if (userC.getLastLogin() != null)
                setText(row, 5, DateTimeFormat.getShortDateFormat().format(userC.getLastLogin()));
        }
    }

    protected void setHeader() {
        setHeader(0, "", HasHorizontalAlignment.ALIGN_CENTER, "20px");
        setHeader(1, Application.getConstants().name(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(2, Application.getConstants().firstName(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(3, Application.getConstants().lastName(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(4, Application.getConstants().userProfile(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(5, Application.getConstants().lastLogin(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
    }
}
