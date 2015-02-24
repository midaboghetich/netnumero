package com.numhero.server.model.pojo;

import com.numhero.shared.enums.UserRoleEnum;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
public class User extends Searchable implements Serializable {
	private static final long	serialVersionUID	= 2019181020074975689L;

	@Persistent
	private String				firstName;

	@Persistent
	private String				lastName;

	@Persistent
	private Date				lastLogin;

	@Persistent
	private int					version;

	@Persistent
	private String				portalUserId;

	@Persistent
	private String				email;

	// many2many with BusinessAccounts
	@Persistent
	private List<String>		relationToBusinessAccounts = new ArrayList<String>();

	public User() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getPortalUserId() {
		return portalUserId;
	}

	public void setPortalUserId(String portalUserId) {
		this.portalUserId = portalUserId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserRoleEnum getCurrentRole() {
		UserRoleEnum ret = UserRoleEnum.free;
		if (getBusinessAccountId() != null) {
			RelationToBA r = getRelationToBa(getBusinessAccountId());
			if (r != null) {
				ret = r.getRole();
			}
		}
		return ret;
	}

	public List<RelationToBA> getRelationToBas() {
		List<RelationToBA> ret = new ArrayList<RelationToBA>(relationToBusinessAccounts.size());
		for (String rBA : relationToBusinessAccounts) {
			RelationToBA relationToBA = RelationToBA.unmarshal(rBA);
			ret.add(relationToBA);
		}
		return ret;
	}

	public void addRelationToBa(String baId, UserRoleEnum role) {
		RelationToBA r = getRelationToBa(baId);
		if (r == null) {
			r = new RelationToBA(baId, role);
			relationToBusinessAccounts.add(r.marshal());
		} else {
			r.setRole(role);
			relationToBusinessAccounts.set(getRelationToBaIndex(baId), r.marshal());
		}
	}

	public void removeRelationToBa(String baId) {
		int index = getRelationToBaIndex(baId);
		if (index >= 0) {
			relationToBusinessAccounts.remove(index);
		}
	}

	public RelationToBA getRelationToBa(String baId) {
		RelationToBA ret = null;
		for (String rBA : relationToBusinessAccounts) {
			RelationToBA relationToBA = RelationToBA.unmarshal(rBA);
			if (relationToBA.getBaId().equals(baId)) {
				ret = relationToBA;
				break;
			}
		}
		return ret;
	}

	// private methods -------------------------
	private int getRelationToBaIndex(String baId) {
		int ret = -1;
		for (int i = 0; i < relationToBusinessAccounts.size(); i++) {
			String rBA = relationToBusinessAccounts.get(i);
			RelationToBA relationToBA = RelationToBA.unmarshal(rBA);
			if (relationToBA.getBaId().equals(baId)) {
				ret = i;
				break;
			}
		}
		return ret;
	}


	@Override
	public String toString() {
		String ret = "User:";
		ret += " portalId=" + portalUserId;
		ret += " firstName=" + firstName;
		ret += " lastName=" + lastName;
        ret += " email=" + email;
		return ret;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (version != user.version) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (portalUserId != null ? !portalUserId.equals(user.portalUserId) : user.portalUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + version;
        result = 31 * result + (portalUserId != null ? portalUserId.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    // inner class ---------------------------------
	public static class RelationToBA {
		private String			baId;
		private UserRoleEnum	role;

		public RelationToBA(String baId, UserRoleEnum role) {
			this.baId = baId;
			this.role = role;
		}

		public String getBaId() {
			return baId;
		}

		public void setBaId(String baId) {
			this.baId = baId;
		}
		
		public UserRoleEnum getRole() {
			return role;
		}
		
		public void setRole(UserRoleEnum role) {
			this.role = role;
		}

		public String marshal() {
			return baId + "," + role.name();
		}

		public String toString() {
			return marshal();
		}

		public static RelationToBA unmarshal(String encoded) {
			RelationToBA ret = null;
            String s[] = encoded.split(",");
            if (s.length == 2) {
                UserRoleEnum ue;
                try {
                    ue = UserRoleEnum.valueOf(s[1]);
                } catch (Exception ignore) {
                    ue = UserRoleEnum.free;
                }
                ret = new RelationToBA(s[0], ue);
            }
			return ret;
		}
	}
}
