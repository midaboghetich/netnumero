package com.numhero.client.model.datacargo.bankaccount;

@SuppressWarnings("deprecation")
public class GetBankAccountResponse_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    
    com.numhero.shared.datacargo.GetSingleEntityResponse_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    
    com.numhero.shared.datacargo.GetSingleEntityResponse_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
