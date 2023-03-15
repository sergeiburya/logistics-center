package com.example.logisticscenter.service.impl;

import com.example.logisticscenter.model.Packing;
import com.example.logisticscenter.repository.PackingRepository;
import com.example.logisticscenter.service.PackingService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PackingServiceImpl implements PackingService {
    private final PackingRepository packingRepository;

    public PackingServiceImpl(PackingRepository packingRepository) {
        this.packingRepository = packingRepository;
    }

    @Override
    public Packing save(Packing packing) {
        return packingRepository.save(packing);
    }

    @Override
    public List<Packing> getAll() {
        return packingRepository.findAll();
    }
}
