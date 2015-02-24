package com.numhero.server.model.pojo;

import javax.jdo.annotations.*;
import java.io.Serializable;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
@Inheritance(strategy = InheritanceStrategy.SUBCLASS_TABLE)
public abstract class Versionable extends Persistable implements Serializable {
    private static final long serialVersionUID = 6737745675445504901L;

    @Persistent
    private Integer concurrencyVersion;

    public Integer getConcurrencyVersion() {
        return concurrencyVersion;
    }

    public void setConcurrencyVersion(Integer concurrencyVersion) {
        this.concurrencyVersion = concurrencyVersion;
    }
}
