package com.numhero.client.model.pojoc;

import com.numhero.shared.enums.CurrencyEnum;
import com.numhero.shared.enums.InvoiceStatusEnum;
import com.numhero.shared.enums.RecurringFrequencyEnum;
import com.numhero.shared.pojoc.BasePojoC;

import java.util.Date;

public class ExpenseC extends BasePojoC {

    private static final String QUANTITY = "quantity";
    private static final String CURRENCY = "currency";
    private static final String AMOUNT = "amount";
    private static final String DESCRIPTION = "description";
    private static final String DATE = "date";
    private static final String STATUS = "status";
    private static final String RECURRING = "recurring";
    private static final String FREQUENCY = "frequency";
    private static final String INVOICE_ID = "invoiceId";


    public ExpenseC() {
    }

    public Double getQuantity() {
        return getAttributeAsDouble(QUANTITY);
    }

    public void setQuantity(Double quantity) {
        setAttribute(QUANTITY, quantity);
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

    public Double getAmount() {
        return getAttributeAsDouble(AMOUNT);
    }

    public void setAmount(Double amount) {
        setAttribute(AMOUNT, amount);
    }

    public String getDescription() {
        return getAttributeAsString(DESCRIPTION);
    }

    public void setDescription(String description) {
        setAttribute(DESCRIPTION, description);
    }

    public Date getDate() {
        return getAttributeAsDate(DATE);
    }

    public void setDate(Date date) {
        setAttribute(DATE, date);
    }

    public InvoiceStatusEnum getStatus() {
        String type = getAttributeAsString(STATUS);
        return type == null ? null : InvoiceStatusEnum.valueOf(type);
    }

    public void setStatus(InvoiceStatusEnum status) {
        if (status != null) {
            setAttribute(STATUS, status.name());
        }
    }

    public Boolean getRecurring() {
        return getAttributeAsBoolean(RECURRING);
    }

    public void setRecurring(Boolean recurring) {
        setAttribute(RECURRING, recurring);
    }

    public RecurringFrequencyEnum getFrequency() {
        String type = getAttributeAsString(FREQUENCY);
        return type == null ? null : RecurringFrequencyEnum.valueOf(type);
    }

    public void setFrequency(RecurringFrequencyEnum frequency) {
        if (frequency != null) {
            setAttribute(FREQUENCY, frequency.name());
        }
    }

    public String getInvoiceId() {
        return getAttributeAsString(INVOICE_ID);
    }

    public void setInvoiceId(String invoiceId) {
        setAttribute(INVOICE_ID, invoiceId);
    }
}
