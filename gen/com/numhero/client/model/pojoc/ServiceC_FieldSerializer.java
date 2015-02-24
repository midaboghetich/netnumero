package com.numhero.client.model.pojoc;

@SuppressWarnings("deprecation")
public class ServiceC_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.pojoc.ServiceC instance) throws com.google.gwt.user.client.rpc.SerializationException{
    
    com.numhero.shared.pojoc.BasePojoC_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.pojoc.ServiceC instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.pojoc.ServiceC::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.pojoc.ServiceC instance) throws com.google.gwt.user.client.rpc.SerializationException {
    
    com.numhero.shared.pojoc.BasePojoC_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
