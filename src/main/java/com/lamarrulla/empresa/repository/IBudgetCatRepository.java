package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.BudgetCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBudgetCatRepository extends JpaRepository<BudgetCat, Integer> {
}
