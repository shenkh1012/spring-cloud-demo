package com.shenkh.scd.greetingwordservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingWordController {
  private GreetingWordConfiguration greetingWordConfiguration;

  public GreetingWordController(GreetingWordConfiguration greetingWordConfiguration) {
    this.greetingWordConfiguration = greetingWordConfiguration;
  }

  @GetMapping("/")
  public String getGreetingWord() {
    return greetingWordConfiguration.getDefaultGreetingWord();
  }

  @GetMapping("/{languageCode}")
  public String getGreetingWord(@PathVariable("languageCode") String languageCode) {
    return greetingWordConfiguration.getGreetingWords().getOrDefault(
            languageCode,
            greetingWordConfiguration.getDefaultGreetingWord());
  }
}
