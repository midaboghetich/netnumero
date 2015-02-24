package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.timeentry.SaveTimeEntryRequest;
import com.numhero.client.model.datacargo.timeentry.SaveTimeEntryResponse;
import com.numhero.client.model.pojoc.TimeEntryC;
import com.numhero.server.convert.TimeEntryConverter;
import com.numhero.server.model.dao.TimeEntryDao;
import com.numhero.server.model.pojo.TimeEntry;
import com.numhero.server.utils.DaoUtils;
import com.numhero.server.utils.DateUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;

public class CommandSaveTimeEntry extends AbstractAuthenticatedCommand<SaveTimeEntryRequest, SaveTimeEntryResponse> {
    private static Log log = LogFactory.getLog(CommandSaveTimeEntry.class);

    @Inject
    TimeEntryDao timeEntryDao;

    @Inject
    TimeEntryConverter timeEntryConverter;

    @Override
    public SaveTimeEntryResponse execute(SaveTimeEntryRequest request) {
        TimeEntry timeEntry = null;

        TimeEntryC timeEntryC = request.getTimeEntryC();
        String id = timeEntryC.getId();
        if (id == null || id.isEmpty()) {
            timeEntryC.setId(null);
            timeEntry = new TimeEntry();
            log.debug("created new time entry");
        } else {
            timeEntry = timeEntryDao.get(id);
            log.debug("retrieved timeentry " + timeEntry);
        }

        // TODO validate
        timeEntryConverter.mergeIntoTimeEntry(timeEntryC, timeEntry);

        Date date = request.getTimeEntryC().getDate();
        timeEntry.setDate(date);
        timeEntry.setDayOfYear(DateUtils.getDayOfYear(date));
        timeEntry.setWeekOfYear(DateUtils.getWeekOfYear(date));
        timeEntry.setMonthOfYear(DateUtils.getMonthOfYear(date));
        timeEntry.setYear(DateUtils.getYear(date));

        timeEntry.setProjectName(request.getTimeEntryC().getProjectName());
        timeEntry.setTaskName(request.getTimeEntryC().getTaskName());

        DaoUtils.setData(request, timeEntry);
        timeEntryDao.save(timeEntry);

        // createAudit
        SaveTimeEntryResponse response = new SaveTimeEntryResponse();
        response.setEntityId(timeEntry.getId());
        return response;
    }
}