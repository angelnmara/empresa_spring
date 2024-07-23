package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompanyCatRepository extends JpaRepository<Company, Integer> {
}
