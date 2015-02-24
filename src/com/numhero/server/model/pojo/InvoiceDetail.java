package com.numhero.server.model.pojo;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PersistenceModifier;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class InvoiceDetail extends Versionable implements Serializable {
    private static final long serialVersionUID = 3919595288797603821L;

    @Persistent
    private String productId;

    @Persistent
    private String name;

    @Persistent
    private String description;

    @Persistent
    private Double quantity;

    @Persistent
    private Double price;

    @Persistent
    private Set<String> taxesFk = new HashSet<String>();

    @Persistent(persistenceModifier = PersistenceModifier.NONE)
    private Set<TaxInfo> taxes = new HashSet<TaxInfo>();

    public InvoiceDetail() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<String> getTaxesFk() {
        return taxesFk;
    }

    public void setTaxesFk(Set<String> taxesFk) {
        this.taxesFk = taxesFk;
    }

    public void addTax(String tax) {
        taxesFk.add(tax);
    }

    public void deleteTax(String tax) {
        taxesFk.remove(tax);
    }

    public Set<TaxInfo> getTaxes() {
        return taxes;
    }

    public void setTaxes(Set<TaxInfo> taxes) {
        this.taxes = taxes;
    }

    // I'm thinking that if it has id then it's better to base hashCode & equals
    // on id,
    // otherwise it means we add DocumentPositions to a new document and then
    // use positionIndex
    @Override
    public int hashCode() {
        int result;
        if (id != null) {
            result = super.hashCode();
        } else {
            final int prime = 31;
            result = super.hashCode();
            result = prime * result + name.hashCode();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        InvoiceDetail other = (InvoiceDetail) obj;
        if (id != null && id.equals(other.id))
            return true;
        if (!name.equals(other.name))
            return false;
        return true;
    }
}
