package com.numhero.client.model.datacargo.invoiceDetail;

@SuppressWarnings("deprecation")
public class SaveInvoiceDetailResponse_FieldSerializer {
  private static native com.numhero.client.model.pojoc.InvoiceDetailC getInvoiceDetailC(com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailResponse::invoiceDetailC;
  }-*/;
  
  private static native void  setInvoiceDetailC(com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailResponse instance, com.numhero.client.model.pojoc.InvoiceDetailC value) /*-{
    instance.@com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailResponse::invoiceDetailC = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setInvoiceDetailC(instance, (com.numhero.client.model.pojoc.InvoiceDetailC) streamReader.readObject());
    
  }
  
  public static native com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.invoiceDetail.SaveInvoiceDetailResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getInvoiceDetailC(instance));
    
  }
  
}
