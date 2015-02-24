package com.numhero.client.model.pojoc;

import com.google.gwt.user.client.ui.SuggestOracle;
import com.numhero.shared.pojoc.field.DateField;
import com.numhero.shared.pojoc.field.StringField;
import com.numhero.shared.enums.UserRoleEnum;
import com.numhero.shared.pojoc.NewBasePojoC;

import java.util.Date;

public class UserC extends NewBasePojoC implements SuggestOracle.Suggestion {

	public StringField fFirstName = stringField("firstName", 30);
    public StringField fLastName = stringField("lastName", 30);
    public StringField fUserProfile = stringField("userProfile", 30);
    public DateField fLastLogin = dateField("lastLogin");
    public StringField fBusinessAccountId = stringField("businessAccountId", 30);

	public UserC() {
		super();
		init();
	}


    protected void init() {
        setUserProfile(UserRoleEnum.free);
    }

    public String getFirstName() {
        return fFirstName.getValue();
    }

    public void setFirstName(String firstName) {
        fFirstName.setValue(firstName);
    }

    public String getLastName() {
        return fLastName.getValue();
    }

    public void setLastName(String lastName) {
        fLastName.setValue(lastName);
    }


    public Date getLastLogin() {
        return fLastLogin.getValue();
    }

    public void setLastLogin(Date lastLogin) {
        fLastLogin.setValue(lastLogin);
    }

    public UserRoleEnum getUserProfile() {
        String type = fUserProfile.getValue();
        return type == null ? null : UserRoleEnum.valueOf(type);
    }

    public void setUserProfile(UserRoleEnum userProfile) {
        if (userProfile != null) {
            fUserProfile.setValue(userProfile.name());
        } else {
			fUserProfile.setValue(null);
		}
    }

    public String getBusinessAccountId() {
        return fBusinessAccountId.getValue();
    }

    public void setBusinessAccountId(String businessAccountId) {
        fBusinessAccountId.setValue(businessAccountId);
    }

    @Override
    public String getDisplayString() {
        return getFirstName() + " " + getLastName();   //maybe the email instead?
    }

    @Override
    public String getReplacementString() {
        return getDisplayString();
    }

	
}
