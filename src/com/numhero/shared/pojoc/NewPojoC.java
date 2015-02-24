package com.numhero.shared.pojoc;

import com.numhero.shared.pojoc.field.DateField;
import com.numhero.shared.pojoc.field.EnumField;
import com.numhero.shared.pojoc.field.PojoCField;
import com.numhero.shared.pojoc.field.StringField;

import java.util.*;

public class NewPojoC extends BasePojoC {

	private Map<String, PojoCField> fieldsList = new LinkedHashMap<String, PojoCField>();


    protected StringField stringField(String fieldName, int maxLen) {
//		System.err.println("!!!!!!!!!!!!!!!!!!!!!--------"+ fieldName);

		StringField f = new StringField(fieldName, maxLen);
		fieldsList.put(f.getFieldName(), f);
		return f;
	}

	protected DateField dateField(String fieldName) {

		DateField f = new DateField(fieldName);
		fieldsList.put(f.getFieldName(), f);
		return f;
	}


    public EnumField enumField(String fieldName, Enum defValue) {
     	EnumField f = new EnumField();
        f.setFieldName(fieldName);
        f.setDefaultValue(defValue);
        f.setValue(defValue);
		fieldsList.put(f.getFieldName(), f);
		return f;

    }

//    public EnumField enumField(EnumField f, String fieldName, Enum defValue) {
//        f.setFieldName(fieldName);
//        f.setDefaultValue(defValue);
//        f.setValue(defValue);
//		fieldsList.put(f.getFieldName(), f);
//		return f;
//
//    }

    public String getAttributeAsString(String fieldName) {
        return getAttributeAsString(fieldName, null);
    }


    public String getAttributeAsString(String fieldName, String valueForNull) {

		PojoCField f = getField(fieldName);
        if (f == null){
			throw new RuntimeException("Field not present " + fieldName);
		}
		String ret = f.getValueAsString();
        ret = ret == null ? valueForNull : ret;

        return ret;
	}


    public void setAttributeAsString(String fieldName, String value) {
		PojoCField f = getField(fieldName);
        if (f == null){
			throw new RuntimeException("Field not present " + fieldName);
		}
		f.setValueAsString(value);

    }	

	public List<String> getAttributes(){
		//TODO to remove it after refactoring
        return getFieldNamesOrderedList();
	}

    public List<String> getFieldNamesOrderedList() {
        List<String> l = new LinkedList<String>( getFieldNames() );
        Collections.sort(l);
        return l;
    }

    public Collection<PojoCField> getFields() {
		return fieldsList.values();
	}

	public PojoCField getField(String name) {
		return fieldsList.get(name);
	}

	public Set<String> getFieldNames(){
		return fieldsList.keySet();
	}

//	
//		String ret = null;
//        if (fieldsString.containsKey(fieldName)) {
//            String b = fieldsString.get(fieldName);
//            ret = b == null ? null : b;
//        } else if (fieldsBoolean.containsKey(fieldName)) {
//            Boolean b = fieldsBoolean.get(fieldName);
//            ret = b == null ? null : b.toString();
//        } else if (fieldsDate.containsKey(fieldName)) {
//            Date d = fieldsDate.get(fieldName);
//            ret = d == null ? null : d.toString();
//        } else if (fieldsInteger.containsKey(fieldName)) {
//            Integer i = fieldsInteger.get(fieldName);
//            ret = i == null ? null : i.toString();
//        } else if (fieldsDouble.containsKey(fieldName)) {
//            Double d = fieldsDouble.get(fieldName);
//            ret = d == null ? null : d.toString();
//        }
}
