package com.example.logisticscenter.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Packing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String vendorCode;
    private String name;
    private double length;
    private double width;
    private double height;
}