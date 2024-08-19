package com.lamarrulla.empresa.repository;

import com.lamarrulla.empresa.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IScheduleRepository extends JpaRepository<Schedule, Integer> {
}
