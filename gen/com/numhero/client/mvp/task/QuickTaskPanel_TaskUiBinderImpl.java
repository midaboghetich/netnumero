package com.numhero.client.mvp.task;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class QuickTaskPanel_TaskUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.task.QuickTaskPanel>, com.numhero.client.mvp.task.QuickTaskPanel.TaskUiBinder {
  static QuickTaskPanelTaskUiBinderImplGenMessages messages = (QuickTaskPanelTaskUiBinderImplGenMessages) GWT.create(QuickTaskPanelTaskUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.task.QuickTaskPanel owner) {

    com.numhero.client.mvp.task.QuickTaskPanel_TaskUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.task.QuickTaskPanel_TaskUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.task.QuickTaskPanel_TaskUiBinderImpl_GenBundle.class);
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
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <tbody> <tr> <td class='formItem'> <span id='" + domId0 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId1 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId2 + "'></span> </td> </tr> </tbody> </table>");
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel9 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
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
    f_VerticalPanel1.add(f_HTMLPanel2);
    btSave.setHTML("" + messages.message4() + "");
    f_HorizontalPanel9.add(btSave);
    btCancel.setHTML("" + messages.message5() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("javascript:;");
    f_HorizontalPanel9.add(btCancel);
    f_HorizontalPanel9.setStyleName("buttonsPanel");
    f_VerticalPanel1.add(f_HorizontalPanel9);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(f_FormItem3, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem5, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem7, domId2Element);


    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.description = description;
    owner.errorsPanel = errorsPanel;
    owner.hdTitle = hdTitle;
    owner.name = name;

    return f_VerticalPanel1;
  }
}
