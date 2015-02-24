package com.numhero.client.model.datacargo.service;

@SuppressWarnings("deprecation")
public class ServiceListResponse_FieldSerializer {
  private static native java.util.ArrayList getServiceCList(com.numhero.client.model.datacargo.service.ServiceListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.service.ServiceListResponse::serviceCList;
  }-*/;
  
  private static native void  setServiceCList(com.numhero.client.model.datacargo.service.ServiceListResponse instance, java.util.ArrayList value) /*-{
    instance.@com.numhero.client.model.datacargo.service.ServiceListResponse::serviceCList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.service.ServiceListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setServiceCList(instance, (java.util.ArrayList) streamReader.readObject());
    
  }
  
  public static native com.numhero.client.model.datacargo.service.ServiceListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.service.ServiceListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.service.ServiceListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getServiceCList(instance));
    
  }
  
}
