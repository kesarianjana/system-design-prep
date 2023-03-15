package com.anjana.interviewprep.concurrency.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Some long running computation
            int result = 0;
            for (int i = 0; i < 100; i++) {
                result += i;
            }
            return result;
        });

        future.thenAccept(result -> System.out.println("Result: " + result));

        System.out.println(future.get());
        /*
        response chaining is possible. No need to always do get() which is a blocking call.
         */
    }
}
