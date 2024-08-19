package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.CustomerDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerDocumentRepository extends JpaRepository<CustomerDocument, Integer> {
}
