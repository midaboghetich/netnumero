package com.numhero.shared.datacargo;

@SuppressWarnings("deprecation")
public class BulkActionResponse_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.datacargo.BulkActionResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    instance.failureIdList = (java.util.List) streamReader.readObject();
    instance.message = streamReader.readString();
    instance.successIdList = (java.util.List) streamReader.readObject();
    
  }
  
  public static native com.numhero.shared.datacargo.BulkActionResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.datacargo.BulkActionResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.datacargo.BulkActionResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(instance.failureIdList);
    streamWriter.writeString(instance.message);
    streamWriter.writeObject(instance.successIdList);
    
  }
  
}
