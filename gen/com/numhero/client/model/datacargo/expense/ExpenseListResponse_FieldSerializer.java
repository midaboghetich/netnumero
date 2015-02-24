package com.numhero.client.model.datacargo.expense;

@SuppressWarnings("deprecation")
public class ExpenseListResponse_FieldSerializer {
  private static native java.util.ArrayList getExpenseCList(com.numhero.client.model.datacargo.expense.ExpenseListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.expense.ExpenseListResponse::expenseCList;
  }-*/;
  
  private static native void  setExpenseCList(com.numhero.client.model.datacargo.expense.ExpenseListResponse instance, java.util.ArrayList value) /*-{
    instance.@com.numhero.client.model.datacargo.expense.ExpenseListResponse::expenseCList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.expense.ExpenseListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setExpenseCList(instance, (java.util.ArrayList) streamReader.readObject());
    
  }
  
  public static native com.numhero.client.model.datacargo.expense.ExpenseListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.expense.ExpenseListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.expense.ExpenseListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getExpenseCList(instance));
    
  }
  
}
