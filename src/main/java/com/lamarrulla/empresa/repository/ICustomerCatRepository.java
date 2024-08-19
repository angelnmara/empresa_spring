package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.CustomerCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerCatRepository extends JpaRepository<CustomerCat, Integer> {
}
