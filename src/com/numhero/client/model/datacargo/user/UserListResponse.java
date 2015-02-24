package com.numhero.client.model.datacargo.user;

import com.google.gwt.user.client.ui.SuggestOracle;
import com.numhero.client.model.pojoc.UserC;
import com.numhero.shared.datacargo.SuggestCommandResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserListResponse extends SuggestCommandResponse {
    private ArrayList<UserC> userCList = new ArrayList<UserC>();

    public List<UserC> getUserCList() {
        return userCList;
    }

    @Override
    public Collection<? extends SuggestOracle.Suggestion> getSuggestions() {
        return userCList;
    }
}
