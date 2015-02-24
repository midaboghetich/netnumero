package com.numhero.client.model.datacargo.timeentry;

import com.numhero.client.model.pojoc.TimeEntryC;
import com.numhero.shared.datacargo.GetSingleEntityResponse;

public class GetTimeEntryResponse extends GetSingleEntityResponse {

    public TimeEntryC getTimeEntryC() {
        return (TimeEntryC) getEntity();
    }

    public void setTimeEntryC(TimeEntryC timeEntryC) {
        setEntity(timeEntryC);
    }
}