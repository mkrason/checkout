package com.example.checkout.controller;

import com.example.checkout.entity.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @RequestMapping("/products")
    public List<Item> getItems() {

        return null;

    }
}
