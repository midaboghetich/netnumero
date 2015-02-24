package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.dom.client.Element;

public class HeaderPanel_HeaderPanelUiBinderImpl implements UiBinder<com.google.gwt.dom.client.Element, com.numhero.client.widget.HeaderPanel>, com.numhero.client.widget.HeaderPanel.HeaderPanelUiBinder {

  public com.google.gwt.dom.client.Element createAndBindUi(final com.numhero.client.widget.HeaderPanel owner) {

    com.numhero.client.widget.HeaderPanel_HeaderPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.HeaderPanel_HeaderPanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.HeaderPanel_HeaderPanelUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.HeaderPanel_HeaderPanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.DivElement mainDivContainer = (com.google.gwt.dom.client.DivElement) UiBinderUtil.fromHtml("<div class='header'></div>");




    owner.mainDivContainer = mainDivContainer;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return mainDivContainer;
  }
}
