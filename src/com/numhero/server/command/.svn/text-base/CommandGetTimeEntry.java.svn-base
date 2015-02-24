package com.numhero.server.command;

import com.google.inject.Inject;
import com.numhero.client.model.datacargo.timeentry.GetTimeEntryRequest;
import com.numhero.client.model.datacargo.timeentry.GetTimeEntryResponse;
import com.numhero.client.model.pojoc.TimeEntryC;
import com.numhero.server.convert.TimeEntryConverter;
import com.numhero.server.model.dao.TimeEntryDao;
import com.numhero.server.model.pojo.TimeEntry;

public class CommandGetTimeEntry extends AbstractAuthenticatedCommand<GetTimeEntryRequest, GetTimeEntryResponse> {

    @Inject
    TimeEntryDao timeEntryDao;

    @Inject
    TimeEntryConverter timeEntryConverter;

    @Override
    public GetTimeEntryResponse execute(GetTimeEntryRequest request) throws Exception {
        GetTimeEntryResponse response = new GetTimeEntryResponse();

        TimeEntry timeEntry = timeEntryDao.get(request.getEntityId());
        TimeEntryC timeEntryC = timeEntryConverter.toTimeEntryC(timeEntry);
        response.setTimeEntryC(timeEntryC);

        return response;
    }
}
