package com.anjana.interviewprep.design_patterns.logging_framework;

import java.io.Serializable;

import static com.anjana.interviewprep.design_patterns.logging_framework.LogManager.buildChainOfLogger;
import static com.anjana.interviewprep.design_patterns.logging_framework.LogManager.buildSubject;

public class Logger implements Cloneable, Serializable {
    private static  Logger logger;
    private static AbstractLogger chainOfLogger;
    private static Subject subject;

    private Logger() {
        if(logger != null) {
            throw new IllegalStateException("Object already created!");
        }
    }

    public static Logger getInstance() {

        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                    chainOfLogger  = buildChainOfLogger();
                    subject = buildSubject();
                }
            }
        }
        return logger;
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();

    }

    protected Object readResolve() {
        return logger;
    }

    public void error(String msg, Subject subject) {
       createLog(2, msg);
    }

    public void debug(String msg) {
        createLog(3, msg);
    }
    public void info(String msg) {
        createLog(1,msg);
    }

    private void createLog(int level, String msg) {
      chainOfLogger.execute(msg, level, subject);
    }



}
