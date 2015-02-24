package com.numhero.client.service;

import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.impl.Serializer;

public class DataService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final MethodMap methodMap = JavaScriptObject.createObject().cast();
  private static final JsArrayString signatureMap = JavaScriptObject.createArray().cast();
  protected MethodMap getMethodMap() { return methodMap; }
  protected JsArrayString getSignatureMap() { return signatureMap; }
  
  static {
    registerMethods();
    registerSignatures();
  }
  private static native java.util.ArrayList create_com_google_gwt_user_client_rpc_core_java_util_ArrayList_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.ArrayList::new()();
  }-*/;
  
  private static native java.util.HashMap create_com_google_gwt_user_client_rpc_core_java_util_HashMap_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.HashMap::new()();
  }-*/;
  
  private static native java.util.HashSet create_com_google_gwt_user_client_rpc_core_java_util_HashSet_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.HashSet::new()();
  }-*/;
  
  private static native java.util.IdentityHashMap create_com_google_gwt_user_client_rpc_core_java_util_IdentityHashMap_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.IdentityHashMap::new()();
  }-*/;
  
  private static native java.util.LinkedList create_com_google_gwt_user_client_rpc_core_java_util_LinkedList_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.LinkedList::new()();
  }-*/;
  
  private static native java.util.Vector create_com_google_gwt_user_client_rpc_core_java_util_Vector_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.Vector::new()();
  }-*/;
  
  private static native void registerSignatures() /*-{
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.google.gwt.i18n.client.impl.DateRecord::class,
      "com.google.gwt.i18n.client.impl.DateRecord/112389920");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class,
      "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion::class,
      "com.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion/2803420099");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion[]::class,
      "[Lcom.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion;/1531882420");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.google.gwt.user.client.ui.SuggestOracle$Suggestion[]::class,
      "[Lcom.google.gwt.user.client.ui.SuggestOracle$Suggestion;/3224244884");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.auth.AuthRequest::class,
      "com.numhero.client.model.datacargo.auth.AuthRequest/4107583350");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.auth.AuthResponse::class,
      "com.numhero.client.model.datacargo.auth.AuthResponse/2772891835");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.bankaccount.BankAccountListRequest::class,
      "com.numhero.client.model.datacargo.bankaccount.BankAccountListRequest/3698198802");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse::class,
      "com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse/3079319847");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.bankaccount.DeleteBankAccountsRequest::class,
      "com.numhero.client.model.datacargo.bankaccount.DeleteBankAccountsRequest/2458799615");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest::class,
      "com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest/2042310531");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse::class,
      "com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse/4063539910");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.bankaccount.SaveBankAccountRequest::class,
      "com.numhero.client.model.datacargo.bankaccount.SaveBankAccountRequest/3809946185");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.bankaccount.SaveBankAccountResponse::class,
      "com.numhero.client.model.datacargo.bankaccount.SaveBankAccountResponse/281212766");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountRequest::class,
      "com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountRequest/1170599189");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountResponse::class,
      "com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountResponse/471296");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountRequest::class,
      "com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountRequest/2805581115");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountResponse::class,
      "com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountResponse/3160935331");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.client_supplier.ClientListRequest::class,
      "com.numhero.client.model.datacargo.client_supplier.ClientListRequest/4269643904");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse::class,
      "com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse/3682429627");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseEstimatesRequest::class,
      "com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseEstimatesRequest/1267808427");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseExpensesRequest::class,
      "com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseExpensesRequest/535209559");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseInvoicesRequest::class,
      "com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseInvoicesRequest/4088648610");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.client_supplier.DeleteClientsSuppliersRequest::class,
      "com.numhero.client.model.datacargo.client_supplier.DeleteClientsSuppliersRequest/716462866");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.client_supplier.GetClientSupplierRequest::class,
      "com.numhero.client.model.datacargo.client_supplier.GetClientSupplierRequest/2324563470");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.client_supplier.GetClientSupplierResponse::class,
      "com.numhero.client.model.datacargo.client_supplier.GetClientSupplierResponse/3292698712");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest::class,
      "com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest/2730309056");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse::class,
      "com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse/1491029178");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.client_supplier.SupplierListRequest::class,
      "com.numhero.client.model.datacargo.client_supplier.SupplierListRequest/3285024420");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.expense.ExpenseListRequest::class,
      "com.numhero.client.model.datacargo.expense.ExpenseListRequest/296877584");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.expense.ExpenseListResponse::class,
      "com.numhero.client.model.datacargo.expense.ExpenseListResponse/3375747990");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.expense.ExpensesConvertToInvoicesRequest::class,
      "com.numhero.client.model.datacargo.expense.ExpensesConvertToInvoicesRequest/3072765857");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.expense.GetExpenseRequest::class,
      "com.numhero.client.model.datacargo.expense.GetExpenseRequest/3457175365");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.expense.GetExpenseResponse::class,
      "com.numhero.client.model.datacargo.expense.GetExpenseResponse/3797869415");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.expense.SaveExpenseRequest::class,
      "com.numhero.client.model.datacargo.expense.SaveExpenseRequest/2212026028");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.expense.SaveExpenseResponse::class,
      "com.numhero.client.model.datacargo.expense.SaveExpenseResponse/1585589852");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.invoice.ArchiveDocumentsRequest::class,
      "com.numhero.client.model.datacargo.invoice.ArchiveDocumentsRequest/1529782301");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.invoice.ChangeStatusToPaiedDocumentsRequest::class,
      "com.numhero.client.model.datacargo.invoice.ChangeStatusToPaiedDocumentsRequest/147299330");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.invoice.ConvertToInvoiceRequest::class,
      "com.numhero.client.model.datacargo.invoice.ConvertToInvoiceRequest/1822301238");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.invoice.DeleteDocumentsRequest::class,
      "com.numhero.client.model.datacargo.invoice.DeleteDocumentsRequest/767368121");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.invoice.GetInvoiceRequest::class,
      "com.numhero.client.model.datacargo.invoice.GetInvoiceRequest/2601109258");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.invoice.GetInvoiceResponse::class,
      "com.numhero.client.model.datacargo.invoice.GetInvoiceResponse/2744346175");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.invoice.InvoiceListRequest::class,
      "com.numhero.client.model.datacargo.invoice.InvoiceListRequest/2290952409");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.invoice.InvoiceListResponse::class,
      "com.numhero.client.model.datacargo.invoice.InvoiceListResponse/48940339");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.invoice.SaveInvoiceRequest::class,
      "com.numhero.client.model.datacargo.invoice.SaveInvoiceRequest/3386524799");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.invoice.SaveInvoiceResponse::class,
      "com.numhero.client.model.datacargo.invoice.SaveInvoiceResponse/2228489513");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.product.DeleteProductsRequest::class,
      "com.numhero.client.model.datacargo.product.DeleteProductsRequest/858027437");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.product.GetProductRequest::class,
      "com.numhero.client.model.datacargo.product.GetProductRequest/1143904597");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.product.GetProductResponse::class,
      "com.numhero.client.model.datacargo.product.GetProductResponse/737618484");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.product.ProductListRequest::class,
      "com.numhero.client.model.datacargo.product.ProductListRequest/1383439208");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.product.ProductListResponse::class,
      "com.numhero.client.model.datacargo.product.ProductListResponse/4293771538");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.product.SaveProductRequest::class,
      "com.numhero.client.model.datacargo.product.SaveProductRequest/4288269249");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.product.SaveProductResponse::class,
      "com.numhero.client.model.datacargo.product.SaveProductResponse/3441497398");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.project.DeleteProjectsRequest::class,
      "com.numhero.client.model.datacargo.project.DeleteProjectsRequest/2772122053");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.project.GetProjectRequest::class,
      "com.numhero.client.model.datacargo.project.GetProjectRequest/1564598744");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.project.GetProjectResponse::class,
      "com.numhero.client.model.datacargo.project.GetProjectResponse/2939720384");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.project.ProjectListRequest::class,
      "com.numhero.client.model.datacargo.project.ProjectListRequest/3700607151");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.project.ProjectListResponse::class,
      "com.numhero.client.model.datacargo.project.ProjectListResponse/3642164506");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.project.ProjectRaiseInvoicesRequest::class,
      "com.numhero.client.model.datacargo.project.ProjectRaiseInvoicesRequest/3260100965");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.project.SaveProjectRequest::class,
      "com.numhero.client.model.datacargo.project.SaveProjectRequest/35517513");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.project.SaveProjectResponse::class,
      "com.numhero.client.model.datacargo.project.SaveProjectResponse/3501589019");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.settings.DeleteServicesRequest::class,
      "com.numhero.client.model.datacargo.settings.DeleteServicesRequest/3619083850");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.settings.GetSettingsRequest::class,
      "com.numhero.client.model.datacargo.settings.GetSettingsRequest/1719722063");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.settings.GetSettingsResponse::class,
      "com.numhero.client.model.datacargo.settings.GetSettingsResponse/2984959330");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.settings.SaveSettingsRequest::class,
      "com.numhero.client.model.datacargo.settings.SaveSettingsRequest/2038087072");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.settings.SaveSettingsResponse::class,
      "com.numhero.client.model.datacargo.settings.SaveSettingsResponse/2197848967");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.staff.ContractorListRequest::class,
      "com.numhero.client.model.datacargo.staff.ContractorListRequest/3942706216");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.staff.DeleteStaffRequest::class,
      "com.numhero.client.model.datacargo.staff.DeleteStaffRequest/1168983663");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.staff.GetStaffRequest::class,
      "com.numhero.client.model.datacargo.staff.GetStaffRequest/3414985807");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.staff.GetStaffResponse::class,
      "com.numhero.client.model.datacargo.staff.GetStaffResponse/3063897028");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.staff.InternalListRequest::class,
      "com.numhero.client.model.datacargo.staff.InternalListRequest/3320843896");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.staff.SaveContractorRequest::class,
      "com.numhero.client.model.datacargo.staff.SaveContractorRequest/3795889479");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.staff.SaveInternalRequest::class,
      "com.numhero.client.model.datacargo.staff.SaveInternalRequest/2449086344");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.staff.SaveStaffRequest::class,
      "com.numhero.client.model.datacargo.staff.SaveStaffRequest/1228435693");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.staff.SaveStaffResponse::class,
      "com.numhero.client.model.datacargo.staff.SaveStaffResponse/948727131");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.staff.StaffListRequest::class,
      "com.numhero.client.model.datacargo.staff.StaffListRequest/2665745908");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.staff.StaffListResponse::class,
      "com.numhero.client.model.datacargo.staff.StaffListResponse/1750319604");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.task.DeleteTasksRequest::class,
      "com.numhero.client.model.datacargo.task.DeleteTasksRequest/2554491545");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.task.GetTaskRequest::class,
      "com.numhero.client.model.datacargo.task.GetTaskRequest/915472142");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.task.GetTaskResponse::class,
      "com.numhero.client.model.datacargo.task.GetTaskResponse/907807255");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.task.SaveTaskRequest::class,
      "com.numhero.client.model.datacargo.task.SaveTaskRequest/2137753344");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.task.SaveTaskResponse::class,
      "com.numhero.client.model.datacargo.task.SaveTaskResponse/903704487");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.task.TaskListRequest::class,
      "com.numhero.client.model.datacargo.task.TaskListRequest/2156615778");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.task.TaskListResponse::class,
      "com.numhero.client.model.datacargo.task.TaskListResponse/4004915169");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.taxinfo.GetTaxInfoRequest::class,
      "com.numhero.client.model.datacargo.taxinfo.GetTaxInfoRequest/4161144010");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.taxinfo.GetTaxInfoResponse::class,
      "com.numhero.client.model.datacargo.taxinfo.GetTaxInfoResponse/2936189675");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoRequest::class,
      "com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoRequest/2892781886");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoResponse::class,
      "com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoResponse/2856274734");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.taxinfo.TaxInfoListRequest::class,
      "com.numhero.client.model.datacargo.taxinfo.TaxInfoListRequest/2394223238");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse::class,
      "com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse/3694576599");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.timeentry.DeleteTimeEntriesRequest::class,
      "com.numhero.client.model.datacargo.timeentry.DeleteTimeEntriesRequest/1705543586");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.timeentry.GetTimeEntryRequest::class,
      "com.numhero.client.model.datacargo.timeentry.GetTimeEntryRequest/1106255719");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.timeentry.GetTimeEntryResponse::class,
      "com.numhero.client.model.datacargo.timeentry.GetTimeEntryResponse/2248947766");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.timeentry.SaveTimeEntryRequest::class,
      "com.numhero.client.model.datacargo.timeentry.SaveTimeEntryRequest/599789133");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.timeentry.SaveTimeEntryResponse::class,
      "com.numhero.client.model.datacargo.timeentry.SaveTimeEntryResponse/3815548896");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.timeentry.TimeEntriesRaiseInvoiceRequest::class,
      "com.numhero.client.model.datacargo.timeentry.TimeEntriesRaiseInvoiceRequest/3960804316");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.timeentry.TimeEntryListRequest::class,
      "com.numhero.client.model.datacargo.timeentry.TimeEntryListRequest/2217391827");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse::class,
      "com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse/506832523");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.user.DeleteUsersRequest::class,
      "com.numhero.client.model.datacargo.user.DeleteUsersRequest/4059450445");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.user.GetUserRequest::class,
      "com.numhero.client.model.datacargo.user.GetUserRequest/3567074055");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.user.GetUserResponse::class,
      "com.numhero.client.model.datacargo.user.GetUserResponse/2753964641");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.user.ReactivateUsersRequest::class,
      "com.numhero.client.model.datacargo.user.ReactivateUsersRequest/1296479290");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.user.SaveUserRequest::class,
      "com.numhero.client.model.datacargo.user.SaveUserRequest/1132133863");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.user.SaveUserResponse::class,
      "com.numhero.client.model.datacargo.user.SaveUserResponse/1844632119");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.user.SuspendUsersRequest::class,
      "com.numhero.client.model.datacargo.user.SuspendUsersRequest/3276754804");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.user.UserListRequest::class,
      "com.numhero.client.model.datacargo.user.UserListRequest/485153783");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.datacargo.user.UserListResponse::class,
      "com.numhero.client.model.datacargo.user.UserListResponse/1266038150");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.BankAccountC::class,
      "com.numhero.client.model.pojoc.BankAccountC/2156861345");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.BusinessAccountC::class,
      "com.numhero.client.model.pojoc.BusinessAccountC/3934623293");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ClientSupplierC::class,
      "com.numhero.client.model.pojoc.ClientSupplierC/873830401");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ClientSupplierC[]::class,
      "[Lcom.numhero.client.model.pojoc.ClientSupplierC;/3268663880");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ClientSupplierContactC::class,
      "com.numhero.client.model.pojoc.ClientSupplierContactC/3150789363");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ClientSupplierContactC[]::class,
      "[Lcom.numhero.client.model.pojoc.ClientSupplierContactC;/3680456465");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ExpenseC::class,
      "com.numhero.client.model.pojoc.ExpenseC/3359826196");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.InvoiceC::class,
      "com.numhero.client.model.pojoc.InvoiceC/3915203253");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.InvoiceDetailC::class,
      "com.numhero.client.model.pojoc.InvoiceDetailC/3508080249");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.InvoiceDetailC[]::class,
      "[Lcom.numhero.client.model.pojoc.InvoiceDetailC;/3497903216");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ProductC::class,
      "com.numhero.client.model.pojoc.ProductC/2794265917");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ProductC[]::class,
      "[Lcom.numhero.client.model.pojoc.ProductC;/3306056498");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ProjectC::class,
      "com.numhero.client.model.pojoc.ProjectC/3265390494");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ProjectC[]::class,
      "[Lcom.numhero.client.model.pojoc.ProjectC;/3937478132");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ProjectStaffDetailC::class,
      "com.numhero.client.model.pojoc.ProjectStaffDetailC/663028294");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ProjectStaffDetailC[]::class,
      "[Lcom.numhero.client.model.pojoc.ProjectStaffDetailC;/3569445080");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ProjectTaskDetailC::class,
      "com.numhero.client.model.pojoc.ProjectTaskDetailC/714804578");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ProjectTaskDetailC[]::class,
      "[Lcom.numhero.client.model.pojoc.ProjectTaskDetailC;/4137221411");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.ServiceC::class,
      "com.numhero.client.model.pojoc.ServiceC/2793527998");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.SettingsC::class,
      "com.numhero.client.model.pojoc.SettingsC/157924507");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.StaffC::class,
      "com.numhero.client.model.pojoc.StaffC/2099296076");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.StaffC[]::class,
      "[Lcom.numhero.client.model.pojoc.StaffC;/1006317188");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.TaskC::class,
      "com.numhero.client.model.pojoc.TaskC/764873478");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.TaskC[]::class,
      "[Lcom.numhero.client.model.pojoc.TaskC;/578472340");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.TaskStaffDetailC::class,
      "com.numhero.client.model.pojoc.TaskStaffDetailC/2553157625");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.TaskStaffDetailC[]::class,
      "[Lcom.numhero.client.model.pojoc.TaskStaffDetailC;/713642563");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.TaxInfoC::class,
      "com.numhero.client.model.pojoc.TaxInfoC/2230154273");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.TaxInfoC[]::class,
      "[Lcom.numhero.client.model.pojoc.TaxInfoC;/1379650383");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.TimeEntryC::class,
      "com.numhero.client.model.pojoc.TimeEntryC/374142646");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.UserC::class,
      "com.numhero.client.model.pojoc.UserC/4145028009");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.client.model.pojoc.UserC[]::class,
      "[Lcom.numhero.client.model.pojoc.UserC;/3791637441");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.datacargo.BulkActionRequest::class,
      "com.numhero.shared.datacargo.BulkActionRequest/3636413619");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.datacargo.BulkActionResponse::class,
      "com.numhero.shared.datacargo.BulkActionResponse/4124045909");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.datacargo.GetSingleEntityResponse::class,
      "com.numhero.shared.datacargo.GetSingleEntityResponse/691832768");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.datacargo.SaveSingleEntityRequest::class,
      "com.numhero.shared.datacargo.SaveSingleEntityRequest/593339807");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.datacargo.SaveSingleEntityResponse::class,
      "com.numhero.shared.datacargo.SaveSingleEntityResponse/2085987193");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.enums.InvoiceTypeEnum::class,
      "com.numhero.shared.enums.InvoiceTypeEnum/4011555972");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.exception.ClientWarningException::class,
      "com.numhero.shared.exception.ClientWarningException/200491243");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.exception.NotAuthorizedException::class,
      "com.numhero.shared.exception.NotAuthorizedException/2742406763");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.pojoc.BasePojoC::class,
      "com.numhero.shared.pojoc.BasePojoC/2471388683");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.pojoc.NewBasePojoC::class,
      "com.numhero.shared.pojoc.NewBasePojoC/2031547790");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.pojoc.NewPojoC::class,
      "com.numhero.shared.pojoc.NewPojoC/4268275471");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.pojoc.field.BooleanField::class,
      "com.numhero.shared.pojoc.field.BooleanField/3904749072");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.pojoc.field.DateField::class,
      "com.numhero.shared.pojoc.field.DateField/4069970143");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.pojoc.field.DoubleField::class,
      "com.numhero.shared.pojoc.field.DoubleField/2238601685");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.pojoc.field.IntegerField::class,
      "com.numhero.shared.pojoc.field.IntegerField/3619849474");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.pojoc.field.StringField::class,
      "com.numhero.shared.pojoc.field.StringField/3578679406");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @com.numhero.shared.service.ApplicationCommandEnum::class,
      "com.numhero.shared.service.ApplicationCommandEnum/1339581709");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.lang.Boolean::class,
      "java.lang.Boolean/476441737");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.lang.Double::class,
      "java.lang.Double/858496421");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.lang.Integer::class,
      "java.lang.Integer/3438268394");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.lang.String::class,
      "java.lang.String/2004016611");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.lang.String[]::class,
      "[Ljava.lang.String;/2600011424");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.sql.Date::class,
      "java.sql.Date/3996530531");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.sql.Time::class,
      "java.sql.Time/831929183");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.sql.Timestamp::class,
      "java.sql.Timestamp/1769758459");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.ArrayList::class,
      "java.util.ArrayList/3821976829");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.Arrays$ArrayList::class,
      "java.util.Arrays$ArrayList/1243019747");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.Date::class,
      "java.util.Date/1659716317");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.HashMap::class,
      "java.util.HashMap/962170901");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.HashSet::class,
      "java.util.HashSet/1594477813");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.IdentityHashMap::class,
      "java.util.IdentityHashMap/3881143367");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.LinkedHashMap::class,
      "java.util.LinkedHashMap/1551059846");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.LinkedHashSet::class,
      "java.util.LinkedHashSet/3628722029");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.LinkedList::class,
      "java.util.LinkedList/1060625595");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.Stack::class,
      "java.util.Stack/1031431137");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.TreeMap::class,
      "java.util.TreeMap/1575826026");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.TreeSet::class,
      "java.util.TreeSet/1002270346");
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerSignature(Lcom/google/gwt/core/client/JsArrayString;Ljava/lang/Class;Ljava/lang/String;)(
      @com.numhero.client.service.DataService_TypeSerializer::signatureMap,
      @java.util.Vector::class,
      "java.util.Vector/3125574444");
    
  }-*/;
  
  private static native void registerMethods() /*-{
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.google.gwt.i18n.client.impl.DateRecord/112389920" , [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533" , [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion/2803420099" , [
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MultiWordSuggestOracle$MultiWordSuggestion;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion;/1531882420" , [
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/google/gwt/user/client/ui/MultiWordSuggestOracle$MultiWordSuggestion;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.google.gwt.user.client.ui.SuggestOracle$Suggestion;/3224244884" , [
        @com.google.gwt.user.client.ui.SuggestOracle_Suggestion_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.SuggestOracle_Suggestion_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/google/gwt/user/client/ui/SuggestOracle$Suggestion;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.auth.AuthRequest/4107583350" , [
        ,
        ,
        @com.numhero.client.model.datacargo.auth.AuthRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/auth/AuthRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.auth.AuthResponse/2772891835" , [
        @com.numhero.client.model.datacargo.auth.AuthResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.auth.AuthResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/auth/AuthResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.bankaccount.BankAccountListRequest/3698198802" , [
        ,
        ,
        @com.numhero.client.model.datacargo.bankaccount.BankAccountListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/bankaccount/BankAccountListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse/3079319847" , [
        @com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.bankaccount.BankAccountListResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/bankaccount/BankAccountListResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.bankaccount.DeleteBankAccountsRequest/2458799615" , [
        ,
        ,
        @com.numhero.client.model.datacargo.bankaccount.DeleteBankAccountsRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/bankaccount/DeleteBankAccountsRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest/2042310531" , [
        ,
        ,
        @com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/bankaccount/GetBankAccountRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse/4063539910" , [
        @com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.bankaccount.GetBankAccountResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/bankaccount/GetBankAccountResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.bankaccount.SaveBankAccountRequest/3809946185" , [
        ,
        ,
        @com.numhero.client.model.datacargo.bankaccount.SaveBankAccountRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/bankaccount/SaveBankAccountRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.bankaccount.SaveBankAccountResponse/281212766" , [
        @com.numhero.client.model.datacargo.bankaccount.SaveBankAccountResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.bankaccount.SaveBankAccountResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/bankaccount/SaveBankAccountResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountRequest/1170599189" , [
        ,
        ,
        @com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/businessaccount/GetBusinessAccountRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountResponse/471296" , [
        @com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.businessaccount.GetBusinessAccountResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/businessaccount/GetBusinessAccountResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountRequest/2805581115" , [
        ,
        ,
        @com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/businessaccount/SaveBusinessAccountRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountResponse/3160935331" , [
        @com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.businessaccount.SaveBusinessAccountResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/businessaccount/SaveBusinessAccountResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.client_supplier.ClientListRequest/4269643904" , [
        ,
        ,
        @com.numhero.client.model.datacargo.client_supplier.ClientListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/client_supplier/ClientListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse/3682429627" , [
        @com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/client_supplier/ClientSupplierListResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseEstimatesRequest/1267808427" , [
        ,
        ,
        @com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseEstimatesRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/client_supplier/ClientSupplierRaiseEstimatesRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseExpensesRequest/535209559" , [
        ,
        ,
        @com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseExpensesRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/client_supplier/ClientSupplierRaiseExpensesRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseInvoicesRequest/4088648610" , [
        ,
        ,
        @com.numhero.client.model.datacargo.client_supplier.ClientSupplierRaiseInvoicesRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/client_supplier/ClientSupplierRaiseInvoicesRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.client_supplier.DeleteClientsSuppliersRequest/716462866" , [
        ,
        ,
        @com.numhero.client.model.datacargo.client_supplier.DeleteClientsSuppliersRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/client_supplier/DeleteClientsSuppliersRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.client_supplier.GetClientSupplierRequest/2324563470" , [
        ,
        ,
        @com.numhero.client.model.datacargo.client_supplier.GetClientSupplierRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/client_supplier/GetClientSupplierRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.client_supplier.GetClientSupplierResponse/3292698712" , [
        @com.numhero.client.model.datacargo.client_supplier.GetClientSupplierResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.client_supplier.GetClientSupplierResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/client_supplier/GetClientSupplierResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest/2730309056" , [
        ,
        ,
        @com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/client_supplier/SaveClientSupplierRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse/1491029178" , [
        @com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/client_supplier/SaveClientSupplierResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.client_supplier.SupplierListRequest/3285024420" , [
        ,
        ,
        @com.numhero.client.model.datacargo.client_supplier.SupplierListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/client_supplier/SupplierListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.expense.ExpenseListRequest/296877584" , [
        ,
        ,
        @com.numhero.client.model.datacargo.expense.ExpenseListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/expense/ExpenseListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.expense.ExpenseListResponse/3375747990" , [
        @com.numhero.client.model.datacargo.expense.ExpenseListResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.expense.ExpenseListResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/expense/ExpenseListResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.expense.ExpensesConvertToInvoicesRequest/3072765857" , [
        ,
        ,
        @com.numhero.client.model.datacargo.expense.ExpensesConvertToInvoicesRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/expense/ExpensesConvertToInvoicesRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.expense.GetExpenseRequest/3457175365" , [
        ,
        ,
        @com.numhero.client.model.datacargo.expense.GetExpenseRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/expense/GetExpenseRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.expense.GetExpenseResponse/3797869415" , [
        @com.numhero.client.model.datacargo.expense.GetExpenseResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.expense.GetExpenseResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/expense/GetExpenseResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.expense.SaveExpenseRequest/2212026028" , [
        ,
        ,
        @com.numhero.client.model.datacargo.expense.SaveExpenseRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/expense/SaveExpenseRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.expense.SaveExpenseResponse/1585589852" , [
        @com.numhero.client.model.datacargo.expense.SaveExpenseResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.expense.SaveExpenseResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/expense/SaveExpenseResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.invoice.ArchiveDocumentsRequest/1529782301" , [
        ,
        ,
        @com.numhero.client.model.datacargo.invoice.ArchiveDocumentsRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/invoice/ArchiveDocumentsRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.invoice.ChangeStatusToPaiedDocumentsRequest/147299330" , [
        ,
        ,
        @com.numhero.client.model.datacargo.invoice.ChangeStatusToPaiedDocumentsRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/invoice/ChangeStatusToPaiedDocumentsRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.invoice.ConvertToInvoiceRequest/1822301238" , [
        ,
        ,
        @com.numhero.client.model.datacargo.invoice.ConvertToInvoiceRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/invoice/ConvertToInvoiceRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.invoice.DeleteDocumentsRequest/767368121" , [
        ,
        ,
        @com.numhero.client.model.datacargo.invoice.DeleteDocumentsRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/invoice/DeleteDocumentsRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.invoice.GetInvoiceRequest/2601109258" , [
        ,
        ,
        @com.numhero.client.model.datacargo.invoice.GetInvoiceRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/invoice/GetInvoiceRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.invoice.GetInvoiceResponse/2744346175" , [
        @com.numhero.client.model.datacargo.invoice.GetInvoiceResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.invoice.GetInvoiceResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/invoice/GetInvoiceResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.invoice.InvoiceListRequest/2290952409" , [
        ,
        ,
        @com.numhero.client.model.datacargo.invoice.InvoiceListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/invoice/InvoiceListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.invoice.InvoiceListResponse/48940339" , [
        @com.numhero.client.model.datacargo.invoice.InvoiceListResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.invoice.InvoiceListResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/invoice/InvoiceListResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.invoice.SaveInvoiceRequest/3386524799" , [
        ,
        ,
        @com.numhero.client.model.datacargo.invoice.SaveInvoiceRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/invoice/SaveInvoiceRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.invoice.SaveInvoiceResponse/2228489513" , [
        @com.numhero.client.model.datacargo.invoice.SaveInvoiceResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.invoice.SaveInvoiceResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/invoice/SaveInvoiceResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.product.DeleteProductsRequest/858027437" , [
        ,
        ,
        @com.numhero.client.model.datacargo.product.DeleteProductsRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/product/DeleteProductsRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.product.GetProductRequest/1143904597" , [
        ,
        ,
        @com.numhero.client.model.datacargo.product.GetProductRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/product/GetProductRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.product.GetProductResponse/737618484" , [
        @com.numhero.client.model.datacargo.product.GetProductResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.product.GetProductResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/product/GetProductResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.product.ProductListRequest/1383439208" , [
        ,
        ,
        @com.numhero.client.model.datacargo.product.ProductListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/product/ProductListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.product.ProductListResponse/4293771538" , [
        @com.numhero.client.model.datacargo.product.ProductListResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.product.ProductListResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/product/ProductListResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.product.SaveProductRequest/4288269249" , [
        ,
        ,
        @com.numhero.client.model.datacargo.product.SaveProductRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/product/SaveProductRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.product.SaveProductResponse/3441497398" , [
        @com.numhero.client.model.datacargo.product.SaveProductResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.product.SaveProductResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/product/SaveProductResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.project.DeleteProjectsRequest/2772122053" , [
        ,
        ,
        @com.numhero.client.model.datacargo.project.DeleteProjectsRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/project/DeleteProjectsRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.project.GetProjectRequest/1564598744" , [
        ,
        ,
        @com.numhero.client.model.datacargo.project.GetProjectRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/project/GetProjectRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.project.GetProjectResponse/2939720384" , [
        @com.numhero.client.model.datacargo.project.GetProjectResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.project.GetProjectResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/project/GetProjectResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.project.ProjectListRequest/3700607151" , [
        ,
        ,
        @com.numhero.client.model.datacargo.project.ProjectListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/project/ProjectListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.project.ProjectListResponse/3642164506" , [
        @com.numhero.client.model.datacargo.project.ProjectListResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.project.ProjectListResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/project/ProjectListResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.project.ProjectRaiseInvoicesRequest/3260100965" , [
        ,
        ,
        @com.numhero.client.model.datacargo.project.ProjectRaiseInvoicesRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/project/ProjectRaiseInvoicesRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.project.SaveProjectRequest/35517513" , [
        ,
        ,
        @com.numhero.client.model.datacargo.project.SaveProjectRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/project/SaveProjectRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.project.SaveProjectResponse/3501589019" , [
        @com.numhero.client.model.datacargo.project.SaveProjectResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.project.SaveProjectResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/project/SaveProjectResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.settings.DeleteServicesRequest/3619083850" , [
        ,
        ,
        @com.numhero.client.model.datacargo.settings.DeleteServicesRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/settings/DeleteServicesRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.settings.GetSettingsRequest/1719722063" , [
        ,
        ,
        @com.numhero.client.model.datacargo.settings.GetSettingsRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/settings/GetSettingsRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.settings.GetSettingsResponse/2984959330" , [
        @com.numhero.client.model.datacargo.settings.GetSettingsResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.settings.GetSettingsResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/settings/GetSettingsResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.settings.SaveSettingsRequest/2038087072" , [
        ,
        ,
        @com.numhero.client.model.datacargo.settings.SaveSettingsRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/settings/SaveSettingsRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.settings.SaveSettingsResponse/2197848967" , [
        @com.numhero.client.model.datacargo.settings.SaveSettingsResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.settings.SaveSettingsResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/settings/SaveSettingsResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.staff.ContractorListRequest/3942706216" , [
        ,
        ,
        @com.numhero.client.model.datacargo.staff.ContractorListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/staff/ContractorListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.staff.DeleteStaffRequest/1168983663" , [
        ,
        ,
        @com.numhero.client.model.datacargo.staff.DeleteStaffRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/staff/DeleteStaffRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.staff.GetStaffRequest/3414985807" , [
        ,
        ,
        @com.numhero.client.model.datacargo.staff.GetStaffRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/staff/GetStaffRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.staff.GetStaffResponse/3063897028" , [
        @com.numhero.client.model.datacargo.staff.GetStaffResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.staff.GetStaffResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/staff/GetStaffResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.staff.InternalListRequest/3320843896" , [
        ,
        ,
        @com.numhero.client.model.datacargo.staff.InternalListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/staff/InternalListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.staff.SaveContractorRequest/3795889479" , [
        ,
        ,
        @com.numhero.client.model.datacargo.staff.SaveContractorRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/staff/SaveContractorRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.staff.SaveInternalRequest/2449086344" , [
        ,
        ,
        @com.numhero.client.model.datacargo.staff.SaveInternalRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/staff/SaveInternalRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.staff.SaveStaffRequest/1228435693" , [
        ,
        ,
        @com.numhero.client.model.datacargo.staff.SaveStaffRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/staff/SaveStaffRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.staff.SaveStaffResponse/948727131" , [
        @com.numhero.client.model.datacargo.staff.SaveStaffResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.staff.SaveStaffResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/staff/SaveStaffResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.staff.StaffListRequest/2665745908" , [
        ,
        ,
        @com.numhero.client.model.datacargo.staff.StaffListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/staff/StaffListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.staff.StaffListResponse/1750319604" , [
        @com.numhero.client.model.datacargo.staff.StaffListResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.staff.StaffListResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/staff/StaffListResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.task.DeleteTasksRequest/2554491545" , [
        ,
        ,
        @com.numhero.client.model.datacargo.task.DeleteTasksRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/task/DeleteTasksRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.task.GetTaskRequest/915472142" , [
        ,
        ,
        @com.numhero.client.model.datacargo.task.GetTaskRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/task/GetTaskRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.task.GetTaskResponse/907807255" , [
        @com.numhero.client.model.datacargo.task.GetTaskResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.task.GetTaskResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/task/GetTaskResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.task.SaveTaskRequest/2137753344" , [
        ,
        ,
        @com.numhero.client.model.datacargo.task.SaveTaskRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/task/SaveTaskRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.task.SaveTaskResponse/903704487" , [
        @com.numhero.client.model.datacargo.task.SaveTaskResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.task.SaveTaskResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/task/SaveTaskResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.task.TaskListRequest/2156615778" , [
        ,
        ,
        @com.numhero.client.model.datacargo.task.TaskListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/task/TaskListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.task.TaskListResponse/4004915169" , [
        @com.numhero.client.model.datacargo.task.TaskListResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.task.TaskListResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/task/TaskListResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.taxinfo.GetTaxInfoRequest/4161144010" , [
        ,
        ,
        @com.numhero.client.model.datacargo.taxinfo.GetTaxInfoRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/taxinfo/GetTaxInfoRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.taxinfo.GetTaxInfoResponse/2936189675" , [
        @com.numhero.client.model.datacargo.taxinfo.GetTaxInfoResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.taxinfo.GetTaxInfoResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/taxinfo/GetTaxInfoResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoRequest/2892781886" , [
        ,
        ,
        @com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/taxinfo/SaveTaxInfoRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoResponse/2856274734" , [
        @com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/taxinfo/SaveTaxInfoResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.taxinfo.TaxInfoListRequest/2394223238" , [
        ,
        ,
        @com.numhero.client.model.datacargo.taxinfo.TaxInfoListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/taxinfo/TaxInfoListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse/3694576599" , [
        @com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/taxinfo/TaxInfoListResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.timeentry.DeleteTimeEntriesRequest/1705543586" , [
        ,
        ,
        @com.numhero.client.model.datacargo.timeentry.DeleteTimeEntriesRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/timeentry/DeleteTimeEntriesRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.timeentry.GetTimeEntryRequest/1106255719" , [
        ,
        ,
        @com.numhero.client.model.datacargo.timeentry.GetTimeEntryRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/timeentry/GetTimeEntryRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.timeentry.GetTimeEntryResponse/2248947766" , [
        @com.numhero.client.model.datacargo.timeentry.GetTimeEntryResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.timeentry.GetTimeEntryResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/timeentry/GetTimeEntryResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.timeentry.SaveTimeEntryRequest/599789133" , [
        ,
        ,
        @com.numhero.client.model.datacargo.timeentry.SaveTimeEntryRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/timeentry/SaveTimeEntryRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.timeentry.SaveTimeEntryResponse/3815548896" , [
        @com.numhero.client.model.datacargo.timeentry.SaveTimeEntryResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.timeentry.SaveTimeEntryResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/timeentry/SaveTimeEntryResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.timeentry.TimeEntriesRaiseInvoiceRequest/3960804316" , [
        ,
        ,
        @com.numhero.client.model.datacargo.timeentry.TimeEntriesRaiseInvoiceRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/timeentry/TimeEntriesRaiseInvoiceRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.timeentry.TimeEntryListRequest/2217391827" , [
        ,
        ,
        @com.numhero.client.model.datacargo.timeentry.TimeEntryListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/timeentry/TimeEntryListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse/506832523" , [
        @com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/timeentry/TimeEntryListResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.user.DeleteUsersRequest/4059450445" , [
        ,
        ,
        @com.numhero.client.model.datacargo.user.DeleteUsersRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/user/DeleteUsersRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.user.GetUserRequest/3567074055" , [
        ,
        ,
        @com.numhero.client.model.datacargo.user.GetUserRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/user/GetUserRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.user.GetUserResponse/2753964641" , [
        @com.numhero.client.model.datacargo.user.GetUserResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.user.GetUserResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/user/GetUserResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.user.ReactivateUsersRequest/1296479290" , [
        ,
        ,
        @com.numhero.client.model.datacargo.user.ReactivateUsersRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/user/ReactivateUsersRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.user.SaveUserRequest/1132133863" , [
        ,
        ,
        @com.numhero.client.model.datacargo.user.SaveUserRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/user/SaveUserRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.user.SaveUserResponse/1844632119" , [
        @com.numhero.client.model.datacargo.user.SaveUserResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.user.SaveUserResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/user/SaveUserResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.user.SuspendUsersRequest/3276754804" , [
        ,
        ,
        @com.numhero.client.model.datacargo.user.SuspendUsersRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/user/SuspendUsersRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.user.UserListRequest/485153783" , [
        ,
        ,
        @com.numhero.client.model.datacargo.user.UserListRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/datacargo/user/UserListRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.datacargo.user.UserListResponse/1266038150" , [
        @com.numhero.client.model.datacargo.user.UserListResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.datacargo.user.UserListResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/datacargo/user/UserListResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.BankAccountC/2156861345" , [
        @com.numhero.client.model.pojoc.BankAccountC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.BankAccountC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/BankAccountC;),
        @com.numhero.client.model.pojoc.BankAccountC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/BankAccountC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.BusinessAccountC/3934623293" , [
        @com.numhero.client.model.pojoc.BusinessAccountC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.BusinessAccountC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/BusinessAccountC;),
        @com.numhero.client.model.pojoc.BusinessAccountC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/BusinessAccountC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.ClientSupplierC/873830401" , [
        @com.numhero.client.model.pojoc.ClientSupplierC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ClientSupplierC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/ClientSupplierC;),
        @com.numhero.client.model.pojoc.ClientSupplierC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/ClientSupplierC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.ClientSupplierC;/3268663880" , [
        @com.numhero.client.model.pojoc.ClientSupplierC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ClientSupplierC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/ClientSupplierC;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.ClientSupplierContactC/3150789363" , [
        @com.numhero.client.model.pojoc.ClientSupplierContactC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ClientSupplierContactC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/ClientSupplierContactC;),
        @com.numhero.client.model.pojoc.ClientSupplierContactC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/ClientSupplierContactC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.ClientSupplierContactC;/3680456465" , [
        @com.numhero.client.model.pojoc.ClientSupplierContactC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ClientSupplierContactC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/ClientSupplierContactC;),
        @com.numhero.client.model.pojoc.ClientSupplierContactC_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/numhero/client/model/pojoc/ClientSupplierContactC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.ExpenseC/3359826196" , [
        @com.numhero.client.model.pojoc.ExpenseC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ExpenseC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/ExpenseC;),
        @com.numhero.client.model.pojoc.ExpenseC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/ExpenseC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.InvoiceC/3915203253" , [
        @com.numhero.client.model.pojoc.InvoiceC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.InvoiceC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/InvoiceC;),
        @com.numhero.client.model.pojoc.InvoiceC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/InvoiceC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.InvoiceDetailC/3508080249" , [
        @com.numhero.client.model.pojoc.InvoiceDetailC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.InvoiceDetailC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/InvoiceDetailC;),
        @com.numhero.client.model.pojoc.InvoiceDetailC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/InvoiceDetailC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.InvoiceDetailC;/3497903216" , [
        @com.numhero.client.model.pojoc.InvoiceDetailC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.InvoiceDetailC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/InvoiceDetailC;),
        @com.numhero.client.model.pojoc.InvoiceDetailC_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/numhero/client/model/pojoc/InvoiceDetailC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.ProductC/2794265917" , [
        @com.numhero.client.model.pojoc.ProductC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ProductC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/ProductC;),
        @com.numhero.client.model.pojoc.ProductC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/ProductC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.ProductC;/3306056498" , [
        @com.numhero.client.model.pojoc.ProductC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ProductC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/ProductC;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.ProjectC/3265390494" , [
        @com.numhero.client.model.pojoc.ProjectC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ProjectC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/ProjectC;),
        @com.numhero.client.model.pojoc.ProjectC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/ProjectC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.ProjectC;/3937478132" , [
        @com.numhero.client.model.pojoc.ProjectC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ProjectC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/ProjectC;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.ProjectStaffDetailC/663028294" , [
        @com.numhero.client.model.pojoc.ProjectStaffDetailC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ProjectStaffDetailC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/ProjectStaffDetailC;),
        @com.numhero.client.model.pojoc.ProjectStaffDetailC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/ProjectStaffDetailC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.ProjectStaffDetailC;/3569445080" , [
        @com.numhero.client.model.pojoc.ProjectStaffDetailC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ProjectStaffDetailC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/ProjectStaffDetailC;),
        @com.numhero.client.model.pojoc.ProjectStaffDetailC_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/numhero/client/model/pojoc/ProjectStaffDetailC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.ProjectTaskDetailC/714804578" , [
        @com.numhero.client.model.pojoc.ProjectTaskDetailC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ProjectTaskDetailC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/ProjectTaskDetailC;),
        @com.numhero.client.model.pojoc.ProjectTaskDetailC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/ProjectTaskDetailC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.ProjectTaskDetailC;/4137221411" , [
        @com.numhero.client.model.pojoc.ProjectTaskDetailC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ProjectTaskDetailC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/ProjectTaskDetailC;),
        @com.numhero.client.model.pojoc.ProjectTaskDetailC_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/numhero/client/model/pojoc/ProjectTaskDetailC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.ServiceC/2793527998" , [
        @com.numhero.client.model.pojoc.ServiceC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.ServiceC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/ServiceC;),
        @com.numhero.client.model.pojoc.ServiceC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/ServiceC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.SettingsC/157924507" , [
        @com.numhero.client.model.pojoc.SettingsC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.SettingsC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/SettingsC;),
        @com.numhero.client.model.pojoc.SettingsC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/SettingsC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.StaffC/2099296076" , [
        @com.numhero.client.model.pojoc.StaffC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.StaffC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/StaffC;),
        @com.numhero.client.model.pojoc.StaffC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/StaffC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.StaffC;/1006317188" , [
        @com.numhero.client.model.pojoc.StaffC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.StaffC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/StaffC;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.TaskC/764873478" , [
        @com.numhero.client.model.pojoc.TaskC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.TaskC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/TaskC;),
        @com.numhero.client.model.pojoc.TaskC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/TaskC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.TaskC;/578472340" , [
        @com.numhero.client.model.pojoc.TaskC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.TaskC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/TaskC;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.TaskStaffDetailC/2553157625" , [
        @com.numhero.client.model.pojoc.TaskStaffDetailC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.TaskStaffDetailC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/TaskStaffDetailC;),
        @com.numhero.client.model.pojoc.TaskStaffDetailC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/TaskStaffDetailC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.TaskStaffDetailC;/713642563" , [
        @com.numhero.client.model.pojoc.TaskStaffDetailC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.TaskStaffDetailC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/TaskStaffDetailC;),
        @com.numhero.client.model.pojoc.TaskStaffDetailC_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/numhero/client/model/pojoc/TaskStaffDetailC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.TaxInfoC/2230154273" , [
        @com.numhero.client.model.pojoc.TaxInfoC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.TaxInfoC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/TaxInfoC;),
        @com.numhero.client.model.pojoc.TaxInfoC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/TaxInfoC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.TaxInfoC;/1379650383" , [
        @com.numhero.client.model.pojoc.TaxInfoC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.TaxInfoC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/TaxInfoC;),
        @com.numhero.client.model.pojoc.TaxInfoC_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/numhero/client/model/pojoc/TaxInfoC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.TimeEntryC/374142646" , [
        @com.numhero.client.model.pojoc.TimeEntryC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.TimeEntryC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/TimeEntryC;),
        @com.numhero.client.model.pojoc.TimeEntryC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/TimeEntryC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.client.model.pojoc.UserC/4145028009" , [
        @com.numhero.client.model.pojoc.UserC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.UserC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/client/model/pojoc/UserC;),
        @com.numhero.client.model.pojoc.UserC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/client/model/pojoc/UserC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Lcom.numhero.client.model.pojoc.UserC;/3791637441" , [
        @com.numhero.client.model.pojoc.UserC_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.client.model.pojoc.UserC_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/numhero/client/model/pojoc/UserC;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.datacargo.BulkActionRequest/3636413619" , [
        ,
        ,
        @com.numhero.shared.datacargo.BulkActionRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/datacargo/BulkActionRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.datacargo.BulkActionResponse/4124045909" , [
        @com.numhero.shared.datacargo.BulkActionResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.datacargo.BulkActionResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/datacargo/BulkActionResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.datacargo.GetSingleEntityResponse/691832768" , [
        @com.numhero.shared.datacargo.GetSingleEntityResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.datacargo.GetSingleEntityResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/datacargo/GetSingleEntityResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.datacargo.SaveSingleEntityRequest/593339807" , [
        ,
        ,
        @com.numhero.shared.datacargo.SaveSingleEntityRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/datacargo/SaveSingleEntityRequest;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.datacargo.SaveSingleEntityResponse/2085987193" , [
        @com.numhero.shared.datacargo.SaveSingleEntityResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.datacargo.SaveSingleEntityResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/datacargo/SaveSingleEntityResponse;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.enums.InvoiceTypeEnum/4011555972" , [
        ,
        ,
        @com.numhero.shared.enums.InvoiceTypeEnum_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/enums/InvoiceTypeEnum;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.exception.ClientWarningException/200491243" , [
        @com.numhero.shared.exception.ClientWarningException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.exception.ClientWarningException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/exception/ClientWarningException;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.exception.NotAuthorizedException/2742406763" , [
        @com.numhero.shared.exception.NotAuthorizedException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.exception.NotAuthorizedException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/exception/NotAuthorizedException;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.pojoc.BasePojoC/2471388683" , [
        @com.numhero.shared.pojoc.BasePojoC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.pojoc.BasePojoC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/pojoc/BasePojoC;),
        @com.numhero.shared.pojoc.BasePojoC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/pojoc/BasePojoC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.pojoc.NewBasePojoC/2031547790" , [
        @com.numhero.shared.pojoc.NewBasePojoC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.pojoc.NewBasePojoC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/pojoc/NewBasePojoC;),
        @com.numhero.shared.pojoc.NewBasePojoC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/pojoc/NewBasePojoC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.pojoc.NewPojoC/4268275471" , [
        @com.numhero.shared.pojoc.NewPojoC_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.pojoc.NewPojoC_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/pojoc/NewPojoC;),
        @com.numhero.shared.pojoc.NewPojoC_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/pojoc/NewPojoC;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.pojoc.field.BooleanField/3904749072" , [
        @com.numhero.shared.pojoc.field.BooleanField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.pojoc.field.BooleanField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/pojoc/field/BooleanField;),
        @com.numhero.shared.pojoc.field.BooleanField_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/pojoc/field/BooleanField;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.pojoc.field.DateField/4069970143" , [
        @com.numhero.shared.pojoc.field.DateField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.pojoc.field.DateField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/pojoc/field/DateField;),
        @com.numhero.shared.pojoc.field.DateField_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/pojoc/field/DateField;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.pojoc.field.DoubleField/2238601685" , [
        @com.numhero.shared.pojoc.field.DoubleField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.pojoc.field.DoubleField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/pojoc/field/DoubleField;),
        @com.numhero.shared.pojoc.field.DoubleField_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/pojoc/field/DoubleField;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.pojoc.field.IntegerField/3619849474" , [
        @com.numhero.shared.pojoc.field.IntegerField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.pojoc.field.IntegerField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/pojoc/field/IntegerField;),
        @com.numhero.shared.pojoc.field.IntegerField_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/pojoc/field/IntegerField;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.pojoc.field.StringField/3578679406" , [
        @com.numhero.shared.pojoc.field.StringField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.numhero.shared.pojoc.field.StringField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/numhero/shared/pojoc/field/StringField;),
        @com.numhero.shared.pojoc.field.StringField_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/pojoc/field/StringField;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "com.numhero.shared.service.ApplicationCommandEnum/1339581709" , [
        ,
        ,
        @com.numhero.shared.service.ApplicationCommandEnum_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/numhero/shared/service/ApplicationCommandEnum;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.lang.Boolean/476441737" , [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.lang.Double/858496421" , [
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Double;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Double;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.lang.Integer/3438268394" , [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.lang.String/2004016611" , [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "[Ljava.lang.String;/2600011424" , [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/String;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.sql.Date/3996530531" , [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.sql.Time/831929183" , [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.sql.Timestamp/1769758459" , [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.ArrayList/3821976829" , [
        @com.numhero.client.service.DataService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_ArrayList_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.Arrays$ArrayList/1243019747" , [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.Date/1659716317" , [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.HashMap/962170901" , [
        @com.numhero.client.service.DataService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_HashMap_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.HashSet/1594477813" , [
        @com.numhero.client.service.DataService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_HashSet_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.IdentityHashMap/3881143367" , [
        @com.numhero.client.service.DataService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_IdentityHashMap_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/IdentityHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/IdentityHashMap;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.LinkedHashMap/1551059846" , [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.LinkedHashSet/3628722029" , [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.LinkedList/1060625595" , [
        @com.numhero.client.service.DataService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_LinkedList_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.Stack/1031431137" , [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.TreeMap/1575826026" , [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.TreeSet/1002270346" , [
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
      ]);
    
    @com.google.gwt.user.client.rpc.impl.SerializerBase::registerMethods(Lcom/google/gwt/user/client/rpc/impl/SerializerBase$MethodMap;Ljava/lang/String;Lcom/google/gwt/core/client/JsArray;)(
      @com.numhero.client.service.DataService_TypeSerializer::methodMap,
      "java.util.Vector/3125574444" , [
        @com.numhero.client.service.DataService_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_Vector_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ]);
    
  }-*/;
  
  private static void raiseSerializationException(String msg) throws SerializationException {
    throw new SerializationException(msg);
  }
  
}
