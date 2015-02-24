package com.numhero.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;

public class DataService_Proxy extends RemoteServiceProxy implements com.numhero.client.service.DataServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.numhero.client.service.DataService";
  private static final String SERIALIZATION_POLICY ="D3BAEB2912EA73C045B589B2F41A19DA";
  private static final com.numhero.client.service.DataService_TypeSerializer SERIALIZER = new com.numhero.client.service.DataService_TypeSerializer();
  
  public DataService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "data", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void execute(com.numhero.shared.datacargo.CommandRequest request, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("DataService_Proxy.execute", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("execute");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.numhero.shared.datacargo.CommandRequest/1463655670");
      streamWriter.writeObject(request);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("DataService_Proxy.execute", requestId, "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "DataService_Proxy.execute", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
