package com.yashodha.eirlssales.Services;

import com.yashodha.eirlssales.model.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final String MaterialProductsUrl = "https://eirls-material.herokuapp.com/showItems";

    public List<Item> getItems() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Item[]> materialIResponse= restTemplate.getForEntity(MaterialProductsUrl, Item[].class);
        Item[] items = materialIResponse.getBody();
        List<Item> itemsList = Arrays.asList(items);

        return itemsList;
    }
}

