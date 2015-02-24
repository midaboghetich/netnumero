package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MoneyinTitlePanel_MoneyinTitlePanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.MoneyinTitlePanel>, com.numhero.client.widget.MoneyinTitlePanel.MoneyinTitlePanelUiBinder {
  static MoneyinTitlePanelMoneyinTitlePanelUiBinderImplGenMessages messages = (MoneyinTitlePanelMoneyinTitlePanelUiBinderImplGenMessages) GWT.create(MoneyinTitlePanelMoneyinTitlePanelUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.MoneyinTitlePanel owner) {

    com.numhero.client.widget.MoneyinTitlePanel_MoneyinTitlePanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.MoneyinTitlePanel_MoneyinTitlePanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.MoneyinTitlePanel_MoneyinTitlePanelUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.MoneyinTitlePanel_MoneyinTitlePanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.TitleLevelOne txTitle = (com.numhero.client.widget.TitleLevelOne) GWT.create(com.numhero.client.widget.TitleLevelOne.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.submenu.InvoicesSubmenu f_InvoicesSubmenu2 = (com.numhero.client.widget.submenu.InvoicesSubmenu) GWT.create(com.numhero.client.widget.submenu.InvoicesSubmenu.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.submenu.EstimatesSubmenu f_EstimatesSubmenu3 = (com.numhero.client.widget.submenu.EstimatesSubmenu) GWT.create(com.numhero.client.widget.submenu.EstimatesSubmenu.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.submenu.ItemsSubmenu f_ItemsSubmenu4 = (com.numhero.client.widget.submenu.ItemsSubmenu) GWT.create(com.numhero.client.widget.submenu.ItemsSubmenu.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.NetNumeroButton btRightButton = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='titlePanelContainer'> <div class='panel-title'> <span id='" + domId0 + "'></span> </div> <div class='panel-menu'> <ul class='first-level'> <li class='menu-title'> " + messages.message1() + " <ul class='second-level'> <li> <div id='menu-sub'> <div class='cell'> <span id='" + domId1 + "'></span> </div> </div> </li> </ul> </li> <li class='menu-title'> " + messages.message2() + " <ul class='second-level'> <li> <div id='menu-sub'> <div class='cell'> <span id='" + domId2 + "'></span> </div> </div> </li> </ul> </li> <li class='menu-title'> " + messages.message3() + " <ul class='second-level'> <li> <div id='menu-sub'> <div class='cell'> <span id='" + domId3 + "'></span> </div> </div> </li> </ul> </li> </ul> </div> <div class='panel-button'> <span id='" + domId4 + "'></span> </div> </div> <hr>");


    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(txTitle, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(f_InvoicesSubmenu2, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_EstimatesSubmenu3, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(f_ItemsSubmenu4, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(btRightButton, domId4Element);


    owner.btRightButton = btRightButton;
    owner.txTitle = txTitle;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
