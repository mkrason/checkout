package com.example.checkout.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "item")
public class Item {

    @Id
    private Long id;

    @Column(name = "basked_id")
    private Long basketId;

    @Column(name = "id_product")
    private Long idProduct;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "special_price")
    private BigDecimal specialPrice;

    @Column(name = "total_value")
    private BigDecimal totalValue;

    @Column(name = "status")
    private BigDecimal status;

}
