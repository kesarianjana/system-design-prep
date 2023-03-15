package com.anjana.interviewprep.concurrency.producer_consumer;

import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueue<T>{
    // We have 2 methods , get and put
    Queue<T> blockingQueue;
    int MAX_CAPACITY = 10;
    ReentrantLock lock = new ReentrantLock();
    Condition notFull = lock.newCondition();
    Condition notEmpty = lock.newCondition();

    public BlockingQueue() {
        blockingQueue = new LinkedList<>();
    }

    public BlockingQueue(int capacity) {
        blockingQueue = new LinkedList<>();
        this.MAX_CAPACITY = capacity;
    }


    public T get() throws InterruptedException {
        lock.lock();
         try {
             while(blockingQueue.isEmpty()) {
                 notEmpty.wait();
             }
             T ele = blockingQueue.peek();
             notFull.signalAll();
             return ele;
         }
         finally {
             lock.unlock();
         }
    }

    public boolean put(T e) throws InterruptedException {
        lock.lock();
        try {
            while(blockingQueue.size() == MAX_CAPACITY) {
                notFull.wait();
            }
             boolean added = blockingQueue.add(e);
            notEmpty.signalAll();
            return added;
        }
        finally {
            lock.unlock();
        }
    }
}
