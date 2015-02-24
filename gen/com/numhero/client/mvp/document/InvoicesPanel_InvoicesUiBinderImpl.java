package com.numhero.client.mvp.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class InvoicesPanel_InvoicesUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.document.InvoicesPanel>, com.numhero.client.mvp.document.InvoicesPanel.InvoicesUiBinder {
  static InvoicesPanelInvoicesUiBinderImplGenMessages messages = (InvoicesPanelInvoicesUiBinderImplGenMessages) GWT.create(InvoicesPanelInvoicesUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.document.InvoicesPanel owner) {

    com.numhero.client.mvp.document.InvoicesPanel_InvoicesUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.document.InvoicesPanel_InvoicesUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.document.InvoicesPanel_InvoicesUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.TitleLevelOne f_TitleLevelOne3 = (com.numhero.client.widget.TitleLevelOne) GWT.create(com.numhero.client.widget.TitleLevelOne.class);
    com.numhero.client.widget.NetNumeroButton f_NetNumeroButton4 = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.numhero.client.mvp.document.InvoicesTable invoicesTable = (com.numhero.client.mvp.document.InvoicesTable) GWT.create(com.numhero.client.mvp.document.InvoicesTable.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_TitleLevelOne3.setText("Money in");
    f_HorizontalPanel2.add(f_TitleLevelOne3);
    f_HorizontalPanel2.setCellVerticalAlignment(f_TitleLevelOne3, com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
    f_HorizontalPanel2.setCellWidth(f_TitleLevelOne3, "50%");
    f_NetNumeroButton4.setHTML("" + messages.message1() + "");
    f_NetNumeroButton4.setHref("#invoice");
    f_HorizontalPanel2.add(f_NetNumeroButton4);
    f_HorizontalPanel2.setCellHorizontalAlignment(f_NetNumeroButton4, com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
    f_HorizontalPanel2.setCellVerticalAlignment(f_NetNumeroButton4, com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
    f_HorizontalPanel2.setCellWidth(f_NetNumeroButton4, "50%");
    f_HorizontalPanel2.setWidth("100%");
    f_VerticalPanel1.add(f_HorizontalPanel2);
    invoicesTable.setStyleName("invoiceDetails inh-standard");
    invoicesTable.setCellSpacing(0);
    invoicesTable.setCellPadding(0);
    f_VerticalPanel1.add(invoicesTable);
    f_VerticalPanel1.setWidth("100%");



    owner.invoicesTable = invoicesTable;

    return f_VerticalPanel1;
  }
}
