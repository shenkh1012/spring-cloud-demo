package com.shenkh.scd.greetingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("greeting-word-service")
public interface GreetingWordClient {
  @GetMapping(value = "/{languageCode}")
  String getGreetingWord(@PathVariable String languageCode);
}
