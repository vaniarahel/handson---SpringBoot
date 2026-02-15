package com.example.springdilab.service;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

@Service // ← Spring: "Buat Bean dari class ini dan simpan di gudang"
@Primary// ← "Kalau bingung, pakai yang ini"
public class EmailNotificationService implements NotificationService {
//public class EmailNotificationService implements NotificationService {

 @Override
 public String send(String to, String message) {
 // Simulasi kirim email
 System.out.println("[EMAIL] Mengirim ke " + to + ": " + message);
 return "Email terkirim ke " + to;
   }

 @Override
 public String getType() {
 return "EMAIL";
  }
}