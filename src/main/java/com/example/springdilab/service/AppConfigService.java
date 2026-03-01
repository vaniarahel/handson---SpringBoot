package com.example.springdilab.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppConfigService {

 @Value("${spring.application.name}")
 private String appName;

 @Value("${app.version}")
 private String appVersion;

 @Value("${app.description}")
 private String appDescription;

 @Value("${app.greeting.default-name}")
 private String defaultName;

 @Value("${app.greeting.prefix}")
 private String greetingPrefix;

 @Value("${app.notification.max-retry}")
 private int maxRetry;

 // Property yang mungkin tidak ada — pakai default value
         @Value("${app.feature.dark-mode:false}")
 private boolean darkModeEnabled;

 @Value("${app.admin.email:admin@example.com}")
 private String adminEmail;

 public String getAppInfo() {
 return String.format("%s v%s - %s", appName, appVersion, appDescription);
   }

 public String getDefaultName() {
 return defaultName;
   }

 public String getGreetingPrefix() {
 return greetingPrefix;
   }

 public int getMaxRetry() {
 return maxRetry;
   }

 public boolean isDarkModeEnabled() {
 return darkModeEnabled;
   }

 public String getAdminEmail() {
 return adminEmail;
   }
}