package com.numhero.client.model.datacargo.timeentry;

import com.numhero.client.model.pojoc.TimeEntryC;
import com.numhero.shared.datacargo.CommandResponse;

import java.util.ArrayList;

public class TimeEntryListResponse implements CommandResponse {
    private ArrayList<TimeEntryC> timeEntryCList = new ArrayList<TimeEntryC>();

    public ArrayList<TimeEntryC> getTimeEntryCList() {
        return timeEntryCList;
    }
}