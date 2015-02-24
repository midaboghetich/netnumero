package com.numhero.client.model.pojoc;

@SuppressWarnings("deprecation")
public class InvoiceC_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.pojoc.InvoiceC instance) throws com.google.gwt.user.client.rpc.SerializationException{
    instance.details = (java.util.List) streamReader.readObject();
    
    com.numhero.shared.pojoc.BasePojoC_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.pojoc.InvoiceC instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.pojoc.InvoiceC::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.pojoc.InvoiceC instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(instance.details);
    
    com.numhero.shared.pojoc.BasePojoC_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
