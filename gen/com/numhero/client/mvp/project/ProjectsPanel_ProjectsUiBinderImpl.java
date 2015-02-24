package com.numhero.client.mvp.project;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ProjectsPanel_ProjectsUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.project.ProjectsPanel>, com.numhero.client.mvp.project.ProjectsPanel.ProjectsUiBinder {
  static ProjectsPanelProjectsUiBinderImplGenMessages messages = (ProjectsPanelProjectsUiBinderImplGenMessages) GWT.create(ProjectsPanelProjectsUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.project.ProjectsPanel owner) {

    com.numhero.client.mvp.project.ProjectsPanel_ProjectsUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.project.ProjectsPanel_ProjectsUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.project.ProjectsPanel_ProjectsUiBinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.HTML hdTitle = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
    com.google.gwt.user.client.ui.Anchor f_Anchor3 = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.numhero.client.mvp.project.ProjectsTable projectsTable = (com.numhero.client.mvp.project.ProjectsTable) GWT.create(com.numhero.client.mvp.project.ProjectsTable.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_HorizontalPanel2.add(hdTitle);
    f_HorizontalPanel2.setCellVerticalAlignment(hdTitle, com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
    f_HorizontalPanel2.setCellWidth(hdTitle, "50%");
    f_Anchor3.setHTML("" + messages.message1() + "");
    f_Anchor3.setStyleName("inh-button");
    f_Anchor3.setHref("#project");
    f_HorizontalPanel2.add(f_Anchor3);
    f_HorizontalPanel2.setCellHorizontalAlignment(f_Anchor3, com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
    f_HorizontalPanel2.setCellVerticalAlignment(f_Anchor3, com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
    f_HorizontalPanel2.setCellWidth(f_Anchor3, "50%");
    f_HorizontalPanel2.setWidth("100%");
    f_VerticalPanel1.add(f_HorizontalPanel2);
    projectsTable.setStyleName("projectsDetails inh-standard");
    projectsTable.setCellSpacing(0);
    projectsTable.setCellPadding(0);
    f_VerticalPanel1.add(projectsTable);
    f_VerticalPanel1.setWidth("100%");



    owner.hdTitle = hdTitle;
    owner.projectsTable = projectsTable;

    return f_VerticalPanel1;
  }
}
