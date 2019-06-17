package com.yashodha.eirlssales.controller;

import com.yashodha.eirlssales.Services.ProductService;
import com.yashodha.eirlssales.model.Item;
import com.yashodha.eirlssales.model.Product;
import com.yashodha.eirlssales.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    ProductService productService;

    //to get all the products from the database
    @GetMapping
    public List getAllProducts() {
        return productRepo.findAll();
    }

    //to get a single product
    @GetMapping("/{id}")
    public Optional getProduct(@PathVariable int id) {
        return productRepo.findById(id);
    }

    @GetMapping("/material")
    public List<Item> getMaterialProducts(){
        return productService.getItems();
    }

    //to send the products details to the database
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productRepo.save(product);

    }

}
