package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.ColorCat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IColorCatRepository extends JpaRepository<ColorCat, Integer> {
}
