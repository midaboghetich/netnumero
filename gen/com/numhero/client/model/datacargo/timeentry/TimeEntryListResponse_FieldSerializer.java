package com.numhero.client.model.datacargo.timeentry;

@SuppressWarnings("deprecation")
public class TimeEntryListResponse_FieldSerializer {
  private static native java.util.ArrayList getTimeEntryCList(com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse::timeEntryCList;
  }-*/;
  
  private static native void  setTimeEntryCList(com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse instance, java.util.ArrayList value) /*-{
    instance.@com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse::timeEntryCList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setTimeEntryCList(instance, (java.util.ArrayList) streamReader.readObject());
    
  }
  
  public static native com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getTimeEntryCList(instance));
    
  }
  
}
