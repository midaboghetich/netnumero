package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.timeentry.TimeEntryListRequest;
import com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse;
import com.numhero.client.model.pojoc.TimeEntryC;
import com.numhero.server.convert.TimeEntryConverter;
import com.numhero.server.model.dao.TimeEntryDao;
import com.numhero.server.model.pojo.TimeEntry;

import java.util.List;

public class CommandGetTimeEntries extends AbstractAuthenticatedCommand<TimeEntryListRequest, TimeEntryListResponse> {

    @Inject
    TimeEntryDao timeEntryDao;

    @Inject
    TimeEntryConverter timeEntryConverter;

    @Override
    public TimeEntryListResponse execute(TimeEntryListRequest request) {
        TimeEntryListResponse response = new TimeEntryListResponse();
        List<TimeEntry> timeEntrys;

        timeEntrys = timeEntryDao.findAll(request.getBusinessAccountId());

        for (TimeEntry cs : timeEntrys) {
            TimeEntryC csC = timeEntryConverter.toTimeEntryC(cs);
            response.getTimeEntryCList().add(csC);
        }
        return response;
    }
}
