package com.numhero.shared.pojoc;

@SuppressWarnings("deprecation")
public class DataCargoRecord_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.pojoc.DataCargoRecord instance) throws com.google.gwt.user.client.rpc.SerializationException{
    instance.fieldsBoolean = (java.util.LinkedHashMap) streamReader.readObject();
    instance.fieldsDate = (java.util.LinkedHashMap) streamReader.readObject();
    instance.fieldsDouble = (java.util.LinkedHashMap) streamReader.readObject();
    instance.fieldsInteger = (java.util.LinkedHashMap) streamReader.readObject();
    instance.fieldsString = (java.util.LinkedHashMap) streamReader.readObject();
    
  }
  
  public static native com.numhero.shared.pojoc.DataCargoRecord instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.pojoc.DataCargoRecord::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.pojoc.DataCargoRecord instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(instance.fieldsBoolean);
    streamWriter.writeObject(instance.fieldsDate);
    streamWriter.writeObject(instance.fieldsDouble);
    streamWriter.writeObject(instance.fieldsInteger);
    streamWriter.writeObject(instance.fieldsString);
    
  }
  
}
