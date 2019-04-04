package com.shenkh.scd.greetingwordservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@ConfigurationProperties("greeting-word")
@Component
public class GreetingWordConfiguration {
  private String defaultGreetingWord;
  private Map<String, String> greetingWords;

  public String getDefaultGreetingWord() {
    return defaultGreetingWord;
  }

  public void setDefaultGreetingWord(String defaultGreetingWord) {
    this.defaultGreetingWord = defaultGreetingWord;
  }

  public Map<String, String> getGreetingWords() {
    return greetingWords;
  }

  public void setGreetingWords(Map<String, String> greetingWords) {
    this.greetingWords = greetingWords;
  }
}
