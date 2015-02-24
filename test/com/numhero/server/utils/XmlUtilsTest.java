package com.numhero.server.utils;

import com.numhero.client.model.datacargo.invoice.GetInvoiceResponse;
import com.numhero.client.model.datacargo.user.SaveUserResponse;
import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.client.model.pojoc.UserC;
import com.numhero.server.NumheroUtils;
import com.numhero.shared.enums.CurrencyEnum;
import com.numhero.shared.pojoc.BasePojoC;
import org.junit.Test;

import static com.numhero.server.utils.XmlUtils.serializeEntity;
import static com.numhero.server.utils.XmlUtils.serializeResp;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: uberto
 * Date: Jun 16, 2010
 * Time: 3:46:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class XmlUtilsTest {


	@Test
	public void testSerializeResp() {
		GetInvoiceResponse r = new GetInvoiceResponse();
		InvoiceC ic = createTestInvoice();
		r.setInvoiceC(ic);
		String xml = serializeResp(r);
		assertTrue(xml.indexOf("<clientSupplierID>123</clientSupplierID>") > 0);

		assertEquals("<response><entity type=\"InvoiceC\" >", xml.substring(0, 35));
	}

	@Test
	public void testSerializeSaveResp() {
		SaveUserResponse r = new SaveUserResponse();
		UserC u = createTestUserC();
		r.setEntityId(u.getId());
		String xml = serializeResp(r);
		System.out.println("user  " + xml);
		assertTrue(xml.indexOf("<id>12</id>") >= 0);

	}

	private UserC createTestUserC() {
		UserC u = new UserC();
		u.setId("12");
		u.setFirstName("Uberto");
		u.setLastName("Barbini");
		u.setBusinessAccountId("gama");
		return u;
	}

	private InvoiceC createTestInvoice() {
		InvoiceC ic = new InvoiceC();
		ic.setClientSupplierID("123");
		ic.setCurrency(CurrencyEnum.EUR);
		return ic;
	}

	@Test
	public void testParseEntityData() throws Exception {
		String xml = "<entity type='InvoiceC'><id>111</id><clientSupplierID>123</clientSupplierID><currency>EUR</currency><dateDue>Wed Jun 30 14:20:51 CEST 2010</dateDue><dateRaised>Wed Jun 16 14:20:51 CEST 2010</dateRaised><discount>0.0</discount><price>0.0</price></entity>";
		BasePojoC p = XmlEntityParser.parseEntityData(NumheroUtils.convertStringInInputStream(xml));

		assertEquals(InvoiceC.class, p.getClass());
		assertEquals("123", p.getAttributeAsString("clientSupplierID"));
		assertEquals("111", p.getId());


	}

	@Test
	public void testSerializeEntity() throws Exception {
		String xmlRef = "<entity type=\"UserC\" ><businessAccountId>gama</businessAccountId><firstName>Uberto</firstName><id>12</id><lastName>Barbini</lastName><userProfile>free</userProfile></entity>";
		UserC u = createTestUserC();

		StringBuffer xml = new StringBuffer();
		serializeEntity(xml, u);

		assertEquals(xmlRef, xml.toString());


	}

}
