package com.example.checkout.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "basket")
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany()
    @JoinColumn(name = "basket_id")
    private List<ProductInBasket> productsInBasket;

    public Basket() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProductInBasket> getProductsInBasket() {
        return productsInBasket;
    }

    public void setProductsInBasket(List<Product> product) {
        this.productsInBasket = productsInBasket;
    }
}
