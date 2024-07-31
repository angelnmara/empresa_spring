package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
}
