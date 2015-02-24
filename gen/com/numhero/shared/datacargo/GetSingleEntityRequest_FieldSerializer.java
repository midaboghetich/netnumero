package com.numhero.shared.datacargo;

@SuppressWarnings("deprecation")
public class GetSingleEntityRequest_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.datacargo.GetSingleEntityRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    instance.entityId = streamReader.readString();
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.datacargo.GetSingleEntityRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeString(instance.entityId);
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
