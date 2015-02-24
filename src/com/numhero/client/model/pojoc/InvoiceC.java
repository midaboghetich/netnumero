package com.numhero.client.model.pojoc;

import com.numhero.shared.enums.CurrencyEnum;
import com.numhero.shared.enums.InvoiceStatusEnum;
import com.numhero.shared.enums.InvoiceTypeEnum;
import com.numhero.shared.pojoc.BasePojoC;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceC extends BasePojoC {
	private static final int		_2WEEKS					= 1000 * 60 * 60 * 24 * 14;
    
	private static final String		INVOICE_ID				= "invoiceID";
	private static final String		INVOICE_TYPE			= "invoiceType";
	private static final String		INVOICE_STATUS			= "invoiceStatus";
	private static final String		DATE_RAISED				= "dateRaised";
	private static final String		DATE_DUE				= "dateDue";
	private static final String		CLIENT_SUPPLIER_ID		= "clientSupplierID";
	private static final String		CLIENT_SUPPLIER_NAME	= "clientSupplierName";
	private static final String		PRICE					= "price";
	private static final String		CURRENCY				= "currency";
	private static final String		NOTES					= "notes";
	private static final String		DISCOUNT				= "discount";
	private static final String		TERMS_CONDITIONS		= "termsConditions";

	protected List<InvoiceDetailC>	details;

    public InvoiceC() {
        init();
    }

	public InvoiceC(String id) {
		this();
		setId(id);
	}

    public void init() {
        details = new ArrayList<InvoiceDetailC>();
        setDateRaised(new Date());
        setDateDue(new Date(getDateRaised().getTime() + _2WEEKS));
        setCurrency(CurrencyEnum.EUR);
        setDiscount(0D);
        setPrice(0D);
        setId(null);
        setInvoiceID(null);
        setInvoiceType(null);
        setInvoiceStatus(null);
        setDateRaised(null);
        setDateDue(null);
        setClientSupplierID(null);
        setClientSupplierName(null);
        setPrice(null);
        setCurrency(null);
        setNotes(null);
        setDiscount(null);
        setTermsConditions(null);
    }

	public String getInvoiceID() {
		return getAttributeAsString(INVOICE_ID);
	}

	public void setInvoiceID(String invoiceID) {
		setAttribute(INVOICE_ID, invoiceID);
	}

	public InvoiceTypeEnum getInvoiceType() {
		String type = getAttributeAsString(INVOICE_TYPE);
		return type == null ? null : InvoiceTypeEnum.valueOf(type);

	}

	public void setInvoiceType(InvoiceTypeEnum invoiceType) {
		if (invoiceType != null) {
			setAttribute(INVOICE_TYPE, invoiceType.name());
		}
	}

	public InvoiceStatusEnum getInvoiceStatus() {
		String status = getAttributeAsString(INVOICE_STATUS);
		return status == null ? null : InvoiceStatusEnum.valueOf(status);

	}

	public void setInvoiceStatus(InvoiceStatusEnum invoiceStatus) {
		if (invoiceStatus != null) {
			setAttribute(INVOICE_STATUS, invoiceStatus.name());
		}
	}

	public Date getDateRaised() {
		return getAttributeAsDate(DATE_RAISED);
	}

	public void setDateRaised(Date dateRaised) {
		setAttribute(DATE_RAISED, dateRaised);
	}

	public Date getDateDue() {
		return getAttributeAsDate(DATE_DUE);
	}

	public void setDateDue(Date dateDue) {
		setAttribute(DATE_DUE, dateDue);
	}

	public String getClientSupplierID() {
		return getAttributeAsString(CLIENT_SUPPLIER_ID);
	}

	public void setClientSupplierID(String clientSupplierID) {
		setAttribute(CLIENT_SUPPLIER_ID, clientSupplierID);
	}

	public String getClientSupplierName() {
		return getAttributeAsString(CLIENT_SUPPLIER_NAME);
	}

	public void setClientSupplierName(String clientSupplierName) {
		setAttribute(CLIENT_SUPPLIER_NAME, clientSupplierName);
	}

	public Double getPrice() {
		return getAttributeAsDouble(PRICE);
	}

	public void setPrice(Double price) {
		setAttribute(PRICE, price);
	}

	public CurrencyEnum getCurrency() {
		String type = getAttributeAsString(CURRENCY);
		return type == null ? null : CurrencyEnum.valueOf(type);

	}

	public void setCurrency(CurrencyEnum currency) {
		if (currency != null) {
			setAttribute(CURRENCY, currency.name());
		}
	}

	public String getNotes() {
		return getAttributeAsString(NOTES);
	}

	public void setNotes(String notes) {
		setAttribute(NOTES, notes);
	}

	public Double getDiscount() {
		return getAttributeAsDouble(DISCOUNT);
	}

	public void setDiscount(Double discount) {
		setAttribute(DISCOUNT, discount);
	}

	public String getTermsConditions() {
		return getAttributeAsString(TERMS_CONDITIONS);
	}

	public void setTermsConditions(String termsConditions) {
		setAttribute(TERMS_CONDITIONS, termsConditions);
	}

	public List<InvoiceDetailC> getDetails() {
		return details;
	}

	public void setDetails(List<InvoiceDetailC> details) {
		this.details = details;
	}

	public void addInvoiceDetail(InvoiceDetailC invoiceDetail) {
		details.add(invoiceDetail);
	}

	public void deleteInvoiceDetail(InvoiceDetailC invoiceDetail) {
		details.remove(invoiceDetail);
	}
}
