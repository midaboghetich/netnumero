package com.numhero.client.mvp.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class InvoicePanel_InvoiceUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.mvp.document.InvoicePanel>, com.numhero.client.mvp.document.InvoicePanel.InvoiceUiBinder {
  static InvoicePanelInvoiceUiBinderImplGenMessages messages = (InvoicePanelInvoiceUiBinderImplGenMessages) GWT.create(InvoicePanelInvoiceUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.mvp.document.InvoicePanel owner) {

    com.numhero.client.mvp.document.InvoicePanel_InvoiceUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.document.InvoicePanel_InvoiceUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.document.InvoicePanel_InvoiceUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.DisclosurePanel errorsPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Errors");
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.mvp.clientsupplier.ClientSelect sbClient = owner.sbClient;
    com.numhero.client.widget.FormItem f_FormItem2 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbInvoiceID = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem4 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.CustomFormatDateBox dateRaised = (com.numhero.client.widget.CustomFormatDateBox) GWT.create(com.numhero.client.widget.CustomFormatDateBox.class);
    com.numhero.client.widget.FormItem f_FormItem6 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.CustomFormatDateBox dateDue = (com.numhero.client.widget.CustomFormatDateBox) GWT.create(com.numhero.client.widget.CustomFormatDateBox.class);
    com.numhero.client.widget.FormItem f_FormItem8 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label11 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.combobox.CurrencyEnumComboBox cbCurrency = (com.numhero.client.widget.combobox.CurrencyEnumComboBox) GWT.create(com.numhero.client.widget.combobox.CurrencyEnumComboBox.class);
    com.numhero.client.widget.FormItem f_FormItem10 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.mvp.document.InvoiceDetailsTable invoiceDetailsTable = owner.invoiceDetailsTable;
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.NetNumeroButton btAddInvoiceDetail = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label13 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.textbox.NumberTextBox tbDiscount = owner.tbDiscount;
    com.numhero.client.widget.FormItem f_FormItem12 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label15 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.textbox.NumberTextBox tbPrice = (com.numhero.client.widget.textbox.NumberTextBox) GWT.create(com.numhero.client.widget.textbox.NumberTextBox.class);
    com.numhero.client.widget.FormItem f_FormItem14 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label17 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextArea taTermsConditions = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
    com.numhero.client.widget.FormItemVertical f_FormItemVertical16 = (com.numhero.client.widget.FormItemVertical) GWT.create(com.numhero.client.widget.FormItemVertical.class);
    java.lang.String domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label19 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextArea taNotes = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
    com.numhero.client.widget.FormItemVertical f_FormItemVertical18 = (com.numhero.client.widget.FormItemVertical) GWT.create(com.numhero.client.widget.FormItemVertical.class);
    java.lang.String domId12 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel20 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span> <table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <tbody> <tr> <td class='formItem'> <span id='" + domId1 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId2 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId3 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId4 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId5 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId6 + "'></span> </td> </tr> <tr> <td style='height:54px;'> <span id='" + domId7 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId8 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId9 + "'></span> </td> </tr> <tr> <td class='formItem'> <table cellpadding='0' cellspacing='0' width='100%'> <tr> <td width='50%'> <span id='" + domId10 + "'></span> </td> <td>    </td> <td width='50%'> <span id='" + domId11 + "'></span> </td> </tr> </table> </td> </tr> </tbody> </table> <span id='" + domId12 + "'></span>");

    errorsPanel.setStyleName("validation-advice");
    errorsPanel.setWidth("100%");
    f_Label3.setText("" + messages.message1() + "");
    f_FormItem2.add(f_Label3);
    f_FormItem2.add(sbClient);
    f_FormItem2.setTitleWidth(120);
    f_Label5.setText("" + messages.message2() + "");
    f_FormItem4.add(f_Label5);
    f_FormItem4.add(tbInvoiceID);
    f_FormItem4.setTitleWidth(120);
    f_Label7.setText("" + messages.message3() + "");
    f_FormItem6.add(f_Label7);
    f_FormItem6.add(dateRaised);
    f_FormItem6.setTitleWidth(120);
    f_Label9.setText("" + messages.message4() + "");
    f_FormItem8.add(f_Label9);
    f_FormItem8.add(dateDue);
    f_FormItem8.setTitleWidth(120);
    f_Label11.setText("" + messages.message5() + "");
    f_FormItem10.add(f_Label11);
    f_FormItem10.add(cbCurrency);
    f_FormItem10.setTitleWidth(120);
    invoiceDetailsTable.setStyleName("invoiceDetails inh-standard");
    invoiceDetailsTable.setCellSpacing(0);
    invoiceDetailsTable.setCellPadding(0);
    btAddInvoiceDetail.setHTML("" + messages.message6() + "");
    btAddInvoiceDetail.setStyleName("inh-button");
    btAddInvoiceDetail.setHref("javascript:;");
    f_Label13.setText("" + messages.message7() + "");
    f_FormItem12.add(f_Label13);
    f_FormItem12.add(tbDiscount);
    f_FormItem12.setTitleWidth(120);
    f_Label15.setText("" + messages.message8() + "");
    f_FormItem14.add(f_Label15);
    tbPrice.setReadOnly(true);
    f_FormItem14.add(tbPrice);
    f_FormItem14.setTitleWidth(120);
    f_Label17.setText("" + messages.message9() + "");
    f_FormItemVertical16.add(f_Label17);
    taTermsConditions.setWidth("100%");
    f_FormItemVertical16.add(taTermsConditions);
    f_FormItemVertical16.setWidth("100%");
    f_Label19.setText("" + messages.message10() + "");
    f_FormItemVertical18.add(f_Label19);
    taNotes.setWidth("100%");
    f_FormItemVertical18.add(taNotes);
    f_FormItemVertical18.setWidth("100%");
    btSave.setHTML("" + messages.message11() + "");
    btSave.setStyleName("inh-button");
    btSave.setHref("javascript:;");
    f_HorizontalPanel20.add(btSave);
    btCancel.setHTML("" + messages.message12() + "");
    btCancel.setStyleName("inh-button");
    f_HorizontalPanel20.add(btCancel);
    f_HorizontalPanel20.setStyleName("buttonsPanel");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    com.google.gwt.user.client.Element domId7Element = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    com.google.gwt.user.client.Element domId8Element = com.google.gwt.dom.client.Document.get().getElementById(domId8).cast();
    com.google.gwt.user.client.Element domId9Element = com.google.gwt.dom.client.Document.get().getElementById(domId9).cast();
    com.google.gwt.user.client.Element domId10Element = com.google.gwt.dom.client.Document.get().getElementById(domId10).cast();
    com.google.gwt.user.client.Element domId11Element = com.google.gwt.dom.client.Document.get().getElementById(domId11).cast();
    com.google.gwt.user.client.Element domId12Element = com.google.gwt.dom.client.Document.get().getElementById(domId12).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(errorsPanel, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem2, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem4, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem6, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem8, domId4Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem10, domId5Element);
    f_HTMLPanel1.addAndReplaceElement(invoiceDetailsTable, domId6Element);
    f_HTMLPanel1.addAndReplaceElement(btAddInvoiceDetail, domId7Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem12, domId8Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem14, domId9Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItemVertical16, domId10Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItemVertical18, domId11Element);
    f_HTMLPanel1.addAndReplaceElement(f_HorizontalPanel20, domId12Element);


    owner.btAddInvoiceDetail = btAddInvoiceDetail;
    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.cbCurrency = cbCurrency;
    owner.dateDue = dateDue;
    owner.dateRaised = dateRaised;
    owner.errorsPanel = errorsPanel;
    owner.taNotes = taNotes;
    owner.taTermsConditions = taTermsConditions;
    owner.tbInvoiceID = tbInvoiceID;
    owner.tbPrice = tbPrice;

    return f_HTMLPanel1;
  }
}
