package com.numhero.client.model.datacargo.clientsupplier;

@SuppressWarnings("deprecation")
public class GetClientSupplierRequest_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.clientsupplier.GetClientSupplierRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    
    com.numhero.shared.datacargo.GetSingleEntityRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.clientsupplier.GetClientSupplierRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.clientsupplier.GetClientSupplierRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.clientsupplier.GetClientSupplierRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    
    com.numhero.shared.datacargo.GetSingleEntityRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
