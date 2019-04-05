package com.shenkh.scd.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
//@EnableZuulServer
@EnableZuulProxy
public class ZuulServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZuulServerApplication.class, args);
  }
}
