package com.numhero.client.mvp.timeentry;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TimeEntriesPanel_TimeEntriesUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.timeentry.TimeEntriesPanel>, com.numhero.client.mvp.timeentry.TimeEntriesPanel.TimeEntriesUiBinder {

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.timeentry.TimeEntriesPanel owner) {

    com.numhero.client.mvp.timeentry.TimeEntriesPanel_TimeEntriesUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.timeentry.TimeEntriesPanel_TimeEntriesUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.timeentry.TimeEntriesPanel_TimeEntriesUiBinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.HTML hdTitle = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
    com.google.gwt.user.client.ui.Anchor f_Anchor3 = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.numhero.client.widget.calendar.CalendarWidget calendar = owner.calendar;
    com.numhero.client.mvp.timeentry.TimeEntriesTable timeEntryTable = (com.numhero.client.mvp.timeentry.TimeEntriesTable) GWT.create(com.numhero.client.mvp.timeentry.TimeEntriesTable.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_HorizontalPanel2.add(hdTitle);
    f_HorizontalPanel2.setCellVerticalAlignment(hdTitle, com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
    f_HorizontalPanel2.setCellWidth(hdTitle, "50%");
    f_Anchor3.setHTML("Create a time entry");
    f_Anchor3.setStyleName("inh-button");
    f_Anchor3.setHref("#timeentry");
    f_HorizontalPanel2.add(f_Anchor3);
    f_HorizontalPanel2.setCellHorizontalAlignment(f_Anchor3, com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
    f_HorizontalPanel2.setCellVerticalAlignment(f_Anchor3, com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
    f_HorizontalPanel2.setCellWidth(f_Anchor3, "50%");
    f_HorizontalPanel2.setWidth("100%");
    f_VerticalPanel1.add(f_HorizontalPanel2);
    f_VerticalPanel1.add(calendar);
    timeEntryTable.setStyleName("tasksDetails inh-standard");
    timeEntryTable.setCellSpacing(0);
    timeEntryTable.setCellPadding(0);
    f_VerticalPanel1.add(timeEntryTable);
    f_VerticalPanel1.setWidth("100%");



    owner.hdTitle = hdTitle;
    owner.timeEntryTable = timeEntryTable;

    return f_VerticalPanel1;
  }
}
