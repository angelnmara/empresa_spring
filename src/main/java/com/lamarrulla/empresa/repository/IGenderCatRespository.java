package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.GenderCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenderCatRespository extends JpaRepository<GenderCat, Integer> {
}
