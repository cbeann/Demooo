package com.example.springbootdemointerfacemideng.controller;

import com.example.springbootdemointerfacemideng.annotation.ApiIdempotentAnn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chaird
 * @create 2020-09-23 15:47
 */
@RestController
public class ApiController {

  AtomicInteger num = new AtomicInteger(100);

  @Autowired private StringRedisTemplate stringRedisTemplate;

  /**
   * 前端获取token,然后把该token放入请求的header中
   *
   * @return
   */
  @GetMapping("/getToken")
  public String getToken() {
    String token = UUID.randomUUID().toString().substring(1, 9);
    stringRedisTemplate.opsForValue().set(token, "1");
    return token;
  }

  /**
   * 主业务逻辑，num--，并且加了自定义接口
   *
   * @return
   */
  @GetMapping("/submit")
  @ApiIdempotentAnn
  public String rushB() {
    // num--
    num.decrementAndGet();
    return "success";
  }

  /**
   * 查看num的值
   *
   * @return
   */
  @GetMapping("/getNum")
  public String getNum() {
    return String.valueOf(num.get());
  }
}
