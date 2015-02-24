package com.numhero.shared.pojoc;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.util.*;

import static com.numhero.shared.util.SharedUtils.*;

public class DataCargoRecord implements IsSerializable {
    /*
      * Responsibility: Keep together the data of a single record, for traveling
      * back and forth between GWT client_supplier and server Collaborator DataCargo is
      * the container of this class
      */

    LinkedHashMap<String, String> fieldsString = new LinkedHashMap<String, String>();
    LinkedHashMap<String, Integer> fieldsInteger = new LinkedHashMap<String, Integer>();
    LinkedHashMap<String, Date> fieldsDate = new LinkedHashMap<String, Date>();
    LinkedHashMap<String, Double> fieldsDouble = new LinkedHashMap<String, Double>();
    LinkedHashMap<String, Boolean> fieldsBoolean = new LinkedHashMap<String, Boolean>();
    //TODO: create a map for storing long values

    // TODO make it work with IsSerializable
    // public void setAttribute(String fieldName, IsSerializable value) {
    // }

    public boolean isEmpty() {
        return fieldsBoolean.isEmpty() &&
                fieldsDate.isEmpty() &&
                fieldsDouble.isEmpty() &&
                fieldsInteger.isEmpty() &&
                fieldsString.isEmpty();
    }

    public void setAttributeAsString(String fieldName, String value) {
        if (fieldsString.containsKey(fieldName)) {
            fieldsString.put(fieldName, value);
        } else if (fieldsInteger.containsKey(fieldName)) {
            fieldsInteger.put(fieldName, strToInteger(value));
        } else if (fieldsDouble.containsKey(fieldName)) {
            fieldsDouble.put(fieldName, strToDouble(value));
        } else if (fieldsDate.containsKey(fieldName)) {
            fieldsDate.put(fieldName, strToDate(value));
        } else if (fieldsBoolean.containsKey(fieldName)) {
            fieldsBoolean.put(fieldName, strToBoolean(value));
        } else {
            throw new RuntimeException("Field not present " + fieldName);
        }

    }

    protected DataCargoRecord setAttribute(String fieldName, String value) {
        fieldsString.put(fieldName, value);
        return this;
    }

    protected DataCargoRecord setAttribute(String fieldName, Boolean value) {
        fieldsBoolean.put(fieldName, value);
        return this;
    }

    protected DataCargoRecord setAttribute(String fieldName, Date value) {
        fieldsDate.put(fieldName, value);
        return this;
    }

    protected DataCargoRecord setAttribute(String fieldName, Integer value) {
        fieldsInteger.put(fieldName, value);
        return this;
    }

    protected DataCargoRecord setAttribute(String fieldName, Double value) {
        fieldsDouble.put(fieldName, value);
        return this;
    }

    public String getAttributeAsString(String fieldName) {
        return getAttributeAsString(fieldName, null);
    }

    public String getAttributeAsString(String fieldName, String valueForNull) {
        String ret = null;
        if (fieldsString.containsKey(fieldName)) {
            String b = fieldsString.get(fieldName);
            ret = b == null ? null : b;
        } else if (fieldsBoolean.containsKey(fieldName)) {
            Boolean b = fieldsBoolean.get(fieldName);
            ret = b == null ? null : b.toString();
        } else if (fieldsDate.containsKey(fieldName)) {
            Date d = fieldsDate.get(fieldName);
            ret = d == null ? null : d.toString();
        } else if (fieldsInteger.containsKey(fieldName)) {
            Integer i = fieldsInteger.get(fieldName);
            ret = i == null ? null : i.toString();
        } else if (fieldsDouble.containsKey(fieldName)) {
            Double d = fieldsDouble.get(fieldName);
            ret = d == null ? null : d.toString();
        }


        ret = ret == null ? valueForNull : ret;

        return ret;
    }

    public Object getAttributeAsObject(String fieldName) {
        Object ret = fieldsString.get(fieldName);
        if (ret == null) {
            if (fieldsBoolean.containsKey(fieldName)) {
                ret = fieldsBoolean.get(fieldName);
            } else if (fieldsDate.containsKey(fieldName)) {
                ret = fieldsDate.get(fieldName);
            } else if (fieldsInteger.containsKey(fieldName)) {
                ret = fieldsInteger.get(fieldName);
            } else if (fieldsDouble.containsKey(fieldName)) {
                ret = fieldsDouble.get(fieldName);
            }
        }
        return ret;
    }

    public Double getAttributeAsDouble(String fieldName) {
        return fieldsDouble.get(fieldName);
    }

    public Integer getAttributeAsInteger(String fieldName) {
        return getAttributeAsInteger(fieldName, 0);
    }

    public Integer getAttributeAsInteger(String fieldName, Integer valueForNull) {
        Integer val = fieldsInteger.get(fieldName);
        if (val == null)
            val = valueForNull;
        return val;
    }

    public Boolean getAttributeAsBoolean(String fieldName) {
        return getAttributeAsBoolean(fieldName, Boolean.FALSE);
    }

    public Boolean getAttributeAsBoolean(String fieldName, Boolean valueForNull) {
        Boolean val = fieldsBoolean.get(fieldName);
        if (val == null)
            val = valueForNull;
        return val;
    }

    public Date getAttributeAsDate(String fieldName) {
        return fieldsDate.get(fieldName);
    }

    public List<String> getAttributes() {
        ArrayList<String> lst = new ArrayList<String>(fieldsString.keySet());
        lst.addAll(fieldsInteger.keySet());
        lst.addAll(fieldsBoolean.keySet());
        lst.addAll(fieldsDate.keySet());
        lst.addAll(fieldsDouble.keySet());
        Collections.sort(lst);
        return lst;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        for (String fieldName : getAttributes()) {
            ret.append(fieldName);
            ret.append(": ");
            ret.append(getAttributeAsString(fieldName));
            ret.append(", ");
        }
        if (ret.length() > 0) {
            return ret.subSequence(0, ret.length() - 2).toString();
        } else {
            return "";
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fieldsBoolean == null) ? 0 : fieldsBoolean.hashCode());
        result = prime * result + ((fieldsDate == null) ? 0 : fieldsDate.hashCode());
        result = prime * result + ((fieldsDouble == null) ? 0 : fieldsDouble.hashCode());
        result = prime * result + ((fieldsInteger == null) ? 0 : fieldsInteger.hashCode());
        result = prime * result + ((fieldsString == null) ? 0 : fieldsString.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DataCargoRecord other = (DataCargoRecord) obj;
        return toString().equals(other.toString());
    }
}
