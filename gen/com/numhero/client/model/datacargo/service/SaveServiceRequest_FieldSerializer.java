package com.numhero.client.model.datacargo.service;

@SuppressWarnings("deprecation")
public class SaveServiceRequest_FieldSerializer {
  private static native com.numhero.client.model.pojoc.ServiceC getService(com.numhero.client.model.datacargo.service.SaveServiceRequest instance) /*-{
    return instance.@com.numhero.client.model.datacargo.service.SaveServiceRequest::service;
  }-*/;
  
  private static native void  setService(com.numhero.client.model.datacargo.service.SaveServiceRequest instance, com.numhero.client.model.pojoc.ServiceC value) /*-{
    instance.@com.numhero.client.model.datacargo.service.SaveServiceRequest::service = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.service.SaveServiceRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setService(instance, (com.numhero.client.model.pojoc.ServiceC) streamReader.readObject());
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.service.SaveServiceRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.service.SaveServiceRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.service.SaveServiceRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getService(instance));
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
