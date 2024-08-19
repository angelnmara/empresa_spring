package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.GarageDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGarageDocumentRepository extends JpaRepository<GarageDocument, Integer> {
}
