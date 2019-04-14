package com.shenkh.scd.common.security;

public class UserContext {
  public static final String CORRELATION_ID = "tmx-correlation-id";
  public static final String AUTH_TOKEN = "Authorization";
  public static final String USER_ID = "tmx-user-id";
  public static final String ORG_ID = "tmx-org-id";

  private static final ThreadLocal<String> correlationId = new ThreadLocal<String>();
  private static final ThreadLocal<String> authToken = new ThreadLocal<String>();
  private static final ThreadLocal<String> userId = new ThreadLocal<String>();
  private static final ThreadLocal<String> orgId = new ThreadLocal<String>();


  public static String getCorrelationId() {
    return correlationId.get();
  }

  public static void setCorrelationId(String cid) {
    correlationId.set(cid);
  }

  public String getAuthToken() {
    return authToken.get();
  }

  public void setAuthToken(String aToken) {
    authToken.set(aToken);
  }

  public String getUserId() {
    return userId.get();
  }

  public void setUserId(String aUser) {
    userId.set(aUser);
  }

  public String getOrgId() {
    return orgId.get();
  }

  public void setOrgId(String aOrg) {
    orgId.set(aOrg);
  }
}
