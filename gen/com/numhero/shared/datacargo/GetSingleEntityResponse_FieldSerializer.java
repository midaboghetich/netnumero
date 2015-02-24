package com.numhero.shared.datacargo;

@SuppressWarnings("deprecation")
public class GetSingleEntityResponse_FieldSerializer {
  private static native com.numhero.shared.pojoc.BasePojoC getEntity(com.numhero.shared.datacargo.GetSingleEntityResponse instance) /*-{
    return instance.@com.numhero.shared.datacargo.GetSingleEntityResponse::entity;
  }-*/;
  
  private static native void  setEntity(com.numhero.shared.datacargo.GetSingleEntityResponse instance, com.numhero.shared.pojoc.BasePojoC value) /*-{
    instance.@com.numhero.shared.datacargo.GetSingleEntityResponse::entity = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.datacargo.GetSingleEntityResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setEntity(instance, (com.numhero.shared.pojoc.BasePojoC) streamReader.readObject());
    
  }
  
  public static native com.numhero.shared.datacargo.GetSingleEntityResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.datacargo.GetSingleEntityResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.datacargo.GetSingleEntityResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getEntity(instance));
    
  }
  
}
