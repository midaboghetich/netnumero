package com.numhero.server.model.pojo;

import com.numhero.shared.enums.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PojoTestUtils {

	public static Date	date		= new Date();
	public static Date	dueDate		= new Date();
	public static Date	raisedDate	= new Date();

	public static User createUser() {
		User user = new User();
		user.setFirstName("first");
		user.setLastName("last");
		user.setLastLogin(date);
		user.setPortalUserId("3");
		user.setEmail("username@gamil.com");
		user.setBusinessAccountId("baId");
		user.addRelationToBa("baId", UserRoleEnum.free);
		return user;
	}

	public static Invoice createInvoice() {
		Invoice invoice = new Invoice();
		invoice.setConcurrencyVersion(1);
		invoice.setDateDue(dueDate);
		invoice.setDateRaised(raisedDate);
		invoice.setInvoiceType(InvoiceTypeEnum.Estimate);
		invoice.setDiscount(1.5);
		invoice.setInvoiceID("invoice");
		invoice.setNotes("brown lasy fox jumps over the green fence");
		invoice.setBusinessAccountId("ba1");
        invoice.setCurrency(CurrencyEnum.USD);
		return invoice;
	}

	public static BankAccount createBankAccount() {
		BankAccount account = new BankAccount();
		account.setAccount("my_account");
		account.setBank("my_bank");
		account.setCurrency(CurrencyEnum.EUR);
		account.setIban("DEIT81374-1234");
		account.setName("name");
		account.setDescription("description");
		account.setSwift("BIC_CODE");
		account.setOpeningBalance(100D);
		account.setCurrentBalance(200D);
		account.setBusinessAccountId("ba1");
		return account;
	}

	public static BusinessAccount createBusinessAccount() {
		BusinessAccount account = new BusinessAccount();
		account.setCurrency(CurrencyEnum.EUR);
		account.setDateFormat(DateFormatEnum.ddmmyyyycolon);
		account.setName("name");
		account.setDefaultDaysDue(30);
		account.setEmail("me@b.com");
		account.setPhoneNumber("490088345");
		account.setPreferredPaymentMethods(PaymentMethodEnum.BANK_PAYMENT);
		account.setTermsConditionsProducts("my terms for products");
		account.setTermsConditionsServices("my terms for services");
		account.setTimeFormat(TimeFormatEnum.hhmmssscolon);
		account.setVatRegistrationNumber("vat_number");
		return account;
	}

	public static ClientSupplier createClientSupplier() {
		ClientSupplier clientSupplier = new ClientSupplier();
		clientSupplier.setAddress("kaiserswertherstr 115");
		clientSupplier.setBusinessAccountId("bizId");
		clientSupplier.setCity("Dusseldorf");
		clientSupplier.setCountry("DE");
		clientSupplier.setConcurrencyVersion(1);
		clientSupplier.setCompanyFax("+4909120909");
		clientSupplier.setCompanyName("antonio");
		clientSupplier.setCompanyPhone("+49129128093812");
		clientSupplier.setRegion("NRW");
		clientSupplier.setPartnerType(ClientSupplierEnum.client);
		clientSupplier.setZipCode("40474");
		clientSupplier.setBusinessAccountId("ba1");
		return clientSupplier;
	}

	public static InvoiceDetail createInvoiceDetail() {
		InvoiceDetail detail = new InvoiceDetail();
		detail.setPrice(100D);
        detail.setName("detail");
		detail.setProductId("pid");
		detail.setQuantity(20D);
		TaxInfo tax1 = new TaxInfo("VAT", 17.5D, 0D);
		Set<TaxInfo> taxes = new HashSet<TaxInfo>();
		taxes.add(tax1);
		detail.setTaxes(taxes);
		detail.addTax("VAT_ID");
		return detail;
	}

	public static Product createProduct() {
		Product product = new Product();
		product.setCategoryId("catId");
		product.setBusinessAccountId("compId");
		product.setDescription("description");
		product.setName("product 1");
		product.setQuantity(1000D);
		product.setTrackingEnabled(true);
		product.setUnitPrice(20D);
		product.setBusinessAccountId("ba1");
		return product;
	}

	public static Product createService() {
		Product service = new Product();
		service.setBusinessAccountId("compId");
		service.setDescription("description");
		service.setName("product 1");
		service.setUnitPrice(20D);
		service.setServiceUnit(ServiceUnitEnum.Day);
		service.setBusinessAccountId("ba1");
		return service;
	}

	public static TaxInfo createTaxInfo() {
		TaxInfo taxinfo = new TaxInfo();
		taxinfo.setPercent(15D);
		taxinfo.setValue(100D);
		taxinfo.setConcurrencyVersion(2);
		taxinfo.setBusinessAccountId("ba1");
		return taxinfo;
	}

	public static Project createProject() {
		Project project = new Project();
		return project;
	}

	public static Task createTask() {
		Task task = new Task();
		return task;
	}

//	public static TimeEntry createTimeEntry() {
//		TimeEntry timeEntry = new TimeEntry();
//		return timeEntry;
//	}
	//
	// public static Settings createSettings() {
	// Settings settings = new Settings();
	// return settings;
	// }

}
