package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class Footer_FooterUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.Footer>, com.numhero.client.widget.Footer.FooterUiBinder {
  static FooterFooterUiBinderImplGenMessages messages = (FooterFooterUiBinderImplGenMessages) GWT.create(FooterFooterUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.Footer owner) {

    com.numhero.client.widget.Footer_FooterUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.Footer_FooterUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.Footer_FooterUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.Footer_FooterUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div id='footer-content'> <div class='link-bar'> <ul> <li class='bar'> <a class='inh-standard' href='#'>" + messages.message1() + "</a> </li> <li class='bar'> <a class='inh-standard' href='http://www.netnumero.com/terms/'>" + messages.message2() + "</a> </li> <li> <a class='inh-standard' href='mailto:contact@netnumero.com?subject=Application Enquiry'>" + messages.message3() + "</a> </li> </ul> </div> <div class='info'> <strong class='logo'> <a href='/index.html'></a> </strong> <p> " + messages.message4() + " <a class='inh-standard' href='http://www.netnumero.com'> " + messages.message5() + " </a> " + messages.message6() + " </p> </div> </div>");

    f_HTMLPanel1.setStyleName("footer");



    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
