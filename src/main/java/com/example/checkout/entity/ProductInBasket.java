package com.example.checkout.entity;

import javax.persistence.*;

@Entity(name = "ProductInBasket")
@Table(name = "product_in_basket")
public class ProductInBasket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "basket_id")
    private Long basket_id;

    @Column(name = "product_id")
    private Long product_id;

    public ProductInBasket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getBasket_id() {
        return basket_id;
    }

    public void setBasket_id(Long basket_id) {
        this.basket_id = basket_id;
    }
}
