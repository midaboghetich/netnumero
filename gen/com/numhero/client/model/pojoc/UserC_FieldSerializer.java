package com.numhero.client.model.pojoc;

@SuppressWarnings("deprecation")
public class UserC_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.pojoc.UserC instance) throws com.google.gwt.user.client.rpc.SerializationException{
    instance.fBusinessAccountId = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fFirstName = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fLastLogin = (com.numhero.shared.pojoc.field.DateField) streamReader.readObject();
    instance.fLastName = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fUserProfile = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    
    com.numhero.shared.pojoc.NewBasePojoC_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.pojoc.UserC instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.pojoc.UserC::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.pojoc.UserC instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(instance.fBusinessAccountId);
    streamWriter.writeObject(instance.fFirstName);
    streamWriter.writeObject(instance.fLastLogin);
    streamWriter.writeObject(instance.fLastName);
    streamWriter.writeObject(instance.fUserProfile);
    
    com.numhero.shared.pojoc.NewBasePojoC_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
