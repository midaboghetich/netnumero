package com.numhero.client.model.datacargo.task;

import com.google.gwt.user.client.ui.SuggestOracle;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.shared.datacargo.SuggestCommandResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TaskListResponse extends SuggestCommandResponse {

    private ArrayList<TaskC> taskCList = new ArrayList<TaskC>();

    public List<TaskC> getTaskCList() {
        return taskCList;
    }

    @Override
    public Collection<? extends SuggestOracle.Suggestion> getSuggestions() {
        return taskCList;
    }
}