package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.EmployeeCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<EmployeeCat, Integer> {
}
