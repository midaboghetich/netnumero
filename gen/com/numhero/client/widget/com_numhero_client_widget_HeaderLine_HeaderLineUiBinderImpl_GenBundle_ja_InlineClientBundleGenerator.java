package com.numhero.client.widget;

import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.core.client.GWT;

public class com_numhero_client_widget_HeaderLine_HeaderLineUiBinderImpl_GenBundle_ja_InlineClientBundleGenerator implements com.numhero.client.widget.HeaderLine_HeaderLineUiBinderImpl_GenBundle {
  public com.numhero.client.widget.HeaderLine_HeaderLineUiBinderImpl_GenCss_style style() {
    if (style == null) {
      style = new com.numhero.client.widget.HeaderLine_HeaderLineUiBinderImpl_GenCss_style() {
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
          return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".Gp7ejccF{margin:" + ("0")  + ";text-align:" + ("left")  + ";padding:" + ("5px"+ " " +"0")  + ";margin-right:" + ("0")  + ";font-size:" + ("12px")  + ";}.Gp7ejccF li{list-style:" + ("none")  + ";margin:" + ("0")  + ";display:" + ("inline")  + ";}.Gp7ejccF li a.Gp7ejccE{color:" + ("#000")  + ";background:" + ("#fff")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#fff")  + ";}")) : ((".Gp7ejccF{margin:" + ("0")  + ";text-align:" + ("right")  + ";padding:" + ("5px"+ " " +"0")  + ";margin-left:" + ("0")  + ";font-size:" + ("12px")  + ";}.Gp7ejccF li{list-style:" + ("none")  + ";margin:" + ("0")  + ";display:" + ("inline")  + ";}.Gp7ejccF li a.Gp7ejccE{color:" + ("#000")  + ";background:" + ("#fff")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#fff")  + ";}"));
        }
        public java.lang.String current(){
          return "Gp7ejccE";
        }
        public java.lang.String topline(){
          return "Gp7ejccF";
        }
      }
      ;
    }
    return style;
  }
  private static com.numhero.client.widget.HeaderLine_HeaderLineUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public native ResourcePrototype getResource(String name) /*-{
    switch (name) {
      case 'style': return this.@com.numhero.client.widget.HeaderLine_HeaderLineUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
