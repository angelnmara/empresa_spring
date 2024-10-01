package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.ExpenseCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExpenseCatRepository extends JpaRepository<ExpenseCat, Integer> {
}
