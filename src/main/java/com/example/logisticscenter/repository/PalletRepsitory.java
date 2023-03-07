package com.example.logisticscenter.repository;

import com.example.logisticscenter.model.Pallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalletRepsitory extends JpaRepository<Pallet, Long> {
}
