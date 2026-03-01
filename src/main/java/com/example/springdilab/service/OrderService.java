package com.example.springdilab.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

 private static final Logger log = LoggerFactory.getLogger(OrderService.class);

 private final NotificationService notificationService;

 public OrderService(NotificationService notificationService) {
 this.notificationService = notificationService;
 log.info("OrderService dibuat! Notification type: {}",
                notificationService.getType());
   }

 public String placeOrder(String customerEmail, String item) {
 log.info("Memproses pesanan: {} untuk {}", item, customerEmail);
 log.debug("Detail - email: {}, item: {}", customerEmail, item);

 String result = notificationService.send(customerEmail,
                "Pesanan " + item + " berhasil diterima!");

 log.info("Pesanan berhasil diproses");
 return "Order placed: " + item + " | " + result;
  }
}