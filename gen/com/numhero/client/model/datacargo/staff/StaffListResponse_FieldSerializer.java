package com.numhero.client.model.datacargo.staff;

@SuppressWarnings("deprecation")
public class StaffListResponse_FieldSerializer {
  private static native java.util.List getStaffCList(com.numhero.client.model.datacargo.staff.StaffListResponse instance) /*-{
    return instance.@com.numhero.client.model.datacargo.staff.StaffListResponse::staffCList;
  }-*/;
  
  private static native void  setStaffCList(com.numhero.client.model.datacargo.staff.StaffListResponse instance, java.util.List value) /*-{
    instance.@com.numhero.client.model.datacargo.staff.StaffListResponse::staffCList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.staff.StaffListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setStaffCList(instance, (java.util.List) streamReader.readObject());
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.staff.StaffListResponse instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.staff.StaffListResponse::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.staff.StaffListResponse instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getStaffCList(instance));
    
    com.numhero.shared.datacargo.SuggestCommandResponse_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
