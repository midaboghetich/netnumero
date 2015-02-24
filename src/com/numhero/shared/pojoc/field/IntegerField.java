package com.numhero.shared.pojoc.field;

import static com.numhero.shared.util.SharedUtils.strToInteger;

public class IntegerField extends PojoCField<Integer> {


    public IntegerField(String name) {
        super( name);
    }

	public IntegerField() {
	}

	@Override
	public void setValueAsString(String value) {
	   setValue(strToInteger(value));
	}


}