package com.example.autorequest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author chaird
 * @create 2020-07-31 22:43
 */
@Component
@Slf4j
public class StartAutoRequestService implements CommandLineRunner {
  @Override
  public void run(String... args) throws Exception {

    String httpUrl = "http://localhost:8082/hello";

    // 链接
    HttpURLConnection connection = null;
    InputStream is = null;
    BufferedReader br = null;
    StringBuffer result = new StringBuffer();
    try {
      // 创建连接
      URL url = new URL(httpUrl);
      connection = (HttpURLConnection) url.openConnection();
      // 设置请求方式
      connection.setRequestMethod("GET");
      // 设置连接超时时间
      connection.setReadTimeout(15000);
      // 开始连接
      connection.connect();
      // 获取响应数据
      if (connection.getResponseCode() == 200) {
        // 获取返回的数据
        is = connection.getInputStream();
        if (null != is) {
          br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
          String temp = null;
          while (null != (temp = br.readLine())) {
            result.append(temp);
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (null != br) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (null != is) {
        try {
          is.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      // 关闭远程连接
      connection.disconnect();
    }
    System.out.println(result.toString());
  }
}
