package com.example.checkout.repository;

import com.example.checkout.entity.Basket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BasketRepository extends CrudRepository<Basket, Long>{

}
