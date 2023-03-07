package com.example.logisticscenter.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
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
