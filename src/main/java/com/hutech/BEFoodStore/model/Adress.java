package com.hutech.BEFoodStore.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String adress;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private  User user;
}
