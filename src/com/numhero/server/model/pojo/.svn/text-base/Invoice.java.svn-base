package com.numhero.server.model.pojo;

import com.numhero.server.search.IsSearchable;
import com.numhero.shared.enums.CurrencyEnum;
import com.numhero.shared.enums.InvoiceStatusEnum;
import com.numhero.shared.enums.InvoiceTypeEnum;

import javax.jdo.annotations.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class Invoice extends Searchable implements Serializable {
    private static final long serialVersionUID = 2975067150278156973L;

    @Persistent
    @IsSearchable
    private String invoiceID;

    @Persistent
    private InvoiceTypeEnum invoiceType;

    @Persistent
    private InvoiceStatusEnum invoiceStatus;

    @Persistent
    private Date dateRaised;

    @Persistent
    private Date dateDue;

    @Persistent
    private String clientSupplierID;

    @Persistent(persistenceModifier = PersistenceModifier.NONE)
    private String clientSupplierName;

    @Persistent
    @Element(dependent = "true")
    private List<InvoiceDetail> details = new ArrayList<InvoiceDetail>();

    @Persistent
    private Double price;

    @Persistent
    private CurrencyEnum currency;

    @Persistent
    @IsSearchable
    private String notes;

    @Persistent
    private Double discount;

    @Persistent
    private String termsConditions;

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public InvoiceTypeEnum getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(InvoiceTypeEnum invoiceType) {
        this.invoiceType = invoiceType;
    }

    public InvoiceStatusEnum getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(InvoiceStatusEnum invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Date getDateRaised() {
        return dateRaised;
    }

    public void setDateRaised(Date dateRaised) {
        this.dateRaised = dateRaised;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public String getClientSupplierID() {
        return clientSupplierID;
    }

    public void setClientSupplierID(String clientSupplierID) {
        this.clientSupplierID = clientSupplierID;
    }

    public String getClientSupplierName() {
        return clientSupplierName;
    }

    public void setClientSupplierName(String clientSupplierName) {
        this.clientSupplierName = clientSupplierName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getTermsConditions() {
        return termsConditions;
    }

    public void setTermsConditions(String termsConditions) {
        this.termsConditions = termsConditions;
    }

    public List<InvoiceDetail> getDetails() {
        return details;
    }

    public void setDetails(List<InvoiceDetail> details) {
        this.details = details;
    }

    public void addInvoiceDetail(InvoiceDetail invoiceDetail) {
        details.add(invoiceDetail);
    }

    public void deleteInvoiceDetail(InvoiceDetail invoiceDetail) {
        details.remove(invoiceDetail);
    }


}
