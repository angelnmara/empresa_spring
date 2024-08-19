package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.GarageService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGarageServiceRepository extends JpaRepository<GarageService, Integer> {
}
