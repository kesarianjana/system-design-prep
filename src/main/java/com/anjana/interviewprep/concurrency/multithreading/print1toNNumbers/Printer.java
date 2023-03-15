package com.anjana.interviewprep.concurrency.multithreading.print1toNNumbers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;

@AllArgsConstructor
@Getter
public class Printer implements Runnable {

    private State state;
    private PrinterType currentPrinterType;
    private PrinterType nextPrinterType;
    private Integer currentValue;
    private Integer maxValue;
    private Integer step;


  @SneakyThrows
  public void run() {
      while (currentValue<=maxValue) {
          synchronized (state) {
              if(this.currentPrinterType != state.getNextPrinterType()) {
                  state.wait();
              }
              System.out.println(currentPrinterType.toString()+" "+currentValue);
              currentValue+=step;
              state.setNextPrinterType(this.nextPrinterType);
              state.notifyAll();
          }
      }
  }


}
