package com.hutech.BEFoodStore.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double value;

    @OneToMany(mappedBy = "discount")
    private List<Product> products;

}
