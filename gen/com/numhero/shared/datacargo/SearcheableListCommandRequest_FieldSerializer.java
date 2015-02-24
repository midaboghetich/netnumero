package com.numhero.shared.datacargo;

@SuppressWarnings("deprecation")
public class SearcheableListCommandRequest_FieldSerializer {
  private static native int getMaxResults(com.numhero.shared.datacargo.SearcheableListCommandRequest instance) /*-{
    return instance.@com.numhero.shared.datacargo.SearcheableListCommandRequest::maxResults;
  }-*/;
  
  private static native void  setMaxResults(com.numhero.shared.datacargo.SearcheableListCommandRequest instance, int value) /*-{
    instance.@com.numhero.shared.datacargo.SearcheableListCommandRequest::maxResults = value;
  }-*/;
  
  private static native java.lang.String getSearchString(com.numhero.shared.datacargo.SearcheableListCommandRequest instance) /*-{
    return instance.@com.numhero.shared.datacargo.SearcheableListCommandRequest::searchString;
  }-*/;
  
  private static native void  setSearchString(com.numhero.shared.datacargo.SearcheableListCommandRequest instance, java.lang.String value) /*-{
    instance.@com.numhero.shared.datacargo.SearcheableListCommandRequest::searchString = value;
  }-*/;
  
  private static native java.lang.String getSuggestString(com.numhero.shared.datacargo.SearcheableListCommandRequest instance) /*-{
    return instance.@com.numhero.shared.datacargo.SearcheableListCommandRequest::suggestString;
  }-*/;
  
  private static native void  setSuggestString(com.numhero.shared.datacargo.SearcheableListCommandRequest instance, java.lang.String value) /*-{
    instance.@com.numhero.shared.datacargo.SearcheableListCommandRequest::suggestString = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.numhero.shared.datacargo.SearcheableListCommandRequest instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setMaxResults(instance, streamReader.readInt());
    setSearchString(instance, streamReader.readString());
    setSuggestString(instance, streamReader.readString());
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.numhero.shared.datacargo.SearcheableListCommandRequest instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeInt(getMaxResults(instance));
    streamWriter.writeString(getSearchString(instance));
    streamWriter.writeString(getSuggestString(instance));
    
    com.numhero.shared.datacargo.CommandRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
