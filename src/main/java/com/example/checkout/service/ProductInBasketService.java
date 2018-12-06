package com.example.checkout.service;

import com.example.checkout.entity.Basket;
import com.example.checkout.entity.ProductInBasket;

import java.util.List;

public interface ProductInBasketService {

    public void addProductToBasket(ProductInBasket productInBasket);

    public void addProductsToBasket(List<ProductInBasket> productsInBasket);

}
