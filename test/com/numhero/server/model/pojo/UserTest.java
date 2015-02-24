package com.numhero.server.model.pojo;

import com.numhero.shared.enums.UserRoleEnum;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

/**
 * User Tester.
 * 
 * @author Antonio Signore
 * @version 1.0
 * @since <pre>
 * 03 / 25 / 2010
 * </pre>
 */
public class UserTest extends TestCase {

	User	user	= PojoTestUtils.createUser();

	public void setUp() throws Exception {
		super.setUp();
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}



	@Test
	public void testGetFirstName() throws Exception {
		assertEquals("first", user.getFirstName());
	}

	@Test
	public void testSetFirstName() throws Exception {
		user.setFirstName("new_name");
		assertEquals("new_name", user.getFirstName());
	}

	@Test
	public void testGetLastName() throws Exception {
		assertEquals("last", user.getLastName());
	}

	@Test
	public void testSetLastName() throws Exception {
		user.setLastName("new_name");
		assertEquals("new_name", user.getLastName());
	}


	@Test
	public void testGetLastLogin() throws Exception {
		assertEquals(PojoTestUtils.date, user.getLastLogin());
	}

	@Test
	public void testSetLastLogin() throws Exception {
		Date date = new Date();
		user.setLastLogin(date);
		assertEquals(date, user.getLastLogin());
	}

	@Test
	public void testGetUserProfile() throws Exception {
		assertEquals(UserRoleEnum.free, user.getCurrentRole());
	}

	@Test
	public void testSetUserProfile() throws Exception {
		user.setBusinessAccountId("baId");
		user.addRelationToBa("baId", UserRoleEnum.free);
	}

	@Test
	public void testHashCode() throws Exception {
		assertEquals(-594645619, user.hashCode());
	}

	@Test
	public void testEquals() throws Exception {
		assertEquals(true, user.equals(user));
	}

	@Test
	public void testToString() throws Exception {
		assertEquals("User: portalId=3 firstName=first lastName=last email=username@gamil.com", user.toString());
	}

	@Test
	public void testRelationToBas() {
		User u = new User();
		u.setEmail("admin1@netnumero.com");
		u.addRelationToBa("baId1", UserRoleEnum.free);
		u.addRelationToBa("baId2", UserRoleEnum.viewonly);
		u.addRelationToBa("baId3", UserRoleEnum.viewonly);

		assertEquals(3, u.getRelationToBas().size());
		assertNotNull(u.getRelationToBa("baId1"));
		assertEquals("baId1," + UserRoleEnum.free, u.getRelationToBa("baId1").marshal());
		assertEquals(UserRoleEnum.free, u.getRelationToBa("baId1").getRole());
		assertNotNull(u.getRelationToBa("baId2"));
		assertNotNull(u.getRelationToBa("baId3"));
		assertNull(u.getRelationToBa("baId4"));
		
		u.addRelationToBa("baId1", UserRoleEnum.viewonly);
		assertEquals(UserRoleEnum.viewonly, u.getRelationToBa("baId1").getRole());
		assertEquals(3, u.getRelationToBas().size());
		
		u.removeRelationToBa("baId2");
		assertEquals(2, u.getRelationToBas().size());
		assertNotNull(u.getRelationToBa("baId1"));
		assertNull(u.getRelationToBa("baId2"));
		assertNotNull(u.getRelationToBa("baId3"));
	}
}
