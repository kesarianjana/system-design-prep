package com.anjana.interviewprep.rate_limiter;

import com.anjana.interviewprep.rate_limiter.leaky_bucket.LeakyBucket;
import com.anjana.interviewprep.rate_limiter.token_bucket.TokenBucket;

public class BucketFactory {

    public static <T extends RateLimiter> RateLimiter getBucket(BucketType bucketType) {
        if(bucketType == BucketType.TOKEN_BUCKET)
            return new TokenBucket(10, 10);

        else if(bucketType == BucketType.LEAKY_BUCKET)
            return new LeakyBucket(10);
        return null;
    }

}
