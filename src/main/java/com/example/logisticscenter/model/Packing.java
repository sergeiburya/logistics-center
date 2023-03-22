package com.example.logisticscenter.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "packings")
public class Packing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 7, unique = true)
    private String vendorCode;
    private String name;
    private double length;
    private double width;
    private double height;
}
