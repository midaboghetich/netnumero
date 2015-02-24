package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ClientSupplierSelect_ClientSupplierSelectUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.numhero.client.mvp.clientsupplier.ClientSupplierSelect>, com.numhero.client.mvp.clientsupplier.ClientSupplierSelect.ClientSupplierSelectUiBinder {

  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.numhero.client.mvp.clientsupplier.ClientSupplierSelect owner) {

    com.numhero.client.mvp.clientsupplier.ClientSupplierSelect_ClientSupplierSelectUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.clientsupplier.ClientSupplierSelect_ClientSupplierSelectUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.clientsupplier.ClientSupplierSelect_ClientSupplierSelectUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SuggestBox sb = owner.sb;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Anchor btAdd = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='inh-add-inline' height='24px' width='100%'> <tbody> <tr> <td> <span id='" + domId0 + "'></span> </td> <td> <span id='" + domId1 + "'></span> </td> </tr> </tbody> </table>");

    btAdd.setHTML("<img border='0' src='../../i/common/16/add2.png'>");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(sb, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(btAdd, domId1Element);


    owner.btAdd = btAdd;

    return f_HTMLPanel1;
  }
}
