package com.anjana.interviewprep.design_patterns.command;

public class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("File is opened");
    }
    @Override
    public void closeFile() {
        System.out.println("File is closed");
    }
    @Override
    public void writeFile() {
        System.out.println("writing on a File");
    }
}
