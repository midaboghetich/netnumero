package com.numhero.shared.pojoc.field;

@SuppressWarnings("deprecation")
public class PojoCField_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.pojoc.field.PojoCField instance) throws com.google.gwt.user.client.rpc.SerializationException{
    instance.fieldName = streamReader.readString();
    instance.value = streamReader.readObject();
    
  }
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.pojoc.field.PojoCField instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeString(instance.fieldName);
    streamWriter.writeObject(instance.value);
    
  }
  
}
