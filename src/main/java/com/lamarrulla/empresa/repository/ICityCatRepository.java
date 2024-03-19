package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.CityCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityCatRepository extends JpaRepository<CityCat, Integer> {
}
