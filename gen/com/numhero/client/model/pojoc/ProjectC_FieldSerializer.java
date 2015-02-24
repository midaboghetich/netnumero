package com.numhero.client.model.pojoc;

@SuppressWarnings("deprecation")
public class ProjectC_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.pojoc.ProjectC instance) throws com.google.gwt.user.client.rpc.SerializationException{
    instance.projectStaffDetails = (java.util.List) streamReader.readObject();
    instance.projectTaskDetails = (java.util.List) streamReader.readObject();
    
    com.numhero.shared.pojoc.BasePojoC_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.pojoc.ProjectC instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.pojoc.ProjectC::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.pojoc.ProjectC instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(instance.projectStaffDetails);
    streamWriter.writeObject(instance.projectTaskDetails);
    
    com.numhero.shared.pojoc.BasePojoC_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
