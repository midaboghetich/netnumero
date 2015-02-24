package com.numhero.server.service;


import com.numhero.server.NumheroUtils;
import com.numhero.server.model.pojo.User;
import com.numhero.server.utils.XmlResponseParser;
import com.numhero.shared.enums.UserRoleEnum;

import junit.framework.TestCase;
import org.junit.Test;



public class XmlResponseParserTest extends TestCase {

    String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "\t<user>\n" +
            "\t\t<name>Uberto</name>\n" +
            "\t\t<surname>Barbini</surname>\n" +
            "\t\t<email>uberto@ubiland.net</email>\n" +
            "\t\t<version>1</version>\n" +
            "\t\t<roles>\n" +
            "\n" +
            "\t\t\t<role companyId='gamasoft'>plus</role> \n" +
			"\t\t\t<role companyId='pippopippo'>solo</role> \n" +
			"\t\t\t<role companyId='netnumero'>free</role> \n" +
            "\t\t</roles> \n" +
            "\t</user>";

    @Test
    public void testParser() {
        User u = new User();
        XmlResponseParser.parseGetUserData(NumheroUtils.convertStringInInputStream(xml), u);
        assertEquals("Uberto", u.getFirstName());
        assertEquals("Barbini", u.getLastName());
        assertEquals("uberto@ubiland.net", u.getEmail());
        assertEquals(1, u.getVersion());
        assertEquals("netnumero", u.getBusinessAccountId());
        assertEquals(UserRoleEnum.free, u.getRelationToBa("netnumero").getRole());
		assertEquals(UserRoleEnum.plus, u.getRelationToBa("gamasoft").getRole());
		assertEquals(UserRoleEnum.solo, u.getRelationToBa("pippopippo").getRole());
    }

}
