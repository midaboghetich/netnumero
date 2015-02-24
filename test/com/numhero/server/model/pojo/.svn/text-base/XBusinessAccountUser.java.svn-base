package com.numhero.server.model.pojo;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;


@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class XBusinessAccountUser extends Versionable implements Serializable {
    private static final long serialVersionUID = -242375757859030316L;

    @Persistent
    private String businessAccountId;

    @Persistent
    private String userId;

    public XBusinessAccountUser(String businessAccountId, String userId) {
        this.businessAccountId = businessAccountId;
        this.userId = userId;
    }

    public String getBusinessAccountId() {
        return businessAccountId;
    }

    public String getUserId() {
        return userId;
    }

}