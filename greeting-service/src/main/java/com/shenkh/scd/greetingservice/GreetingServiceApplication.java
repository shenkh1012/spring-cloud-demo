package com.shenkh.scd.greetingservice;

import com.shenkh.scd.common.security.UserContextFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import javax.servlet.Filter;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
//@EnableResourceServer
//@EnableOAuth2Client
//@Configuration
public class GreetingServiceApplication {
//  @Bean
//  public Filter userContextFilter() {
//    return  new UserContextFilter();
//  }

  public static void main(String[] args) {
    SpringApplication.run(GreetingServiceApplication.class, args);
  }
}
