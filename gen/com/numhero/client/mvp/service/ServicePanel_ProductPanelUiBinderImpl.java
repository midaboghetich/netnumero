package com.numhero.client.mvp.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ServicePanel_ProductPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.service.ServicePanel>, com.numhero.client.mvp.service.ServicePanel.ProductPanelUiBinder {
  static ServicePanelProductPanelUiBinderImplGenMessages messages = (ServicePanelProductPanelUiBinderImplGenMessages) GWT.create(ServicePanelProductPanelUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.service.ServicePanel owner) {

    com.numhero.client.mvp.service.ServicePanel_ProductPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.service.ServicePanel_ProductPanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.service.ServicePanel_ProductPanelUiBinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.DisclosurePanel errorsPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Errors");
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbServiceName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem3 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbServiceDescription = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem5 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label8 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.combobox.CurrencyEnumComboBox cbServiceCurrency = (com.numhero.client.widget.combobox.CurrencyEnumComboBox) GWT.create(com.numhero.client.widget.combobox.CurrencyEnumComboBox.class);
    com.numhero.client.widget.FormItem f_FormItem7 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label10 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.textbox.NumberTextBox tbServiceUnitPrice = (com.numhero.client.widget.textbox.NumberTextBox) GWT.create(com.numhero.client.widget.textbox.NumberTextBox.class);
    com.numhero.client.widget.FormItem f_FormItem9 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label12 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.combobox.ServiceUnitEnumComboBox cbServiceUnit = (com.numhero.client.widget.combobox.ServiceUnitEnumComboBox) GWT.create(com.numhero.client.widget.combobox.ServiceUnitEnumComboBox.class);
    com.numhero.client.widget.FormItem f_FormItem11 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <tbody> <tr> <td class='formItem'> <span id='" + domId0 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId1 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId2 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId3 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId4 + "'></span> </td> </tr> </tbody> </table>");
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel13 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    errorsPanel.setStyleName("validation-advice");
    errorsPanel.setWidth("100%");
    f_VerticalPanel1.add(errorsPanel);
    f_Label4.setText("" + messages.message1() + "");
    f_FormItem3.add(f_Label4);
    f_FormItem3.add(tbServiceName);
    f_FormItem3.setTitleWidth(120);
    f_Label6.setText("" + messages.message2() + "");
    f_FormItem5.add(f_Label6);
    f_FormItem5.add(tbServiceDescription);
    f_FormItem5.setTitleWidth(120);
    f_Label8.setText("" + messages.message3() + "");
    f_FormItem7.add(f_Label8);
    f_FormItem7.add(cbServiceCurrency);
    f_FormItem7.setTitleWidth(120);
    f_Label10.setText("" + messages.message4() + "");
    f_FormItem9.add(f_Label10);
    f_FormItem9.add(tbServiceUnitPrice);
    f_FormItem9.setTitleWidth(120);
    f_Label12.setText("" + messages.message5() + "");
    f_FormItem11.add(f_Label12);
    f_FormItem11.add(cbServiceUnit);
    f_FormItem11.setTitleWidth(120);
    f_VerticalPanel1.add(f_HTMLPanel2);
    btSave.setHTML("" + messages.message6() + "");
    btSave.setStyleName("inh-button");
    btSave.setHref("javascript:;");
    f_HorizontalPanel13.add(btSave);
    btCancel.setHTML("" + messages.message7() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("javascript:;");
    f_HorizontalPanel13.add(btCancel);
    f_HorizontalPanel13.setStyleName("buttonsPanel");
    f_VerticalPanel1.add(f_HorizontalPanel13);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(f_FormItem3, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem5, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem7, domId2Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem9, domId3Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem11, domId4Element);


    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.cbServiceCurrency = cbServiceCurrency;
    owner.cbServiceUnit = cbServiceUnit;
    owner.errorsPanel = errorsPanel;
    owner.tbServiceDescription = tbServiceDescription;
    owner.tbServiceName = tbServiceName;
    owner.tbServiceUnitPrice = tbServiceUnitPrice;

    return f_VerticalPanel1;
  }
}
