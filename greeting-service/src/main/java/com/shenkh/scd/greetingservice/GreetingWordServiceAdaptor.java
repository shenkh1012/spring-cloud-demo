package com.shenkh.scd.greetingservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * <p>(C) 2003 Delphi Technology, inc. (dti)</p>
 * Date:   4/4/2019
 *
 * @author kshen
 */
/*
 *
 * Revision Date    Revised By  Description
 * ---------------------------------------------------
 *
 * ---------------------------------------------------
 */
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

  private String getGreetingWordFallBack(String languageCode) {
    return "Fallback: Hello";
  }
}
