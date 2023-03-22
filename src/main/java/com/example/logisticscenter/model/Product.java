package com.example.logisticscenter.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 7, unique = true)
    private String vendorCode;
    private String name;
    private String unit;
    @OneToOne
    private Packing packing;
    private String group;
    private int layingScheme;
    private int quantityPerPallet;
    private int quantity;
    private double weight;
}
