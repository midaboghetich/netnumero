package com.numhero.client.mvp.task;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.client.widget.table.AbstractTableWithHeaderAndFooter;

import java.util.List;

public class TasksTable extends AbstractTableWithHeaderAndFooter {

    public void setTasks(List<TaskC> taskCs) {
        for (int row = 0; row < taskCs.size(); row++) {
            TaskC taskC = taskCs.get(row);
            HTML hID = new HTML("<a href='#task/" + taskC.getId() + "'>" + taskC.getName() + "</a>");
            setWidget(row, 0, getCheckbox(taskC.getId()));
            setWidget(row, 1, hID);
            setText(row, 2, taskC.getDescription());

            if (taskC.getCreated() != null)
                setText(row, 3, DateTimeFormat.getShortDateFormat().format(taskC.getCreated()));
            else
                setText(row, 3, "");

            if (taskC.getBillable() != null)
                setText(row, 4, taskC.getBillable().toString());
            else
                setText(row, 4, "");

            if (taskC.getState() != null)
                setText(row, 5, taskC.getState().name());
            else
                setText(row, 5, "");

        }
    }

    protected void setHeader() {
        setHeader(0, "", HasHorizontalAlignment.ALIGN_CENTER, "20px");
        setHeader(1, Application.getConstants().name(), HasHorizontalAlignment.ALIGN_CENTER, "20px");
        setHeader(2, Application.getConstants().description(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(3, Application.getConstants().created(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(4, Application.getConstants().billable(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(5, Application.getConstants().state(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
    }
}
