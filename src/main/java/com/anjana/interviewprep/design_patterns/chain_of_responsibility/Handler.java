package com.anjana.interviewprep.design_patterns.chain_of_responsibility;

public abstract class Handler {
    private Handler next;

    public Handler setNextHandler(Handler handler) {
        this.next = handler;
        return this;
    }

    public abstract boolean handle(String name, String password);

    public boolean handleNext(String name, String password) {
        if(next == null) {
            return true;
        }
        return next.handle(name, password);
    }
}
