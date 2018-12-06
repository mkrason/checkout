package com.example.checkout.service;

import com.example.checkout.entity.Product;
import com.example.checkout.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public Iterable<Product> getProducts() {
        return productsRepository.findAll();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return productsRepository.findAllByNameLike("%"+name+"%");
    }
}
