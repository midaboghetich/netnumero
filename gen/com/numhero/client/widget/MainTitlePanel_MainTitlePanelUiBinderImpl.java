package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MainTitlePanel_MainTitlePanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.MainTitlePanel>, com.numhero.client.widget.MainTitlePanel.MainTitlePanelUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.MainTitlePanel owner) {

    com.numhero.client.widget.MainTitlePanel_MainTitlePanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.MainTitlePanel_MainTitlePanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.MainTitlePanel_MainTitlePanelUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.MainTitlePanel_MainTitlePanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.numhero.client.widget.TitleLevelOne txTitle = (com.numhero.client.widget.TitleLevelOne) GWT.create(com.numhero.client.widget.TitleLevelOne.class);
    com.google.gwt.user.client.ui.HorizontalPanel subMenubar = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.HorizontalPanel rightButtonSpace = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.numhero.client.widget.HRElement f_HRElement4 = (com.numhero.client.widget.HRElement) GWT.create(com.numhero.client.widget.HRElement.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel3 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_HorizontalPanel2.add(txTitle);
    subMenubar.setWidth("100%");
    f_HorizontalPanel2.add(subMenubar);
    rightButtonSpace.setStyleName("button-container");
    rightButtonSpace.setWidth("100%");
    f_HorizontalPanel2.add(rightButtonSpace);
    f_HorizontalPanel2.setWidth("100%");
    f_VerticalPanel1.add(f_HorizontalPanel2);
    f_HorizontalPanel3.add(f_HRElement4);
    f_HorizontalPanel3.setWidth("100%");
    f_VerticalPanel1.add(f_HorizontalPanel3);
    f_VerticalPanel1.setWidth("100%");



    owner.rightButtonSpace = rightButtonSpace;
    owner.subMenubar = subMenubar;
    owner.txTitle = txTitle;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_VerticalPanel1;
  }
}