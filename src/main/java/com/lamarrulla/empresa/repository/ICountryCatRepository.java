package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.CountryCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryCatRepository extends JpaRepository<CountryCat, Integer> {
}
