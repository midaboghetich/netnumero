package com.numhero.shared.pojoc.field;

import java.util.Date;

import static com.numhero.shared.util.SharedUtils.strToDate;

public class DateField extends PojoCField<Date> {


    public DateField(String name) {
        super( name);
    }

	public DateField() {
	}

	@Override
	public void setValueAsString(String value) {
	   setValue(strToDate(value));
	}


}
