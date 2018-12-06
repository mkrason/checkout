package com.example.checkout.repository;

import com.example.checkout.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductsRepository extends CrudRepository<Product, Long> {

    public List<Product> findAllByNameLike(String name);
}
