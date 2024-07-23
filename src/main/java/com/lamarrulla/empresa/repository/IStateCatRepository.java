package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStateCatRepository extends JpaRepository<State, Integer> {
}
