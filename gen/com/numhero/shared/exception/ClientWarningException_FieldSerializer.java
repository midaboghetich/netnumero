package com.numhero.shared.exception;

@SuppressWarnings("deprecation")
public class ClientWarningException_FieldSerializer {
  private static native java.lang.String getMessage(com.numhero.shared.exception.ClientWarningException instance) /*-{
    return instance.@com.numhero.shared.exception.ClientWarningException::message;
  }-*/;
  
  private static native void  setMessage(com.numhero.shared.exception.ClientWarningException instance, java.lang.String value) /*-{
    instance.@com.numhero.shared.exception.ClientWarningException::message = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.exception.ClientWarningException instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setMessage(instance, streamReader.readString());
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.shared.exception.ClientWarningException instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.exception.ClientWarningException::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.exception.ClientWarningException instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeString(getMessage(instance));
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
