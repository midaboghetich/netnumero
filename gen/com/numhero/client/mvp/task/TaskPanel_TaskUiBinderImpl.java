package com.numhero.client.mvp.task;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TaskPanel_TaskUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.task.TaskPanel>, com.numhero.client.mvp.task.TaskPanel.TaskUiBinder {
  static TaskPanelTaskUiBinderImplGenMessages messages = (TaskPanelTaskUiBinderImplGenMessages) GWT.create(TaskPanelTaskUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.task.TaskPanel owner) {

    com.numhero.client.mvp.task.TaskPanel_TaskUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.task.TaskPanel_TaskUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.task.TaskPanel_TaskUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.TitleLevelOne hdTitle = (com.numhero.client.widget.TitleLevelOne) GWT.create(com.numhero.client.widget.TitleLevelOne.class);
    com.google.gwt.user.client.ui.DisclosurePanel errorsPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Errors");
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox name = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem3 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox description = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem5 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label8 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.mvp.clientsupplier.ClientSelect sbClient = owner.sbClient;
    com.numhero.client.widget.FormItem f_FormItem7 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label10 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.CustomFormatDateBox created = (com.numhero.client.widget.CustomFormatDateBox) GWT.create(com.numhero.client.widget.CustomFormatDateBox.class);
    com.numhero.client.widget.FormItem f_FormItem9 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label12 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox rate = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem11 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label14 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.CheckBox billable = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    com.numhero.client.widget.FormItem f_FormItem13 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label16 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox timeUnit = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem15 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label18 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.ListBox timeEntryUnit = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    com.numhero.client.widget.FormItem f_FormItem17 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label20 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.ListBox state = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    com.numhero.client.widget.FormItem f_FormItem19 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.mvp.task.TaskStaffDetailsTable taskStaffDetailsTable = owner.taskStaffDetailsTable;
    java.lang.String domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.NetNumeroButton btAddStaff = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <tbody> <tr> <td class='formItem'> <span id='" + domId0 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId1 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId2 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId3 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId4 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId5 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId6 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId7 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId8 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId9 + "'></span> </td> </tr> <tr> <td style='height:54px;'> <span id='" + domId10 + "'></span> </td> </tr> </tbody> </table>");
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel21 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_VerticalPanel1.add(hdTitle);
    errorsPanel.setStyleName("validation-advice");
    errorsPanel.setWidth("100%");
    f_VerticalPanel1.add(errorsPanel);
    f_Label4.setText("" + messages.message1() + "");
    f_FormItem3.add(f_Label4);
    f_FormItem3.add(name);
    f_Label6.setText("" + messages.message2() + "");
    f_FormItem5.add(f_Label6);
    f_FormItem5.add(description);
    f_Label8.setText("" + messages.message3() + "");
    f_FormItem7.add(f_Label8);
    f_FormItem7.add(sbClient);
    f_FormItem7.setTitleWidth(120);
    f_Label10.setText("" + messages.message4() + "");
    f_FormItem9.add(f_Label10);
    f_FormItem9.add(created);
    f_Label12.setText("" + messages.message5() + "");
    f_FormItem11.add(f_Label12);
    f_FormItem11.add(rate);
    f_Label14.setText("" + messages.message6() + "");
    f_FormItem13.add(f_Label14);
    f_FormItem13.add(billable);
    f_Label16.setText("" + messages.message7() + "");
    f_FormItem15.add(f_Label16);
    f_FormItem15.add(timeUnit);
    f_Label18.setText("" + messages.message8() + "");
    f_FormItem17.add(f_Label18);
    f_FormItem17.add(timeEntryUnit);
    f_Label20.setText("" + messages.message9() + "");
    f_FormItem19.add(f_Label20);
    f_FormItem19.add(state);
    taskStaffDetailsTable.setStyleName("invoiceDetails inh-standard");
    taskStaffDetailsTable.setCellSpacing(0);
    taskStaffDetailsTable.setCellPadding(0);
    btAddStaff.setHTML("" + messages.message10() + "");
    f_VerticalPanel1.add(f_HTMLPanel2);
    btSave.setHTML("" + messages.message11() + "");
    f_HorizontalPanel21.add(btSave);
    btCancel.setHTML("" + messages.message12() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("javascript:;");
    f_HorizontalPanel21.add(btCancel);
    f_HorizontalPanel21.setStyleName("buttonsPanel");
    f_VerticalPanel1.add(f_HorizontalPanel21);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    com.google.gwt.user.client.Element domId7Element = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    com.google.gwt.user.client.Element domId8Element = com.google.gwt.dom.client.Document.get().getElementById(domId8).cast();
    com.google.gwt.user.client.Element domId9Element = com.google.gwt.dom.client.Document.get().getElementById(domId9).cast();
    com.google.gwt.user.client.Element domId10Element = com.google.gwt.dom.client.Document.get().getElementById(domId10).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(f_FormItem3, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem5, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem7, domId2Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem9, domId3Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem11, domId4Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem13, domId5Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem15, domId6Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem17, domId7Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem19, domId8Element);
    f_HTMLPanel2.addAndReplaceElement(taskStaffDetailsTable, domId9Element);
    f_HTMLPanel2.addAndReplaceElement(btAddStaff, domId10Element);


    owner.billable = billable;
    owner.btAddStaff = btAddStaff;
    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.created = created;
    owner.description = description;
    owner.errorsPanel = errorsPanel;
    owner.hdTitle = hdTitle;
    owner.name = name;
    owner.rate = rate;
    owner.state = state;
    owner.timeEntryUnit = timeEntryUnit;
    owner.timeUnit = timeUnit;

    return f_VerticalPanel1;
  }
}