package com.numhero.client;

public class LocalizableMessages_ja implements com.numhero.client.LocalizableMessages {
  public java.lang.String invalidSymbol(java.lang.String symbol) {
    return "'" + symbol + "' is not a valid symbol.";
  }
  
  public java.lang.String currentDate(java.util.Date timestamp) {
    return com.google.gwt.i18n.client.DateTimeFormat.getLongDateFormat().format(timestamp) + " " + com.google.gwt.i18n.client.DateTimeFormat.getMediumTimeFormat().format(timestamp);
  }
  
  public java.lang.String lastUpdate(java.util.Date timestamp) {
    return "Last update: " + com.google.gwt.i18n.client.DateTimeFormat.getMediumDateFormat().format(timestamp) + " " + com.google.gwt.i18n.client.DateTimeFormat.getShortTimeFormat().format(timestamp);
  }
  
  }
