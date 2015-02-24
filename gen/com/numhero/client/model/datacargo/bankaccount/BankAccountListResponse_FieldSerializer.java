package com.numhero.client.model.datacargo.bankaccount;

@SuppressWarnings("deprecation")
public class BankAccountListResponse_FieldSerializer {
  private static native java.util.ArrayList getBankAccountCList(com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse::bankAccountCList;
  }-*/;
  
  private static native void  setBankAccountCList(com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse instance, java.util.ArrayList value) /*-{
    instance.@com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse::bankAccountCList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setBankAccountCList(instance, (java.util.ArrayList) streamReader.readObject());
    
  }
  
  public static native com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getBankAccountCList(instance));
    
  }
  
}
