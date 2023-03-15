package com.example.logisticscenter.service;

import com.example.logisticscenter.model.Packing;

import java.util.List;

public interface PackingService {
    Packing save(Packing packing);

    List<Packing> getAll();
}
