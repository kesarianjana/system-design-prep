package com.anjana.interviewprep.design_patterns.logging_framework;

public class LogManager {

    protected static AbstractLogger buildChainOfLogger() {
        AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger errorLogger = new ErrorLogger(2);
        AbstractLogger debugLogger = new DebugLogger(3);

        infoLogger.setNextLevelLogger(errorLogger);
        errorLogger.setNextLevelLogger(debugLogger);

        return infoLogger;


    }

    public static Subject buildSubject() {
        Subject subject = new Subject();
        subject.addObserver(1, new ConsoleLogger());
        subject.addObserver(2, new FileLogger());
        subject.addObserver(1, new FileLogger());
        subject.addObserver(3, new FileLogger());

        return subject;
        
    }

}
