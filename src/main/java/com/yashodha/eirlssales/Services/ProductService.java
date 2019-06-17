package com.yashodha.eirlssales.Services;

import com.yashodha.eirlssales.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final String MaterialProductsUrl = "https://eirls-material.herokuapp.com/showItems";

    public List<Product> getProducts() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Product[]> materialIResponse= restTemplate.getForEntity(MaterialProductsUrl, Product[].class);
        Product[] items = materialIResponse.getBody();
        List<Product> itemsList = Arrays.asList(items);

        return itemsList;
    }
}

