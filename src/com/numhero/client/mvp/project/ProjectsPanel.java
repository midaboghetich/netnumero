package com.numhero.client.mvp.project;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ProjectsPanel extends Composite {
    interface ProjectsUiBinder extends UiBinder<VerticalPanel, ProjectsPanel> {
    }

    private static ProjectsUiBinder uiBinder = GWT.create(ProjectsUiBinder.class);

    @UiField
    HTML hdTitle;

    @UiField
    ProjectsTable projectsTable;

    public ProjectsPanel() {
        initWidget(uiBinder.createAndBindUi(this));
        hdTitle.setHTML("<h1>Time</h1>");
    }

    public ProjectsTable getProjectsTable() {
        return projectsTable;
    }
}