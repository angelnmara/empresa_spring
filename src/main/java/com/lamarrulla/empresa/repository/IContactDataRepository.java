package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.ContactData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactDataRepository extends JpaRepository<ContactData, Integer> {
}
