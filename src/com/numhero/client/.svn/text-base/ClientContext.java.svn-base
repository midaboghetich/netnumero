package com.numhero.client;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.BusinessAccountC;
import com.numhero.client.model.pojoc.UserC;
import com.numhero.client.util.CoreUtils;

@Singleton
public class ClientContext implements IsSerializable {
    protected UserC user;

    protected BusinessAccountC ba;

    public ClientContext() {
        user = new UserC();
    }

    public void initFromContext(ClientContext context) {
        CoreUtils.debug("Initializing context from another context");
        this.user = context.getUser();
        this.ba = context.getBa();

    }

    public UserC getUser() {
        return user;
    }

    public void setUser(UserC user) {
        this.user = user;
    }

    public BusinessAccountC getBa() {
        return ba;
    }

    public void setBa(BusinessAccountC ba) {
        this.ba = ba;
    }
}
