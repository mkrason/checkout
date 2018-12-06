package com.example.checkout.service;

import com.example.checkout.entity.Product;

import java.util.List;

public interface ProductsService {

public Iterable<Product> getProducts();

public List<Product> getProductsByName(String name);

}
