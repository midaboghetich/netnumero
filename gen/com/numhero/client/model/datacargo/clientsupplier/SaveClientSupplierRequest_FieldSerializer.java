package com.numhero.client.model.datacargo.clientsupplier;

@SuppressWarnings("deprecation")
public class SaveClientSupplierRequest_FieldSerializer {
  private static native com.numhero.client.model.pojoc.ClientSupplierC getClientSupplier(com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierRequest instance) /*-{
    return instance.@com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierRequest::clientSupplier;
  }-*/;
  
  private static native void  setClientSupplier(com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierRequest instance, com.numhero.client.model.pojoc.ClientSupplierC value) /*-{
    instance.@com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierRequest::clientSupplier = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setClientSupplier(instance, (com.numhero.client.model.pojoc.ClientSupplierC) streamReader.readObject());
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getClientSupplier(instance));
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
