package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.GarageBudget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGarageBudgetRepository extends JpaRepository<GarageBudget, Integer> {
}
