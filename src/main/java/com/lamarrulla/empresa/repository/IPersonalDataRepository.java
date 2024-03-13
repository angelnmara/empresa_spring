package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.PersonalData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonalDataRepository extends JpaRepository<PersonalData, Integer> {
}
