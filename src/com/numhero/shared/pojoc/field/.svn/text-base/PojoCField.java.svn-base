package com.numhero.shared.pojoc.field;

import com.google.gwt.user.client.rpc.IsSerializable;

public abstract class PojoCField<T>  implements IsSerializable {

	T value;


	String fieldName;

	public PojoCField() {
	}

	public PojoCField(String fieldName) {
		this.fieldName = fieldName;
	}


	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public String getValueAsString() {
		T v = getValue();
		if (v == null) {
			return null;
		} else {
			return v.toString();
		}
	}

	public abstract void setValueAsString(String value);

	@Override
	public String toString() {
		return fieldName + ": " + getValueAsString();
	}
}
