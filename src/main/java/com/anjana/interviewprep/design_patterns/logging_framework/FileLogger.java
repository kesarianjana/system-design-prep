package com.anjana.interviewprep.design_patterns.logging_framework;

public class FileLogger implements Observer {

    @Override
    public void log(String msg) {
        System.out.println("LOGGED ON FILE LOGGER : "+msg);
    }
}
