package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class TableFooterPanel_TableFooterPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.numhero.client.widget.TableFooterPanel>, com.numhero.client.widget.TableFooterPanel.TableFooterPanelUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.numhero.client.widget.TableFooterPanel owner) {

    com.numhero.client.widget.TableFooterPanel_TableFooterPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.widget.TableFooterPanel_TableFooterPanelUiBinderImpl_GenBundle) GWT.create(com.numhero.client.widget.TableFooterPanel_TableFooterPanelUiBinderImpl_GenBundle.class);
    com.numhero.client.widget.TableFooterPanel_TableFooterPanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.MenuBar tableFooterActionsCombo = (com.google.gwt.user.client.ui.MenuBar) GWT.create(com.google.gwt.user.client.ui.MenuBar.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span>");

    tableFooterActionsCombo.setStyleName("table-footer-combo");
    f_HTMLPanel1.setStyleName("table-footer-panel");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(tableFooterActionsCombo, domId0Element);


    owner.tableFooterActionsCombo = tableFooterActionsCombo;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
