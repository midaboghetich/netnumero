package com.numhero.client.model.datacargo.invoiceDetail;

@SuppressWarnings("deprecation")
public class SaveInvoiceDetailRequest_FieldSerializer {
  private static native com.numhero.client.model.pojoc.InvoiceDetailC getInvoiceDetailC(com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailRequest instance) /*-{
    return instance.@com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailRequest::invoiceDetailC;
  }-*/;
  
  private static native void  setInvoiceDetailC(com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailRequest instance, com.numhero.client.model.pojoc.InvoiceDetailC value) /*-{
    instance.@com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailRequest::invoiceDetailC = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setInvoiceDetailC(instance, (com.numhero.client.model.pojoc.InvoiceDetailC) streamReader.readObject());
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getInvoiceDetailC(instance));
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
