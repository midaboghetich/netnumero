package com.numhero.client.widget.submenu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class TrackTimeSubmenu_TrackTimeSubmenuUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.submenu.TrackTimeSubmenu>, com.numhero.client.widget.submenu.TrackTimeSubmenu.TrackTimeSubmenuUiBinder {
  static TrackTimeSubmenuTrackTimeSubmenuUiBinderImplGenMessages messages = (TrackTimeSubmenuTrackTimeSubmenuUiBinderImplGenMessages) GWT.create(TrackTimeSubmenuTrackTimeSubmenuUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.submenu.TrackTimeSubmenu owner) {

    com.numhero.client.widget.submenu.TrackTimeSubmenu_TrackTimeSubmenuUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.submenu.TrackTimeSubmenu_TrackTimeSubmenuUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.submenu.TrackTimeSubmenu_TrackTimeSubmenuUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.submenu.TrackTimeSubmenu_TrackTimeSubmenuUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<dl class='inh-menu'> <dt class='inh-menu'> <a class='inh-menu' href='#timeentry'> " + messages.message1() + " </a> </dt> <dt class='inh-menu-end'> <a class='inh-menu' href='#timeentries'> " + messages.message2() + " </a> </dt> </dl>");




    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
