package com.numhero.server.utils;

import com.numhero.shared.datacargo.CommandResponse;
import com.numhero.shared.datacargo.GetSingleEntityResponse;
import com.numhero.shared.datacargo.SaveSingleEntityResponse;
import com.numhero.shared.pojoc.BasePojoC;

import java.util.List;

public class XmlUtils {

    public static String serializeResp(CommandResponse resp) {
        StringBuffer xml = new StringBuffer();
        if (resp instanceof GetSingleEntityResponse) {
            GetSingleEntityResponse ser = (GetSingleEntityResponse) resp;
            xml.append("<response>");
            serializeEntity(xml, ser.getEntity());
            xml.append("</response>");
        } else if (resp instanceof SaveSingleEntityResponse) {
            SaveSingleEntityResponse ser = (SaveSingleEntityResponse) resp;
            xml.append("<id>");
            xml.append(ser.getEntityId());
            xml.append("</id>");
        } else {
            throw new RuntimeException("unsupported response type " + resp);
        }

        return xml.toString();
    }

    public static void serializeEntity(StringBuffer xml, BasePojoC entity) {
        xml.append("<entity type=\"" + entity.getClass().getSimpleName() + "\" >");
//        xml.append("<id>");
//        xml.append(entity.getId());
//        xml.append("</id>");
        List<String> l = entity.getAttributes();
        for (String s : l) {
            if (entity.getAttributeAsString(s) != null) {
                xml.append("<" + s + ">");
                xml.append(entity.getAttributeAsString(s));
                xml.append("</" + s + ">");
            }
        }
        xml.append("</entity>");
    }

//    public static BasePojoC deserializePojoC(String xml) {
//
//        Document document;
//
//        try {
//            document = DocumentHelper.parseText(xml);
//        } catch (DocumentException e) {
//            throw new RuntimeException("Error parsing xml", e);
//        }
//
//        Element el = document.getRootElement();
//
//        System.out.println("EL  "  + el);
//        System.out.println("EL  "  + el.node(0).valueOf("@type"));
//
//        String classname = "com.numhero.client.model.pojoc." + el.valueOf("@type");
//        BasePojoC entity = createPojoC(classname);
//
//        for (Iterator i = el.elementIterator(); i.hasNext();) {
//            Element element = (Element) i.next();
//            String val = element.getStringValue();
//            String attr = element.getName();
//            System.out.println("attr " + attr + "  val " + val);
//            entity.setAttribute(attr, val);
//        }
//
//
//        return entity;
//    }


}
