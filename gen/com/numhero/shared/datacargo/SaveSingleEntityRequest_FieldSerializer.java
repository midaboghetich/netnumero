package com.numhero.shared.datacargo;

@SuppressWarnings("deprecation")
public class SaveSingleEntityRequest_FieldSerializer {
  private static native com.numhero.shared.pojoc.BasePojoC getEntity(com.numhero.shared.datacargo.SaveSingleEntityRequest instance) /*-{
    return instance.@com.numhero.shared.datacargo.SaveSingleEntityRequest::entity;
  }-*/;
  
  private static native void  setEntity(com.numhero.shared.datacargo.SaveSingleEntityRequest instance, com.numhero.shared.pojoc.BasePojoC value) /*-{
    instance.@com.numhero.shared.datacargo.SaveSingleEntityRequest::entity = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.datacargo.SaveSingleEntityRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setEntity(instance, (com.numhero.shared.pojoc.BasePojoC) streamReader.readObject());
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.shared.datacargo.SaveSingleEntityRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.datacargo.SaveSingleEntityRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.datacargo.SaveSingleEntityRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getEntity(instance));
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
