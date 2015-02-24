package com.numhero.client.mvp.project;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class QuickProjectPanel_ProjectUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.numhero.client.mvp.project.QuickProjectPanel>, com.numhero.client.mvp.project.QuickProjectPanel.ProjectUiBinder {
  static QuickProjectPanelProjectUiBinderImplGenMessages messages = (QuickProjectPanelProjectUiBinderImplGenMessages) GWT.create(QuickProjectPanelProjectUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.numhero.client.mvp.project.QuickProjectPanel owner) {

    com.numhero.client.mvp.project.QuickProjectPanel_ProjectUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.project.QuickProjectPanel_ProjectUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.project.QuickProjectPanel_ProjectUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.DisclosurePanel errorsPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Errors");
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.mvp.clientsupplier.ClientSelect sbClient = owner.sbClient;
    com.numhero.client.widget.FormItem f_FormItem2 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox name = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem4 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox description = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem6 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel8 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span> <table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <tbody> <tr> <td class='formItem'> <span id='" + domId1 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId2 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId3 + "'></span> </td> </tr> </tbody> </table> <span id='" + domId4 + "'></span>");

    errorsPanel.setStyleName("validation-advice");
    errorsPanel.setWidth("100%");
    f_Label3.setText("" + messages.message1() + "");
    f_FormItem2.add(f_Label3);
    f_FormItem2.add(sbClient);
    f_FormItem2.setTitleWidth(120);
    f_Label5.setText("" + messages.message2() + "");
    f_FormItem4.add(f_Label5);
    f_FormItem4.add(name);
    f_FormItem4.setTitleWidth(120);
    f_Label7.setText("" + messages.message3() + "");
    f_FormItem6.add(f_Label7);
    f_FormItem6.add(description);
    f_FormItem6.setTitleWidth(120);
    btSave.setHTML("" + messages.message4() + "");
    f_HorizontalPanel8.add(btSave);
    btCancel.setHTML("" + messages.message5() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("javascript:;");
    f_HorizontalPanel8.add(btCancel);
    f_HorizontalPanel8.setStyleName("buttonsPanel");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(errorsPanel, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem2, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem4, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem6, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(f_HorizontalPanel8, domId4Element);


    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.description = description;
    owner.errorsPanel = errorsPanel;
    owner.name = name;

    return f_HTMLPanel1;
  }
}
