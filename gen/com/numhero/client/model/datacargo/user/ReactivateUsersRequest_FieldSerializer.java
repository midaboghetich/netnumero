package com.numhero.client.model.datacargo.user;

@SuppressWarnings("deprecation")
public class ReactivateUsersRequest_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.user.ReactivateUsersRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    
    com.numhero.shared.datacargo.BulkActionRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.user.ReactivateUsersRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.user.ReactivateUsersRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.user.ReactivateUsersRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    
    com.numhero.shared.datacargo.BulkActionRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}