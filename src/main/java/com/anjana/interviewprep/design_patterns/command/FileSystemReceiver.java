package com.anjana.interviewprep.design_patterns.command;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
