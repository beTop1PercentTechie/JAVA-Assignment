package com.example.machinetest.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}