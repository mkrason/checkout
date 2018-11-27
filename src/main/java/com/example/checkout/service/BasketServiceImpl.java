package com.example.checkout.service;

import com.example.checkout.entity.Basket;
import com.example.checkout.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BasketServiceImpl implements BasketService{

    @Autowired
    private BasketRepository basketRepository;

    @Override
    @Transactional
    public Basket newBasket(Basket basket){
        return basketRepository.save(basket);
    }

    @Override
    public Basket getBasket(Long id) {
        return basketRepository.findById(id).get();
    }


}
