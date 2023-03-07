package com.example.logisticscenter.repository;

import com.example.logisticscenter.model.Packing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackingRepository extends JpaRepository<Packing, Long> {
}
