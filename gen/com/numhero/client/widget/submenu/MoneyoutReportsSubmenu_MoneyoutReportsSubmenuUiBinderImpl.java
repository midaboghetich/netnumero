package com.numhero.client.widget.submenu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MoneyoutReportsSubmenu_MoneyoutReportsSubmenuUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.submenu.MoneyoutReportsSubmenu>, com.numhero.client.widget.submenu.MoneyoutReportsSubmenu.MoneyoutReportsSubmenuUiBinder {
  static MoneyoutReportsSubmenuMoneyoutReportsSubmenuUiBinderImplGenMessages messages = (MoneyoutReportsSubmenuMoneyoutReportsSubmenuUiBinderImplGenMessages) GWT.create(MoneyoutReportsSubmenuMoneyoutReportsSubmenuUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.submenu.MoneyoutReportsSubmenu owner) {

    com.numhero.client.widget.submenu.MoneyoutReportsSubmenu_MoneyoutReportsSubmenuUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.submenu.MoneyoutReportsSubmenu_MoneyoutReportsSubmenuUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.submenu.MoneyoutReportsSubmenu_MoneyoutReportsSubmenuUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.submenu.MoneyoutReportsSubmenu_MoneyoutReportsSubmenuUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<dl class='inh-menu'> <dt class='inh-menu'> <a class='inh-menu' href='#'> " + messages.message1() + " </a> </dt> <dt class='inh-menu-end'> <a class='inh-menu' href='#'> " + messages.message2() + " </a> </dt> </dl>");




    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
