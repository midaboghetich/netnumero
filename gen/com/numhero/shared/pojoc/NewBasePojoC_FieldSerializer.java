package com.numhero.shared.pojoc;

@SuppressWarnings("deprecation")
public class NewBasePojoC_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.pojoc.NewBasePojoC instance) throws com.google.gwt.user.client.rpc.SerializationException{
    instance.fCreated = (com.numhero.shared.pojoc.field.DateField) streamReader.readObject();
    instance.fId = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    
    com.numhero.shared.pojoc.NewPojoC_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.shared.pojoc.NewBasePojoC instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.pojoc.NewBasePojoC::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.pojoc.NewBasePojoC instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(instance.fCreated);
    streamWriter.writeObject(instance.fId);
    
    com.numhero.shared.pojoc.NewPojoC_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
