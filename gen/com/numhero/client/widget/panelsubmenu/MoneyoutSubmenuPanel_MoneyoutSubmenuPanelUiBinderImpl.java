package com.numhero.client.widget.panelsubmenu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MoneyoutSubmenuPanel_MoneyoutSubmenuPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel>, com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel.MoneyoutSubmenuPanelUiBinder {
  static MoneyoutSubmenuPanelMoneyoutSubmenuPanelUiBinderImplGenMessages messages = (MoneyoutSubmenuPanelMoneyoutSubmenuPanelUiBinderImplGenMessages) GWT.create(MoneyoutSubmenuPanelMoneyoutSubmenuPanelUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel owner) {

    com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel_MoneyoutSubmenuPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel_MoneyoutSubmenuPanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel_MoneyoutSubmenuPanelUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel_MoneyoutSubmenuPanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.submenu.ExpensesSubmenu f_ExpensesSubmenu2 = (com.numhero.client.widget.submenu.ExpensesSubmenu) GWT.create(com.numhero.client.widget.submenu.ExpensesSubmenu.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<ul class='first-level'> <li class='menu-title'> " + messages.message1() + " <ul class='second-level'> <li> <div id='menu-sub'> <div class='cell'> <span id='" + domId0 + "'></span> </div> </div> </li> </ul> </li> </ul>");

    f_HTMLPanel1.setStyleName("panel-menu");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_ExpensesSubmenu2, domId0Element);


    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}