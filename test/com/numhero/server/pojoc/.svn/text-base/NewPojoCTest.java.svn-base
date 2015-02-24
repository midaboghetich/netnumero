package com.numhero.server.pojoc;

import com.numhero.client.model.pojoc.UserC;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NewPojoCTest {
	@Test
	public void testSetAttributeAsString() throws Exception {

		UserC u = new UserC();
		u.setAttributeAsString("firstName", "ubi");

		assertEquals("ubi", u.getField("firstName").getValue());
		assertEquals("ubi", u.fFirstName.getValue());

	}

	@Test
	public void testFields() throws Exception {

		UserC u = new UserC();

		assertEquals(7, u.getFields().size());
		assertEquals(u.fFirstName, u.getField("firstName"));
		assertEquals(7, u.getFieldNames().size());

	}
}
