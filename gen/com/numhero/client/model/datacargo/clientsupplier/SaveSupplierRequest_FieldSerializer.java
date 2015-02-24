package com.numhero.client.model.datacargo.clientsupplier;

@SuppressWarnings("deprecation")
public class SaveSupplierRequest_FieldSerializer {
  private static native com.numhero.client.model.pojoc.ClientSupplierC getClientSupplierC(com.numhero.client.model.datacargo.clientsupplier.SaveSupplierRequest instance) /*-{
    return instance.@com.numhero.client.model.datacargo.clientsupplier.SaveSupplierRequest::clientSupplierC;
  }-*/;
  
  private static native void  setClientSupplierC(com.numhero.client.model.datacargo.clientsupplier.SaveSupplierRequest instance, com.numhero.client.model.pojoc.ClientSupplierC value) /*-{
    instance.@com.numhero.client.model.datacargo.clientsupplier.SaveSupplierRequest::clientSupplierC = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.clientsupplier.SaveSupplierRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setClientSupplierC(instance, (com.numhero.client.model.pojoc.ClientSupplierC) streamReader.readObject());
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.clientsupplier.SaveSupplierRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.clientsupplier.SaveSupplierRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.clientsupplier.SaveSupplierRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getClientSupplierC(instance));
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
