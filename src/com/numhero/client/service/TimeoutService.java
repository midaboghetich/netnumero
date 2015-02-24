package com.numhero.client.service;

import com.google.gwt.user.client.Timer;

// TODO What exactly is this class intended to do? Right now it just saves a status when times-out
public class TimeoutService {
    public enum Status {
        New, Running, Stopped, TimedOut
    }

    private Timer timeoutTimer;
    private Status status = Status.New;
    private int timeout = 1000;

    public TimeoutService(int timeout) {
        this();
        this.timeout = 1000;
    }

    public TimeoutService() {
        timeoutTimer = new Timer() {
            @Override
            public void run() {
                status = Status.TimedOut;
                timeoutTimer = null;
            }
        };
    }

    public void startTimer() {
        status = Status.Running;
        if (timeoutTimer == null)
            timeoutTimer = new Timer() {
                @Override
                public void run() {
                    status = Status.TimedOut;
                    timeoutTimer = null;
                }
            };
        timeoutTimer.schedule(timeout);
    }

    public Status getStatus() {
        return status;
    }

    public void stopTimer() {
        if (status != Status.TimedOut) {
            status = Status.Stopped;
            if (timeoutTimer != null) {
                timeoutTimer.cancel();
                timeoutTimer = null;
            }
        }
    }
}
