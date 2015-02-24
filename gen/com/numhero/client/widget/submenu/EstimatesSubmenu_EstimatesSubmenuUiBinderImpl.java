package com.numhero.client.widget.submenu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class EstimatesSubmenu_EstimatesSubmenuUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.submenu.EstimatesSubmenu>, com.numhero.client.widget.submenu.EstimatesSubmenu.EstimatesSubmenuUiBinder {
  static EstimatesSubmenuEstimatesSubmenuUiBinderImplGenMessages messages = (EstimatesSubmenuEstimatesSubmenuUiBinderImplGenMessages) GWT.create(EstimatesSubmenuEstimatesSubmenuUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.submenu.EstimatesSubmenu owner) {

    com.numhero.client.widget.submenu.EstimatesSubmenu_EstimatesSubmenuUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.submenu.EstimatesSubmenu_EstimatesSubmenuUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.submenu.EstimatesSubmenu_EstimatesSubmenuUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.submenu.EstimatesSubmenu_EstimatesSubmenuUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<dl class='inh-menu'> <dt class='inh-menu'> <a class='inh-menu' href='#estimate'> " + messages.message1() + " </a> </dt> <dt class='inh-menu'> <a class='inh-menu' href='#estimates'> " + messages.message2() + " </a> </dt> <dt class='inh-menu'> <a class='inh-menu' href='#'> " + messages.message3() + " </a> </dt> <dt class='inh-menu-end'> <a class='inh-menu' href='#'> " + messages.message4() + " </a> </dt> </dl>");




    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
