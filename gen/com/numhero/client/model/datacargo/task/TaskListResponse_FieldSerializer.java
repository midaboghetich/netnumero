package com.numhero.client.model.datacargo.task;

@SuppressWarnings("deprecation")
public class TaskListResponse_FieldSerializer {
  private static native java.util.ArrayList getTaskCList(com.numhero.client.model.datacargo.task.TaskListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.task.TaskListResponse::taskCList;
  }-*/;
  
  private static native void  setTaskCList(com.numhero.client.model.datacargo.task.TaskListResponse instance, java.util.ArrayList value) /*-{
    instance.@com.numhero.client.model.datacargo.task.TaskListResponse::taskCList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.task.TaskListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setTaskCList(instance, (java.util.ArrayList) streamReader.readObject());
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.task.TaskListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.task.TaskListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.task.TaskListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getTaskCList(instance));
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
