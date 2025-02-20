package com.shop.coffee.order.controller;

import com.shop.coffee.order.OrderStatus;
import com.shop.coffee.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class ApiV1AdminController {

    private final OrderService orderService;

    @GetMapping("/orders")
    public String getOrders(@RequestParam(required = false) OrderStatus orderStatus, Model model) {
        List<com.shop.coffee.order.DTO.OrderSummaryDTO> orders = orderService.getOrders(orderStatus);
        model.addAttribute("orders", orders);
        return "admin_order_list";
    }

}

