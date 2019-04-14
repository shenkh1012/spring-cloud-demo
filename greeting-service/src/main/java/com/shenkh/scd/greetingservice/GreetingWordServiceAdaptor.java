package com.shenkh.scd.greetingservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class GreetingWordServiceAdaptor {
  private GreetingWordClient greetingWordClient;

  public GreetingWordServiceAdaptor(GreetingWordClient greetingWordClient) {
    this.greetingWordClient = greetingWordClient;
  }

  @HystrixCommand(fallbackMethod = "getGreetingWordFallBack")
  public String getGreetingWord(String languageCode) {
    return this.greetingWordClient.getGreetingWord(languageCode);
  }

  public String getGreetingWordFallBack(String languageCode) {
    return "Fallback: Hello";
  }
}
