package com.anjana.interviewprep.design_patterns.logging_framework;

public class DebugLogger extends AbstractLogger{
    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void displayMessage(String message, Subject subject) {
        System.out.println("Logged by DEBUG Logger : "+message);
        subject.notifyObserver(3,message);
    }
}
