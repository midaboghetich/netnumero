package com.numhero.shared.pojoc.field;

public class StringField extends PojoCField<String> {

    private int maxLength;

    public StringField(String name, int maxLength) {
        super(name);
        this.maxLength = maxLength;
    }

	public StringField() {
		super();
	}


	@Override
	public void setValueAsString(String value) {
		setValue(value);
	}
}
