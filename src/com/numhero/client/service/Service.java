package com.numhero.client.service;

import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.util.ClientUtils;
import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.datacargo.CommandResponse;
import com.numhero.shared.util.Constants;

@Singleton
public class Service<REQUEST extends CommandRequest, RESPONSE extends CommandResponse> {
    private DataServiceAsync asyncService;

    @Inject
    public Service(DataServiceAsync asyncService) {
        this.asyncService = asyncService;
    }

    public void execute(REQUEST request, final ServiceCallback<RESPONSE> serviceCallback) {
        String sessionID = Cookies.getCookie(Constants.SESSION_COOKIE_NAME);
        request.setSessionID(sessionID);

        String path = Window.Location.getPath();
        String baId = ClientUtils.getCompanyNameFromUri(path);
//        Log.debug("path " +path);
//        Log.debug("ba " + baId);
        request.setBusinessAccountId(baId);

        final TimeoutService timeoutService = new TimeoutService();
        AsyncCallback<RESPONSE> callback = createCallback(serviceCallback, timeoutService);

        asyncService.execute(request, callback);
        timeoutService.startTimer();
    }

    private AsyncCallback<RESPONSE> createCallback(final ServiceCallback<RESPONSE> serviceCallback, final TimeoutService timeoutService) {
        AsyncCallback<RESPONSE> callback = new AsyncCallback<RESPONSE>() {
            @Override
            public void onFailure(Throwable th) {
                if (timeoutService.getStatus() == TimeoutService.Status.TimedOut) {
                    //handle timeout
                } else {
                    timeoutService.stopTimer();
                    serviceCallback.onFailure(th);
                }
            }

            @Override
            public void onSuccess(RESPONSE response) {
                if (timeoutService.getStatus() == TimeoutService.Status.TimedOut) {
                    //handle timeout
                } else {
                    timeoutService.stopTimer();
                    serviceCallback.onSuccess(response);
                }
            }
        };
        return callback;
    }
}
