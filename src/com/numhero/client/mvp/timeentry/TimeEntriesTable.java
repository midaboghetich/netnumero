package com.numhero.client.mvp.timeentry;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.TimeEntryC;
import com.numhero.client.widget.table.AbstractTableWithHeaderAndFooter;
import com.numhero.client.widget.textbox.NumberTextBox;

import java.util.List;

public class TimeEntriesTable extends AbstractTableWithHeaderAndFooter {

    public void setTimeEntries(List<TimeEntryC> timeEntryCs) {
        removeAllRows();
        for (int row = 0; row < timeEntryCs.size(); row++) {
            TimeEntryC timeEntryC = timeEntryCs.get(row);
            HTML hID = new HTML("<a href='#timeentry/" + timeEntryC.getId() + "'>" + timeEntryC.getDate() + "</a>");
            setWidget(row, 0, getCheckbox(timeEntryC.getId()));
            setWidget(row, 1, hID);
            setText(row, 2, timeEntryC.getDescription());
            setText(row, 3, timeEntryC.getProjectName());
            setText(row, 4, timeEntryC.getTaskName());
            NumberTextBox timeUnits = new NumberTextBox();
            if (timeEntryC.getTimeUnit() != null)
                timeUnits.setAmount(timeEntryC.getTimeUnit());
            else
                timeUnits.setAmount(0D);
            timeUnits.setReadOnly(true);
            setWidget(row, 5, timeUnits);

        }
    }

    protected void setHeader() {
        setHeader(0, "", HasHorizontalAlignment.ALIGN_CENTER, "20px");
        setHeader(1, Application.getConstants().date(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(2, Application.getConstants().description(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(3, Application.getConstants().project(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(4, Application.getConstants().task(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(5, Application.getConstants().hours(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
    }
}
