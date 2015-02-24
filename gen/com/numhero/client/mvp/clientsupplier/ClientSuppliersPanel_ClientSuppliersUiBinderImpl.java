package com.numhero.client.mvp.clientsupplier;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ClientSuppliersPanel_ClientSuppliersUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.clientsupplier.ClientSuppliersPanel>, com.numhero.client.mvp.clientsupplier.ClientSuppliersPanel.ClientSuppliersUiBinder {
  static ClientSuppliersPanelClientSuppliersUiBinderImplGenMessages messages = (ClientSuppliersPanelClientSuppliersUiBinderImplGenMessages) GWT.create(ClientSuppliersPanelClientSuppliersUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.clientsupplier.ClientSuppliersPanel owner) {

    com.numhero.client.mvp.clientsupplier.ClientSuppliersPanel_ClientSuppliersUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.clientsupplier.ClientSuppliersPanel_ClientSuppliersUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.clientsupplier.ClientSuppliersPanel_ClientSuppliersUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.TitleLevelOne f_TitleLevelOne3 = (com.numhero.client.widget.TitleLevelOne) GWT.create(com.numhero.client.widget.TitleLevelOne.class);
    com.numhero.client.widget.NetNumeroButton f_NetNumeroButton4 = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.numhero.client.mvp.clientsupplier.ClientSuppliersTable clientSuppliersTable = (com.numhero.client.mvp.clientsupplier.ClientSuppliersTable) GWT.create(com.numhero.client.mvp.clientsupplier.ClientSuppliersTable.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_TitleLevelOne3.setText("Clients");
    f_HorizontalPanel2.add(f_TitleLevelOne3);
    f_HorizontalPanel2.setCellVerticalAlignment(f_TitleLevelOne3, com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
    f_HorizontalPanel2.setCellWidth(f_TitleLevelOne3, "50%");
    f_NetNumeroButton4.setHTML("" + messages.message1() + "");
    f_NetNumeroButton4.setStyleName("inh-button");
    f_NetNumeroButton4.setHref("#client");
    f_HorizontalPanel2.add(f_NetNumeroButton4);
    f_HorizontalPanel2.setCellHorizontalAlignment(f_NetNumeroButton4, com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
    f_HorizontalPanel2.setCellVerticalAlignment(f_NetNumeroButton4, com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
    f_HorizontalPanel2.setCellWidth(f_NetNumeroButton4, "50%");
    f_HorizontalPanel2.setWidth("100%");
    f_VerticalPanel1.add(f_HorizontalPanel2);
    clientSuppliersTable.setStyleName("inh-standard");
    clientSuppliersTable.setCellSpacing(0);
    clientSuppliersTable.setCellPadding(0);
    f_VerticalPanel1.add(clientSuppliersTable);
    f_VerticalPanel1.setWidth("100%");



    owner.clientSuppliersTable = clientSuppliersTable;

    return f_VerticalPanel1;
  }
}
