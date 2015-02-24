package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ClientsTitlePanel_ClientsTitlePanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.ClientsTitlePanel>, com.numhero.client.widget.ClientsTitlePanel.ClientsTitlePanelUiBinder {
  static ClientsTitlePanelClientsTitlePanelUiBinderImplGenMessages messages = (ClientsTitlePanelClientsTitlePanelUiBinderImplGenMessages) GWT.create(ClientsTitlePanelClientsTitlePanelUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.ClientsTitlePanel owner) {

    com.numhero.client.widget.ClientsTitlePanel_ClientsTitlePanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.ClientsTitlePanel_ClientsTitlePanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.ClientsTitlePanel_ClientsTitlePanelUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.ClientsTitlePanel_ClientsTitlePanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.TitleLevelOne txTitle = (com.numhero.client.widget.TitleLevelOne) GWT.create(com.numhero.client.widget.TitleLevelOne.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.submenu.ClientsSubmenu f_ClientsSubmenu2 = (com.numhero.client.widget.submenu.ClientsSubmenu) GWT.create(com.numhero.client.widget.submenu.ClientsSubmenu.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.submenu.SuppliersSubmenu f_SuppliersSubmenu3 = (com.numhero.client.widget.submenu.SuppliersSubmenu) GWT.create(com.numhero.client.widget.submenu.SuppliersSubmenu.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.NetNumeroButton btRightButton = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='titlePanelContainer'> <div class='panel-title'> <span id='" + domId0 + "'></span> </div> <div class='panel-menu'> <ul class='first-level'> <li class='menu-title'> " + messages.message1() + " <ul class='second-level'> <li> <div id='menu-sub'> <div class='cell'> <span id='" + domId1 + "'></span> </div> </div> </li> </ul> </li> <li class='menu-title'> " + messages.message2() + " <ul class='second-level'> <li> <div id='menu-sub'> <div class='cell'> <span id='" + domId2 + "'></span> </div> </div> </li> </ul> </li> </ul> </div> <div class='panel-button'> <span id='" + domId3 + "'></span> </div> </div> <hr>");


    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(txTitle, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(f_ClientsSubmenu2, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_SuppliersSubmenu3, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(btRightButton, domId3Element);


    owner.btRightButton = btRightButton;
    owner.txTitle = txTitle;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
