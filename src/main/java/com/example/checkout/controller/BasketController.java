package com.example.checkout.controller;

import com.example.checkout.entity.Basket;
import com.example.checkout.entity.ProductInBasket;
import com.example.checkout.service.BasketService;
import com.example.checkout.service.ProductInBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BasketController {

    @Autowired
    private BasketService basketService;

    @Autowired
    private ProductInBasketService productInBasketService;

    @PostMapping("/basket")
    public Basket newBasket() {
        Basket basket = new Basket();
        return basketService.newBasket(basket);
    }

    @GetMapping("/basket/{id}")
    public Basket getBasket(@PathVariable Long id){
        return basketService.getBasket(id);
    }

    @PostMapping("/basket/{id}/addproduct")
    public Basket addProductToBasket(@PathVariable Long id, @RequestBody ProductInBasket productInBasket){
        productInBasket.setBasket_id(id);
        productInBasketService.addProductToBasket(productInBasket);
        return basketService.getBasket(id);
    }


    @PostMapping("/basket/{id}/addproducts")
    public Basket addProductsToBasket(@PathVariable Long id, @RequestBody List<ProductInBasket> productInBasket){
        productInBasket.forEach(p->p.setBasket_id(id));
        productInBasketService.addProductsToBasket(productInBasket);
        return basketService.getBasket(id);
    }

}
