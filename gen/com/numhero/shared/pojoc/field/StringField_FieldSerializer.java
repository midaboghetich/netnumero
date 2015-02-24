package com.numhero.shared.pojoc.field;

@SuppressWarnings("deprecation")
public class StringField_FieldSerializer {
  private static native int getMaxLength(com.numhero.shared.pojoc.field.StringField instance) /*-{
    return instance.@com.numhero.shared.pojoc.field.StringField::maxLength;
  }-*/;
  
  private static native void  setMaxLength(com.numhero.shared.pojoc.field.StringField instance, int value) /*-{
    instance.@com.numhero.shared.pojoc.field.StringField::maxLength = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.pojoc.field.StringField instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setMaxLength(instance, streamReader.readInt());
    
    com.numhero.shared.pojoc.field.PojoCField_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.shared.pojoc.field.StringField instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.pojoc.field.StringField::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.pojoc.field.StringField instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeInt(getMaxLength(instance));
    
    com.numhero.shared.pojoc.field.PojoCField_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
