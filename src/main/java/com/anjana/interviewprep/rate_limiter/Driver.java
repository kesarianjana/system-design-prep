package com.anjana.interviewprep.rate_limiter;

import com.anjana.interviewprep.rate_limiter.BucketType;
import com.anjana.interviewprep.rate_limiter.UserBucketCreator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

    public static void main(String[] args) {
        UserBucketCreator userBucketCreator = new UserBucketCreator(1, BucketType.LEAKY_BUCKET);

        /*
        Single Thread - Create 12 requests
        Comment the below for loop to see Multithreaded access along with thread name
         */
        for(int i=0;i<12; i++) {
            userBucketCreator.accessApplication(1);
        }

        //Multiple Threads
        ExecutorService service = Executors.newFixedThreadPool(12);

        for(int i=0;i<12; i++) {
            service.submit(() -> userBucketCreator.accessApplication(1));
        }
    }
}
