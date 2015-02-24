package com.numhero.client.model.datacargo.client_supplier;

@SuppressWarnings("deprecation")
public class ClientSupplierListResponse_FieldSerializer {
  private static native java.util.List getClientSupplierCList(com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse::clientSupplierCList;
  }-*/;
  
  private static native void  setClientSupplierCList(com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse instance, java.util.List value) /*-{
    instance.@com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse::clientSupplierCList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setClientSupplierCList(instance, (java.util.List) streamReader.readObject());
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getClientSupplierCList(instance));
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
