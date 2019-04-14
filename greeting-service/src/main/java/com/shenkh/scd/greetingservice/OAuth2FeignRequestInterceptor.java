package com.shenkh.scd.greetingservice;

import com.shenkh.scd.common.security.UserContextHolder;
import feign.RequestInterceptor;
import feign.RequestTemplate;

public class OAuth2FeignRequestInterceptor implements RequestInterceptor {
  private static final String AUTHORIZATION_HEADER = "Authorization";
  private static final String BEARER_TOKEN_TYPE = "Bearer";

  @Override
  public void apply(RequestTemplate template) {
    template.header(AUTHORIZATION_HEADER,
        String.format("%s %s",
            BEARER_TOKEN_TYPE,
            UserContextHolder.getContext().getAuthToken()));
  }
}
