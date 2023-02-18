package com.anjana.interviewprep.design_patterns.command;

public class FileSystemClient {

    public static void main(String[] args) {
        FileSystemReceiver fileSystemReceiver = new UnixFileSystemReceiver();
        fileSystemReceiver.openFile();
    }

}
