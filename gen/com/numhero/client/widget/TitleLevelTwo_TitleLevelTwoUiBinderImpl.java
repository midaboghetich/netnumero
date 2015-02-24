package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class TitleLevelTwo_TitleLevelTwoUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.TitleLevelTwo>, com.numhero.client.widget.TitleLevelTwo.TitleLevelTwoUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.TitleLevelTwo owner) {

    com.numhero.client.widget.TitleLevelTwo_TitleLevelTwoUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.TitleLevelTwo_TitleLevelTwoUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.TitleLevelTwo_TitleLevelTwoUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.TitleLevelTwo_TitleLevelTwoUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label title = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span>");

    f_HTMLPanel1.setStyleName("titleLevelTwo");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(title, domId0Element);


    owner.title = title;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
