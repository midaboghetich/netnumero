package com.numhero.client.mvp.settings;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class SettingsPanel_BusinessAccountUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.settings.SettingsPanel>, com.numhero.client.mvp.settings.SettingsPanel.BusinessAccountUiBinder {
  static SettingsPanelBusinessAccountUiBinderImplGenMessages messages = (SettingsPanelBusinessAccountUiBinderImplGenMessages) GWT.create(SettingsPanelBusinessAccountUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.settings.SettingsPanel owner) {

    com.numhero.client.mvp.settings.SettingsPanel_BusinessAccountUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.settings.SettingsPanel_BusinessAccountUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.settings.SettingsPanel_BusinessAccountUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.TitleLevelOne hdTitle = (com.numhero.client.widget.TitleLevelOne) GWT.create(com.numhero.client.widget.TitleLevelOne.class);
    com.google.gwt.user.client.ui.DisclosurePanel errorsPanel = new com.google.gwt.user.client.ui.DisclosurePanel("Errors");
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.ListBox locales = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    com.numhero.client.widget.FormItem f_FormItem3 = (com.numhero.client.widget.FormItem) GWT.create(com.numhero.client.widget.FormItem.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='formContainer' width='100%'> <tbody> <tr id='" + domId0 + "'></tr> </tbody> </table>");
    com.numhero.client.widget.NetNumeroButton btSave = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.numhero.client.widget.NetNumeroButton btCancel = (com.numhero.client.widget.NetNumeroButton) GWT.create(com.numhero.client.widget.NetNumeroButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel5 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_VerticalPanel1.add(hdTitle);
    errorsPanel.setStyleName("validation-advice");
    errorsPanel.setWidth("100%");
    f_VerticalPanel1.add(errorsPanel);
    f_Label4.setText("" + messages.message1() + "");
    f_FormItem3.add(f_Label4);
    f_FormItem3.add(locales);
    f_VerticalPanel1.add(f_HTMLPanel2);
    btSave.setHTML("" + messages.message2() + "");
    f_HorizontalPanel5.add(btSave);
    btCancel.setHTML("" + messages.message3() + "");
    btCancel.setStyleName("inh-button");
    btCancel.setHref("javascript:;");
    f_HorizontalPanel5.add(btCancel);
    f_HorizontalPanel5.setStyleName("buttonsPanel");
    f_VerticalPanel1.add(f_HorizontalPanel5);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(f_FormItem3, domId0Element);


    owner.btCancel = btCancel;
    owner.btSave = btSave;
    owner.errorsPanel = errorsPanel;
    owner.hdTitle = hdTitle;
    owner.locales = locales;

    return f_VerticalPanel1;
  }
}
