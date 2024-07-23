package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleCatRepository extends JpaRepository<Role, Integer> {
}
