package com.example.checkout.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "basket")
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_basket")
    private Long id;

//    @ManyToMany
//    private User user;

    @OneToMany
    @JoinColumn(name = "basket_id", referencedColumnName="id_basket")
    private List<Item> items;

    public Basket() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
