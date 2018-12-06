package com.example.checkout.service;

import com.example.checkout.entity.Basket;
import com.example.checkout.entity.ProductInBasket;
import com.example.checkout.repository.ProductInBasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductInBasketServiceImpl implements ProductInBasketService {

    @Autowired
    private ProductInBasketRepository productInBasketRepository;


    @Override
    @Transactional
    public void addProductToBasket(ProductInBasket productInBasket) {
        productInBasketRepository.save(productInBasket);
    }

    @Override
    @Transactional
    public void addProductsToBasket(List<ProductInBasket> productsInBasket) {
        productInBasketRepository.saveAll(productsInBasket);
    }

}
