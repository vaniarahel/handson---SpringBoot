package com.example.springdilab.service;

import org.springframework.stereotype.Service;

@Service
public class SmsNotificationService implements NotificationService {

 @Override
 public String send(String to, String message) {
 System.out.println("[SMS] Mengirim ke " + to + ": " + message);
 return "SMS terkirim ke " + to;
   }

 @Override
 public String getType() {
 return "SMS";
   }
}