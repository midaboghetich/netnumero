package com.numhero.server.utils;

import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.server.NumheroUtils;
import org.junit.Test;

import static com.numhero.server.utils.XmlEntityParser.parseEntityData;
import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: uberto
 * Date: Jun 19, 2010
 * Time: 4:02:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class XmlEntityParserTest {
    @Test
    public void testParseEntityData() throws Exception {
    	String xml = "<entity type=\"ClientSupplierC\" ><address>via della Spiga</address><companyName>Camiceria Mariella s.n.c.</companyName><notes>notes</notes><type>both</type></entity>";

		ClientSupplierC c = (ClientSupplierC) parseEntityData(NumheroUtils.convertStringInInputStream(xml));

		assertEquals("via della Spiga", c.getAddress());
    }
	
}
