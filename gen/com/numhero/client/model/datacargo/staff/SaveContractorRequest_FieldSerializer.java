package com.numhero.client.model.datacargo.staff;

@SuppressWarnings("deprecation")
public class SaveContractorRequest_FieldSerializer {
  private static native com.numhero.client.model.pojoc.StaffC getStaffC(com.numhero.client.model.datacargo.staff.SaveContractorRequest instance) /*-{
    return instance.@com.numhero.client.model.datacargo.staff.SaveContractorRequest::staffC;
  }-*/;
  
  private static native void  setStaffC(com.numhero.client.model.datacargo.staff.SaveContractorRequest instance, com.numhero.client.model.pojoc.StaffC value) /*-{
    instance.@com.numhero.client.model.datacargo.staff.SaveContractorRequest::staffC = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.datacargo.staff.SaveContractorRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setStaffC(instance, (com.numhero.client.model.pojoc.StaffC) streamReader.readObject());
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.datacargo.staff.SaveContractorRequest instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.datacargo.staff.SaveContractorRequest::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.staff.SaveContractorRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getStaffC(instance));
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
