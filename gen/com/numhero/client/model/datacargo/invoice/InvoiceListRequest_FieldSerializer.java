package com.numhero.client.model.datacargo.invoice;

@SuppressWarnings("deprecation")
public class InvoiceListRequest_FieldSerializer {
  private static native com.numhero.shared.enums.InvoiceTypeEnum getInvoiceType(com.numhero.client.model.datacargo.invoice.InvoiceListRequest instance) /*-{
    return instance.@com.numhero.client.model.datacargo.invoice.InvoiceListRequest::invoiceType;
  }-*/;
  
  private static native void  setInvoiceType(com.numhero.client.model.datacargo.invoice.InvoiceListRequest instance, com.numhero.shared.enums.InvoiceTypeEnum value) /*-{
    instance.@com.numhero.client.model.datacargo.invoice.InvoiceListRequest::invoiceType = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.invoice.InvoiceListRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setInvoiceType(instance, (com.numhero.shared.enums.InvoiceTypeEnum) streamReader.readObject());
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.invoice.InvoiceListRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.invoice.InvoiceListRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.invoice.InvoiceListRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getInvoiceType(instance));
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
