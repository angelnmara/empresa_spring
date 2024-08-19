package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.CustomerVehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerVehicleRepository extends JpaRepository<CustomerVehicle, Integer> {
}
