package com.numhero.shared.datacargo;

@SuppressWarnings("deprecation")
public class CommandRequest_FieldSerializer {
  private static native java.lang.String getBusinessAccountId(com.numhero.shared.datacargo.CommandRequest instance) /*-{
    return instance.@com.numhero.shared.datacargo.CommandRequest::businessAccountId;
  }-*/;
  
  private static native void  setBusinessAccountId(com.numhero.shared.datacargo.CommandRequest instance, java.lang.String value) /*-{
    instance.@com.numhero.shared.datacargo.CommandRequest::businessAccountId = value;
  }-*/;
  
  private static native com.numhero.shared.service.ApplicationCommandEnum getCommand(com.numhero.shared.datacargo.CommandRequest instance) /*-{
    return instance.@com.numhero.shared.datacargo.CommandRequest::command;
  }-*/;
  
  private static native void  setCommand(com.numhero.shared.datacargo.CommandRequest instance, com.numhero.shared.service.ApplicationCommandEnum value) /*-{
    instance.@com.numhero.shared.datacargo.CommandRequest::command = value;
  }-*/;
  
  private static native java.lang.String getSessionID(com.numhero.shared.datacargo.CommandRequest instance) /*-{
    return instance.@com.numhero.shared.datacargo.CommandRequest::sessionID;
  }-*/;
  
  private static native void  setSessionID(com.numhero.shared.datacargo.CommandRequest instance, java.lang.String value) /*-{
    instance.@com.numhero.shared.datacargo.CommandRequest::sessionID = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.datacargo.CommandRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setBusinessAccountId(instance, streamReader.readString());
    setCommand(instance, (com.numhero.shared.service.ApplicationCommandEnum) streamReader.readObject());
    setSessionID(instance, streamReader.readString());
    
  }
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.datacargo.CommandRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeString(getBusinessAccountId(instance));
    streamWriter.writeObject(getCommand(instance));
    streamWriter.writeString(getSessionID(instance));
    
  }
  
}
