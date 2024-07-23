package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityCatRepository extends JpaRepository<City, Integer> {
}
