package com.anjana.interviewprep.rate_limiter;

import java.util.HashMap;
import java.util.Map;

public class UserBucketCreator {

    private final Map<Integer, RateLimiter> userMap;

    public UserBucketCreator(int id, BucketType bucketType) {
        userMap = new HashMap<>();
        userMap.put(1, BucketFactory.getBucket(bucketType));
    }

    public void accessApplication(int id) {
        if(userMap.get(id).grantAccess())  {
            System.out.println(Thread.currentThread().getName()+" -> Able to access the application");
        } else {
            System.out.println(Thread.currentThread().getName()+" -> Unable to access the application, Too Many Requests!");

        }
    }
}
