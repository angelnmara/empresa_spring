package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.EmployeeDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeDocumentRepository extends JpaRepository<EmployeeDocument, Integer> {
}
