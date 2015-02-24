package com.numhero.client.model.datacargo.product;

@SuppressWarnings("deprecation")
public class ProductListResponse_FieldSerializer {
  private static native java.util.ArrayList getProductCList(com.numhero.client.model.datacargo.product.ProductListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.product.ProductListResponse::productCList;
  }-*/;
  
  private static native void  setProductCList(com.numhero.client.model.datacargo.product.ProductListResponse instance, java.util.ArrayList value) /*-{
    instance.@com.numhero.client.model.datacargo.product.ProductListResponse::productCList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.product.ProductListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setProductCList(instance, (java.util.ArrayList) streamReader.readObject());
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.product.ProductListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.product.ProductListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.product.ProductListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getProductCList(instance));
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
