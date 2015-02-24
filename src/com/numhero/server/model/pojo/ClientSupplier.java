package com.numhero.server.model.pojo;

import com.numhero.server.search.IsSearchable;
import com.numhero.shared.enums.ClientSupplierEnum;
import com.numhero.shared.enums.SendInvoiceTypeEnum;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class ClientSupplier extends Searchable implements Serializable {
	private static final long			serialVersionUID	= 5218077766774442157L;

	@Persistent
	private ClientSupplierEnum			partnerType;

	@Persistent
	@IsSearchable(byStartWith = true)
	private String						companyName;

	@Persistent
	private String						companyPhone;

	@Persistent
	private String						companyFax;

	@Persistent
	private SendInvoiceTypeEnum			sendInvoiceType;

	@Persistent
	@IsSearchable
	private String						address;

	@Persistent
	private String						city;

	@Persistent
	private String						region;

	@Persistent
	private String						zipCode;

	@Persistent
	private String						country;

	@Persistent
	@IsSearchable
	private String						notes;

	@Persistent
	@Element(dependent = "true")
	private List<ClientSupplierContact>	contacts			= new ArrayList<ClientSupplierContact>();

	public ClientSupplier() {
	}

	public ClientSupplierEnum getPartnerType() {
		return partnerType;
	}

	public void setPartnerType(ClientSupplierEnum partnerType) {
		this.partnerType = partnerType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public SendInvoiceTypeEnum getSendInvoiceType() {
		return sendInvoiceType;
	}

	public void setSendInvoiceType(SendInvoiceTypeEnum sendInvoiceType) {
		this.sendInvoiceType = sendInvoiceType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public List<ClientSupplierContact> getContacts() {
		return contacts;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getCompanyFax() {
		return companyFax;
	}

	public void setCompanyFax(String companyFax) {
		this.companyFax = companyFax;
	}
}
