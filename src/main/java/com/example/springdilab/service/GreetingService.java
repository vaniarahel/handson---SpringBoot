package com.example.springdilab.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

 @Value("${app.greeting.prefix}")
 private String prefix;

 @Value("${app.greeting.default-name}")
 private String defaultName;

 public GreetingService() {
 System.out.println("GreetingService dibuat oleh Spring!");
   }

 public String greet(String name) {
 String targetName = (name == null || name.isBlank()) ? defaultName : name;
 return prefix + ", " + targetName + "! Selamat belajar Spring Boot.";
   }
}