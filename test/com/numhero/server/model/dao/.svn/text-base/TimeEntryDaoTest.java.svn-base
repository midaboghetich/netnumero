package com.numhero.server.model.dao;

import com.numhero.server.NumheroUtils;
import com.numhero.server.model.pojo.TimeEntry;
import com.numhero.server.utils.DateUtils;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class TimeEntryDaoTest extends BaseDaoTest {
    
	private TimeEntryDao timeEntryDao;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		timeEntryDao = NumheroUtils.injector.getInstance(TimeEntryDao.class);
	}

	@Test
	public void testInjection() throws Exception {
		assertNotNull(timeEntryDao);
	}

	@Test
	public void testSaveAndRetrieve() throws Exception {

        TimeEntry timeEntry = createTimeEntry();

		timeEntryDao.save(timeEntry);
		pm.flush();
		pm.evictAll();

		TimeEntry u2 = timeEntryDao.get(timeEntry.getId());
        
		assertEquals(timeEntry.getId(), u2.getId());
	}

    private TimeEntry createTimeEntry() {
        TimeEntry u = new TimeEntry();

        Date date = new Date();
        u.setDayOfYear(DateUtils.getDayOfYear(date));
        u.setWeekOfYear(DateUtils.getWeekOfYear(date));
        u.setMonthOfYear(DateUtils.getMonthOfYear(date));
        u.setYear(DateUtils.getYear(date));

        u.setCreated(date);

        u.setDescription("a time entry");
        u.setNotes("notes of the time entry");
        u.setTimeUnit(0.5);
        
        u.setBusinessAccountId("ba1");
        return u;
    }

    @Test
	public void testSave() throws Exception {
        TimeEntry u = createTimeEntry();

		timeEntryDao.save(u);
		assertNotNull("failed to create timeEntry id", u.getId());

		List<TimeEntry> timeEntryList = timeEntryDao.findAll("ba1");

		for (int i = 0; i < timeEntryList.size(); i++) {
			TimeEntry user = timeEntryList.get(i);
			System.out.println("timeEntry.getId() = " + user.getId());
		}
	}

	@Test
	public void testFindByDate() {

        TimeEntry u = createTimeEntry();

		timeEntryDao.save(u);
		assertNotNull("failed to create user id", u.getId());

        List<TimeEntry> entries = timeEntryDao.findAll("ba1");

		List <TimeEntry> dayEntries = timeEntryDao.findByDayOfYear("ba1", new Date());
        assertNotNull(dayEntries);
        assertEquals(1, dayEntries.size());
        
        List <TimeEntry> weekEntries = timeEntryDao.findByWeek("ba1", new Date());
        assertNotNull(weekEntries);
        assertEquals(1, weekEntries.size());

        List <TimeEntry> monthEntries = timeEntryDao.findByMonth("ba1", new Date());
        assertNotNull(monthEntries);
        assertEquals(1, monthEntries.size());

	}

}