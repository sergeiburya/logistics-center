package com.example.logisticscenter.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int pallets;
    private String number;
    private Date dateShipment;
    private String buyersWarehouse;
    @OneToMany
    private List<Product> products;
    @OneToMany
    private List<Pallet> palletList;
    @OneToOne
    private Status status;
}
