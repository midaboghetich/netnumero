package com.numhero.server.utils;

import com.numhero.server.model.pojo.User;
import com.numhero.shared.enums.UserRoleEnum;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;
import java.util.Stack;

import static com.numhero.server.utils.StringUtils.strToEnumDef;
import static com.numhero.server.utils.StringUtils.strToIntDef;


public class XmlResponseParser {
    public static void parseGetUserData(InputStream xml, User u) {


        GetUserDataHandler ur = new GetUserDataHandler(u);
        SAXParser p = null;
        try {
            p = SAXParserFactory.newInstance().newSAXParser();
        } catch (Exception e) {
            throw new RuntimeException("parser creation exception ", e);
        }
        try {
            p.parse(xml, ur);
        }
        catch (Exception e) {
            throw new RuntimeException("parser parse exception ", e);
        }

    }


    private static class GetUserDataHandler extends DefaultHandler {
        private User user;
        private Stack<String> currentTags = new Stack<String>();
        private String currentCompanyId = "";

        public GetUserDataHandler(User u) {
            this.user = u;
        }

        public void startElement(String namespaceURI, String localName, String qName, Attributes atts) {
            if (qName.equals("role")) {
                currentCompanyId = atts.getValue("companyId");

//                System.out.println(qName + " " + atts.getValue("companyId"));
            }
            currentTags.push(qName);

        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {

            currentTags.pop();
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {

            String t = currentTags.peek();
            String v = new String(ch, start, length);
            if ("name".equals(t)){
                user.setFirstName(v);
            }
            if ("surname".equals(t)){
                user.setLastName(v);
                //System.out.println("lastname " + v + " " + user.getLastName());
            }
            if ("email".equals(t)){
                user.setEmail(v);
            }
            if ("version".equals(t)){
                user.setVersion(strToIntDef(v, 0));
            }
            if ("role".equals(t)){
            	user.setBusinessAccountId(currentCompanyId);
            	user.addRelationToBa(currentCompanyId, (UserRoleEnum) strToEnumDef(v, UserRoleEnum.free));
            }

        }
    }
}
