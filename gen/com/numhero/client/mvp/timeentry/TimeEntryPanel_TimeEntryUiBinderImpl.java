package com.numhero.client.mvp.timeentry;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TimeEntryPanel_TimeEntryUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.timeentry.TimeEntryPanel>, com.numhero.client.mvp.timeentry.TimeEntryPanel.TimeEntryUiBinder {
  static TimeEntryPanelTimeEntryUiBinderImplGenMessages messages = (TimeEntryPanelTimeEntryUiBinderImplGenMessages) GWT.create(TimeEntryPanelTimeEntryUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.timeentry.TimeEntryPanel owner) {

    com.numhero.client.mvp.timeentry.TimeEntryPanel_TimeEntryUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.timeentry.TimeEntryPanel_TimeEntryUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.timeentry.TimeEntryPanel_TimeEntryUiBinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.DisclosurePanel errorsPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Errors");
    com.numhero.client.widget.calendar.CalendarWidget calendarWidget = owner.calendarWidget;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.CustomFormatDateBox selectedDate = (com.numhero.client.widget.CustomFormatDateBox) GWT.create(com.numhero.client.widget.CustomFormatDateBox.class);
    com.numhero.client.widget.FormItem f_FormItem4 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label created = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.FormItem f_FormItem6 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.mvp.project.ProjectSelect sbProject = owner.sbProject;
    com.numhero.client.widget.FormItem f_FormItem8 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label11 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.mvp.task.TaskSelect sbTask = owner.sbTask;
    com.numhero.client.widget.FormItem f_FormItem10 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label13 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox description = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem12 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label15 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox notes = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem14 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel3 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <tbody> <tr> <td class='formItem'> <span id='" + domId0 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId1 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId2 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId3 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId4 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId5 + "'></span> </td> </tr>           <tr> <td class='formItem'> </td> </tr> </tbody> </table>");
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel17 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel16 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId6 + "'></span>");
    com.numhero.client.mvp.timeentry.TimeEntriesTable timeEntriesTable = (com.numhero.client.mvp.timeentry.TimeEntriesTable) GWT.create(com.numhero.client.mvp.timeentry.TimeEntriesTable.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    errorsPanel.setStyleName("validation-advice");
    errorsPanel.setWidth("100%");
    f_VerticalPanel1.add(errorsPanel);
    f_HorizontalPanel2.add(calendarWidget);
    f_Label5.setText("" + messages.message1() + "");
    f_FormItem4.add(f_Label5);
    f_FormItem4.add(selectedDate);
    f_Label7.setText("" + messages.message2() + "");
    f_FormItem6.add(f_Label7);
    f_FormItem6.add(created);
    f_Label9.setText("" + messages.message3() + "");
    f_FormItem8.add(f_Label9);
    f_FormItem8.add(sbProject);
    f_FormItem8.setTitleWidth(120);
    f_Label11.setText("" + messages.message4() + "");
    f_FormItem10.add(f_Label11);
    f_FormItem10.add(sbTask);
    f_FormItem10.setTitleWidth(120);
    f_Label13.setText("" + messages.message5() + "");
    f_FormItem12.add(f_Label13);
    f_FormItem12.add(description);
    f_Label15.setText("" + messages.message6() + "");
    f_FormItem14.add(f_Label15);
    f_FormItem14.add(notes);
    f_HorizontalPanel2.add(f_HTMLPanel3);
    f_HorizontalPanel2.setWidth("100%");
    f_VerticalPanel1.add(f_HorizontalPanel2);
    btSave.setHTML("" + messages.message7() + "");
    f_HorizontalPanel17.add(btSave);
    btCancel.setHTML("" + messages.message8() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("#time");
    f_HorizontalPanel17.add(btCancel);
    f_HorizontalPanel17.setStyleName("buttonsPanel");
    f_VerticalPanel1.add(f_HTMLPanel16);
    timeEntriesTable.setStyleName("inh-standard");
    f_VerticalPanel1.add(timeEntriesTable);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel3.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    attachRecord0.detach();
    f_HTMLPanel3.addAndReplaceElement(f_FormItem4, domId0Element);
    f_HTMLPanel3.addAndReplaceElement(f_FormItem6, domId1Element);
    f_HTMLPanel3.addAndReplaceElement(f_FormItem8, domId2Element);
    f_HTMLPanel3.addAndReplaceElement(f_FormItem10, domId3Element);
    f_HTMLPanel3.addAndReplaceElement(f_FormItem12, domId4Element);
    f_HTMLPanel3.addAndReplaceElement(f_FormItem14, domId5Element);
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel16.getElement());
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    attachRecord1.detach();
    f_HTMLPanel16.addAndReplaceElement(f_HorizontalPanel17, domId6Element);


    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.created = created;
    owner.description = description;
    owner.errorsPanel = errorsPanel;
    owner.notes = notes;
    owner.selectedDate = selectedDate;
    owner.timeEntriesTable = timeEntriesTable;

    return f_VerticalPanel1;
  }
}
