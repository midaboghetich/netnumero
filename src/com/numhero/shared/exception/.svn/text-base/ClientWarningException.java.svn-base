package com.numhero.shared.exception;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ClientWarningException extends RuntimeException implements IsSerializable {
    private static final long serialVersionUID = 1498390910089741165L;
    private String message;

    public ClientWarningException() {
        // for GWT
    }

    public ClientWarningException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
