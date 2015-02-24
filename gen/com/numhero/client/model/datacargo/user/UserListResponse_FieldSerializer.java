package com.numhero.client.model.datacargo.user;

@SuppressWarnings("deprecation")
public class UserListResponse_FieldSerializer {
  private static native java.util.ArrayList getUserCList(com.numhero.client.model.datacargo.user.UserListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.user.UserListResponse::userCList;
  }-*/;
  
  private static native void  setUserCList(com.numhero.client.model.datacargo.user.UserListResponse instance, java.util.ArrayList value) /*-{
    instance.@com.numhero.client.model.datacargo.user.UserListResponse::userCList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.user.UserListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setUserCList(instance, (java.util.ArrayList) streamReader.readObject());
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.user.UserListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.user.UserListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.user.UserListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getUserCList(instance));
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
