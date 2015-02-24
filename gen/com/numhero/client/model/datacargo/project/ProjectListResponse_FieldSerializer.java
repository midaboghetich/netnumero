package com.numhero.client.model.datacargo.project;

@SuppressWarnings("deprecation")
public class ProjectListResponse_FieldSerializer {
  private static native java.util.ArrayList getProjectCList(com.numhero.client.model.datacargo.project.ProjectListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.project.ProjectListResponse::projectCList;
  }-*/;
  
  private static native void  setProjectCList(com.numhero.client.model.datacargo.project.ProjectListResponse instance, java.util.ArrayList value) /*-{
    instance.@com.numhero.client.model.datacargo.project.ProjectListResponse::projectCList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.project.ProjectListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setProjectCList(instance, (java.util.ArrayList) streamReader.readObject());
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.project.ProjectListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.project.ProjectListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.project.ProjectListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getProjectCList(instance));
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
