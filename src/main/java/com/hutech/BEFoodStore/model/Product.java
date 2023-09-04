package com.hutech.BEFoodStore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private  Category category;

    @OneToMany(mappedBy = "product")
    private List<ImageProduct> images;

    @ManyToOne
    @JoinColumn(name = "discount_code_id")
    private Discount discount;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private  Bill bill;

}