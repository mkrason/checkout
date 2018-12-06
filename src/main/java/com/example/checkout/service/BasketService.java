package com.example.checkout.service;

import com.example.checkout.entity.Basket;

public interface BasketService {

    public Basket newBasket(Basket basket);

    public Basket getBasket(Long id);


}
