package com.numhero.shared.pojoc;

@SuppressWarnings("deprecation")
public class NewPojoC_FieldSerializer {
  private static native java.util.Map getFieldsList(com.numhero.shared.pojoc.NewPojoC instance) /*-{
    return instance.@com.numhero.shared.pojoc.NewPojoC::fieldsList;
  }-*/;
  
  private static native void  setFieldsList(com.numhero.shared.pojoc.NewPojoC instance, java.util.Map value) /*-{
    instance.@com.numhero.shared.pojoc.NewPojoC::fieldsList = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.pojoc.NewPojoC instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setFieldsList(instance, (java.util.Map) streamReader.readObject());
    
    com.numhero.shared.pojoc.BasePojoC_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.shared.pojoc.NewPojoC instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.shared.pojoc.NewPojoC::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.pojoc.NewPojoC instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getFieldsList(instance));
    
    com.numhero.shared.pojoc.BasePojoC_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
