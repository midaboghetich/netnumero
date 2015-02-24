package com.numhero.shared.pojoc;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.numhero.shared.pojoc.field.DateField;
import com.numhero.shared.pojoc.field.StringField;

import java.util.Date;

public class NewBasePojoC extends NewPojoC implements IsSerializable {
	public StringField fId = stringField("id", 30);
    public DateField fCreated = dateField("created");


	public String getId() {
        return fId.getValue();
    }

    public void setId(String id) {
        fId.setValue(id);
    }

    public Date getCreated() {
        return fCreated.getValue();
    }

    public void setCreated(Date created) {
        fCreated.setValue(created);
    }
}
