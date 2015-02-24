package com.numhero.client.widget.submenu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ItemsSubmenu_ItemsSubmenuUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.submenu.ItemsSubmenu>, com.numhero.client.widget.submenu.ItemsSubmenu.ItemsSubmenuUiBinder {
  static ItemsSubmenuItemsSubmenuUiBinderImplGenMessages messages = (ItemsSubmenuItemsSubmenuUiBinderImplGenMessages) GWT.create(ItemsSubmenuItemsSubmenuUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.submenu.ItemsSubmenu owner) {

    com.numhero.client.widget.submenu.ItemsSubmenu_ItemsSubmenuUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.submenu.ItemsSubmenu_ItemsSubmenuUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.submenu.ItemsSubmenu_ItemsSubmenuUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.submenu.ItemsSubmenu_ItemsSubmenuUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<dl class='inh-menu'> <dt class='inh-menu'> <a class='inh-menu' href='#product'> " + messages.message1() + " </a> </dt> <dt class='inh-menu'> <a class='inh-menu' href='#products'> " + messages.message2() + " </a> </dt> <dt class='inh-menu'> <a class='inh-menu' href='#service'> " + messages.message3() + " </a> </dt> <dt class='inh-menu-end'> <a class='inh-menu' href='#services'> " + messages.message4() + " </a> </dt> </dl>");




    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
