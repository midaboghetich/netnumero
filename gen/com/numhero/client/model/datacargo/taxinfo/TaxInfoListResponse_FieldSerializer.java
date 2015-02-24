package com.numhero.client.model.datacargo.taxinfo;

@SuppressWarnings("deprecation")
public class TaxInfoListResponse_FieldSerializer {
  private static native java.util.ArrayList getTaxInfoListC(com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse::taxInfoListC;
  }-*/;
  
  private static native void  setTaxInfoListC(com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse instance, java.util.ArrayList value) /*-{
    instance.@com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse::taxInfoListC = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setTaxInfoListC(instance, (java.util.ArrayList) streamReader.readObject());
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getTaxInfoListC(instance));
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
