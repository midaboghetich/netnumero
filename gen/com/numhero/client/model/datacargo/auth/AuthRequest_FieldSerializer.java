package com.numhero.client.model.datacargo.auth;

@SuppressWarnings("deprecation")
public class AuthRequest_FieldSerializer {
  private static native java.lang.String getHttpSessionID(com.numhero.client.model.datacargo.auth.AuthRequest instance) /*-{
    return instance.@com.numhero.client.model.datacargo.auth.AuthRequest::httpSessionID;
  }-*/;
  
  private static native void  setHttpSessionID(com.numhero.client.model.datacargo.auth.AuthRequest instance, java.lang.String value) /*-{
    instance.@com.numhero.client.model.datacargo.auth.AuthRequest::httpSessionID = value;
  }-*/;
  
  private static native java.lang.String getPassword(com.numhero.client.model.datacargo.auth.AuthRequest instance) /*-{
    return instance.@com.numhero.client.model.datacargo.auth.AuthRequest::password;
  }-*/;
  
  private static native void  setPassword(com.numhero.client.model.datacargo.auth.AuthRequest instance, java.lang.String value) /*-{
    instance.@com.numhero.client.model.datacargo.auth.AuthRequest::password = value;
  }-*/;
  
  private static native java.lang.String getUsername(com.numhero.client.model.datacargo.auth.AuthRequest instance) /*-{
    return instance.@com.numhero.client.model.datacargo.auth.AuthRequest::username;
  }-*/;
  
  private static native void  setUsername(com.numhero.client.model.datacargo.auth.AuthRequest instance, java.lang.String value) /*-{
    instance.@com.numhero.client.model.datacargo.auth.AuthRequest::username = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.auth.AuthRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setHttpSessionID(instance, streamReader.readString());
    setPassword(instance, streamReader.readString());
    setUsername(instance, streamReader.readString());
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.auth.AuthRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.auth.AuthRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.auth.AuthRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeString(getHttpSessionID(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeString(getUsername(instance));
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
