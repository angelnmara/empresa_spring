package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address, Integer> {
}
