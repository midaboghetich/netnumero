package com.numhero.shared.datacargo;

@SuppressWarnings("deprecation")
public class SuggestCommandResponse_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.datacargo.SuggestCommandResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    
    com.google.gwt.user.client.ui.SuggestOracle_Response_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.datacargo.SuggestCommandResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    
    com.google.gwt.user.client.ui.SuggestOracle_Response_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
