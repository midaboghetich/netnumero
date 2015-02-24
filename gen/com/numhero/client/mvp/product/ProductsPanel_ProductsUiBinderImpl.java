package com.numhero.client.mvp.product;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ProductsPanel_ProductsUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.VerticalPanel, com.numhero.client.mvp.product.ProductsPanel>, com.numhero.client.mvp.product.ProductsPanel.ProductsUiBinder {
  static ProductsPanelProductsUiBinderImplGenMessages messages = (ProductsPanelProductsUiBinderImplGenMessages) GWT.create(ProductsPanelProductsUiBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.VerticalPanel createAndBindUi(final com.numhero.client.mvp.product.ProductsPanel owner) {

    com.numhero.client.mvp.product.ProductsPanel_ProductsUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.numhero.client.mvp.product.ProductsPanel_ProductsUiBinderImpl_GenBundle) GWT.create(com.numhero.client.mvp.product.ProductsPanel_ProductsUiBinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.HTML hdTitle = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
    com.google.gwt.user.client.ui.Anchor f_Anchor3 = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.numhero.client.mvp.product.ProductsTable productsTable = (com.numhero.client.mvp.product.ProductsTable) GWT.create(com.numhero.client.mvp.product.ProductsTable.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_HorizontalPanel2.add(hdTitle);
    f_HorizontalPanel2.setCellVerticalAlignment(hdTitle, com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
    f_HorizontalPanel2.setCellWidth(hdTitle, "50%");
    f_Anchor3.setHTML("" + messages.message1() + "");
    f_Anchor3.setStyleName("inh-button");
    f_Anchor3.setHref("#product");
    f_HorizontalPanel2.add(f_Anchor3);
    f_HorizontalPanel2.setCellHorizontalAlignment(f_Anchor3, com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
    f_HorizontalPanel2.setCellVerticalAlignment(f_Anchor3, com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_MIDDLE);
    f_HorizontalPanel2.setCellWidth(f_Anchor3, "50%");
    f_HorizontalPanel2.setWidth("100%");
    f_VerticalPanel1.add(f_HorizontalPanel2);
    productsTable.setStyleName("productsDetails inh-standard");
    productsTable.setCellSpacing(0);
    productsTable.setCellPadding(0);
    f_VerticalPanel1.add(productsTable);
    f_VerticalPanel1.setWidth("100%");



    owner.hdTitle = hdTitle;
    owner.productsTable = productsTable;

    return f_VerticalPanel1;
  }
}
