package com.example.checkout.repository;

import com.example.checkout.entity.ProductInBasket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInBasketRepository extends CrudRepository<ProductInBasket, Long>{
}
