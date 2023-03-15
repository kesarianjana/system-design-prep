package com.anjana.interviewprep.concurrency.multithreading;

import java.util.concurrent.*;

public class FutureDemo {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*       declare the executor and thread size
       Also note that, Future can take a task that implements either callable or runnable also

       */

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Create a task
        Callable<String> task = () -> {
            delay(2); // Indicates delay due to API call
            return "return from callable!";
        };

        //Submit task to executor
        /*
        you call also call 2 tasks in executor
        ExecutorService es = Executors.newFixedThreadPool(5);
         public void doStuff() {
             es.submit(new FirstTask());  // FirstTask implements Callable
             es.submit(new SecondTask());  // SecondTask implements Callable
        }

         */
        Future<String> future = executorService.submit(task);
    
        String result = future.get(); // This is a blocking operation. We need to wait till task completes! sol : Use completable future
        System.out.println(result);
        executorService.shutdown();
        /*
        Drawbacks
        1. You can't perform modifications for thr result obtained.Like if API call was unsuccessful, you
        can't return local cached / any customised response!
        2.No Exception Handling
        3. Cannot call multiple services at a time
        To address this, completable future was brought up!
         */

    }


    private static void delay(int timeDuration) throws InterruptedException {
        TimeUnit.SECONDS.sleep(timeDuration);
    }
}
