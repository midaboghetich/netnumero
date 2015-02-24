package com.numhero.client.mvp.taxinfo;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TaxInfoPanel_TaxInfoPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.taxinfo.TaxInfoPanel>, com.numhero.client.mvp.taxinfo.TaxInfoPanel.TaxInfoPanelUiBinder {
  static TaxInfoPanelTaxInfoPanelUiBinderImplGenMessages messages = (TaxInfoPanelTaxInfoPanelUiBinderImplGenMessages) GWT.create(TaxInfoPanelTaxInfoPanelUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.taxinfo.TaxInfoPanel owner) {

    com.numhero.client.mvp.taxinfo.TaxInfoPanel_TaxInfoPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.taxinfo.TaxInfoPanel_TaxInfoPanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.taxinfo.TaxInfoPanel_TaxInfoPanelUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.TitleLevelOne hdTitle = (com.numhero.client.widget.TitleLevelOne) GWT.create(com.numhero.client.widget.TitleLevelOne.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem3 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.form.CheckBoxLabel lbPercent = (com.numhero.client.widget.form.CheckBoxLabel) GWT.create(com.numhero.client.widget.form.CheckBoxLabel.class);
    com.numhero.client.widget.textbox.NumberTextBox tbPercent = (com.numhero.client.widget.textbox.NumberTextBox) GWT.create(com.numhero.client.widget.textbox.NumberTextBox.class);
    com.numhero.client.widget.FormItem f_FormItem5 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.numhero.client.widget.form.CheckBoxLabel lbValue = (com.numhero.client.widget.form.CheckBoxLabel) GWT.create(com.numhero.client.widget.form.CheckBoxLabel.class);
    com.numhero.client.widget.textbox.NumberTextBox tbValue = (com.numhero.client.widget.textbox.NumberTextBox) GWT.create(com.numhero.client.widget.textbox.NumberTextBox.class);
    com.numhero.client.widget.combobox.CurrencyEnumComboBox cbCurrency = (com.numhero.client.widget.combobox.CurrencyEnumComboBox) GWT.create(com.numhero.client.widget.combobox.CurrencyEnumComboBox.class);
    com.numhero.client.widget.FormItem f_FormItem6 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <tbody> <tr> <td class='formItem'> <span id='" + domId0 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId1 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId2 + "'></span> </td> </tr> </tbody> </table> <br> <br>");
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel7 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_VerticalPanel1.add(hdTitle);
    f_Label4.setText("" + messages.message1() + "");
    f_FormItem3.add(f_Label4);
    f_FormItem3.add(tbName);
    f_FormItem3.setTitleWidth(80);
    lbPercent.setText("" + messages.message2() + "");
    f_FormItem5.add(lbPercent);
    f_FormItem5.add(tbPercent);
    f_FormItem5.setHeight("28px");
    f_FormItem5.setTitleWidth(80);
    lbValue.setText("" + messages.message3() + "");
    f_FormItem6.add(lbValue);
    f_FormItem6.add(tbValue);
    cbCurrency.setWidth("65");
    f_FormItem6.add(cbCurrency);
    f_FormItem6.setHeight("28px");
    f_FormItem6.setTitleWidth(80);
    f_VerticalPanel1.add(f_HTMLPanel2);
    btSave.setHTML("" + messages.message4() + "");
    btSave.setStyleName("inh-button");
    btSave.setHref("javascript:;");
    f_HorizontalPanel7.add(btSave);
    btCancel.setHTML("" + messages.message5() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("javascript:;");
    f_HorizontalPanel7.add(btCancel);
    f_HorizontalPanel7.setStyleName("buttonsPanel");
    f_VerticalPanel1.add(f_HorizontalPanel7);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(f_FormItem3, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem5, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(f_FormItem6, domId2Element);


    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.cbCurrency = cbCurrency;
    owner.hdTitle = hdTitle;
    owner.lbPercent = lbPercent;
    owner.lbValue = lbValue;
    owner.tbName = tbName;
    owner.tbPercent = tbPercent;
    owner.tbValue = tbValue;

    return f_VerticalPanel1;
  }
}
