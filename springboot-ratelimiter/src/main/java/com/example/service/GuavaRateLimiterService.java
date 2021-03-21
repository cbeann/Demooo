package com.example.service;

import org.springframework.stereotype.Service;

import com.google.common.util.concurrent.RateLimiter;


@Service
public class GuavaRateLimiterService {



    /**
     * 每秒钟只发出2个令牌，拿到令牌的请求才可以进入下一个业务
     */
    private RateLimiter seckillRateLimiter = RateLimiter.create(2);

    public boolean tryAcquireSeckill() {
        return seckillRateLimiter.tryAcquire();
    }
}
