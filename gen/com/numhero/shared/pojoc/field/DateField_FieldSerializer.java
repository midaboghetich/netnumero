package com.numhero.shared.pojoc.field;

@SuppressWarnings("deprecation")
public class DateField_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.pojoc.field.DateField instance) throws com.google.gwt.user.client.rpc.SerializationException{
    
    com.numhero.shared.pojoc.field.PojoCField_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.shared.pojoc.field.DateField instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.pojoc.field.DateField::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.pojoc.field.DateField instance) throws com.google.gwt.user.client.rpc.SerializationException {
    
    com.numhero.shared.pojoc.field.PojoCField_FieldSerializer.serialize(streamWriter, instance);
  }
  
}