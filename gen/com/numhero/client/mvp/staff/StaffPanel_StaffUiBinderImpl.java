package com.numhero.client.mvp.staff;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class StaffPanel_StaffUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.staff.StaffPanel>, com.numhero.client.mvp.staff.StaffPanel.StaffUiBinder {
  static StaffPanelStaffUiBinderImplGenMessages messages = (StaffPanelStaffUiBinderImplGenMessages) GWT.create(StaffPanelStaffUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.staff.StaffPanel owner) {

    com.numhero.client.mvp.staff.StaffPanel_StaffUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.staff.StaffPanel_StaffUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.staff.StaffPanel_StaffUiBinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.DisclosurePanel errorsPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Errors");
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem3 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbEmail = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem5 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label8 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbPhone = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem7 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label10 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbMobile = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem9 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label12 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbFax = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem11 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <thead> <tr> <td> " + messages.message1() + " </td> </tr> </thead> <tbody> <tr> <td class='formItem'> <span id='" + domId0 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId1 + "'></span> </td> </tr> <tr> <td class='formItem'> <table cellpadding='0' cellspacing='0' width='100%'> <tr> <td width='60%'> <span id='" + domId2 + "'></span> </td> <td width='40%'> <span id='" + domId3 + "'></span> </td> <td width='40%'> <span id='" + domId4 + "'></span> </td> </tr> </table> </td> </tr> </tbody> </table>");
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label15 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbAddress = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem14 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label17 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbCity = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem16 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label19 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbRegion = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem18 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label21 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbZipCode = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem20 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label23 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox tbCountry = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.numhero.client.widget.FormItem f_FormItem22 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label25 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextArea taNotes = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
    com.numhero.client.widget.FormItem f_FormItem24 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    java.lang.String domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label27 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextArea billingRate = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
    com.numhero.client.widget.FormItem f_FormItem26 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel13 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <thead> <tr> <td> " + messages.message7() + " </td> </tr> </thead> <tbody> <tr> <td class='formItem'> <span id='" + domId5 + "'></span> </td> </tr> <tr> <td class='formItem'> <table cellpadding='0' cellspacing='0' width='100%'> <tr> <td width='40%'> <span id='" + domId6 + "'></span> </td> <td width='30%'> <span id='" + domId7 + "'></span> </td> <td width='30%'> <span id='" + domId8 + "'></span> </td> </tr> </table> </td> </tr> <tr> <td class='formItem'> <span id='" + domId9 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId10 + "'></span> </td> </tr> <tr> <td class='formItem'> <span id='" + domId11 + "'></span> </td> </tr> </tbody> </table>");
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel28 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    errorsPanel.setStyleName("validation-advice");
    errorsPanel.setWidth("100%");
    f_VerticalPanel1.add(errorsPanel);
    f_Label4.setText("" + messages.message2() + "");
    f_FormItem3.add(f_Label4);
    f_FormItem3.add(tbName);
    f_FormItem3.setTitleWidth(200);
    f_Label6.setText("" + messages.message3() + "");
    f_FormItem5.add(f_Label6);
    f_FormItem5.add(tbEmail);
    f_FormItem5.setTitleWidth(200);
    f_Label8.setText("" + messages.message4() + "");
    f_FormItem7.add(f_Label8);
    f_FormItem7.add(tbPhone);
    f_FormItem7.setTitleWidth(200);
    f_Label10.setText("" + messages.message5() + "");
    f_FormItem9.add(f_Label10);
    f_FormItem9.add(tbMobile);
    f_FormItem9.setTitleWidth(60);
    f_Label12.setText("" + messages.message6() + "");
    f_FormItem11.add(f_Label12);
    f_FormItem11.add(tbFax);
    f_FormItem11.setTitleWidth(60);
    f_VerticalPanel1.add(f_HTMLPanel2);
    f_Label15.setText("" + messages.message8() + "");
    f_FormItem14.add(f_Label15);
    f_FormItem14.add(tbAddress);
    f_FormItem14.setTitleWidth(200);
    f_Label17.setText("" + messages.message9() + "");
    f_FormItem16.add(f_Label17);
    f_FormItem16.add(tbCity);
    f_FormItem16.setTitleWidth(200);
    f_Label19.setText("" + messages.message10() + "");
    f_FormItem18.add(f_Label19);
    f_FormItem18.add(tbRegion);
    f_FormItem18.setTitleWidth(75);
    f_FormItem18.setTitleAlign(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
    f_Label21.setText("" + messages.message11() + "");
    f_FormItem20.add(f_Label21);
    f_FormItem20.add(tbZipCode);
    f_FormItem20.setTitleWidth(75);
    f_FormItem20.setTitleAlign(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
    f_Label23.setText("" + messages.message12() + "");
    f_FormItem22.add(f_Label23);
    f_FormItem22.add(tbCountry);
    f_FormItem22.setTitleWidth(200);
    f_Label25.setText("" + messages.message13() + "");
    f_FormItem24.add(f_Label25);
    f_FormItem24.add(taNotes);
    f_FormItem24.setTitleWidth(200);
    f_Label27.setText("" + messages.message14() + "");
    f_FormItem26.add(f_Label27);
    f_FormItem26.add(billingRate);
    f_FormItem26.setTitleWidth(200);
    f_VerticalPanel1.add(f_HTMLPanel13);
    btSave.setHTML("" + messages.message15() + "");
    btSave.setStyleName("inh-button");
    btSave.setHref("javascript:;");
    f_HorizontalPanel28.add(btSave);
    btCancel.setHTML("" + messages.message16() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("javascript:;");
    f_HorizontalPanel28.add(btCancel);
    f_HorizontalPanel28.setStyleName("buttonsPanel");
    f_VerticalPanel1.add(f_HorizontalPanel28);

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
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel13.getElement());
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    com.google.gwt.user.client.Element domId7Element = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    com.google.gwt.user.client.Element domId8Element = com.google.gwt.dom.client.Document.get().getElementById(domId8).cast();
    com.google.gwt.user.client.Element domId9Element = com.google.gwt.dom.client.Document.get().getElementById(domId9).cast();
    com.google.gwt.user.client.Element domId10Element = com.google.gwt.dom.client.Document.get().getElementById(domId10).cast();
    com.google.gwt.user.client.Element domId11Element = com.google.gwt.dom.client.Document.get().getElementById(domId11).cast();
    attachRecord1.detach();
    f_HTMLPanel13.addAndReplaceElement(f_FormItem14, domId5Element);
    f_HTMLPanel13.addAndReplaceElement(f_FormItem16, domId6Element);
    f_HTMLPanel13.addAndReplaceElement(f_FormItem18, domId7Element);
    f_HTMLPanel13.addAndReplaceElement(f_FormItem20, domId8Element);
    f_HTMLPanel13.addAndReplaceElement(f_FormItem22, domId9Element);
    f_HTMLPanel13.addAndReplaceElement(f_FormItem24, domId10Element);
    f_HTMLPanel13.addAndReplaceElement(f_FormItem26, domId11Element);


    owner.billingRate = billingRate;
    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.errorsPanel = errorsPanel;
    owner.taNotes = taNotes;
    owner.tbAddress = tbAddress;
    owner.tbCity = tbCity;
    owner.tbCountry = tbCountry;
    owner.tbEmail = tbEmail;
    owner.tbFax = tbFax;
    owner.tbMobile = tbMobile;
    owner.tbName = tbName;
    owner.tbPhone = tbPhone;
    owner.tbRegion = tbRegion;
    owner.tbZipCode = tbZipCode;

    return f_VerticalPanel1;
  }
}
