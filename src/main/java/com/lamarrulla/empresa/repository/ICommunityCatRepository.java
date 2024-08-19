package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.CommunityCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommunityCatRepository extends JpaRepository<CommunityCat, Integer> {
}
