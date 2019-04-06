package com.shenkh.scd.zuulserver;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = ApplicationInfoEndpoint.ID)
@Component
public class ApplicationInfoEndpoint {
  public static final String ID = "application-info";

  @ReadOperation
  public Map<String, String> applicationInfo() {
    Map<String, String> applicationInfo = new HashMap<>();
    applicationInfo.put("applicationName", "spring-cloud-demo");
    applicationInfo.put("version", "0.4.0.SNAPSHOT");

    return applicationInfo;
  }
}
