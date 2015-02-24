package com.numhero.client.model.datacargo.timeentry;

import com.numhero.client.model.pojoc.TimeEntryC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveTimeEntryRequest  extends SaveSingleEntityRequest {

    public SaveTimeEntryRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveTimeEntry);
    }

    public TimeEntryC getTimeEntryC() {
        return (TimeEntryC) getEntity();
    }

    public void setTimeEntryC(TimeEntryC timeEntryC) {
        setEntity(timeEntryC);
    }
}
