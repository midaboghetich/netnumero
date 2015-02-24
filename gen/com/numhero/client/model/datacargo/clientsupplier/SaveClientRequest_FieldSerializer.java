package com.numhero.client.model.datacargo.clientsupplier;

@SuppressWarnings("deprecation")
public class SaveClientRequest_FieldSerializer {
  private static native com.numhero.client.model.pojoc.ClientSupplierC getClientSupplierC(com.numhero.client.model.datacargo.clientsupplier.SaveClientRequest instance) /*-{
    return instance.@com.numhero.client.model.datacargo.clientsupplier.SaveClientRequest::clientSupplierC;
  }-*/;
  
  private static native void  setClientSupplierC(com.numhero.client.model.datacargo.clientsupplier.SaveClientRequest instance, com.numhero.client.model.pojoc.ClientSupplierC value) /*-{
    instance.@com.numhero.client.model.datacargo.clientsupplier.SaveClientRequest::clientSupplierC = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.clientsupplier.SaveClientRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setClientSupplierC(instance, (com.numhero.client.model.pojoc.ClientSupplierC) streamReader.readObject());
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.clientsupplier.SaveClientRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.clientsupplier.SaveClientRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.clientsupplier.SaveClientRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getClientSupplierC(instance));
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
