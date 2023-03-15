package com.anjana.interviewprep.concurrency.multithreading.print1toNNumbers;

public class Driver {

    public static void main(String[] args) {
        State state = new State(PrinterType.ODD);
        Printer evenPrinter = new Printer(state, PrinterType.EVEN, PrinterType.ODD, 2, 50, 2);
        Printer oddPrinter = new Printer(state, PrinterType.ODD, PrinterType.EVEN, 1, 50, 2);

        Thread evenThread = new Thread(evenPrinter);
        Thread oddThread = new Thread(oddPrinter);

        evenThread.start();
        oddThread.start();
    }
}
