package com.numhero.client.widget.combobox;

import com.google.gwt.user.client.ui.SuggestOracle;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.shared.datacargo.SearcheableListCommandRequest;
import com.numhero.shared.datacargo.SuggestCommandResponse;

public class ServerSuggestOracle<REQUEST extends SearcheableListCommandRequest, RESPONSE extends SuggestCommandResponse> extends SuggestOracle {
    private Service<REQUEST, RESPONSE> service;
    private REQUEST request;

    public ServerSuggestOracle(Service<REQUEST, RESPONSE> service, REQUEST request) {
        this.service = service;
        this.request = request;
    }

    public boolean isDisplayStringHTML() {
        return true;
    }

    public void requestSuggestions(final SuggestOracle.Request suggestRequest, final SuggestOracle.Callback callback) {
        request.setMaxResults(suggestRequest.getLimit());
        request.setSuggestString(suggestRequest.getQuery());
        service.execute(request, new ServiceCallbackImpl<RESPONSE>() {
            @Override
            public void onFailure(Throwable th) {
                callback.onSuggestionsReady(suggestRequest, new SuggestOracle.Response());
            }

            public void onSuccess(RESPONSE response) {
                callback.onSuggestionsReady(suggestRequest, response);
            }
        });
    }
}
