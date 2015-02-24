package com.numhero.shared.exception;

@SuppressWarnings("deprecation")
public class NotAuthorizedException_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.exception.NotAuthorizedException instance) throws com.google.gwt.user.client.rpc.SerializationException{
    
    com.numhero.shared.exception.ClientWarningException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.shared.exception.NotAuthorizedException instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.exception.NotAuthorizedException::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.exception.NotAuthorizedException instance) throws com.google.gwt.user.client.rpc.SerializationException {
    
    com.numhero.shared.exception.ClientWarningException_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
