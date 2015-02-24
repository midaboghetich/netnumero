package com.numhero.server.model.pojo;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class ProjectStaffDetail extends Versionable implements Serializable {
    private static final long serialVersionUID = 3919595288797603821L;

    @Persistent
    private String staffId;

    @Persistent
    private String name;

    public ProjectStaffDetail() {
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProjectStaffDetail that = (ProjectStaffDetail) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (staffId != null ? !staffId.equals(that.staffId) : that.staffId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (staffId != null ? staffId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}