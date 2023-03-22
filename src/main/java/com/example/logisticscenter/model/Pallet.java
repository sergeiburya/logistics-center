package com.example.logisticscenter.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pallets")
public class Pallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
