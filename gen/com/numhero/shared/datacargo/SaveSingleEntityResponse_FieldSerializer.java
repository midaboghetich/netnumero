package com.numhero.shared.datacargo;

@SuppressWarnings("deprecation")
public class SaveSingleEntityResponse_FieldSerializer {
  private static native java.lang.String getEntityId(com.numhero.shared.datacargo.SaveSingleEntityResponse instance) /*-{
    return instance.@com.numhero.shared.datacargo.SaveSingleEntityResponse::entityId;
  }-*/;
  
  private static native void  setEntityId(com.numhero.shared.datacargo.SaveSingleEntityResponse instance, java.lang.String value) /*-{
    instance.@com.numhero.shared.datacargo.SaveSingleEntityResponse::entityId = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.datacargo.SaveSingleEntityResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setEntityId(instance, streamReader.readString());
    
  }
  
  public static native com.numhero.shared.datacargo.SaveSingleEntityResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.datacargo.SaveSingleEntityResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.datacargo.SaveSingleEntityResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeString(getEntityId(instance));
    
  }
  
}
