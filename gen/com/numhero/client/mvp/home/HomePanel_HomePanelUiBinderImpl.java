package com.numhero.client.mvp.home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class HomePanel_HomePanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.mvp.home.HomePanel>, com.numhero.client.mvp.home.HomePanel.HomePanelUiBinder {
  static HomePanelHomePanelUiBinderImplGenMessages messages = (HomePanelHomePanelUiBinderImplGenMessages) GWT.create(HomePanelHomePanelUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.mvp.home.HomePanel owner) {

    com.numhero.client.mvp.home.HomePanel_HomePanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.home.HomePanel_HomePanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.home.HomePanel_HomePanelUiBinderImpl_GenBundle.class);
    com.numhero.client.mvp.home.HomePanel_HomePanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.TitleLevelOne f_TitleLevelOne2 = (com.numhero.client.widget.TitleLevelOne) GWT.create(com.numhero.client.widget.TitleLevelOne.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.TitleLevelTwo f_TitleLevelTwo4 = (com.numhero.client.widget.TitleLevelTwo) GWT.create(com.numhero.client.widget.TitleLevelTwo.class);
    com.numhero.client.widget.NetNumeroButton btNewInvoice = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btNewEstimate = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel5 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.numhero.client.widget.NetNumeroButton btTimeTrack = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btNewReport = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel3 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div id='dashboardTopLayout'> <div id='dashboardOverviewDesc'> <span id='" + domId0 + "'></span> <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nunc dui, mattis eget aliquet nec, suscipit vel dolor. Donec gravida pellentesque viverra. Nullam luctus rutrum neque. </p> </div> <div id='dashboardOverviewTable'> <table border='0' cellpadding='0' cellspacing='0' class='inh-standard-recap'> <tr> <th>  </th> <th class='right'> " + messages.message2() + " </th> <th class='right'> " + messages.message3() + " </th> </tr> <tr> <td> " + messages.message4() + " </td> <td class='right'>£3,500.00 </td> <td class='right'>£18,500.00 </td> </tr> <tr> <td> " + messages.message5() + " </td> <td class='right'>£3,500.00 </td> <td class='right'>£18,500.00 </td> </tr> <tr> <td> " + messages.message6() + " </td> <td class='right'>£3,500.00 </td> <td class='right'>£18,500.00 </td> </tr> </table> </div> <div id='dashboardOverviewActions'> <span id='" + domId1 + "'></span> </div> </div> <hr>");

    f_TitleLevelOne2.setHTML("" + messages.message1() + "");
    f_TitleLevelTwo4.setHTML("I would like to...");
    f_VerticalPanel3.add(f_TitleLevelTwo4);
    btNewInvoice.setHTML("" + messages.message7() + "");
    btNewInvoice.setHref("#invoice");
    f_HorizontalPanel5.add(btNewInvoice);
    btNewEstimate.setHTML("" + messages.message8() + "");
    btNewEstimate.setHref("#estimate");
    f_HorizontalPanel5.add(btNewEstimate);
    f_HorizontalPanel5.setStyleName("home-buttons-container");
    f_VerticalPanel3.add(f_HorizontalPanel5);
    btTimeTrack.setHTML("" + messages.message9() + "");
    btTimeTrack.setHref("#projects");
    f_HorizontalPanel6.add(btTimeTrack);
    btNewReport.setHTML("" + messages.message10() + "");
    btNewReport.setHref("#report");
    f_HorizontalPanel6.add(btNewReport);
    f_HorizontalPanel6.setStyleName("home-buttons-container");
    f_VerticalPanel3.add(f_HorizontalPanel6);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_TitleLevelOne2, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(f_VerticalPanel3, domId1Element);


    owner.btNewEstimate = btNewEstimate;
    owner.btNewInvoice = btNewInvoice;
    owner.btNewReport = btNewReport;
    owner.btTimeTrack = btTimeTrack;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
