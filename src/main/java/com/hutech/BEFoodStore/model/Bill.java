package com.hutech.BEFoodStore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  double total;

    @OneToMany(mappedBy = "bill")
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
