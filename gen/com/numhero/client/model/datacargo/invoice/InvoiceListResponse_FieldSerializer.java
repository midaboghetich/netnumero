package com.numhero.client.model.datacargo.invoice;

@SuppressWarnings("deprecation")
public class InvoiceListResponse_FieldSerializer {
  private static native java.util.ArrayList getInvoiceCList(com.numhero.client.model.datacargo.invoice.InvoiceListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.invoice.InvoiceListResponse::invoiceCList;
  }-*/;
  
  private static native void  setInvoiceCList(com.numhero.client.model.datacargo.invoice.InvoiceListResponse instance, java.util.ArrayList value) /*-{
    instance.@com.numhero.client.model.datacargo.invoice.InvoiceListResponse::invoiceCList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.invoice.InvoiceListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setInvoiceCList(instance, (java.util.ArrayList) streamReader.readObject());
    
  }
  
  public static native com.numhero.client.model.datacargo.invoice.InvoiceListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.invoice.InvoiceListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.invoice.InvoiceListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getInvoiceCList(instance));
    
  }
  
}
