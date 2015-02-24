package com.numhero.client.model.datacargo.auth;

@SuppressWarnings("deprecation")
public class AuthResponse_FieldSerializer {
  private static native java.util.Date getExpirationDate(com.numhero.client.model.datacargo.auth.AuthResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.auth.AuthResponse::expirationDate;
  }-*/;
  
  private static native void  setExpirationDate(com.numhero.client.model.datacargo.auth.AuthResponse instance, java.util.Date value) /*-{
    instance.@com.numhero.client.model.datacargo.auth.AuthResponse::expirationDate = value;
  }-*/;
  
  private static native java.lang.String getSessionID(com.numhero.client.model.datacargo.auth.AuthResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.auth.AuthResponse::sessionID;
  }-*/;
  
  private static native void  setSessionID(com.numhero.client.model.datacargo.auth.AuthResponse instance, java.lang.String value) /*-{
    instance.@com.numhero.client.model.datacargo.auth.AuthResponse::sessionID = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.auth.AuthResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setExpirationDate(instance, (java.util.Date) streamReader.readObject());
    setSessionID(instance, streamReader.readString());
    
  }
  
  public static native com.numhero.client.model.datacargo.auth.AuthResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.auth.AuthResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.auth.AuthResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getExpirationDate(instance));
    streamWriter.writeString(getSessionID(instance));
    
  }
  
}
