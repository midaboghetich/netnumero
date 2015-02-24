package com.numhero.client.mvp.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class InvoiceDetailToolbar_InvoiceDetailToolbarUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.numhero.client.mvp.document.InvoiceDetailToolbar>, com.numhero.client.mvp.document.InvoiceDetailToolbar.InvoiceDetailToolbarUiBinder {

  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.numhero.client.mvp.document.InvoiceDetailToolbar owner) {

    com.numhero.client.mvp.document.InvoiceDetailToolbar_InvoiceDetailToolbarUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.document.InvoiceDetailToolbar_InvoiceDetailToolbarUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.document.InvoiceDetailToolbar_InvoiceDetailToolbarUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Anchor btDelete = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Anchor btMoveUp = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Anchor btMoveDown = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='inh-add-inline' width='100%'> <tbody> <tr> <td> <span id='" + domId0 + "'></span> </td> <td style='padding-left:10px'> <span id='" + domId1 + "'></span> <br> <span id='" + domId2 + "'></span> </td> </tr> </tbody> </table>");

    btDelete.setHTML("<img border='0' height='16' src='../../i/common/16/delete2.png' width='16'>");
    btDelete.setHref("javascript:;");
    btMoveUp.setHTML("<img border='0' height='16' src='../../i/common/16/navigate_up.png' width='16'>");
    btMoveUp.setHref("javascript:;");
    btMoveDown.setHTML("<img border='0' height='16' src='../../i/common/16/navigate_down.png' width='16'>");
    btMoveDown.setHref("javascript:;");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(btDelete, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(btMoveUp, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(btMoveDown, domId2Element);


    owner.btDelete = btDelete;
    owner.btMoveDown = btMoveDown;
    owner.btMoveUp = btMoveUp;

    return f_HTMLPanel1;
  }
}
