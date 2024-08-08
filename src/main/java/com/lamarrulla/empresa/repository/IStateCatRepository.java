package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.StateCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStateCatRepository extends JpaRepository<StateCat, Integer> {
}
