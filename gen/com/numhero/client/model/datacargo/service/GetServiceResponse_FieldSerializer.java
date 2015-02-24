package com.numhero.client.model.datacargo.service;

@SuppressWarnings("deprecation")
public class GetServiceResponse_FieldSerializer {
  private static native com.numhero.client.model.pojoc.ServiceC getService(com.numhero.client.model.datacargo.service.GetServiceResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.service.GetServiceResponse::service;
  }-*/;
  
  private static native void  setService(com.numhero.client.model.datacargo.service.GetServiceResponse instance, com.numhero.client.model.pojoc.ServiceC value) /*-{
    instance.@com.numhero.client.model.datacargo.service.GetServiceResponse::service = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.service.GetServiceResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setService(instance, (com.numhero.client.model.pojoc.ServiceC) streamReader.readObject());
    
  }
  
  public static native com.numhero.client.model.datacargo.service.GetServiceResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.service.GetServiceResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.service.GetServiceResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getService(instance));
    
  }
  
}
