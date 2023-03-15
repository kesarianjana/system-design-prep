package com.anjana.interviewprep.concurrency.producer_consumer;



public class Driver {
    /*
    Implement a producer - consumer pattern using blocking queue
     */

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> q = new BlockingQueue<>(10);
      Thread producer = new Thread(() -> {
          for(int i=1;i<10;i++) {
              try {
                  System.out.println("Thread :"+Thread.currentThread().getName()+" added :"+i);
                  q.put(i);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      });

        Thread consumer = new Thread(() -> {
            for(int i=1;i<10;i++) {
                try {
                    System.out.println("Thread :"+Thread.currentThread().getName()+"took :"+q.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();

    }
}
