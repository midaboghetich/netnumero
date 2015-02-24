package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class NetNumeroButton_NetNumeroButtonUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.NetNumeroButton>, com.numhero.client.widget.NetNumeroButton.NetNumeroButtonUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.NetNumeroButton owner) {

    com.numhero.client.widget.NetNumeroButton_NetNumeroButtonUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.NetNumeroButton_NetNumeroButtonUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.NetNumeroButton_NetNumeroButtonUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Anchor anchor = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span>");

    anchor.setStyleName("inh-button");
    anchor.setHref("javascript:;");
    f_HTMLPanel1.setStyleName("inh-button");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(anchor, domId0Element);


    owner.anchor = anchor;

    return f_HTMLPanel1;
  }
}
