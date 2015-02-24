package com.numhero.client.service;

import com.google.gwt.user.client.rpc.InvocationException;
import com.numhero.client.util.ClientDialogUtils;
import com.numhero.client.util.CoreUtils;
import com.numhero.shared.datacargo.CommandResponse;
import com.numhero.shared.exception.ClientWarningException;

import static com.google.gwt.user.client.Window.alert;

public abstract class  ServiceCallbackImpl<RESPONSE extends CommandResponse> implements ServiceCallback<RESPONSE> {

    @Override
    public void onFailure(Throwable th) {

        try {
            throw th;
//		} catch (NotAuthorizedException nae) {
//			GlobalEventsHandler.fireEvent(new LogoutEvent(nae.getMessage()));
//		} catch (ClientWarningException ce) {
//			GlobalEventsHandler.fireEvent(new MessageEvent(ce.getMessage(), true));
//		} catch (ClientDialogException te) {
//			ClientDialogUtils.showErrorMessage(te.getMessage());
        } catch (ClientWarningException ce) {
            ClientDialogUtils.showErrorMessage(ce.getMessage());
//		} catch (TimeoutException te) {
//			GlobalEventsHandler.fireEvent(new MessageEvent(te.getMessage(), true));
//		} catch (ApplicationException ae) {
//			ClientDialogUtils.showGenericErrorMessage(ae);
        } catch (InvocationException ie) {
            ClientDialogUtils.showServerDownErrorMessage();
            CoreUtils.debug("Invocation exception", ie);
        } catch (Throwable th1) {
            ClientDialogUtils.showGenericErrorMessage();
            CoreUtils.debug("onFailure", th);
            th.printStackTrace();
            alert("ERROR " + th.toString());
        }
    }
}
