package com.numhero.shared.pojoc.field;

import static com.numhero.shared.util.SharedUtils.strToBoolean;

public class BooleanField extends PojoCField<Boolean> {


    public BooleanField(String name) {
        super( name);
    }

	public BooleanField() {
	}

	@Override
	public void setValueAsString(String value) {
	   setValue(strToBoolean(value));
	}


}