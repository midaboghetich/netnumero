package com.numhero.client.mvp.home;

import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.core.client.GWT;

public class com_numhero_client_mvp_home_HomePanel_HomePanelUiBinderImpl_GenBundle_ja_InlineClientBundleGenerator implements com.numhero.client.mvp.home.HomePanel_HomePanelUiBinderImpl_GenBundle {
  public com.numhero.client.mvp.home.HomePanel_HomePanelUiBinderImpl_GenCss_style style() {
    if (style == null) {
      style = new com.numhero.client.mvp.home.HomePanel_HomePanelUiBinderImpl_GenCss_style() {
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
          return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".Gp7ejccD{font-weight:" + ("bold")  + ";}")) : ((".Gp7ejccD{font-weight:" + ("bold")  + ";}"));
        }
        public java.lang.String important(){
          return "Gp7ejccD";
        }
      }
      ;
    }
    return style;
  }
  private static com.numhero.client.mvp.home.HomePanel_HomePanelUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public native ResourcePrototype getResource(String name) /*-{
    switch (name) {
      case 'style': return this.@com.numhero.client.mvp.home.HomePanel_HomePanelUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
