package com.numhero.server.model.dao;

import com.numhero.server.NumheroUtils;
import com.numhero.server.model.pojo.Staff;
import com.numhero.shared.enums.StaffTypeEnum;
import org.junit.Test;

import java.util.List;

public class StaffDaoTest extends BaseDaoTest {
    
	private StaffDao staffDao;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		staffDao = NumheroUtils.injector.getInstance(StaffDao.class);
	}

	@Test
	public void testInjection() throws Exception {
		assertNotNull(staffDao);
	}

	@Test
	public void testSaveAndRetrieve() throws Exception {

        Staff staff = createStaff();

		staffDao.save(staff);
		pm.flush();
		pm.evictAll();

		Staff u2 = staffDao.get(staff.getId());
        
		assertEquals(staff.getId(), u2.getId());
	}

    private Staff createStaff() {
        Staff staff = new Staff();
        staff.setType(StaffTypeEnum.Contractor);
        staff.setBusinessAccountId("ba1");
        return staff;
    }

    @Test

	public void testSave() throws Exception {
        Staff staff = createStaff();

		staffDao.save(staff);
		assertNotNull("failed to create staff id", staff.getId());

		List<Staff> staffs = staffDao.findAll("ba1");

        assertEquals(1, staffs.size());
    }
}
