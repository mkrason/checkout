package com.example.checkout.controller;

import com.example.checkout.entity.Product;
import com.example.checkout.entity.ProductInBasket;
import com.example.checkout.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductsService productsService;

    @GetMapping("products")
    public Iterable<Product> getProducts() {
        return productsService.getProducts();

    }

    @GetMapping("products/filter")
    public List<Product> getProductsByName(String name) {
      return productsService.getProductsByName(name);
    }
}
