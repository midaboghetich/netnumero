package com.numhero.server.model.pojo;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class ClientSupplierContact extends Versionable implements Serializable {

    @Persistent
    private String name;

    @Persistent
    private String email;

    @Persistent
    private String phone;

    @Persistent
    private String mobile;

    @Persistent
    private String fax;

    public ClientSupplierContact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
