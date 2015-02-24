package com.numhero.client.model.datacargo.staff;

import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.shared.datacargo.SuggestCommandResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StaffListResponse extends SuggestCommandResponse {
    private List<StaffC> staffCList = new ArrayList<StaffC>();

    public List<StaffC> getStaffCList() {
        return staffCList;
    }

    public void setStaffCList(List<StaffC> staffCList) {
        this.staffCList = staffCList;
    }

    public Collection<? extends Suggestion> getSuggestions() {
        return staffCList;
    }
}