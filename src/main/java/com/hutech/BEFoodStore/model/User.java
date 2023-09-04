package com.hutech.BEFoodStore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private  String email;
    private  String phone;
    private  String image;

    @OneToMany(mappedBy = "user")
    private List<Adress> adresses;

    @OneToMany(mappedBy = "user")
    private List<Bill> bill;
}
