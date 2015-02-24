package com.numhero.client.mvp.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MoneyinPanel_MoneyinPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.mvp.document.MoneyinPanel>, com.numhero.client.mvp.document.MoneyinPanel.MoneyinPanelUiBinder {
  static MoneyinPanelMoneyinPanelUiBinderImplGenMessages messages = (MoneyinPanelMoneyinPanelUiBinderImplGenMessages) GWT.create(MoneyinPanelMoneyinPanelUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.mvp.document.MoneyinPanel owner) {

    com.numhero.client.mvp.document.MoneyinPanel_MoneyinPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.document.MoneyinPanel_MoneyinPanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.document.MoneyinPanel_MoneyinPanelUiBinderImpl_GenBundle.class);
    com.numhero.client.mvp.document.MoneyinPanel_MoneyinPanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.MoneyinTitlePanel titlePanel = (com.numhero.client.widget.MoneyinTitlePanel) GWT.create(com.numhero.client.widget.MoneyinTitlePanel.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.TitleLevelTwo f_TitleLevelTwo2 = (com.numhero.client.widget.TitleLevelTwo) GWT.create(com.numhero.client.widget.TitleLevelTwo.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.TitleLevelTwo f_TitleLevelTwo3 = (com.numhero.client.widget.TitleLevelTwo) GWT.create(com.numhero.client.widget.TitleLevelTwo.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.TitleLevelThree f_TitleLevelThree4 = (com.numhero.client.widget.TitleLevelThree) GWT.create(com.numhero.client.widget.TitleLevelThree.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span> <div class='sub-container'> <div class='left-panel'> <span id='" + domId1 + "'></span> <table border='0' cellpadding='0' cellspacing='0' class='inh-standard-recap'> <tr> <th>Invoice No.</th> <th>Client</th> <th class='right'>Amount</th> <th class='right'>Status</th> </tr> <tr> <td> <img alt='Download invoice No. 000000' src='/i/files/pdf.gif'> INV 2605 </td> <td>James &amp; Sons Ltd.</td> <td class='right'>£3,500.00 </td> <td class='right'>Sent</td> </tr> <tr> <td> <img alt='Download invoice No. 000000' src='/i/files/pdf.gif'> INV 2605 </td> <td>DTK Ltd.</td> <td class='right'>£18,500.00 </td> <td class='right'>Sent</td> </tr> <tr> <td> <img alt='Download invoice No. 000000' src='/i/files/pdf.gif'> INV 2605 </td> <td>DTMC Ltd.</td> <td class='right'>£3,500.00 </td> <td class='paid'>Paid</td> </tr> <tr> <td> <img alt='Download invoice No. 000000' src='/i/files/pdf.gif'> INV 2605 </td> <td>THC Pharma Ltd.</td> <td class='right'>£10,500.00 </td> <td class='right'>Sent</td> </tr> </table> <hr> <span id='" + domId2 + "'></span> <table border='0' cellpadding='0' cellspacing='0' class='inh-standard-recap'> <tr> <th>Invoice No.</th> <th>Client</th> <th class='right'>Amount</th> <th class='right'>Status</th> </tr> <tr> <td> <img alt='Download invoice No. 000000' src='/i/files/pdf.gif'> INV 2605 </td> <td>James &amp; Sons Ltd.</td> <td class='right'>£3,500.00 </td> <td class='right'>Sent</td> </tr> <tr> <td> <img alt='Download invoice No. 000000' src='/i/files/pdf.gif'> INV 2605 </td> <td>DTK Ltd.</td> <td class='right'>£18,500.00 </td> <td class='right'>Sent</td> </tr> <tr> <td> <img alt='Download invoice No. 000000' src='/i/files/pdf.gif'> INV 2605 </td> <td>DTMC Ltd.</td> <td class='right'>£3,500.00 </td> <td class='paid'>Paid</td> </tr> <tr> <td> <img alt='Download invoice No. 000000' src='/i/files/pdf.gif'> INV 2605 </td> <td>THC Pharma Ltd.</td> <td class='right'>£10,500.00 </td> <td class='right'>Sent</td> </tr> </table> </div> <div class='right-panel'> <span id='" + domId3 + "'></span> <p class='inh-standard'>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur velit ante, fermentum non porttitor nec, accumsan et odio. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur velit ante, fermentum non porttitor nec, accumsan et odio. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur velit ante, fermentum non porttitor nec, accumsan et odio. </p> <table border='0' cellpadding='0' cellspacing='0' class='inh-standard-recap'> <tr> <th>  </th> <th class='right'>Invoices</th> <th class='right'>Estimates</th> </tr> <tr> <td>March 10</td> <td class='right'>£3,500.00 </td> <td class='right'>£18,500.00 </td> </tr> <tr> <td>Feb 10</td> <td class='right'>£3,500.00 </td> <td class='right'>£18,500.00 </td> </tr> <tr> <td>Jan 10</td> <td class='right'>£3,500.00 </td> <td class='right'>£18,500.00 </td> </tr> <tr> <td>Dec 09</td> <td class='right'>£3,500.00 </td> <td class='right'>£18,500.00 </td> </tr> <tr> <td>Nov 09</td> <td class='right'>£3,500.00 </td> <td class='right'>£18,500.00 </td> </tr> </table> </div> </div>");

    f_TitleLevelTwo2.setHTML("" + messages.message1() + "");
    f_TitleLevelTwo3.setHTML("" + messages.message2() + "");
    f_TitleLevelThree4.setHTML("" + messages.message3() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(titlePanel, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(f_TitleLevelTwo2, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_TitleLevelTwo3, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(f_TitleLevelThree4, domId3Element);


    owner.titlePanel = titlePanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
