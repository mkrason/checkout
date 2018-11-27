package com.example.checkout.controller;

import com.example.checkout.entity.Basket;
import com.example.checkout.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasketController {

    @Autowired
    private BasketService basketService;

    @RequestMapping("/basket/new")
    public Basket newBasket() {
        Basket basket = new Basket();
        return basketService.newBasket(basket);
    }

    @RequestMapping("/basket/{id}")
    public Basket getBasket(@PathVariable Long id){
        return basketService.getBasket(id);
    }





}
