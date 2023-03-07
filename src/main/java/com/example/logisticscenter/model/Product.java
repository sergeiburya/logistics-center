package com.example.logisticscenter.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String vendorCode;
    private String name;
    private String unit;
    @OneToOne
    private Packing packing;
    private String group;
    private int layingScheme;
    private int quantityPerPallet;
    private double weight;
}
