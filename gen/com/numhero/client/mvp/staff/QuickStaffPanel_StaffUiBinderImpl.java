package com.numhero.client.mvp.staff;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class QuickStaffPanel_StaffUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.staff.QuickStaffPanel>, com.numhero.client.mvp.staff.QuickStaffPanel.StaffUiBinder {
  static QuickStaffPanelStaffUiBinderImplGenMessages messages = (QuickStaffPanelStaffUiBinderImplGenMessages) GWT.create(QuickStaffPanelStaffUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.staff.QuickStaffPanel owner) {

    com.numhero.client.mvp.staff.QuickStaffPanel_StaffUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.staff.QuickStaffPanel_StaffUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.staff.QuickStaffPanel_StaffUiBinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.DisclosurePanel errorsPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Errors");
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem3 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <thead> <tr> <td> " + messages.message1() + " </td> </tr> </thead> <tbody> <tr> <td class='formItem'> <span id='" + domId0 + "'></span> </td> </tr> </tbody> </table>");
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel5 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId1 + "'></span>");
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    errorsPanel.setStyleName("validation-advice");
    errorsPanel.setWidth("100%");
    f_VerticalPanel1.add(errorsPanel);
    f_Label4.setText("" + messages.message2() + "");
    f_FormItem3.add(f_Label4);
    f_FormItem3.add(tbName);
    f_FormItem3.setTitleWidth(200);
    f_VerticalPanel1.add(f_HTMLPanel2);
    btSave.setHTML("" + messages.message3() + "");
    btSave.setStyleName("inh-button");
    btSave.setHref("javascript:;");
    f_HorizontalPanel6.add(btSave);
    btCancel.setHTML("" + messages.message4() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("javascript:;");
    f_HorizontalPanel6.add(btCancel);
    f_HorizontalPanel6.setStyleName("buttonsPanel");
    f_VerticalPanel1.add(f_HTMLPanel5);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(f_FormItem3, domId0Element);
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel5.getElement());
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord1.detach();
    f_HTMLPanel5.addAndReplaceElement(f_HorizontalPanel6, domId1Element);


    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.errorsPanel = errorsPanel;
    owner.tbName = tbName;

    return f_VerticalPanel1;
  }
}
