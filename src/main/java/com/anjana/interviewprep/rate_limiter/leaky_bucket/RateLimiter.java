package com.anjana.interviewprep.rate_limiter.leaky_bucket;

public interface RateLimiter {
    boolean grantAccess();
}
