package com.yashodha.eirlssales.controller;


import com.yashodha.eirlssales.model.Customer;
import com.yashodha.eirlssales.model.Product;
import com.yashodha.eirlssales.repository.CustomerRepo;
import com.yashodha.eirlssales.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @GetMapping
    public List getAllCustomer() {
        return customerRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getProduct(@PathVariable int id) {
        return customerRepo.findById(id);
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerRepo.save(customer);

    }
}
