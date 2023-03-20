package com.anjana.interviewprep.rate_limiter.leaky_bucket;

import com.anjana.interviewprep.rate_limiter.BucketType;

public class BucketFactory {

    public static <T extends RateLimiter> RateLimiter getBucket(BucketType bucketType) {
        if(bucketType == BucketType.TOKEN_BUCKET)
            return new TokenBucket(10, 10);

        else if(bucketType == BucketType.LEAKY_BUCKET)
            return new LeakyBucket(10);
        return null;
    }

}
