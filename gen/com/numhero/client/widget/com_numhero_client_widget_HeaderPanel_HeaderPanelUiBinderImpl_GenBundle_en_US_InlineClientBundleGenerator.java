package com.numhero.client.widget;

import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.core.client.GWT;

public class com_numhero_client_widget_HeaderPanel_HeaderPanelUiBinderImpl_GenBundle_en_US_InlineClientBundleGenerator implements com.numhero.client.widget.HeaderPanel_HeaderPanelUiBinderImpl_GenBundle {
  public com.numhero.client.widget.HeaderPanel_HeaderPanelUiBinderImpl_GenCss_style style() {
    if (style == null) {
      style = new com.numhero.client.widget.HeaderPanel_HeaderPanelUiBinderImpl_GenCss_style() {
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
        public java.lang.String important(){
          return "Gp7ejccC";
        }
      }
      ;
    }
    return style;
  }
  private static com.numhero.client.widget.HeaderPanel_HeaderPanelUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public native ResourcePrototype getResource(String name) /*-{
    switch (name) {
      case 'style': return this.@com.numhero.client.widget.HeaderPanel_HeaderPanelUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}