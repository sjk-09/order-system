package com.example.order_system.controller;

import com.example.order_system.model.Order;
import com.example.order_system.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public String orderForm(Model model) {
        model.addAttribute("order", new Order());
        return "order";  // templates/order.html
    }

    @PostMapping("/order")
    public String submitOrder(Order order, Model model) {
        int total = orderService.calculateTotalPrice(order);
        model.addAttribute("total", total);
        model.addAttribute("order", order);
        return "result"; // templates/result.html
    }
}