package com.numhero.client.mvp.project;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.client.widget.table.AbstractTableWithHeaderAndFooter;

import java.util.List;

public class ProjectsTable extends AbstractTableWithHeaderAndFooter {

    public void setProjects(List<ProjectC> projectCs) {
        removeAllRows();
        for (int row = 0; row < projectCs.size(); row++) {
            ProjectC projectC = projectCs.get(row);

            HTML hID = new HTML("<a href='#project/" + projectC.getId() + "'>"
                    + projectC.getName() + "</a>");

            setWidget(row, 0, getCheckbox(projectC.getId()));
            setWidget(row, 1, hID);
            setText(row, 2, projectC.getDescription());
            if (projectC.getCreated() != null)
                setText(row, 3, DateTimeFormat.getShortDateFormat().format(projectC.getCreated()));
            if (projectC.getLastBilled() != null)
                setText(row, 4, DateTimeFormat.getShortDateFormat().format(projectC.getLastBilled()));
            if (projectC.getState() != null) setText(row, 5, projectC.getState().name());
            if (projectC.getNotBilledHours() != null) setText(row, 6, projectC.getNotBilledHours().toString());
            if (projectC.getTotalHours() != null) setText(row, 7, projectC.getTotalHours().toString());
        }
    }

    @Override
    protected void setHeader() {
        setHeader(0, "", HasHorizontalAlignment.ALIGN_CENTER, "20px");
        setHeader(1, Application.getConstants().name(), HasHorizontalAlignment.ALIGN_CENTER, "20px");
        setHeader(2, Application.getConstants().description(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(3, Application.getConstants().created(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(4, Application.getConstants().lastBilled(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(5, Application.getConstants().state(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(6, Application.getConstants().notBilledHours(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
        setHeader(7, Application.getConstants().totalHours(), HasHorizontalAlignment.ALIGN_LEFT, "80px");
    }
}