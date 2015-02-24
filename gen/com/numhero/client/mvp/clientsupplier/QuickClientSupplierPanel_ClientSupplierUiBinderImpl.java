package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class QuickClientSupplierPanel_ClientSupplierUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.mvp.clientsupplier.QuickClientSupplierPanel>, com.numhero.client.mvp.clientsupplier.QuickClientSupplierPanel.ClientSupplierUiBinder {
  static QuickClientSupplierPanelClientSupplierUiBinderImplGenMessages messages = (QuickClientSupplierPanelClientSupplierUiBinderImplGenMessages) GWT.create(QuickClientSupplierPanelClientSupplierUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.mvp.clientsupplier.QuickClientSupplierPanel owner) {

    com.numhero.client.mvp.clientsupplier.QuickClientSupplierPanel_ClientSupplierUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.clientsupplier.QuickClientSupplierPanel_ClientSupplierUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.clientsupplier.QuickClientSupplierPanel_ClientSupplierUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.DisclosurePanel errorsPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Errors");
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbCompanyName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem3 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='formContainer'> <thead> <tr> <td> " + messages.message1() + " </td> </tr> </thead> <tbody> <tr> <td class='formItem'> <strong> <span id='" + domId2 + "'></span> </strong> </td> </tr> </tbody> </table>");
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel5 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId4 + "'></span>");
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span> <span id='" + domId1 + "'></span> <span id='" + domId3 + "'></span>");

    errorsPanel.setStyleName("validation-advice");
    errorsPanel.setWidth("100%");
    f_Label4.setText("" + messages.message2() + "");
    f_FormItem3.add(f_Label4);
    f_FormItem3.add(tbCompanyName);
    f_FormItem3.setTitleWidth(200);
    btSave.setHTML("" + messages.message3() + "");
    btSave.setStyleName("inh-button");
    btSave.setHref("javascript:;");
    f_HorizontalPanel6.add(btSave);
    btCancel.setHTML("" + messages.message4() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("javascript:;");
    f_HorizontalPanel6.add(btCancel);
    f_HorizontalPanel6.setStyleName("buttonsPanel");
    f_HTMLPanel1.setStyleName("formContainer");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord1.detach();
    f_HTMLPanel2.addAndReplaceElement(f_FormItem3, domId2Element);
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    UiBinderUtil.TempAttachment attachRecord2 = UiBinderUtil.attachToDom(f_HTMLPanel5.getElement());
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    attachRecord2.detach();
    f_HTMLPanel5.addAndReplaceElement(f_HorizontalPanel6, domId4Element);
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(errorsPanel, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(f_HTMLPanel2, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_HTMLPanel5, domId3Element);


    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.errorsPanel = errorsPanel;
    owner.tbCompanyName = tbCompanyName;

    return f_HTMLPanel1;
  }
}
