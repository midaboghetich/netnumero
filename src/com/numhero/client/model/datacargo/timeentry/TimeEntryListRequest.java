package com.numhero.client.model.datacargo.timeentry;

import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class TimeEntryListRequest extends CommandRequest {

    public TimeEntryListRequest() {
        setCommand(ApplicationCommandEnum.CommandGetTimeEntries);
    }
}