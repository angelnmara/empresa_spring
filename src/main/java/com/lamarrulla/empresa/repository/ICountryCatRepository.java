package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryCatRepository extends JpaRepository<Country, Integer> {
}
