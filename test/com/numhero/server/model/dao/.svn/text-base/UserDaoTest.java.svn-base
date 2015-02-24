package com.numhero.server.model.dao;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.numhero.server.NumheroUtils;
import com.numhero.server.auth.OneWayEncryptionService;
import com.numhero.server.model.pojo.User;
import com.numhero.shared.enums.UserRoleEnum;
import org.junit.Test;

import javax.jdo.JDOObjectNotFoundException;

public class UserDaoTest extends BaseDaoTest {
	private OneWayEncryptionService	encryptionService;
	private UserDao					userDao;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		userDao = NumheroUtils.injector.getInstance(UserDao.class);
		encryptionService = NumheroUtils.injector.getInstance(OneWayEncryptionService.class);
	}

	@Test
	public void testInjection() throws Exception {
		assertNotNull(userDao);
	}

	@Test
	public void testDataIsThere() {
		try {
			Key key = KeyFactory.createKey(User.class.getSimpleName(), 123434566);
			User user = userDao.get(KeyFactory.keyToString(key));
            assertNull(user);
		} catch (JDOObjectNotFoundException jonfex) {
		}
	}

	@Test
	public void testSaveAndRetrieve() throws Exception {
		User u = new User();
		u.setFirstName("jerry");
		u.setEmail("jerry@netnumero.com");
		userDao.save(u);
		pm.flush();
		pm.evictAll();

		User u2 = userDao.get(u.getId());
		assertNotNull("failed to retrieve user", u.getFirstName());
		assertEquals(u.getFirstName(), u2.getFirstName());
	}

	@Test
	public void testSave() throws Exception {
		User u = new User();
		u.setPortalUserId("666");
		u.setFirstName("Fran\u00E7ais");

		userDao.save(u);
		assertNotNull("failed to create user id", u.getId());

		User uFound = userDao.findByPortalUserId("666");
		assertNotNull(uFound);
	}

	@Test
	public void testFindByPortalUserId() {
		User u = new User();
		u.setFirstName("jerry");
		u.setEmail("jerry@netnumero.com");
        u.setPortalUserId("666");
		userDao.save(u);

		User user = userDao.findByPortalUserId("666");
		assertNotNull(user);
		assertEquals("jerry", user.getFirstName());

		user = userDao.findByPortalUserId("jeRRy1");
		assertNull(user);
	}

//	@Test
//	public void testAuthenticate() {
//		User u = new User();
//		u.setUsername("admin1");
//		u.setPassword(encryptionService.encrypt("password"));
//		userDao.save(u);
//
//		User user = userDao.authenticate("admin1", encryptionService.encrypt("password"));
//		assertNotNull(user);
//	}

	@Test
	public void testRelationToBas() {
		User u = new User();
		u.setEmail("admin1");
		u.setPortalUserId("42");
		u.addRelationToBa("baId1", UserRoleEnum.free);
		u.addRelationToBa("baId2", UserRoleEnum.viewonly);
		u.addRelationToBa("baId3", UserRoleEnum.plus);
		userDao.save(u);

		User u2 = userDao.findByPortalUserId("42");

		assertEquals(UserRoleEnum.free, u2.getRelationToBa("baId1").getRole());
		assertEquals(UserRoleEnum.viewonly, u2.getRelationToBa("baId2").getRole());
		assertEquals(UserRoleEnum.plus, u2.getRelationToBa("baId3").getRole());
		assertNull(u2.getRelationToBa("baId4"));
	}
}
