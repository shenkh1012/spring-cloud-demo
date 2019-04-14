package com.shenkh.scd.common.security;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class UserContextFeignRequestInterceptor implements RequestInterceptor {
  @Override
  public void apply(RequestTemplate template) {
    template.header(UserContext.CORRELATION_ID, UserContextHolder.getContext().getCorrelationId());
    template.header(UserContext.AUTH_TOKEN, UserContextHolder.getContext().getAuthToken());
  }
}
