package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.dom.client.Element;

public class HeaderLine_HeaderLineUiBinderImpl implements UiBinder<com.google.gwt.dom.client.Element, com.numhero.client.widget.HeaderLine>, com.numhero.client.widget.HeaderLine.HeaderLineUiBinder {
  static HeaderLineHeaderLineUiBinderImplGenMessages messages = (HeaderLineHeaderLineUiBinderImplGenMessages) GWT.create(HeaderLineHeaderLineUiBinderImplGenMessages.class);

  public com.google.gwt.dom.client.Element createAndBindUi(final com.numhero.client.widget.HeaderLine owner) {

    com.numhero.client.widget.HeaderLine_HeaderLineUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.HeaderLine_HeaderLineUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.HeaderLine_HeaderLineUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.HeaderLine_HeaderLineUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.AnchorElement myAccount = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.AnchorElement settings = null;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.AnchorElement users = null;
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.AnchorElement help = null;
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement currentDate = null;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.AnchorElement logout = null;
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.DivElement f_div1 = (com.google.gwt.dom.client.DivElement) UiBinderUtil.fromHtml("<div id='header-line'><div id='header-line-left'> <ul> <li> <a href='#businessaccount' id='" + domId0 + "'> " + messages.message1() + " </a> </li> <li> <a href='#settings' id='" + domId1 + "'> " + messages.message2() + " </a> </li> <li> <a href='#users' id='" + domId2 + "'> " + messages.message3() + " </a> </li> <li> <a href='#Help' id='" + domId3 + "'> " + messages.message4() + " </a> </li> </ul> </div> <div id='header-line-right'> <span class='currentDate' id='" + domId4 + "'></span> | <a class='logoutButton' href='#Logout' id='" + domId5 + "'> " + messages.message5() + " </a> </div></div>");


    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_div1);
    myAccount = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    myAccount.removeAttribute("id");
    settings = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    settings.removeAttribute("id");
    users = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    users.removeAttribute("id");
    help = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    help.removeAttribute("id");
    currentDate = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    currentDate.removeAttribute("id");
    logout = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    logout.removeAttribute("id");
    attachRecord0.detach();


    owner.currentDate = currentDate;
    owner.help = help;
    owner.logout = logout;
    owner.myAccount = myAccount;
    owner.settings = settings;
    owner.style = style;
    owner.users = users;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_div1;
  }
}
