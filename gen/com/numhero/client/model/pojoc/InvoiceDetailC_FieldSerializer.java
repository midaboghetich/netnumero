package com.numhero.client.model.pojoc;

@SuppressWarnings("deprecation")
public class InvoiceDetailC_FieldSerializer {
  private static native java.util.List getTaxes(com.numhero.client.model.pojoc.InvoiceDetailC instance) /*-{
    return instance.@com.numhero.client.model.pojoc.InvoiceDetailC::taxes;
  }-*/;
  
  private static native void  setTaxes(com.numhero.client.model.pojoc.InvoiceDetailC instance, java.util.List value) /*-{
    instance.@com.numhero.client.model.pojoc.InvoiceDetailC::taxes = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.pojoc.InvoiceDetailC instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setTaxes(instance, (java.util.List) streamReader.readObject());
    
    com.numhero.shared.pojoc.BasePojoC_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.pojoc.InvoiceDetailC instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.pojoc.InvoiceDetailC::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.pojoc.InvoiceDetailC instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getTaxes(instance));
    
    com.numhero.shared.pojoc.BasePojoC_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
