package com.hutech.BEFoodStore.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "imageproduct")
@Data
public class ImageProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;



}
