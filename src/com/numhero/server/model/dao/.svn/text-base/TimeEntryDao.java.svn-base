package com.numhero.server.model.dao;

import com.numhero.server.model.dao.filter.JDOFilters;
import com.numhero.server.model.pojo.TimeEntry;
import com.numhero.server.utils.DateUtils;

import java.util.Date;
import java.util.List;

public class TimeEntryDao extends BaseDao<TimeEntry> {

    public List<TimeEntry> findByDayOfYear(String businessAccountId, Date date) {
        return findByCriteria(
        		businessAccountId,
        		JDOFilters.eq("dayOfYear", DateUtils.getDayOfYear(date)),
                JDOFilters.eq("year", DateUtils.getYear(date)));
    }

    public List<TimeEntry> findByWeek(String businessAccountId, Date date) {
        return findByCriteria(
        		businessAccountId,
        		JDOFilters.eq("weekOfYear", DateUtils.getWeekOfYear(date)),
                JDOFilters.eq("year", DateUtils.getYear(date)));
    }

    public List<TimeEntry> findByMonth(String businessAccountId, Date date) {
        return findByCriteria(
        		businessAccountId,
        		JDOFilters.eq("monthOfYear", DateUtils.getMonthOfYear(date)),
                JDOFilters.eq("year", DateUtils.getYear(date)));
    }
}
