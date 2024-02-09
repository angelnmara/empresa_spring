package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
}
