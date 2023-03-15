package com.anjana.interviewprep.design_patterns.logging_framework;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void displayMessage(String message, Subject subject) {
        System.out.println("Logged by ERROR Logger : "+ message);
        subject.notifyObserver(2,message);
    }
}
