package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.CompanyCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompanyCatRepository extends JpaRepository<CompanyCat, Integer> {
}
