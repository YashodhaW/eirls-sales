package com.yashodha.eirlssales.controller;


import com.yashodha.eirlssales.model.Orders;
import com.yashodha.eirlssales.repository.OrderRepo;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer/orders")
public class CustomerOrderController {

    @Autowired
    OrderRepo orderRepo;

    @GetMapping
    public List<Orders> getAllOrders() {
        return orderRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Orders> getOrder(@PathVariable int id) {
        return orderRepo.findById(id);
    }

    @PostMapping
    public Orders addOrder(@RequestBody Orders orders) {
        return orderRepo.save(orders);
    }


}
