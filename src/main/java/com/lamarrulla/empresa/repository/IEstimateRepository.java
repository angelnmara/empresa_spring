package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.Estimate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstimateRepository extends JpaRepository<Estimate, Integer> {
}
