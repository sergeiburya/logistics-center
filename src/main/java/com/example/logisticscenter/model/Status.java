package com.example.logisticscenter.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "statuses")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private StatusName statusName;

    public enum StatusName {
        NEW,
        CONFIRMED,
        PACKAGING,
        SHIPMENT,
        READY
    }
}
