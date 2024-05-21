package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.TokenData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenDataRepository extends JpaRepository<TokenData, Integer> {
}
