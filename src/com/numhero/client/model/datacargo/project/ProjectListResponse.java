package com.numhero.client.model.datacargo.project;

import com.google.gwt.user.client.ui.SuggestOracle;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.shared.datacargo.SuggestCommandResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProjectListResponse extends SuggestCommandResponse {
    private ArrayList<ProjectC> projectCList = new ArrayList<ProjectC>();


    public List<ProjectC> getProjectCList() {
        return projectCList;
    }

    public Collection<? extends SuggestOracle.Suggestion> getSuggestions() {
        return projectCList;
    }
}