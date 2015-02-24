package com.numhero.client.mvp.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ServicePanel_ServicePanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.service.ServicePanel>, com.numhero.client.mvp.service.ServicePanel.ServicePanelUiBinder {
  static ServicePanelServicePanelUiBinderImplGenMessages messages = (ServicePanelServicePanelUiBinderImplGenMessages) GWT.create(ServicePanelServicePanelUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.service.ServicePanel owner) {

    com.numhero.client.mvp.service.ServicePanel_ServicePanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.service.ServicePanel_ServicePanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.service.ServicePanel_ServicePanelUiBinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Hidden id = (com.google.gwt.user.client.ui.Hidden) GWT.create(com.google.gwt.user.client.ui.Hidden.class);
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.ListBox serviceUnitType = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    com.numhero.client.widget.FormItem f_FormItem4 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox name = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem6 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox description = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem8 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.Label f_Label11 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox unitCost = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem10 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.Label f_Label13 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox unitPrice = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem12 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.Label f_Label15 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox companyId = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem14 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel16 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_Label3.setText("" + messages.message1() + "");
    f_VerticalPanel2.add(f_Label3);
    f_VerticalPanel2.add(id);
    f_Label5.setText("" + messages.message2() + "");
    f_FormItem4.add(f_Label5);
    f_FormItem4.add(serviceUnitType);
    f_VerticalPanel2.add(f_FormItem4);
    f_Label7.setText("" + messages.message3() + "");
    f_FormItem6.add(f_Label7);
    f_FormItem6.add(name);
    f_VerticalPanel2.add(f_FormItem6);
    f_Label9.setText("" + messages.message4() + "");
    f_FormItem8.add(f_Label9);
    f_FormItem8.add(description);
    f_VerticalPanel2.add(f_FormItem8);
    f_Label11.setText("" + messages.message5() + "");
    f_FormItem10.add(f_Label11);
    f_FormItem10.add(unitCost);
    f_VerticalPanel2.add(f_FormItem10);
    f_Label13.setText("" + messages.message6() + "");
    f_FormItem12.add(f_Label13);
    f_FormItem12.add(unitPrice);
    f_VerticalPanel2.add(f_FormItem12);
    f_Label15.setText("" + messages.message7() + "");
    f_FormItem14.add(f_Label15);
    f_FormItem14.add(companyId);
    f_VerticalPanel2.add(f_FormItem14);
    f_VerticalPanel1.add(f_VerticalPanel2);
    btSave.setHTML("" + messages.message8() + "");
    btSave.setStyleName("inh-button");
    btSave.setHref("javascript:;");
    f_HorizontalPanel16.add(btSave);
    btCancel.setHTML("" + messages.message9() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("javascript:;");
    f_HorizontalPanel16.add(btCancel);
    f_VerticalPanel1.add(f_HorizontalPanel16);



    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.companyId = companyId;
    owner.description = description;
    owner.id = id;
    owner.name = name;
    owner.serviceUnitType = serviceUnitType;
    owner.unitCost = unitCost;
    owner.unitPrice = unitPrice;

    return f_VerticalPanel1;
  }
}
