package com.anjana.interviewprep.concurrency.multithreading.print1toNNumbers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class State {
    private PrinterType nextPrinterType;

    public State(PrinterType nextPrinterType) {
        this.nextPrinterType = nextPrinterType;
    }
}
