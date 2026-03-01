package com.example.springdilab.controller;

import com.example.springdilab.service.AppConfigService;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.core.env.Environment;

@RestController
public class ConfigController {

    private final AppConfigService configService;
    private final Environment environment;

    public ConfigController(AppConfigService configService, Environment environment) {
        this.configService = configService;
        this.environment = environment;
    }

    @GetMapping("/config")
    public Map<String, Object> showConfig() {
        Map<String, Object> config = new LinkedHashMap<>();
        config.put("activeProfiles", environment.getActiveProfiles());
        config.put("appInfo", configService.getAppInfo());
        config.put("defaultName", configService.getDefaultName());
        config.put("greetingPrefix", configService.getGreetingPrefix());
        config.put("maxRetry", configService.getMaxRetry());
        config.put("darkModeEnabled", configService.isDarkModeEnabled());
        config.put("adminEmail", configService.getAdminEmail());
        return config;
    }
}