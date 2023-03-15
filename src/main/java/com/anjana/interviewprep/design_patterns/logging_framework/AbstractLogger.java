package com.anjana.interviewprep.design_patterns.logging_framework;

public abstract class AbstractLogger {

     int level;
    AbstractLogger nextLevelLogger;


    public void setNextLevelLogger(AbstractLogger nextLevelLogger) {
         this.nextLevelLogger = nextLevelLogger;
     }

    public void execute(String message, int level, Subject subject) {
        if(this.level <= level) {
         displayMessage(message, subject);
        }

        if(this.nextLevelLogger != null) {
            this.nextLevelLogger.execute(message, level, subject);
        }
    }

    protected abstract void displayMessage(String message, Subject subject);
}
