package com.numhero.client.mvp.product;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ProductPanel_ProductPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.numhero.client.mvp.product.ProductPanel>, com.numhero.client.mvp.product.ProductPanel.ProductPanelUiBinder {
  static ProductPanelProductPanelUiBinderImplGenMessages messages = (ProductPanelProductPanelUiBinderImplGenMessages) GWT.create(ProductPanelProductPanelUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.numhero.client.mvp.product.ProductPanel owner) {

    com.numhero.client.mvp.product.ProductPanel_ProductPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.product.ProductPanel_ProductPanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.product.ProductPanel_ProductPanelUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.DisclosurePanel errorsPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Errors");
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbProductName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem2 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbProductDescription = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem4 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.combobox.CurrencyEnumComboBox cbProductCurrency = (com.numhero.client.widget.combobox.CurrencyEnumComboBox) GWT.create(com.numhero.client.widget.combobox.CurrencyEnumComboBox.class);
    com.numhero.client.widget.FormItem f_FormItem6 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.textbox.NumberTextBox tbProductUnitPrice = (com.numhero.client.widget.textbox.NumberTextBox) GWT.create(com.numhero.client.widget.textbox.NumberTextBox.class);
    com.numhero.client.widget.FormItem f_FormItem8 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label11 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.CheckBox cbProductTrackingEnabled = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    com.numhero.client.widget.FormItem f_FormItem10 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label lbProductQuantity = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.numhero.client.widget.textbox.NumberTextBox tbProductQuantity = (com.numhero.client.widget.textbox.NumberTextBox) GWT.create(com.numhero.client.widget.textbox.NumberTextBox.class);
    com.numhero.client.widget.FormItem f_FormItem12 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel13 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span> <table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <tbody> <tr> <td class='formItem'> <span id='" + domId1 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId2 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId3 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId4 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId5 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId6 + "'></span> </td> </tr> </tbody> </table> <span id='" + domId7 + "'></span>");

    errorsPanel.setStyleName("validation-advice");
    errorsPanel.setWidth("100%");
    f_Label3.setText("" + messages.message1() + "");
    f_FormItem2.add(f_Label3);
    f_FormItem2.add(tbProductName);
    f_FormItem2.setTitleWidth(120);
    f_Label5.setText("" + messages.message2() + "");
    f_FormItem4.add(f_Label5);
    f_FormItem4.add(tbProductDescription);
    f_FormItem4.setTitleWidth(120);
    f_Label7.setText("" + messages.message3() + "");
    f_FormItem6.add(f_Label7);
    f_FormItem6.add(cbProductCurrency);
    f_FormItem6.setTitleWidth(120);
    f_Label9.setText("" + messages.message4() + "");
    f_FormItem8.add(f_Label9);
    f_FormItem8.add(tbProductUnitPrice);
    f_FormItem8.setTitleWidth(120);
    f_Label11.setText("" + messages.message5() + "");
    f_FormItem10.add(f_Label11);
    f_FormItem10.add(cbProductTrackingEnabled);
    f_FormItem10.setTitleWidth(120);
    lbProductQuantity.setText("" + messages.message6() + "");
    f_FormItem12.add(lbProductQuantity);
    f_FormItem12.add(tbProductQuantity);
    f_FormItem12.setTitleWidth(120);
    btSave.setHTML("" + messages.message7() + "");
    btSave.setStyleName("inh-button");
    btSave.setHref("javascript:;");
    f_HorizontalPanel13.add(btSave);
    btCancel.setHTML("" + messages.message8() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("javascript:;");
    f_HorizontalPanel13.add(btCancel);
    f_HorizontalPanel13.setStyleName("buttonsPanel");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    com.google.gwt.user.client.Element domId7Element = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(errorsPanel, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem2, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem4, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem6, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem8, domId4Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem10, domId5Element);
    f_HTMLPanel1.addAndReplaceElement(f_FormItem12, domId6Element);
    f_HTMLPanel1.addAndReplaceElement(f_HorizontalPanel13, domId7Element);


    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.cbProductCurrency = cbProductCurrency;
    owner.cbProductTrackingEnabled = cbProductTrackingEnabled;
    owner.errorsPanel = errorsPanel;
    owner.lbProductQuantity = lbProductQuantity;
    owner.tbProductDescription = tbProductDescription;
    owner.tbProductName = tbProductName;
    owner.tbProductQuantity = tbProductQuantity;
    owner.tbProductUnitPrice = tbProductUnitPrice;

    return f_HTMLPanel1;
  }
}
