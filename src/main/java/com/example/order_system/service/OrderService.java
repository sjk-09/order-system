package com.example.order_system.service;

import com.example.order_system.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
   public int calculateTotalPrice(Order order) {
       int total = (int) (order.getQuantity() * order.getPrice());
       order.setTotal(total);
       return total;
   }
}