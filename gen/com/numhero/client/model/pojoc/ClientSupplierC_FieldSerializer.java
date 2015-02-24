package com.numhero.client.model.pojoc;

@SuppressWarnings("deprecation")
public class ClientSupplierC_FieldSerializer {
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.client.model.pojoc.ClientSupplierC instance) throws com.google.gwt.user.client.rpc.SerializationException{
    instance.contacts = (java.util.List) streamReader.readObject();
    instance.fAddress = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fCity = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fCompanyFax = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fCompanyName = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fCompanyPhone = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fCountry = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fNotes = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fRegion = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fSendInvoiceType = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fType = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    instance.fZipCode = (com.numhero.shared.pojoc.field.StringField) streamReader.readObject();
    
    com.numhero.shared.pojoc.NewBasePojoC_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.numhero.client.model.pojoc.ClientSupplierC instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.numhero.client.model.pojoc.ClientSupplierC::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.client.model.pojoc.ClientSupplierC instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(instance.contacts);
    streamWriter.writeObject(instance.fAddress);
    streamWriter.writeObject(instance.fCity);
    streamWriter.writeObject(instance.fCompanyFax);
    streamWriter.writeObject(instance.fCompanyName);
    streamWriter.writeObject(instance.fCompanyPhone);
    streamWriter.writeObject(instance.fCountry);
    streamWriter.writeObject(instance.fNotes);
    streamWriter.writeObject(instance.fRegion);
    streamWriter.writeObject(instance.fSendInvoiceType);
    streamWriter.writeObject(instance.fType);
    streamWriter.writeObject(instance.fZipCode);
    
    com.numhero.shared.pojoc.NewBasePojoC_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
