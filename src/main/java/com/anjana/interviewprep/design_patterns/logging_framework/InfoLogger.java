package com.anjana.interviewprep.design_patterns.logging_framework;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        super();
        this.level = level;
    }

    @Override
    protected void displayMessage(String message, Subject subject) {
        System.out.println("Logged by INFO Logger :"+message);
        subject.notifyObserver(1,message);
    }
}
