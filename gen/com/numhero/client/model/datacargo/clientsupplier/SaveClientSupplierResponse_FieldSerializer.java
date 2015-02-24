package com.numhero.client.model.datacargo.clientsupplier;

@SuppressWarnings("deprecation")
public class SaveClientSupplierResponse_FieldSerializer {
  private static native com.numhero.client.model.pojoc.ClientSupplierC getClientSupplierC(com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierResponse::clientSupplierC;
  }-*/;
  
  private static native void  setClientSupplierC(com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierResponse instance, com.numhero.client.model.pojoc.ClientSupplierC value) /*-{
    instance.@com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierResponse::clientSupplierC = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setClientSupplierC(instance, (com.numhero.client.model.pojoc.ClientSupplierC) streamReader.readObject());
    
  }
  
  public static native com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.clientsupplier.SaveClientSupplierResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getClientSupplierC(instance));
    
  }
  
}
