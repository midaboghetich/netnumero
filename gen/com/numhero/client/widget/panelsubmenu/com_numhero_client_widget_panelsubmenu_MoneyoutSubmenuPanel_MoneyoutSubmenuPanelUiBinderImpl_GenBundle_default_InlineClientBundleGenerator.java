package com.numhero.client.widget.panelsubmenu;

import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.core.client.GWT;

public class com_numhero_client_widget_panelsubmenu_MoneyoutSubmenuPanel_MoneyoutSubmenuPanelUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel_MoneyoutSubmenuPanelUiBinderImpl_GenBundle {
  public com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel_MoneyoutSubmenuPanelUiBinderImpl_GenCss_style style() {
    if (style == null) {
      style = new com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel_MoneyoutSubmenuPanelUiBinderImpl_GenCss_style() {
        private boolean injected;
        public boolean ensureInjected() {
          if (!injected) {
            injected = true;
            com.google.gwt.dom.client.StyleInjector.inject(getText());
            return true;
          }
          return false;
        }
        public String getName() {
          return "style";
        }
        public String getText() {
          return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("")) : ((""));
        }
      }
      ;
    }
    return style;
  }
  private static com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel_MoneyoutSubmenuPanelUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public native ResourcePrototype getResource(String name) /*-{
    switch (name) {
      case 'style': return this.@com.numhero.client.widget.panelsubmenu.MoneyoutSubmenuPanel_MoneyoutSubmenuPanelUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
