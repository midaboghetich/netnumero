package com.numhero.shared.datacargo;

@SuppressWarnings("deprecation")
public class BulkActionRequest_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.datacargo.BulkActionRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    instance.entityIdList = (java.util.List) streamReader.readObject();
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.shared.datacargo.BulkActionRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.datacargo.BulkActionRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.datacargo.BulkActionRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(instance.entityIdList);
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
